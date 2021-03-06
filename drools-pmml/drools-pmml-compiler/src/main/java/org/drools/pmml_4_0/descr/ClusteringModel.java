
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelExplanation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ComparisonMeasure"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ClusteringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}MissingValueWeights" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Cluster" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modelClass" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="centerBased"/>
 *             &lt;enumeration value="distributionBased"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="numberOfClusters" use="required" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndClustersAndComparisonMeasures"
})
@XmlRootElement(name = "ClusteringModel")
public class ClusteringModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "ModelStats", required = true, type = ModelStats.class),
        @XmlElement(name = "MissingValueWeights", required = true, type = MissingValueWeights.class),
        @XmlElement(name = "ModelExplanation", required = true, type = ModelExplanation.class),
        @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class),
        @XmlElement(name = "Output", required = true, type = Output.class),
        @XmlElement(name = "ClusteringField", required = true, type = ClusteringField.class),
        @XmlElement(name = "LocalTransformations", required = true, type = LocalTransformations.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "ComparisonMeasure", required = true, type = ComparisonMeasure.class),
        @XmlElement(name = "Cluster", required = true, type = Cluster.class),
        @XmlElement(name = "ModelVerification", required = true, type = ModelVerification.class)
    })
    protected List<Object> extensionsAndClustersAndComparisonMeasures;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute(required = true)
    protected String modelClass;
    @XmlAttribute(required = true)
    protected BigInteger numberOfClusters;

    /**
     * Gets the value of the extensionsAndClustersAndComparisonMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndClustersAndComparisonMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndClustersAndComparisonMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelStats }
     * {@link MissingValueWeights }
     * {@link ModelExplanation }
     * {@link MiningSchema }
     * {@link Output }
     * {@link ClusteringField }
     * {@link LocalTransformations }
     * {@link Extension }
     * {@link ComparisonMeasure }
     * {@link Cluster }
     * {@link ModelVerification }
     * 
     * 
     */
    public List<Object> getExtensionsAndClustersAndComparisonMeasures() {
        if (extensionsAndClustersAndComparisonMeasures == null) {
            extensionsAndClustersAndComparisonMeasures = new ArrayList<Object>();
        }
        return this.extensionsAndClustersAndComparisonMeasures;
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
     * Gets the value of the modelClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelClass() {
        return modelClass;
    }

    /**
     * Sets the value of the modelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelClass(String value) {
        this.modelClass = value;
    }

    /**
     * Gets the value of the numberOfClusters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfClusters() {
        return numberOfClusters;
    }

    /**
     * Sets the value of the numberOfClusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfClusters(BigInteger value) {
        this.numberOfClusters = value;
    }

}
