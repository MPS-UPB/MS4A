//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.24 at 06:25:44 PM EET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComposedBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComposedBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{}BlockType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{}BlockGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{}ImposedType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComposedBlockType", propOrder = {
    "textBlockOrImageBlockOrComposedBlock"
})
public class ComposedBlockType
    extends BlockType
{

    @XmlElements({
        @XmlElement(name = "TextBlock", type = TextBlockType.class),
        @XmlElement(name = "ImageBlock", type = ImageBlockType.class),
        @XmlElement(name = "ComposedBlock", type = ComposedBlockType.class)
    })
    protected List<BlockType> textBlockOrImageBlockOrComposedBlock;
    @XmlAttribute(name = "type", required = true)
    protected ImposedType type;

    /**
     * Gets the value of the textBlockOrImageBlockOrComposedBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textBlockOrImageBlockOrComposedBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBlockOrImageBlockOrComposedBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextBlockType }
     * {@link ImageBlockType }
     * {@link ComposedBlockType }
     * 
     * 
     */
    public List<BlockType> getTextBlockOrImageBlockOrComposedBlock() {
        if (textBlockOrImageBlockOrComposedBlock == null) {
            textBlockOrImageBlockOrComposedBlock = new ArrayList<BlockType>();
        }
        return this.textBlockOrImageBlockOrComposedBlock;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ImposedType }
     *     
     */
    public ImposedType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImposedType }
     *     
     */
    public void setType(ImposedType value) {
        this.type = value;
    }

}
