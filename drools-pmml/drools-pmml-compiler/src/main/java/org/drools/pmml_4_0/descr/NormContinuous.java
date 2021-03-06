
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LinearNorm" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mapMissingTo" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="outliers" type="{http://www.dmg.org/PMML-4_0}OUTLIER-TREATMENT-METHOD" default="asIs" />
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
    "linearNorms"
})
@XmlRootElement(name = "NormContinuous")
public class NormContinuous implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "LinearNorm", required = true)
    protected List<LinearNorm> linearNorms;
    @XmlAttribute
    protected Double mapMissingTo;
    @XmlAttribute(required = true)
    protected String field;
    @XmlAttribute
    protected OUTLIERTREATMENTMETHOD outliers;

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
     * Gets the value of the linearNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearNorm }
     * 
     * 
     */
    public List<LinearNorm> getLinearNorms() {
        if (linearNorms == null) {
            linearNorms = new ArrayList<LinearNorm>();
        }
        return this.linearNorms;
    }

    /**
     * Gets the value of the mapMissingTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMapMissingTo() {
        return mapMissingTo;
    }

    /**
     * Sets the value of the mapMissingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMapMissingTo(Double value) {
        this.mapMissingTo = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the outliers property.
     * 
     * @return
     *     possible object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public OUTLIERTREATMENTMETHOD getOutliers() {
        if (outliers == null) {
            return OUTLIERTREATMENTMETHOD.AS_IS;
        } else {
            return outliers;
        }
    }

    /**
     * Sets the value of the outliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public void setOutliers(OUTLIERTREATMENTMETHOD value) {
        this.outliers = value;
    }

}
