
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}Rule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
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
    "_false",
    "_true",
    "simpleSetPredicate",
    "compoundPredicate",
    "simplePredicate",
    "simpleRulesAndCompoundRules"
})
@XmlRootElement(name = "CompoundRule")
public class CompoundRule implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "False")
    protected False _false;
    @XmlElement(name = "True")
    protected True _true;
    @XmlElement(name = "SimpleSetPredicate")
    protected SimpleSetPredicate simpleSetPredicate;
    @XmlElement(name = "CompoundPredicate")
    protected CompoundPredicate compoundPredicate;
    @XmlElement(name = "SimplePredicate")
    protected SimplePredicate simplePredicate;
    @XmlElements({
        @XmlElement(name = "CompoundRule", type = CompoundRule.class),
        @XmlElement(name = "SimpleRule", type = SimpleRule.class)
    })
    protected List<Object> simpleRulesAndCompoundRules;

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
     * Gets the value of the false property.
     * 
     * @return
     *     possible object is
     *     {@link False }
     *     
     */
    public False getFalse() {
        return _false;
    }

    /**
     * Sets the value of the false property.
     * 
     * @param value
     *     allowed object is
     *     {@link False }
     *     
     */
    public void setFalse(False value) {
        this._false = value;
    }

    /**
     * Gets the value of the true property.
     * 
     * @return
     *     possible object is
     *     {@link True }
     *     
     */
    public True getTrue() {
        return _true;
    }

    /**
     * Sets the value of the true property.
     * 
     * @param value
     *     allowed object is
     *     {@link True }
     *     
     */
    public void setTrue(True value) {
        this._true = value;
    }

    /**
     * Gets the value of the simpleSetPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public SimpleSetPredicate getSimpleSetPredicate() {
        return simpleSetPredicate;
    }

    /**
     * Sets the value of the simpleSetPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSetPredicate }
     *     
     */
    public void setSimpleSetPredicate(SimpleSetPredicate value) {
        this.simpleSetPredicate = value;
    }

    /**
     * Gets the value of the compoundPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundPredicate }
     *     
     */
    public CompoundPredicate getCompoundPredicate() {
        return compoundPredicate;
    }

    /**
     * Sets the value of the compoundPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundPredicate }
     *     
     */
    public void setCompoundPredicate(CompoundPredicate value) {
        this.compoundPredicate = value;
    }

    /**
     * Gets the value of the simplePredicate property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePredicate }
     *     
     */
    public SimplePredicate getSimplePredicate() {
        return simplePredicate;
    }

    /**
     * Sets the value of the simplePredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePredicate }
     *     
     */
    public void setSimplePredicate(SimplePredicate value) {
        this.simplePredicate = value;
    }

    /**
     * Gets the value of the simpleRulesAndCompoundRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleRulesAndCompoundRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleRulesAndCompoundRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompoundRule }
     * {@link SimpleRule }
     * 
     * 
     */
    public List<Object> getSimpleRulesAndCompoundRules() {
        if (simpleRulesAndCompoundRules == null) {
            simpleRulesAndCompoundRules = new ArrayList<Object>();
        }
        return this.simpleRulesAndCompoundRules;
    }

}
