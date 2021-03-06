
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeSeries" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}SpectralAnalysis" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ARIMA" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ExponentialSmoothing" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}SeasonalTrendDecomposition" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_0}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bestFit" use="required" type="{http://www.dmg.org/PMML-4_0}TIMESERIES-ALGORITHM" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndMiningSchemasAndOutputs"
})
@XmlRootElement(name = "TimeSeriesModel")
public class TimeSeriesModel implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElementRefs({
        @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_0", type = Output.class),
        @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_0", type = LocalTransformations.class),
        @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_0", type = ModelVerification.class),
        @XmlElementRef(name = "ExponentialSmoothing", namespace = "http://www.dmg.org/PMML-4_0", type = ExponentialSmoothing.class),
        @XmlElementRef(name = "SeasonalTrendDecomposition", namespace = "http://www.dmg.org/PMML-4_0", type = JAXBElement.class),
        @XmlElementRef(name = "ARIMA", namespace = "http://www.dmg.org/PMML-4_0", type = JAXBElement.class),
        @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_0", type = ModelStats.class),
        @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_0", type = MiningSchema.class),
        @XmlElementRef(name = "SpectralAnalysis", namespace = "http://www.dmg.org/PMML-4_0", type = JAXBElement.class),
        @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_0", type = Extension.class),
        @XmlElementRef(name = "TimeSeries", namespace = "http://www.dmg.org/PMML-4_0", type = TimeSeries.class)
    })
    protected List<Object> extensionsAndMiningSchemasAndOutputs;
    @XmlAttribute
    protected String modelName;
    @XmlAttribute(required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute
    protected String algorithmName;
    @XmlAttribute(required = true)
    protected TIMESERIESALGORITHM bestFit;

    /**
     * Gets the value of the extensionsAndMiningSchemasAndOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndMiningSchemasAndOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndMiningSchemasAndOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Output }
     * {@link LocalTransformations }
     * {@link ModelVerification }
     * {@link ExponentialSmoothing }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link ModelStats }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link MiningSchema }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Extension }
     * {@link TimeSeries }
     * 
     * 
     */
    public List<Object> getExtensionsAndMiningSchemasAndOutputs() {
        if (extensionsAndMiningSchemasAndOutputs == null) {
            extensionsAndMiningSchemasAndOutputs = new ArrayList<Object>();
        }
        return this.extensionsAndMiningSchemasAndOutputs;
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
     * Gets the value of the bestFit property.
     * 
     * @return
     *     possible object is
     *     {@link TIMESERIESALGORITHM }
     *     
     */
    public TIMESERIESALGORITHM getBestFit() {
        return bestFit;
    }

    /**
     * Sets the value of the bestFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESERIESALGORITHM }
     *     
     */
    public void setBestFit(TIMESERIESALGORITHM value) {
        this.bestFit = value;
    }

}
