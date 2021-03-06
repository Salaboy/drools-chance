
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Constraints" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Itemset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}SetPredicate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Sequence" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}SequenceRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTransactions" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="numberOfTransactionGroups" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndSequencesAndMiningSchemas"
})
@XmlRootElement(name = "SequenceModel")
public class SequenceModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "Sequence", required = true, type = Sequence.class),
        @XmlElement(name = "Itemset", required = true, type = Itemset.class),
        @XmlElement(name = "Constraints", required = true, type = Constraints.class),
        @XmlElement(name = "LocalTransformations", required = true, type = LocalTransformations.class),
        @XmlElement(name = "SequenceRule", required = true, type = SequenceRule.class),
        @XmlElement(name = "Item", required = true, type = Item.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "SetPredicate", required = true, type = SetPredicate.class),
        @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class),
        @XmlElement(name = "ModelStats", required = true, type = ModelStats.class)
    })
    protected List<Object> extensionsAndSequencesAndMiningSchemas;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute
    protected BigInteger numberOfTransactions;
    @XmlAttribute
    protected BigInteger maxNumberOfItemsPerTransaction;
    @XmlAttribute
    protected Double avgNumberOfItemsPerTransaction;
    @XmlAttribute
    protected BigInteger numberOfTransactionGroups;
    @XmlAttribute
    protected BigInteger maxNumberOfTAsPerTAGroup;
    @XmlAttribute
    protected Double avgNumberOfTAsPerTAGroup;

    /**
     * Gets the value of the extensionsAndSequencesAndMiningSchemas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndSequencesAndMiningSchemas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndSequencesAndMiningSchemas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sequence }
     * {@link Itemset }
     * {@link Constraints }
     * {@link LocalTransformations }
     * {@link SequenceRule }
     * {@link Item }
     * {@link Extension }
     * {@link SetPredicate }
     * {@link MiningSchema }
     * {@link ModelStats }
     * 
     * 
     */
    public List<Object> getExtensionsAndSequencesAndMiningSchemas() {
        if (extensionsAndSequencesAndMiningSchemas == null) {
            extensionsAndSequencesAndMiningSchemas = new ArrayList<Object>();
        }
        return this.extensionsAndSequencesAndMiningSchemas;
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
     * Gets the value of the numberOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransactions() {
        return numberOfTransactions;
    }

    /**
     * Sets the value of the numberOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransactions(BigInteger value) {
        this.numberOfTransactions = value;
    }

    /**
     * Gets the value of the maxNumberOfItemsPerTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfItemsPerTransaction() {
        return maxNumberOfItemsPerTransaction;
    }

    /**
     * Sets the value of the maxNumberOfItemsPerTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfItemsPerTransaction(BigInteger value) {
        this.maxNumberOfItemsPerTransaction = value;
    }

    /**
     * Gets the value of the avgNumberOfItemsPerTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgNumberOfItemsPerTransaction() {
        return avgNumberOfItemsPerTransaction;
    }

    /**
     * Sets the value of the avgNumberOfItemsPerTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgNumberOfItemsPerTransaction(Double value) {
        this.avgNumberOfItemsPerTransaction = value;
    }

    /**
     * Gets the value of the numberOfTransactionGroups property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransactionGroups() {
        return numberOfTransactionGroups;
    }

    /**
     * Sets the value of the numberOfTransactionGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransactionGroups(BigInteger value) {
        this.numberOfTransactionGroups = value;
    }

    /**
     * Gets the value of the maxNumberOfTAsPerTAGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfTAsPerTAGroup() {
        return maxNumberOfTAsPerTAGroup;
    }

    /**
     * Sets the value of the maxNumberOfTAsPerTAGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfTAsPerTAGroup(BigInteger value) {
        this.maxNumberOfTAsPerTAGroup = value;
    }

    /**
     * Gets the value of the avgNumberOfTAsPerTAGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgNumberOfTAsPerTAGroup() {
        return avgNumberOfTAsPerTAGroup;
    }

    /**
     * Sets the value of the avgNumberOfTAsPerTAGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgNumberOfTAsPerTAGroup(Double value) {
        this.avgNumberOfTAsPerTAGroup = value;
    }

}
