
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ParameterList"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}FactorList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}CovariateList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}PPMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}PCovMatrix" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ParamMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}EventValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}BaseCumHazardTables" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetVariableName" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="modelType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="regression"/>
 *             &lt;enumeration value="generalLinear"/>
 *             &lt;enumeration value="multinomialLogistic"/>
 *             &lt;enumeration value="ordinalMultinomial"/>
 *             &lt;enumeration value="generalizedLinear"/>
 *             &lt;enumeration value="CoxRegression"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetReferenceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cumulativeLink" type="{http://www.dmg.org/PMML-4_0}CUMULATIVE-LINK-FUNCTION" />
 *       &lt;attribute name="linkFunction" type="{http://www.dmg.org/PMML-4_0}LINK-FUNCTION" />
 *       &lt;attribute name="linkParameter" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="trialsVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="trialsValue" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="distribution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="binomial"/>
 *             &lt;enumeration value="gamma"/>
 *             &lt;enumeration value="igauss"/>
 *             &lt;enumeration value="negbin"/>
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="poisson"/>
 *             &lt;enumeration value="tweedie"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="distParameter" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="offsetVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="offsetValue" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="modelDF" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="endTimeVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="startTimeVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="subjectIDVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="statusVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="baselineStrataVariable" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndParamMatrixesAndPPMatrixes"
})
@XmlRootElement(name = "GeneralRegressionModel")
public class GeneralRegressionModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "EventValues", required = true, type = EventValues.class),
        @XmlElement(name = "FactorList", required = true, type = FactorList.class),
        @XmlElement(name = "BaseCumHazardTables", required = true, type = BaseCumHazardTables.class),
        @XmlElement(name = "ModelVerification", required = true, type = ModelVerification.class),
        @XmlElement(name = "PPMatrix", required = true, type = PPMatrix.class),
        @XmlElement(name = "Output", required = true, type = Output.class),
        @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class),
        @XmlElement(name = "Targets", required = true, type = Targets.class),
        @XmlElement(name = "ModelStats", required = true, type = ModelStats.class),
        @XmlElement(name = "LocalTransformations", required = true, type = LocalTransformations.class),
        @XmlElement(name = "ModelExplanation", required = true, type = ModelExplanation.class),
        @XmlElement(name = "ParameterList", required = true, type = ParameterList.class),
        @XmlElement(name = "ParamMatrix", required = true, type = ParamMatrix.class),
        @XmlElement(name = "PCovMatrix", required = true, type = PCovMatrix.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "CovariateList", required = true, type = CovariateList.class)
    })
    protected List<Object> extensionsAndParamMatrixesAndPPMatrixes;
    @XmlAttribute
    protected String targetVariableName;
    @XmlAttribute(required = true)
    protected String modelType;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute
    protected String targetReferenceCategory;
    @XmlAttribute
    protected CUMULATIVELINKFUNCTION cumulativeLink;
    @XmlAttribute
    protected LINKFUNCTION linkFunction;
    @XmlAttribute
    protected Double linkParameter;
    @XmlAttribute
    protected String trialsVariable;
    @XmlAttribute
    protected BigInteger trialsValue;
    @XmlAttribute
    protected String distribution;
    @XmlAttribute
    protected Double distParameter;
    @XmlAttribute
    protected String offsetVariable;
    @XmlAttribute
    protected Double offsetValue;
    @XmlAttribute
    protected Double modelDF;
    @XmlAttribute
    protected String endTimeVariable;
    @XmlAttribute
    protected String startTimeVariable;
    @XmlAttribute
    protected String subjectIDVariable;
    @XmlAttribute
    protected String statusVariable;
    @XmlAttribute
    protected String baselineStrataVariable;

    /**
     * Gets the value of the extensionsAndParamMatrixesAndPPMatrixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndParamMatrixesAndPPMatrixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndParamMatrixesAndPPMatrixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventValues }
     * {@link FactorList }
     * {@link BaseCumHazardTables }
     * {@link ModelVerification }
     * {@link PPMatrix }
     * {@link Output }
     * {@link MiningSchema }
     * {@link Targets }
     * {@link ModelStats }
     * {@link LocalTransformations }
     * {@link ModelExplanation }
     * {@link ParameterList }
     * {@link ParamMatrix }
     * {@link PCovMatrix }
     * {@link Extension }
     * {@link CovariateList }
     * 
     * 
     */
    public List<Object> getExtensionsAndParamMatrixesAndPPMatrixes() {
        if (extensionsAndParamMatrixesAndPPMatrixes == null) {
            extensionsAndParamMatrixesAndPPMatrixes = new ArrayList<Object>();
        }
        return this.extensionsAndParamMatrixesAndPPMatrixes;
    }

    /**
     * Gets the value of the targetVariableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVariableName() {
        return targetVariableName;
    }

    /**
     * Sets the value of the targetVariableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVariableName(String value) {
        this.targetVariableName = value;
    }

    /**
     * Gets the value of the modelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * Sets the value of the modelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
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
     * Gets the value of the targetReferenceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetReferenceCategory() {
        return targetReferenceCategory;
    }

    /**
     * Sets the value of the targetReferenceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetReferenceCategory(String value) {
        this.targetReferenceCategory = value;
    }

    /**
     * Gets the value of the cumulativeLink property.
     * 
     * @return
     *     possible object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public CUMULATIVELINKFUNCTION getCumulativeLink() {
        return cumulativeLink;
    }

    /**
     * Sets the value of the cumulativeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public void setCumulativeLink(CUMULATIVELINKFUNCTION value) {
        this.cumulativeLink = value;
    }

    /**
     * Gets the value of the linkFunction property.
     * 
     * @return
     *     possible object is
     *     {@link LINKFUNCTION }
     *     
     */
    public LINKFUNCTION getLinkFunction() {
        return linkFunction;
    }

    /**
     * Sets the value of the linkFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKFUNCTION }
     *     
     */
    public void setLinkFunction(LINKFUNCTION value) {
        this.linkFunction = value;
    }

    /**
     * Gets the value of the linkParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinkParameter() {
        return linkParameter;
    }

    /**
     * Sets the value of the linkParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinkParameter(Double value) {
        this.linkParameter = value;
    }

    /**
     * Gets the value of the trialsVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialsVariable() {
        return trialsVariable;
    }

    /**
     * Sets the value of the trialsVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialsVariable(String value) {
        this.trialsVariable = value;
    }

    /**
     * Gets the value of the trialsValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrialsValue() {
        return trialsValue;
    }

    /**
     * Sets the value of the trialsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrialsValue(BigInteger value) {
        this.trialsValue = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the distParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistParameter() {
        return distParameter;
    }

    /**
     * Sets the value of the distParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistParameter(Double value) {
        this.distParameter = value;
    }

    /**
     * Gets the value of the offsetVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetVariable() {
        return offsetVariable;
    }

    /**
     * Sets the value of the offsetVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetVariable(String value) {
        this.offsetVariable = value;
    }

    /**
     * Gets the value of the offsetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffsetValue() {
        return offsetValue;
    }

    /**
     * Sets the value of the offsetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetValue(Double value) {
        this.offsetValue = value;
    }

    /**
     * Gets the value of the modelDF property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModelDF() {
        return modelDF;
    }

    /**
     * Sets the value of the modelDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModelDF(Double value) {
        this.modelDF = value;
    }

    /**
     * Gets the value of the endTimeVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeVariable() {
        return endTimeVariable;
    }

    /**
     * Sets the value of the endTimeVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeVariable(String value) {
        this.endTimeVariable = value;
    }

    /**
     * Gets the value of the startTimeVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeVariable() {
        return startTimeVariable;
    }

    /**
     * Sets the value of the startTimeVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeVariable(String value) {
        this.startTimeVariable = value;
    }

    /**
     * Gets the value of the subjectIDVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectIDVariable() {
        return subjectIDVariable;
    }

    /**
     * Sets the value of the subjectIDVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectIDVariable(String value) {
        this.subjectIDVariable = value;
    }

    /**
     * Gets the value of the statusVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVariable() {
        return statusVariable;
    }

    /**
     * Sets the value of the statusVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVariable(String value) {
        this.statusVariable = value;
    }

    /**
     * Gets the value of the baselineStrataVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineStrataVariable() {
        return baselineStrataVariable;
    }

    /**
     * Sets the value of the baselineStrataVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineStrataVariable(String value) {
        this.baselineStrataVariable = value;
    }

}
