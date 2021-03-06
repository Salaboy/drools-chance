
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
 *         &lt;sequence maxOccurs="unbounded" minOccurs="2">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_0}PREDICATE"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="booleanOperator" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="or"/>
 *             &lt;enumeration value="and"/>
 *             &lt;enumeration value="xor"/>
 *             &lt;enumeration value="surrogate"/>
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
    "extensions",
    "simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates"
})
@XmlRootElement(name = "CompoundPredicate")
public class CompoundPredicate implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElements({
        @XmlElement(name = "SimpleSetPredicate", type = SimpleSetPredicate.class),
        @XmlElement(name = "False", type = False.class),
        @XmlElement(name = "SimplePredicate", type = SimplePredicate.class),
        @XmlElement(name = "CompoundPredicate", type = CompoundPredicate.class),
        @XmlElement(name = "True", type = True.class)
    })
    protected List<Object> simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates;
    @XmlAttribute(required = true)
    protected String booleanOperator;

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
     * Gets the value of the simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimplePredicatesAndCompoundPredicatesAndSimpleSetPredicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleSetPredicate }
     * {@link False }
     * {@link SimplePredicate }
     * {@link CompoundPredicate }
     * {@link True }
     * 
     * 
     */
    public List<Object> getSimplePredicatesAndCompoundPredicatesAndSimpleSetPredicates() {
        if (simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates == null) {
            simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates = new ArrayList<Object>();
        }
        return this.simplePredicatesAndCompoundPredicatesAndSimpleSetPredicates;
    }

    /**
     * Gets the value of the booleanOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanOperator() {
        return booleanOperator;
    }

    /**
     * Sets the value of the booleanOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanOperator(String value) {
        this.booleanOperator = value;
    }

}
