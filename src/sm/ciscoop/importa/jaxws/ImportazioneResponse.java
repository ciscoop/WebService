
package sm.ciscoop.importa.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import sm.ciscoop.importa.Malattia;

@XmlRootElement(name = "importazioneResponse", namespace = "http://importa.ciscoop.sm/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importazioneResponse", namespace = "http://importa.ciscoop.sm/")
public class ImportazioneResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Malattia> _return;

    /**
     * 
     * @return
     *     returns List<Malattia>
     */
    public List<Malattia> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Malattia> _return) {
        this._return = _return;
    }

}
