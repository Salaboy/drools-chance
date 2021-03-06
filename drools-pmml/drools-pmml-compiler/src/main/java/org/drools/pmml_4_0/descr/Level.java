
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="alpha" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="quadraticSmoothedValue" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="cubicSmoothedValue" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Level")
public class Level
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlAttribute
    protected Double alpha;
    @XmlAttribute
    protected Double smoothedValue;
    @XmlAttribute
    protected Double quadraticSmoothedValue;
    @XmlAttribute
    protected Double cubicSmoothedValue;

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlpha(Double value) {
        this.alpha = value;
    }

    /**
     * Gets the value of the smoothedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSmoothedValue() {
        return smoothedValue;
    }

    /**
     * Sets the value of the smoothedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSmoothedValue(Double value) {
        this.smoothedValue = value;
    }

    /**
     * Gets the value of the quadraticSmoothedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuadraticSmoothedValue() {
        return quadraticSmoothedValue;
    }

    /**
     * Sets the value of the quadraticSmoothedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuadraticSmoothedValue(Double value) {
        this.quadraticSmoothedValue = value;
    }

    /**
     * Gets the value of the cubicSmoothedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCubicSmoothedValue() {
        return cubicSmoothedValue;
    }

    /**
     * Sets the value of the cubicSmoothedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCubicSmoothedValue(Double value) {
        this.cubicSmoothedValue = value;
    }

}
