
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}MiningSchema"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelExplanation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Node"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="missingValueStrategy" type="{http://www.dmg.org/PMML-4_0}MISSING-VALUE-STRATEGY" default="none" />
 *       &lt;attribute name="missingValuePenalty" type="{http://www.dmg.org/PMML-4_0}PROB-NUMBER" default="1.0" />
 *       &lt;attribute name="noTrueChildStrategy" type="{http://www.dmg.org/PMML-4_0}NO-TRUE-CHILD-STRATEGY" default="returnNullPrediction" />
 *       &lt;attribute name="splitCharacteristic" default="multiSplit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="binarySplit"/>
 *             &lt;enumeration value="multiSplit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndNodesAndMiningSchemas"
})
@XmlRootElement(name = "TreeModel")
public class TreeModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "ModelVerification", required = true, type = ModelVerification.class),
        @XmlElement(name = "LocalTransformations", required = true, type = LocalTransformations.class),
        @XmlElement(name = "Targets", required = true, type = Targets.class),
        @XmlElement(name = "Node", required = true, type = Node.class),
        @XmlElement(name = "Output", required = true, type = Output.class),
        @XmlElement(name = "ModelStats", required = true, type = ModelStats.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "ModelExplanation", required = true, type = ModelExplanation.class),
        @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class)
    })
    protected List<Object> extensionsAndNodesAndMiningSchemas;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute
    protected MISSINGVALUESTRATEGY missingValueStrategy;
    @XmlAttribute
    protected BigDecimal missingValuePenalty;
    @XmlAttribute
    protected NOTRUECHILDSTRATEGY noTrueChildStrategy;
    @XmlAttribute
    protected String splitCharacteristic;

    /**
     * Gets the value of the extensionsAndNodesAndMiningSchemas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndNodesAndMiningSchemas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndNodesAndMiningSchemas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelVerification }
     * {@link LocalTransformations }
     * {@link Targets }
     * {@link Node }
     * {@link Output }
     * {@link ModelStats }
     * {@link Extension }
     * {@link ModelExplanation }
     * {@link MiningSchema }
     * 
     * 
     */
    public List<Object> getExtensionsAndNodesAndMiningSchemas() {
        if (extensionsAndNodesAndMiningSchemas == null) {
            extensionsAndNodesAndMiningSchemas = new ArrayList<Object>();
        }
        return this.extensionsAndNodesAndMiningSchemas;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    public MININGFUNCTION getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MININGFUNCTION }
     *     
     */
    public void setFunctionName(MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the algorithmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Sets the value of the algorithmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Gets the value of the missingValueStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link MISSINGVALUESTRATEGY }
     *     
     */
    public MISSINGVALUESTRATEGY getMissingValueStrategy() {
        if (missingValueStrategy == null) {
            return MISSINGVALUESTRATEGY.NONE;
        } else {
            return missingValueStrategy;
        }
    }

    /**
     * Sets the value of the missingValueStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISSINGVALUESTRATEGY }
     *     
     */
    public void setMissingValueStrategy(MISSINGVALUESTRATEGY value) {
        this.missingValueStrategy = value;
    }

    /**
     * Gets the value of the missingValuePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMissingValuePenalty() {
        if (missingValuePenalty == null) {
            return new BigDecimal("1.0");
        } else {
            return missingValuePenalty;
        }
    }

    /**
     * Sets the value of the missingValuePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMissingValuePenalty(BigDecimal value) {
        this.missingValuePenalty = value;
    }

    /**
     * Gets the value of the noTrueChildStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link NOTRUECHILDSTRATEGY }
     *     
     */
    public NOTRUECHILDSTRATEGY getNoTrueChildStrategy() {
        if (noTrueChildStrategy == null) {
            return NOTRUECHILDSTRATEGY.RETURN_NULL_PREDICTION;
        } else {
            return noTrueChildStrategy;
        }
    }

    /**
     * Sets the value of the noTrueChildStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTRUECHILDSTRATEGY }
     *     
     */
    public void setNoTrueChildStrategy(NOTRUECHILDSTRATEGY value) {
        this.noTrueChildStrategy = value;
    }

    /**
     * Gets the value of the splitCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitCharacteristic() {
        if (splitCharacteristic == null) {
            return "multiSplit";
        } else {
            return splitCharacteristic;
        }
    }

    /**
     * Sets the value of the splitCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitCharacteristic(String value) {
        this.splitCharacteristic = value;
    }

}
