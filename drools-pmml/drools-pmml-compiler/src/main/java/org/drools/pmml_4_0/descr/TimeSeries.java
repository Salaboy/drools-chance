
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeAnchor" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeException" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}TimeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="usage" type="{http://www.dmg.org/PMML-4_0}TIMESERIES-USAGE" default="original" />
 *       &lt;attribute name="startTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="endTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="interpolationMethod" type="{http://www.dmg.org/PMML-4_0}INTERPOLATION-METHOD" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timeAnchor",
    "timeExceptions",
    "timeValues"
})
@XmlRootElement(name = "TimeSeries")
public class TimeSeries implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "TimeAnchor")
    protected TimeAnchor timeAnchor;
    @XmlElement(name = "TimeException")
    protected List<TimeException> timeExceptions;
    @XmlElement(name = "TimeValue")
    protected List<TimeValue> timeValues;
    @XmlAttribute
    protected TIMESERIESUSAGE usage;
    @XmlAttribute
    protected Double startTime;
    @XmlAttribute
    protected Double endTime;
    @XmlAttribute
    protected INTERPOLATIONMETHOD interpolationMethod;

    /**
     * Gets the value of the timeAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAnchor }
     *     
     */
    public TimeAnchor getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * Sets the value of the timeAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAnchor }
     *     
     */
    public void setTimeAnchor(TimeAnchor value) {
        this.timeAnchor = value;
    }

    /**
     * Gets the value of the timeExceptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeExceptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeExceptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeException }
     * 
     * 
     */
    public List<TimeException> getTimeExceptions() {
        if (timeExceptions == null) {
            timeExceptions = new ArrayList<TimeException>();
        }
        return this.timeExceptions;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    public TIMESERIESUSAGE getUsage() {
        if (usage == null) {
            return TIMESERIESUSAGE.ORIGINAL;
        } else {
            return usage;
        }
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    public void setUsage(TIMESERIESUSAGE value) {
        this.usage = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartTime(Double value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndTime(Double value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the interpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    public INTERPOLATIONMETHOD getInterpolationMethod() {
        if (interpolationMethod == null) {
            return INTERPOLATIONMETHOD.NONE;
        } else {
            return interpolationMethod;
        }
    }

    /**
     * Sets the value of the interpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    public void setInterpolationMethod(INTERPOLATIONMETHOD value) {
        this.interpolationMethod = value;
    }

}
