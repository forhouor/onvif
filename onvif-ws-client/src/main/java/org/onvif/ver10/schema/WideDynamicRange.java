
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WideDynamicRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WideDynamicRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}WideDynamicMode"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WideDynamicRange", propOrder = {
    "mode",
    "level"
})
public class WideDynamicRange {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected WideDynamicMode mode;
    @XmlElement(name = "Level")
    protected float level;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicMode }
     *     
     */
    public WideDynamicMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicMode }
     *     
     */
    public void setMode(WideDynamicMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public float getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(float value) {
        this.level = value;
    }

}
