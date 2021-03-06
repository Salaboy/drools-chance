
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_0}OPTYPE" />
 *       &lt;attribute name="dataType" type="{http://www.dmg.org/PMML-4_0}DATATYPE" />
 *       &lt;attribute name="targetField" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="feature" type="{http://www.dmg.org/PMML-4_0}RESULT-FEATURE" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ruleFeature" type="{http://www.dmg.org/PMML-4_0}RULE-FEATURE" default="consequent" />
 *       &lt;attribute name="algorithm" default="exclusiveRecommendation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="recommendation"/>
 *             &lt;enumeration value="exclusiveRecommendation"/>
 *             &lt;enumeration value="ruleAssociation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rank" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" default="1" />
 *       &lt;attribute name="rankBasis" default="confidence">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="confidence"/>
 *             &lt;enumeration value="support"/>
 *             &lt;enumeration value="lift"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rankOrder" default="descending">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="descending"/>
 *             &lt;enumeration value="ascending"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isMultiValued" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions"
})
@XmlRootElement(name = "OutputField")
public class OutputField
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String displayName;
    @XmlAttribute
    protected OPTYPE optype;
    @XmlAttribute
    protected DATATYPE dataType;
    @XmlAttribute
    protected String targetField;
    @XmlAttribute
    protected RESULTFEATURE feature;
    @XmlAttribute
    protected String value;
    @XmlAttribute
    protected RULEFEATURE ruleFeature;
    @XmlAttribute
    protected String algorithm;
    @XmlAttribute
    protected BigInteger rank;
    @XmlAttribute
    protected String rankBasis;
    @XmlAttribute
    protected String rankOrder;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String isMultiValued;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the optype property.
     * 
     * @return
     *     possible object is
     *     {@link OPTYPE }
     *     
     */
    public OPTYPE getOptype() {
        return optype;
    }

    /**
     * Sets the value of the optype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTYPE }
     *     
     */
    public void setOptype(OPTYPE value) {
        this.optype = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DATATYPE }
     *     
     */
    public DATATYPE getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPE }
     *     
     */
    public void setDataType(DATATYPE value) {
        this.dataType = value;
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
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link RESULTFEATURE }
     *     
     */
    public RESULTFEATURE getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESULTFEATURE }
     *     
     */
    public void setFeature(RESULTFEATURE value) {
        this.feature = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the ruleFeature property.
     * 
     * @return
     *     possible object is
     *     {@link RULEFEATURE }
     *     
     */
    public RULEFEATURE getRuleFeature() {
        if (ruleFeature == null) {
            return RULEFEATURE.CONSEQUENT;
        } else {
            return ruleFeature;
        }
    }

    /**
     * Sets the value of the ruleFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RULEFEATURE }
     *     
     */
    public void setRuleFeature(RULEFEATURE value) {
        this.ruleFeature = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        if (algorithm == null) {
            return "exclusiveRecommendation";
        } else {
            return algorithm;
        }
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        if (rank == null) {
            return new BigInteger("1");
        } else {
            return rank;
        }
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Gets the value of the rankBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankBasis() {
        if (rankBasis == null) {
            return "confidence";
        } else {
            return rankBasis;
        }
    }

    /**
     * Sets the value of the rankBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankBasis(String value) {
        this.rankBasis = value;
    }

    /**
     * Gets the value of the rankOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankOrder() {
        if (rankOrder == null) {
            return "descending";
        } else {
            return rankOrder;
        }
    }

    /**
     * Sets the value of the rankOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankOrder(String value) {
        this.rankOrder = value;
    }

    /**
     * Gets the value of the isMultiValued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiValued() {
        if (isMultiValued == null) {
            return "0";
        } else {
            return isMultiValued;
        }
    }

    /**
     * Sets the value of the isMultiValued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiValued(String value) {
        this.isMultiValued = value;
    }

}
