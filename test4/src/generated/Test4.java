/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generated;

import java.io.File;
import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.BlockType;
import generated.PolygonType;
import generated.PointType;
import generated.ImageBlockType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alin
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 try {
            JAXBContext jc = JAXBContext.newInstance ("generated");

            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File ("ex2.xml");
           JAXBElement element = (JAXBElement) u.unmarshal (f);
           
          /* BigInteger a1 = BigInteger.valueOf(0);
           BigInteger a2 = BigInteger.valueOf(1);
           BigInteger a3 = BigInteger.valueOf(2);
           BigInteger a4 = BigInteger.valueOf(3);
           BigInteger a5 = BigInteger.valueOf(4);
           BigInteger a6 = BigInteger.valueOf(5);
           
           BlockType bloc = new BlockType();
           PointType p1 = new PointType();
           PointType p2 = new PointType();
           PointType p3 = new PointType();
           
           p1.setX(a1);
           p2.setX(a2);
           p3.setX(a3);
           p1.setY(a4);
           p2.setY(a5);
           p3.setY(a6);
           ArrayList<PointType> list=new ArrayList<PointType>() ;
           list.add(p1);
           list.add(p2);
           list.add(p3);
           
           PolygonType poly = new PolygonType();
           poly.setPoint(list);
           
           bloc.setPolygon(poly);
           */
           
           HierarchyType nodstart = (HierarchyType) element.getValue();
           ComposedBlockType imagine = (ComposedBlockType) nodstart.getHierarchyBlocks().getTextBlockOrImageBlockOrComposedBlock().get(0);
           ImageBlockType blocimage= (ImageBlockType) imagine.getTextBlockOrImageBlockOrComposedBlock().get(0);
           
           System.out.println (imagine.getType());
           System.out.println (blocimage.getTop());
           System.out.println (blocimage.getRight());
           System.out.println (blocimage.getBottom());
           
       } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
