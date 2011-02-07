package sm.ciscoop.manualclient;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.w3c.dom.Node;

import sm.ciscoop.clientws2.IImportaMalattie;

/**
 * Client scritto a manina
 * 
 * @author Fabri
 * 
 */
public class Client {
	private static final String WS_URL = "http://localhost:8080/ImportaMalattie/ImportaMalattie?wsdl";

	public static void main(String[] args) throws Exception {

		// invokeSimple();
		invokeDynamic();
	}

	private static void invokeSimple() throws MalformedURLException {
		URL url = new URL(WS_URL);
		// QName package + className + Service
		QName qname = new QName("http://importa.ciscoop.sm/",
				"ImportaMalattieService");

		Service service = Service.create(url, qname);

		IImportaMalattie importaMalattie = service
				.getPort(IImportaMalattie.class);
		System.out.println(importaMalattie.isOnline());
	}

	public static void invokeDynamic() throws Exception {
		String targetNameSpace = "http://importa.ciscoop.sm/";
		String endpointUrl = "http://localhost:8080/ImportaMalattie/ImportaMalattie?wsdl";
		//String soapAction = "isOnline";
		QName serviceName = new QName(targetNameSpace, "ImportaMalattieService");
		QName portName = new QName(targetNameSpace, "ImportaMalattiePort");
		String szRisultato = null;
		try {
			SOAPMessage risposta = invokeDynamic(serviceName, portName, endpointUrl);
			
			System.out.println( getSOAPMessageAsString(risposta) );
			
			if (risposta.getSOAPBody().hasFault()) {
				System.out.println(risposta.getSOAPBody().getFault());
			} else {
				SOAPBody body = risposta.getSOAPBody();
				Node nodoRisposta = null;
				if( (nodoRisposta = body.getFirstChild()) != null ) {
					Node risultato = nodoRisposta.getFirstChild();
					Node text = risultato.getFirstChild();
					szRisultato = text.getNodeValue();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static SOAPMessage invokeDynamic(QName serviceName, QName portName, String endpointUrl) throws Exception {
		/** Create a service and add at least one port to it. **/
		Service service = Service.create(serviceName);
		service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpointUrl);

		/** Create a Dispatch instance from a service. **/
		Dispatch<SOAPMessage> dispatch = service.createDispatch(portName,
				SOAPMessage.class, Service.Mode.MESSAGE);

		// The soapActionUri is set here. otherwise we get a error on .net based
		// services.
		dispatch.getRequestContext().put(Dispatch.SOAPACTION_USE_PROPERTY, new Boolean(true));
//		dispatch.getRequestContext().put(Dispatch.SOAPACTION_URI_PROPERTY);

		/** Create SOAPMessage request. **/
		// compose a request message
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage message = messageFactory.createMessage();

		// Create objects for the message parts
		SOAPPart soapPart = message.getSOAPPart();
		SOAPEnvelope envelope = soapPart.getEnvelope();
		SOAPBody body = envelope.getBody();

		// Populate the Message. In here, I populate the message from a xml file
		StreamSource preppedMsgSrc = new StreamSource(new FileInputStream("resources/req.xml"));
		soapPart.setContent(preppedMsgSrc);

		// Save the message
		message.saveChanges();
		//System.out.println(message.getSOAPBody().getFirstChild().getTextContent());

		SOAPMessage response = (SOAPMessage) dispatch.invoke(message);

		return response;
	}

	private static String getSOAPMessageAsString(SOAPMessage msg) {
		ByteArrayOutputStream baos = null;
		String s = null;
		try {
			baos = new ByteArrayOutputStream();
			msg.writeTo(baos);
			s = baos.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

}
