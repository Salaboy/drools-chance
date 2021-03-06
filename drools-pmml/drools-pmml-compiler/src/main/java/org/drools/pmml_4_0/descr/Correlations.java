
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}CorrelationFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}CorrelationValues"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}CorrelationMethods" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions",
    "correlationFields",
    "correlationValues",
    "correlationMethods"
})
@XmlRootElement(name = "Correlations")
public class Correlations
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "CorrelationFields", required = true)
    protected CorrelationFields correlationFields;
    @XmlElement(name = "CorrelationValues", required = true)
    protected CorrelationValues correlationValues;
    @XmlElement(name = "CorrelationMethods")
    protected CorrelationMethods correlationMethods;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the correlationFields property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationFields }
     *     
     */
    public CorrelationFields getCorrelationFields() {
        return correlationFields;
    }

    /**
     * Sets the value of the correlationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationFields }
     *     
     */
    public void setCorrelationFields(CorrelationFields value) {
        this.correlationFields = value;
    }

    /**
     * Gets the value of the correlationValues property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationValues }
     *     
     */
    public CorrelationValues getCorrelationValues() {
        return correlationValues;
    }

    /**
     * Sets the value of the correlationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationValues }
     *     
     */
    public void setCorrelationValues(CorrelationValues value) {
        this.correlationValues = value;
    }

    /**
     * Gets the value of the correlationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationMethods }
     *     
     */
    public CorrelationMethods getCorrelationMethods() {
        return correlationMethods;
    }

    /**
     * Sets the value of the correlationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationMethods }
     *     
     */
    public void setCorrelationMethods(CorrelationMethods value) {
        this.correlationMethods = value;
    }

}
