package com.company.project.services;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.support.MarshallingUtils;

import com.company.project.stubs.AFSInvoice;
import com.company.project.stubs.AFSUser;
import com.company.project.stubs.InsertInvoice;
import com.company.project.stubs.InsertInvoiceResponse;
import com.company.project.stubs.ObjectFactory;
import com.jcabi.xml.XMLDocument;

@Service
public class InsertInvoiceClient extends WebServiceGatewaySupport{
	
	@Autowired
	private ObjectFactory objectFactory;
	
	@Autowired
	private AFSUser afsUser;
	
	@Value("${arvato.soap.address}")
	private String soapAddress;
	
	
	
	public InsertInvoiceResponse getValue(Object invoiceLabTestEntity, Object company) throws DatatypeConfigurationException {
		
		InsertInvoice requestPayload = objectFactory.createInsertInvoice();
		
		JAXBElement<AFSUser> user = objectFactory.createAFSUser(afsUser);
		JAXBElement<AFSInvoice> invoice = objectFactory.createAFSInvoice(createAFSInvoice());
		
		requestPayload.setUser(user);
		requestPayload.setInvoice(invoice);
		
		return send(requestPayload);
		
	}
	
	private InsertInvoiceResponse send(InsertInvoice requestPayload ) {
		final WebServiceMessageCallback actionCallback = new SoapActionCallback("http://tempuri.org/IAFSService/InsertInvoice");
		final WebServiceMessageCallback customCallback = new WebServiceMessageCallback() {
            @Override
            public void doWithMessage(WebServiceMessage request) throws IOException, TransformerException {
            
            	if (requestPayload != null) {
					Marshaller marshaller = getMarshaller();
					if (marshaller == null) {
						throw new IllegalStateException("No marshaller registered. Check configuration of WebServiceTemplate.");
					}
					MarshallingUtils.marshal(marshaller, requestPayload, request);
					if (actionCallback != null) {
						actionCallback.doWithMessage(request);
					}
				}
            	SoapMessage soapMessage = (SoapMessage) request;
            	String xmlBody = new XMLDocument(soapMessage.getDocument()).toString();
            	System.out.println(xmlBody);
			}
	     };
		WebServiceTemplate webServiceTemplate =  getWebServiceTemplate();
		InsertInvoiceResponse res = null;
        try {
        	 res = (InsertInvoiceResponse) webServiceTemplate.sendAndReceive(soapAddress, 
        			customCallback,
                new WebServiceMessageExtractor<InsertInvoiceResponse>() {

					@Override
					public InsertInvoiceResponse extractData(WebServiceMessage message)throws IOException, TransformerException {
						Unmarshaller unmarshaller = getUnmarshaller();
						if (unmarshaller == null) {
							throw new IllegalStateException(
									"No unmarshaller registered. Check configuration of WebServiceTemplate.");
						}
						return (InsertInvoiceResponse) MarshallingUtils.unmarshal(unmarshaller, message);
					}
                	
                });
        } catch (Exception e) {
            e.printStackTrace();}
		
		
		//Spring's abstraction for sending SOAP request
//		InsertInvoiceResponse response = (InsertInvoiceResponse) getWebServiceTemplate()
//				.marshalSendAndReceive("https://clienttesthorizon.horizonafs.com/AFSServices/AFSService.svc/basicHttpBinding", 
//						requestPayload, new SoapActionCallback("http://tempuri.org/IAFSService/InsertInvoice"));
	
		return res;
	}
	
	private AFSInvoice createAFSInvoice() {
		AFSInvoice invoice = new AFSInvoice();
		//set other data on invoice
		return invoice;
	}

	
	
}
