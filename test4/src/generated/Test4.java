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
    
    public static void movePointUp(ArrayList<PointType> lista, int index) {
        if (index >0) {
           BigInteger tempx=lista.get(index-1).getX();
           BigInteger tempy=lista.get(index-1).getY();
           PointType punct_auxiliar= new PointType();
           punct_auxiliar.setX(tempx);
           punct_auxiliar.setY(tempy);
           lista.set(index-1,lista.get(index));
           lista.set(index,punct_auxiliar);
        }
        
    }
    
    public static void movePointDown(ArrayList<PointType> lista, int index) {
        if (index < lista.size() - 1) {
           BigInteger tempx=lista.get(index+1).getX();
           BigInteger tempy=lista.get(index+1).getY();
           PointType punct_auxiliar= new PointType();
           punct_auxiliar.setX(tempx);
           punct_auxiliar.setY(tempy);
           lista.set(index+1,lista.get(index));
           lista.set(index,punct_auxiliar);
        }
        
    }
    
    public static void moveStringUp(ArrayList<String> lista, int index) {
        if (index>0) {
            String text_aux = lista.get(index-1);
            lista.set(index-1,lista.get(index));
            lista.set(index,text_aux);
            
        }
    }
    
    public static void moveStringDown(ArrayList<String> lista, int index) {
        if (index<lista.size() -1 ) {
            String text_aux = lista.get(index+1);
            lista.set(index+1,lista.get(index));
            lista.set(index,text_aux);
            
        }
    }
    
    public static void moveTextLineUp(ArrayList<TextBlockType.TextLine> lista, int index) {
        if (index>0) {
            TextBlockType.TextLine text_line_aux = lista.get(index-1);
            lista.set(index-1,lista.get(index));
            lista.set(index,text_line_aux);
        }
    }
    
     public static void moveTextLineDown(ArrayList<TextBlockType.TextLine> lista, int index) {
        if (index<lista.size() -1 ) {
            TextBlockType.TextLine text_line_aux = lista.get(index+1);
            lista.set(index+1,lista.get(index));
            lista.set(index,text_line_aux);
        }
    }
     
     public static void moveTextBlockUp(ArrayList<BlockType> lista, int index) {
        if (index>0) {
            BlockType text_bloc_aux = lista.get(index-1);
            lista.set(index-1,lista.get(index));
            lista.set(index,text_bloc_aux);
        }
    }
     
     public static void moveTextBlockDown(ArrayList<BlockType> lista, int index) {
        if (index<lista.size() -1 ) {
            BlockType text_bloc_aux = lista.get(index+1);
            lista.set(index+1,lista.get(index));
            lista.set(index,text_bloc_aux);
        }
    }
   
     public static void deleteNode(ArrayList lista, Object o) {
           lista.remove(o);  
    }
     
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
           
           //System.out.println(nodstart);
           
           /*ComposedBlockType imagine = (ComposedBlockType) nodstart.getHierarchyBlocks().getTextBlockOrImageBlockOrComposedBlock().get(0);
           ImageBlockType blocimage= (ImageBlockType) imagine.getTextBlockOrImageBlockOrComposedBlock().get(0);
           PolygonType poli=(PolygonType) blocimage.getPolygon();
           ArrayList<PointType> list=new ArrayList<PointType>() ;
           list=(ArrayList<PointType>) poli.getPoint();
           
           BigInteger tempx=list.get(0).getX();
           BigInteger tempy=list.get(0).getY();
           PointType punct_auxiliar= new PointType();
           punct_auxiliar.setX(tempx);
           punct_auxiliar.setY(tempy);
           list.set(0,list.get(1));
           list.set(1,punct_auxiliar);
         
           movePointDown(list,1);
         
           //System.out.println (imagine.getType());
           for (int i=0; i<list.size(); i++) {
               System.out.println(list.get(i).getX());
               System.out.println(list.get(i).getY());
           }
          
           //System.out.println (blocimage.getRight());
           //System.out.println (blocimage.getBottom());*/
           ComposedBlockType imagine = (ComposedBlockType) nodstart.getHierarchyBlocks().getTextBlockOrImageBlockOrComposedBlock().get(0);
           ComposedBlockType bloc= (ComposedBlockType) imagine.getTextBlockOrImageBlockOrComposedBlock().get(2);
           ArrayList<BlockType> l1=(ArrayList<BlockType>) bloc.getTextBlockOrImageBlockOrComposedBlock();
          // moveTextBlockDown(l1,0);
           
           ImageBlockType textblock1= (ImageBlockType) bloc.getTextBlockOrImageBlockOrComposedBlock().get(0);
           ImageBlockType textblock2= (ImageBlockType) bloc.getTextBlockOrImageBlockOrComposedBlock().get(1);
           deleteNode(l1,textblock2);
            BigInteger refid1=textblock1.left;
           TextBlockType text= (TextBlockType) l1.get(1);
           
           System.out.println(refid1);
           System.out.println(text.refid);
           //ArrayList<TextBlockType.TextLine> l1=(ArrayList<TextBlockType.TextLine>) textblock.textLine;
          // ArrayList<String> lista_stringuri =new ArrayList<String>() ;
           //lista_stringuri= (ArrayList<String>) textblock.textLine.get(0).string;
          
  //         for (int i=0; i<bloc.getTextBlockOrImageBlockOrComposedBlock().size(); i++) 
            //   System.out.println(.get(i).string.get(0));
           
           
       } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
