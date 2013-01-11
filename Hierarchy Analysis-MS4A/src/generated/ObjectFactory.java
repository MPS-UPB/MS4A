//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.24 at 06:25:44 PM EET 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hierarchy_QNAME = new QName("", "hierarchy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextBlockType }
     * 
     */
    public TextBlockType createTextBlockType() {
        return new TextBlockType();
    }

    /**
     * Create an instance of {@link HierarchyType }
     * 
     */
    public HierarchyType createHierarchyType() {
        return new HierarchyType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link ImageBlockType }
     * 
     */
    public ImageBlockType createImageBlockType() {
        return new ImageBlockType();
    }

    /**
     * Create an instance of {@link ComposedBlockType }
     * 
     */
    public ComposedBlockType createComposedBlockType() {
        return new ComposedBlockType();
    }

    /**
     * Create an instance of {@link BlockType }
     * 
     */
    public BlockType createBlockType() {
        return new BlockType();
    }

    /**
     * Create an instance of {@link HierarchyDocsType }
     * 
     */
    public HierarchyDocsType createHierarchyDocsType() {
        return new HierarchyDocsType();
    }

    /**
     * Create an instance of {@link HierarchyBlocksType }
     * 
     */
    public HierarchyBlocksType createHierarchyBlocksType() {
        return new HierarchyBlocksType();
    }

    /**
     * Create an instance of {@link TextBlockType.TextLine }
     * 
     */
    public TextBlockType.TextLine createTextBlockTypeTextLine() {
        return new TextBlockType.TextLine();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HierarchyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hierarchy")
    public JAXBElement<HierarchyType> createHierarchy(HierarchyType value) {
        return new JAXBElement<HierarchyType>(_Hierarchy_QNAME, HierarchyType.class, null, value);
    }

}