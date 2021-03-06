
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Interval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}FrequenciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalValuesSum" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="totalSquaresSum" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions",
    "intervals",
    "arraies"
})
@XmlRootElement(name = "ContStats")
public class ContStats
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "Interval")
    protected List<Interval> intervals;
    @XmlElement(name = "Array")
    protected List<Array> arraies;
    @XmlAttribute
    protected Double totalValuesSum;
    @XmlAttribute
    protected Double totalSquaresSum;

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
     * Gets the value of the intervals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interval }
     * 
     * 
     */
    public List<Interval> getIntervals() {
        if (intervals == null) {
            intervals = new ArrayList<Interval>();
        }
        return this.intervals;
    }

    /**
     * Gets the value of the arraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * 
     * 
     */
    public List<Array> getArraies() {
        if (arraies == null) {
            arraies = new ArrayList<Array>();
        }
        return this.arraies;
    }

    /**
     * Gets the value of the totalValuesSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValuesSum() {
        return totalValuesSum;
    }

    /**
     * Sets the value of the totalValuesSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValuesSum(Double value) {
        this.totalValuesSum = value;
    }

    /**
     * Gets the value of the totalSquaresSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSquaresSum() {
        return totalSquaresSum;
    }

    /**
     * Sets the value of the totalSquaresSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSquaresSum(Double value) {
        this.totalSquaresSum = value;
    }

}
