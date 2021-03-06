
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}PREDICATE"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}ClusteringModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}GeneralRegressionModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}NaiveBayesModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}NeuralNetwork"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}RegressionModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}RuleSetModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}SupportVectorMachineModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}TreeModel"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndSimplePredicatesAndCompoundPredicates",
    "treeModel",
    "supportVectorMachineModel",
    "ruleSetModel",
    "regressionModel",
    "neuralNetwork",
    "naiveBayesModel",
    "generalRegressionModel",
    "clusteringModel"
})
@XmlRootElement(name = "Segment")
public class Segment
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "True", type = True.class),
        @XmlElement(name = "False", type = False.class),
        @XmlElement(name = "SimpleSetPredicate", type = SimpleSetPredicate.class),
        @XmlElement(name = "CompoundPredicate", type = CompoundPredicate.class),
        @XmlElement(name = "SimplePredicate", type = SimplePredicate.class),
        @XmlElement(name = "Extension", type = Extension.class)
    })
    protected List<Object> extensionsAndSimplePredicatesAndCompoundPredicates;
    @XmlElement(name = "TreeModel")
    protected TreeModel treeModel;
    @XmlElement(name = "SupportVectorMachineModel")
    protected SupportVectorMachineModel supportVectorMachineModel;
    @XmlElement(name = "RuleSetModel")
    protected RuleSetModel ruleSetModel;
    @XmlElement(name = "RegressionModel")
    protected RegressionModel regressionModel;
    @XmlElement(name = "NeuralNetwork")
    protected NeuralNetwork neuralNetwork;
    @XmlElement(name = "NaiveBayesModel")
    protected NaiveBayesModel naiveBayesModel;
    @XmlElement(name = "GeneralRegressionModel")
    protected GeneralRegressionModel generalRegressionModel;
    @XmlElement(name = "ClusteringModel")
    protected ClusteringModel clusteringModel;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected Double weight;

    /**
     * Gets the value of the extensionsAndSimplePredicatesAndCompoundPredicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndSimplePredicatesAndCompoundPredicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndSimplePredicatesAndCompoundPredicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link True }
     * {@link False }
     * {@link SimpleSetPredicate }
     * {@link CompoundPredicate }
     * {@link SimplePredicate }
     * {@link Extension }
     * 
     * 
     */
    public List<Object> getExtensionsAndSimplePredicatesAndCompoundPredicates() {
        if (extensionsAndSimplePredicatesAndCompoundPredicates == null) {
            extensionsAndSimplePredicatesAndCompoundPredicates = new ArrayList<Object>();
        }
        return this.extensionsAndSimplePredicatesAndCompoundPredicates;
    }

    /**
     * Gets the value of the treeModel property.
     * 
     * @return
     *     possible object is
     *     {@link TreeModel }
     *     
     */
    public TreeModel getTreeModel() {
        return treeModel;
    }

    /**
     * Sets the value of the treeModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreeModel }
     *     
     */
    public void setTreeModel(TreeModel value) {
        this.treeModel = value;
    }

    /**
     * Gets the value of the supportVectorMachineModel property.
     * 
     * @return
     *     possible object is
     *     {@link SupportVectorMachineModel }
     *     
     */
    public SupportVectorMachineModel getSupportVectorMachineModel() {
        return supportVectorMachineModel;
    }

    /**
     * Sets the value of the supportVectorMachineModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportVectorMachineModel }
     *     
     */
    public void setSupportVectorMachineModel(SupportVectorMachineModel value) {
        this.supportVectorMachineModel = value;
    }

    /**
     * Gets the value of the ruleSetModel property.
     * 
     * @return
     *     possible object is
     *     {@link RuleSetModel }
     *     
     */
    public RuleSetModel getRuleSetModel() {
        return ruleSetModel;
    }

    /**
     * Sets the value of the ruleSetModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSetModel }
     *     
     */
    public void setRuleSetModel(RuleSetModel value) {
        this.ruleSetModel = value;
    }

    /**
     * Gets the value of the regressionModel property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionModel }
     *     
     */
    public RegressionModel getRegressionModel() {
        return regressionModel;
    }

    /**
     * Sets the value of the regressionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionModel }
     *     
     */
    public void setRegressionModel(RegressionModel value) {
        this.regressionModel = value;
    }

    /**
     * Gets the value of the neuralNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link NeuralNetwork }
     *     
     */
    public NeuralNetwork getNeuralNetwork() {
        return neuralNetwork;
    }

    /**
     * Sets the value of the neuralNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeuralNetwork }
     *     
     */
    public void setNeuralNetwork(NeuralNetwork value) {
        this.neuralNetwork = value;
    }

    /**
     * Gets the value of the naiveBayesModel property.
     * 
     * @return
     *     possible object is
     *     {@link NaiveBayesModel }
     *     
     */
    public NaiveBayesModel getNaiveBayesModel() {
        return naiveBayesModel;
    }

    /**
     * Sets the value of the naiveBayesModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaiveBayesModel }
     *     
     */
    public void setNaiveBayesModel(NaiveBayesModel value) {
        this.naiveBayesModel = value;
    }

    /**
     * Gets the value of the generalRegressionModel property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralRegressionModel }
     *     
     */
    public GeneralRegressionModel getGeneralRegressionModel() {
        return generalRegressionModel;
    }

    /**
     * Sets the value of the generalRegressionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralRegressionModel }
     *     
     */
    public void setGeneralRegressionModel(GeneralRegressionModel value) {
        this.generalRegressionModel = value;
    }

    /**
     * Gets the value of the clusteringModel property.
     * 
     * @return
     *     possible object is
     *     {@link ClusteringModel }
     *     
     */
    public ClusteringModel getClusteringModel() {
        return clusteringModel;
    }

    /**
     * Sets the value of the clusteringModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusteringModel }
     *     
     */
    public void setClusteringModel(ClusteringModel value) {
        this.clusteringModel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
