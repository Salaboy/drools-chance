
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}PredictiveModelQuality" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}ClusteringModelQuality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Correlations" minOccurs="0"/>
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
    "clusteringModelQualities",
    "predictiveModelQualities",
    "correlations"
})
@XmlRootElement(name = "ModelExplanation")
public class ModelExplanation implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "ClusteringModelQuality")
    protected List<ClusteringModelQuality> clusteringModelQualities;
    @XmlElement(name = "PredictiveModelQuality")
    protected List<PredictiveModelQuality> predictiveModelQualities;
    @XmlElement(name = "Correlations")
    protected Correlations correlations;

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
     * Gets the value of the clusteringModelQualities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusteringModelQualities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusteringModelQualities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusteringModelQuality }
     * 
     * 
     */
    public List<ClusteringModelQuality> getClusteringModelQualities() {
        if (clusteringModelQualities == null) {
            clusteringModelQualities = new ArrayList<ClusteringModelQuality>();
        }
        return this.clusteringModelQualities;
    }

    /**
     * Gets the value of the predictiveModelQualities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictiveModelQualities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictiveModelQualities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredictiveModelQuality }
     * 
     * 
     */
    public List<PredictiveModelQuality> getPredictiveModelQualities() {
        if (predictiveModelQualities == null) {
            predictiveModelQualities = new ArrayList<PredictiveModelQuality>();
        }
        return this.predictiveModelQualities;
    }

    /**
     * Gets the value of the correlations property.
     * 
     * @return
     *     possible object is
     *     {@link Correlations }
     *     
     */
    public Correlations getCorrelations() {
        return correlations;
    }

    /**
     * Sets the value of the correlations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Correlations }
     *     
     */
    public void setCorrelations(Correlations value) {
        this.correlations = value;
    }

}
