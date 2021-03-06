
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Header"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}MiningBuildTask" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}DataDictionary"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TransformationDictionary" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}AssociationModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}ClusteringModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}GeneralRegressionModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}MiningModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}NaiveBayesModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}NeuralNetwork"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}RegressionModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}RuleSetModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}SequenceModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}SupportVectorMachineModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}TextModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeSeriesModel"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}TreeModel"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "miningBuildTask",
    "dataDictionary",
    "transformationDictionary",
    "associationModelsAndClusteringModelsAndGeneralRegressionModels",
    "extensions"
})
@XmlRootElement(name = "PMML")
public class PMML
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "MiningBuildTask")
    protected MiningBuildTask miningBuildTask;
    @XmlElement(name = "DataDictionary", required = true)
    protected DataDictionary dataDictionary;
    @XmlElement(name = "TransformationDictionary")
    protected TransformationDictionary transformationDictionary;
    @XmlElements({
        @XmlElement(name = "ClusteringModel", type = ClusteringModel.class),
        @XmlElement(name = "AssociationModel", type = AssociationModel.class),
        @XmlElement(name = "MiningModel", type = MiningModel.class),
        @XmlElement(name = "RegressionModel", type = RegressionModel.class),
        @XmlElement(name = "RuleSetModel", type = RuleSetModel.class),
        @XmlElement(name = "GeneralRegressionModel", type = GeneralRegressionModel.class),
        @XmlElement(name = "TextModel", type = TextModel.class),
        @XmlElement(name = "NaiveBayesModel", type = NaiveBayesModel.class),
        @XmlElement(name = "NeuralNetwork", type = NeuralNetwork.class),
        @XmlElement(name = "SequenceModel", type = SequenceModel.class),
        @XmlElement(name = "TimeSeriesModel", type = TimeSeriesModel.class),
        @XmlElement(name = "SupportVectorMachineModel", type = SupportVectorMachineModel.class),
        @XmlElement(name = "TreeModel", type = TreeModel.class)
    })
    protected List<Object> associationModelsAndClusteringModelsAndGeneralRegressionModels;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the miningBuildTask property.
     * 
     * @return
     *     possible object is
     *     {@link MiningBuildTask }
     *     
     */
    public MiningBuildTask getMiningBuildTask() {
        return miningBuildTask;
    }

    /**
     * Sets the value of the miningBuildTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiningBuildTask }
     *     
     */
    public void setMiningBuildTask(MiningBuildTask value) {
        this.miningBuildTask = value;
    }

    /**
     * Gets the value of the dataDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DataDictionary }
     *     
     */
    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    /**
     * Sets the value of the dataDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDictionary }
     *     
     */
    public void setDataDictionary(DataDictionary value) {
        this.dataDictionary = value;
    }

    /**
     * Gets the value of the transformationDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link TransformationDictionary }
     *     
     */
    public TransformationDictionary getTransformationDictionary() {
        return transformationDictionary;
    }

    /**
     * Sets the value of the transformationDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationDictionary }
     *     
     */
    public void setTransformationDictionary(TransformationDictionary value) {
        this.transformationDictionary = value;
    }

    /**
     * Gets the value of the associationModelsAndClusteringModelsAndGeneralRegressionModels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationModelsAndClusteringModelsAndGeneralRegressionModels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationModelsAndClusteringModelsAndGeneralRegressionModels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusteringModel }
     * {@link AssociationModel }
     * {@link MiningModel }
     * {@link RegressionModel }
     * {@link RuleSetModel }
     * {@link GeneralRegressionModel }
     * {@link TextModel }
     * {@link NaiveBayesModel }
     * {@link NeuralNetwork }
     * {@link SequenceModel }
     * {@link TimeSeriesModel }
     * {@link SupportVectorMachineModel }
     * {@link TreeModel }
     * 
     * 
     */
    public List<Object> getAssociationModelsAndClusteringModelsAndGeneralRegressionModels() {
        if (associationModelsAndClusteringModelsAndGeneralRegressionModels == null) {
            associationModelsAndClusteringModelsAndGeneralRegressionModels = new ArrayList<Object>();
        }
        return this.associationModelsAndClusteringModelsAndGeneralRegressionModels;
    }

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
