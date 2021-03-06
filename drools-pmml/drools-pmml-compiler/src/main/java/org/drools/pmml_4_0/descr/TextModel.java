
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TextDictionary"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TextCorpus"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}DocumentTermMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TextModelNormalization" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TextModelSimiliarity" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTerms" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numberOfDocuments" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndDocumentTermMatrixesAndTextCorpuses"
})
@XmlRootElement(name = "TextModel")
public class TextModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "ModelExplanation", required = true, type = ModelExplanation.class),
        @XmlElement(name = "ModelVerification", required = true, type = ModelVerification.class),
        @XmlElement(name = "ModelStats", required = true, type = ModelStats.class),
        @XmlElement(name = "TextModelNormalization", required = true, type = TextModelNormalization.class),
        @XmlElement(name = "DocumentTermMatrix", required = true, type = DocumentTermMatrix.class),
        @XmlElement(name = "TextModelSimiliarity", required = true, type = TextModelSimiliarity.class),
        @XmlElement(name = "Output", required = true, type = Output.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "LocalTransformations", required = true, type = LocalTransformations.class),
        @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class),
        @XmlElement(name = "TextDictionary", required = true, type = TextDictionary.class),
        @XmlElement(name = "Targets", required = true, type = Targets.class),
        @XmlElement(name = "TextCorpus", required = true, type = TextCorpus.class)
    })
    protected List<Object> extensionsAndDocumentTermMatrixesAndTextCorpuses;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute(required = true)
    protected BigInteger numberOfTerms;
    @XmlAttribute(required = true)
    protected BigInteger numberOfDocuments;

    /**
     * Gets the value of the extensionsAndDocumentTermMatrixesAndTextCorpuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndDocumentTermMatrixesAndTextCorpuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndDocumentTermMatrixesAndTextCorpuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelExplanation }
     * {@link ModelVerification }
     * {@link ModelStats }
     * {@link TextModelNormalization }
     * {@link DocumentTermMatrix }
     * {@link TextModelSimiliarity }
     * {@link Output }
     * {@link Extension }
     * {@link LocalTransformations }
     * {@link MiningSchema }
     * {@link TextDictionary }
     * {@link Targets }
     * {@link TextCorpus }
     * 
     * 
     */
    public List<Object> getExtensionsAndDocumentTermMatrixesAndTextCorpuses() {
        if (extensionsAndDocumentTermMatrixesAndTextCorpuses == null) {
            extensionsAndDocumentTermMatrixesAndTextCorpuses = new ArrayList<Object>();
        }
        return this.extensionsAndDocumentTermMatrixesAndTextCorpuses;
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
     * Gets the value of the numberOfTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTerms() {
        return numberOfTerms;
    }

    /**
     * Sets the value of the numberOfTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTerms(BigInteger value) {
        this.numberOfTerms = value;
    }

    /**
     * Gets the value of the numberOfDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDocuments() {
        return numberOfDocuments;
    }

    /**
     * Sets the value of the numberOfDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDocuments(BigInteger value) {
        this.numberOfDocuments = value;
    }

}
