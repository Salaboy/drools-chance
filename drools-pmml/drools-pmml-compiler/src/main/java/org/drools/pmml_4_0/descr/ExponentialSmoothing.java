
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Level"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Trend" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Seasonality_ExpoSmooth" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RMSE" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="transformation" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="squareroot"/>
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
    "level",
    "trend",
    "seasonalityExpoSmooth",
    "timeValues"
})
@XmlRootElement(name = "ExponentialSmoothing")
public class ExponentialSmoothing implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Level", required = true)
    protected Level level;
    @XmlElement(name = "Trend")
    protected Trend trend;
    @XmlElement(name = "Seasonality_ExpoSmooth")
    protected SeasonalityExpoSmooth seasonalityExpoSmooth;
    @XmlElement(name = "TimeValue")
    protected List<TimeValue> timeValues;
    @XmlAttribute(name = "RMSE")
    protected Double rmse;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transformation;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the trend property.
     * 
     * @return
     *     possible object is
     *     {@link Trend }
     *     
     */
    public Trend getTrend() {
        return trend;
    }

    /**
     * Sets the value of the trend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trend }
     *     
     */
    public void setTrend(Trend value) {
        this.trend = value;
    }

    /**
     * Gets the value of the seasonalityExpoSmooth property.
     * 
     * @return
     *     possible object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    public SeasonalityExpoSmooth getSeasonalityExpoSmooth() {
        return seasonalityExpoSmooth;
    }

    /**
     * Sets the value of the seasonalityExpoSmooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    public void setSeasonalityExpoSmooth(SeasonalityExpoSmooth value) {
        this.seasonalityExpoSmooth = value;
    }

    /**
     * Gets the value of the timeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeValue }
     * 
     * 
     */
    public List<TimeValue> getTimeValues() {
        if (timeValues == null) {
            timeValues = new ArrayList<TimeValue>();
        }
        return this.timeValues;
    }

    /**
     * Gets the value of the rmse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRMSE() {
        return rmse;
    }

    /**
     * Sets the value of the rmse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRMSE(Double value) {
        this.rmse = value;
    }

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformation() {
        if (transformation == null) {
            return "none";
        } else {
            return transformation;
        }
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformation(String value) {
        this.transformation = value;
    }

}
