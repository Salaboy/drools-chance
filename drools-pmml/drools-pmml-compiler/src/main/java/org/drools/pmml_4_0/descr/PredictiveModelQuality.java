
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ConfusionMatrix" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LiftData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ROC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetField" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataUsage" default="training">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="training"/>
 *             &lt;enumeration value="test"/>
 *             &lt;enumeration value="validation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="meanError" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="meanAbsoluteError" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="meanSquaredError" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="r-squared" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
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
    "confusionMatrix",
    "liftData",
    "roc"
})
@XmlRootElement(name = "PredictiveModelQuality")
public class PredictiveModelQuality
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "ConfusionMatrix")
    protected ConfusionMatrix confusionMatrix;
    @XmlElement(name = "LiftData")
    protected LiftData liftData;
    @XmlElement(name = "ROC")
    protected ROC roc;
    @XmlAttribute(required = true)
    protected String targetField;
    @XmlAttribute
    protected String dataName;
    @XmlAttribute
    protected String dataUsage;
    @XmlAttribute
    protected Double meanError;
    @XmlAttribute
    protected Double meanAbsoluteError;
    @XmlAttribute
    protected Double meanSquaredError;
    @XmlAttribute(name = "r-squared")
    protected Double rSquared;

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
     * Gets the value of the confusionMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link ConfusionMatrix }
     *     
     */
    public ConfusionMatrix getConfusionMatrix() {
        return confusionMatrix;
    }

    /**
     * Sets the value of the confusionMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfusionMatrix }
     *     
     */
    public void setConfusionMatrix(ConfusionMatrix value) {
        this.confusionMatrix = value;
    }

    /**
     * Gets the value of the liftData property.
     * 
     * @return
     *     possible object is
     *     {@link LiftData }
     *     
     */
    public LiftData getLiftData() {
        return liftData;
    }

    /**
     * Sets the value of the liftData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiftData }
     *     
     */
    public void setLiftData(LiftData value) {
        this.liftData = value;
    }

    /**
     * Gets the value of the roc property.
     * 
     * @return
     *     possible object is
     *     {@link ROC }
     *     
     */
    public ROC getROC() {
        return roc;
    }

    /**
     * Sets the value of the roc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROC }
     *     
     */
    public void setROC(ROC value) {
        this.roc = value;
    }

    /**
     * Gets the value of the targetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetField() {
        return targetField;
    }

    /**
     * Sets the value of the targetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetField(String value) {
        this.targetField = value;
    }

    /**
     * Gets the value of the dataName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * Sets the value of the dataName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataName(String value) {
        this.dataName = value;
    }

    /**
     * Gets the value of the dataUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUsage() {
        if (dataUsage == null) {
            return "training";
        } else {
            return dataUsage;
        }
    }

    /**
     * Sets the value of the dataUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUsage(String value) {
        this.dataUsage = value;
    }

    /**
     * Gets the value of the meanError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanError() {
        return meanError;
    }

    /**
     * Sets the value of the meanError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanError(Double value) {
        this.meanError = value;
    }

    /**
     * Gets the value of the meanAbsoluteError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanAbsoluteError() {
        return meanAbsoluteError;
    }

    /**
     * Sets the value of the meanAbsoluteError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanAbsoluteError(Double value) {
        this.meanAbsoluteError = value;
    }

    /**
     * Gets the value of the meanSquaredError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanSquaredError() {
        return meanSquaredError;
    }

    /**
     * Sets the value of the meanSquaredError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanSquaredError(Double value) {
        this.meanSquaredError = value;
    }

    /**
     * Gets the value of the rSquared property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRSquared() {
        return rSquared;
    }

    /**
     * Sets the value of the rSquared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRSquared(Double value) {
        this.rSquared = value;
    }

}
