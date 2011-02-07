
package sm.ciscoop.clientws2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImportaMalattieService", targetNamespace = "http://importa.ciscoop.sm/", wsdlLocation = "http://localhost:8080/ImportaMalattie/ImportaMalattie?wsdl")
public class ImportaMalattieService
    extends Service
{

    private final static URL IMPORTAMALATTIESERVICE_WSDL_LOCATION;
    private final static WebServiceException IMPORTAMALATTIESERVICE_EXCEPTION;
    private final static QName IMPORTAMALATTIESERVICE_QNAME = new QName("http://importa.ciscoop.sm/", "ImportaMalattieService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ImportaMalattie/ImportaMalattie?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMPORTAMALATTIESERVICE_WSDL_LOCATION = url;
        IMPORTAMALATTIESERVICE_EXCEPTION = e;
    }

    public ImportaMalattieService() {
        super(__getWsdlLocation(), IMPORTAMALATTIESERVICE_QNAME);
    }

    public ImportaMalattieService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMPORTAMALATTIESERVICE_QNAME, features);
    }

    public ImportaMalattieService(URL wsdlLocation) {
        super(wsdlLocation, IMPORTAMALATTIESERVICE_QNAME);
    }

    public ImportaMalattieService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMPORTAMALATTIESERVICE_QNAME, features);
    }

    public ImportaMalattieService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImportaMalattieService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IImportaMalattie
     */
    @WebEndpoint(name = "ImportaMalattiePort")
    public IImportaMalattie getImportaMalattiePort() {
        return super.getPort(new QName("http://importa.ciscoop.sm/", "ImportaMalattiePort"), IImportaMalattie.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IImportaMalattie
     */
    @WebEndpoint(name = "ImportaMalattiePort")
    public IImportaMalattie getImportaMalattiePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://importa.ciscoop.sm/", "ImportaMalattiePort"), IImportaMalattie.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMPORTAMALATTIESERVICE_EXCEPTION!= null) {
            throw IMPORTAMALATTIESERVICE_EXCEPTION;
        }
        return IMPORTAMALATTIESERVICE_WSDL_LOCATION;
    }

}
