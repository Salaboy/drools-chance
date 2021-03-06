
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}EXPRESSION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="function" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "constantsAndFieldRevesAndNormContinuouses"
})
@XmlRootElement(name = "Apply")
public class Apply implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElements({
        @XmlElement(name = "Apply", type = Apply.class),
        @XmlElement(name = "NormContinuous", type = NormContinuous.class),
        @XmlElement(name = "Constant", type = Constant.class),
        @XmlElement(name = "Discretize", type = Discretize.class),
        @XmlElement(name = "MapValues", type = MapValues.class),
        @XmlElement(name = "NormDiscrete", type = NormDiscrete.class),
        @XmlElement(name = "FieldRef", type = FieldRef.class),
        @XmlElement(name = "Aggregate", type = Aggregate.class)
    })
    protected List<Object> constantsAndFieldRevesAndNormContinuouses;
    @XmlAttribute(required = true)
    protected String function;

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
     * Gets the value of the constantsAndFieldRevesAndNormContinuouses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constantsAndFieldRevesAndNormContinuouses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstantsAndFieldRevesAndNormContinuouses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Apply }
     * {@link NormContinuous }
     * {@link Constant }
     * {@link Discretize }
     * {@link MapValues }
     * {@link NormDiscrete }
     * {@link FieldRef }
     * {@link Aggregate }
     * 
     * 
     */
    public List<Object> getConstantsAndFieldRevesAndNormContinuouses() {
        if (constantsAndFieldRevesAndNormContinuouses == null) {
            constantsAndFieldRevesAndNormContinuouses = new ArrayList<Object>();
        }
        return this.constantsAndFieldRevesAndNormContinuouses;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

}
