
package sm.ciscoop.clientws2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sm.ciscoop.clientws2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImportaMalattieResponse_QNAME = new QName("http://importa.ciscoop.sm/", "importaMalattieResponse");
    private final static QName _ImportaMalattie_QNAME = new QName("http://importa.ciscoop.sm/", "importaMalattie");
    private final static QName _IsOnlineResponse_QNAME = new QName("http://importa.ciscoop.sm/", "isOnlineResponse");
    private final static QName _Importazione_QNAME = new QName("http://importa.ciscoop.sm/", "importazione");
    private final static QName _IsOnline_QNAME = new QName("http://importa.ciscoop.sm/", "isOnline");
    private final static QName _ImportazioneResponse_QNAME = new QName("http://importa.ciscoop.sm/", "importazioneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sm.ciscoop.clientws2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportazioneResponse }
     * 
     */
    public ImportazioneResponse createImportazioneResponse() {
        return new ImportazioneResponse();
    }

    /**
     * Create an instance of {@link Importazione }
     * 
     */
    public Importazione createImportazione() {
        return new Importazione();
    }

    /**
     * Create an instance of {@link IsOnline }
     * 
     */
    public IsOnline createIsOnline() {
        return new IsOnline();
    }

    /**
     * Create an instance of {@link Malattia }
     * 
     */
    public Malattia createMalattia() {
        return new Malattia();
    }

    /**
     * Create an instance of {@link IsOnlineResponse }
     * 
     */
    public IsOnlineResponse createIsOnlineResponse() {
        return new IsOnlineResponse();
    }

    /**
     * Create an instance of {@link ImportaMalattieResponse }
     * 
     */
    public ImportaMalattieResponse createImportaMalattieResponse() {
        return new ImportaMalattieResponse();
    }

    /**
     * Create an instance of {@link ImportaMalattie }
     * 
     */
    public ImportaMalattie createImportaMalattie() {
        return new ImportaMalattie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportaMalattieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "importaMalattieResponse")
    public JAXBElement<ImportaMalattieResponse> createImportaMalattieResponse(ImportaMalattieResponse value) {
        return new JAXBElement<ImportaMalattieResponse>(_ImportaMalattieResponse_QNAME, ImportaMalattieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportaMalattie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "importaMalattie")
    public JAXBElement<ImportaMalattie> createImportaMalattie(ImportaMalattie value) {
        return new JAXBElement<ImportaMalattie>(_ImportaMalattie_QNAME, ImportaMalattie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOnlineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "isOnlineResponse")
    public JAXBElement<IsOnlineResponse> createIsOnlineResponse(IsOnlineResponse value) {
        return new JAXBElement<IsOnlineResponse>(_IsOnlineResponse_QNAME, IsOnlineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Importazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "importazione")
    public JAXBElement<Importazione> createImportazione(Importazione value) {
        return new JAXBElement<Importazione>(_Importazione_QNAME, Importazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOnline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "isOnline")
    public JAXBElement<IsOnline> createIsOnline(IsOnline value) {
        return new JAXBElement<IsOnline>(_IsOnline_QNAME, IsOnline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportazioneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importa.ciscoop.sm/", name = "importazioneResponse")
    public JAXBElement<ImportazioneResponse> createImportazioneResponse(ImportazioneResponse value) {
        return new JAXBElement<ImportazioneResponse>(_ImportazioneResponse_QNAME, ImportazioneResponse.class, null, value);
    }

}
