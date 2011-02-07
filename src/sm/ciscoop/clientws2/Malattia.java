
package sm.ciscoop.clientws2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for malattia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="malattia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="array" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prova" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "malattia", propOrder = {
    "array",
    "prova"
})
public class Malattia {

    @XmlElement(nillable = true)
    protected List<Object> array;
    protected String prova;

    /**
     * Gets the value of the array property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the array property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getArray() {
        if (array == null) {
            array = new ArrayList<Object>();
        }
        return this.array;
    }

    /**
     * Gets the value of the prova property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProva() {
        return prova;
    }

    /**
     * Sets the value of the prova property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProva(String value) {
        this.prova = value;
    }

}
