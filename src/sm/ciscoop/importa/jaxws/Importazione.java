
package sm.ciscoop.importa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import sm.ciscoop.importa.Malattia;

@XmlRootElement(name = "importazione", namespace = "http://importa.ciscoop.sm/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importazione", namespace = "http://importa.ciscoop.sm/")
public class Importazione {

    @XmlElement(name = "arg0", namespace = "")
    private Malattia arg0;

    /**
     * 
     * @return
     *     returns Malattia
     */
    public Malattia getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Malattia arg0) {
        this.arg0 = arg0;
    }

}
