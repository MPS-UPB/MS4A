//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.24 at 06:25:44 PM EET 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImposedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImposedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="page_number"/>
 *     &lt;enumeration value="article"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="subtitle"/>
 *     &lt;enumeration value="body"/>
 *     &lt;enumeration value="paragraph"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImposedType")
@XmlEnum
public enum ImposedType {

    @XmlEnumValue("page_number")
    PAGE_NUMBER("page_number"),
    @XmlEnumValue("article")
    ARTICLE("article"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("subtitle")
    SUBTITLE("subtitle"),
    @XmlEnumValue("body")
    BODY("body"),
    @XmlEnumValue("paragraph")
    PARAGRAPH("paragraph");
    private final String value;

    ImposedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImposedType fromValue(String v) {
        for (ImposedType c: ImposedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
