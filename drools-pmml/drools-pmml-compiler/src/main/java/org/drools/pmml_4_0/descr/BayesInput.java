
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}DerivedField" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}PairCounts" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "derivedField",
    "pairCounts"
})
@XmlRootElement(name = "BayesInput")
public class BayesInput
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "DerivedField")
    protected DerivedField derivedField;
    @XmlElement(name = "PairCounts", required = true)
    protected List<PairCounts> pairCounts;
    @XmlAttribute(required = true)
    protected String fieldName;

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
     * Gets the value of the derivedField property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedField }
     *     
     */
    public DerivedField getDerivedField() {
        return derivedField;
    }

    /**
     * Sets the value of the derivedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedField }
     *     
     */
    public void setDerivedField(DerivedField value) {
        this.derivedField = value;
    }

    /**
     * Gets the value of the pairCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PairCounts }
     * 
     * 
     */
    public List<PairCounts> getPairCounts() {
        if (pairCounts == null) {
            pairCounts = new ArrayList<PairCounts>();
        }
        return this.pairCounts;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
