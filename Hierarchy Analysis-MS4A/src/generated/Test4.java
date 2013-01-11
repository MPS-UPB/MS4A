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


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.xml.namespace.QName;

/**
 *
 * @author Alin
 */

class TNode extends DefaultMutableTreeNode{
  
  
} 
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
     
     public static String getName(Object x){
         if(x.getClass().toString().equals("class generated.HierarchyType")){
             return "hierarchy";
         }
         if(x.getClass().toString().equals("class generated.HierarchyBlocksType")){
             return "hierarchyblocks";
         }
         if(x.getClass().toString().equals("class generated.HierarchyDocsType")){
             return "hierarchydocs";
         }
         if(x.getClass().toString().equals("class generated.ImageBlockType")){
             return "imageblock";
         }
         if(x.getClass().toString().equals("class generated.TextBlockType")){
             return "textblock";
         }
         if(x.getClass().toString().equals("class generated.PolygonType")){
             return "polygon";
         }
         if(x.getClass().toString().equals("class generated.PointType")){
             return "point";
         }
         if(x.getClass().toString().equals("class generated.ImposedType")){
             return "imposed";
         }
         if(x.getClass().toString().equals("class generated.DocumentType")){
             return "document";
         }
         if(x.getClass().toString().equals("class generated.DirType")){
             return "dir";
         }
         if(x.getClass().toString().equals("class generated.ComposedBlockType")){
             return "composedblock";
         }
         
         return "eroare: "+x.getClass().toString();
     }
     private static JAXBElement rootElement;
     public static DefaultMutableTreeNode transform()
     {
         DefaultMutableTreeNode root= new DefaultMutableTreeNode((HierarchyType) rootElement.getValue());
         LinkedList coada = new LinkedList();
         coada.push(root);
         while (coada.size()>0)
         {
           DefaultMutableTreeNode node =(DefaultMutableTreeNode) coada.pop();
           if(getName(node.getUserObject()).equals("hierarchy"))
           {
               HierarchyType temp = (HierarchyType)node.getUserObject();
               DefaultMutableTreeNode a = new DefaultMutableTreeNode(temp.getHierarchyDocs());
               DefaultMutableTreeNode b = new DefaultMutableTreeNode(temp.getHierarchyBlocks());
               
               node.add(a); node.add(b);
               coada.push(a);coada.push(b);
           }
           if(getName(node.getUserObject()).equals("hierarchydocs"))
           {
               HierarchyDocsType temp = (HierarchyDocsType)node.getUserObject();
               List<DocumentType> docs = temp.getDocument();
               for(int i=0; i<docs.size(); i++){
                   DefaultMutableTreeNode a = new DefaultMutableTreeNode(docs.get(i));
                   node.add(a);
                   coada.push(a);
               }
           }
           if(getName(node.getUserObject()).equals("hierarchyblocks"))
           {
               HierarchyBlocksType temp = (HierarchyBlocksType)node.getUserObject();
               List<BlockType> docs = temp.getTextBlockOrImageBlockOrComposedBlock();
               for(int i=0; i<docs.size(); i++){
                   DefaultMutableTreeNode a = new DefaultMutableTreeNode(docs.get(i));
                   node.add(a);
                   coada.push(a);
               }
           }
           if(getName(node.getUserObject()).equals("document"))
           {
               DocumentType temp = (DocumentType)node.getUserObject();
               DefaultMutableTreeNode a = new DefaultMutableTreeNode(temp);
               //node.add(a);
           }
           if(getName(node.getUserObject()).equals("imageblock"))
           {
               ImageBlockType temp = (ImageBlockType)node.getUserObject();
               DefaultMutableTreeNode a = new DefaultMutableTreeNode(temp.getPolygon());
               node.add(a);
               coada.push(a);
           }
           
           if(getName(node.getUserObject()).equals("polygon"))
           {
               PolygonType temp = (PolygonType)node.getUserObject();
               List<PointType> docs = temp.getPoint();
               for(int i=0; i<docs.size(); i++){
                   DefaultMutableTreeNode a = new DefaultMutableTreeNode(docs.get(i));
                   node.add(a);
                   
               }
           }
           if(getName(node.getUserObject()).equals("textblock"))
           {
               TextBlockType temp = (TextBlockType)node.getUserObject();
               List<TextBlockType.TextLine> docs = temp.getTextLine();
               for(int i=0; i<docs.size(); i++){
                   DefaultMutableTreeNode a = new DefaultMutableTreeNode(docs.get(i));
                   node.add(a);
                   coada.push(a);
               }
           }
           if(getName(node.getUserObject()).equals("point"))
           {
               PointType temp = (PointType)node.getUserObject();
               DefaultMutableTreeNode a = new DefaultMutableTreeNode(temp);
               node.add(a);
           }
           if(getName(node.getUserObject()).equals("composedblock"))
           {
               ComposedBlockType temp = (ComposedBlockType)node.getUserObject();
               List<BlockType> docs = temp.getTextBlockOrImageBlockOrComposedBlock();
               for(int i=0; i<docs.size(); i++){
                   DefaultMutableTreeNode a = new DefaultMutableTreeNode(docs.get(i));
                   node.add(a);
                   coada.push(a);
               }
           }
           
           
         }
         return root;
     }
     
    public static Vector<String> attributes(DefaultMutableTreeNode node){
        
        Vector <String> v = new Vector<String>();
        String name=getName(node.getUserObject());
        
        if(name.equals("composedblock")){
           v.add("type");
           ImposedType tip=((ComposedBlockType) node.getUserObject()).getType();
           if (tip==ImposedType.ARTICLE) v.add("article");
           if (tip==ImposedType.BODY) v.add("body");
           if (tip==ImposedType.PAGE_NUMBER) v.add("page_number");
           if (tip==ImposedType.PARAGRAPH) v.add("paragraph");
           if (tip==ImposedType.TITLE) v.add("title");
           if (tip==ImposedType.SUBTITLE) v.add("subtitle");
        }
        if(name.equals("textblock")){
           TextBlockType textbloc = (TextBlockType)node.getUserObject();
           v.add("refid");
           v.add(textbloc.getRefid());
           v.add("left");
           v.add((textbloc.getLeft().toString()));
           v.add("right");
           v.add(textbloc.getRight().toString());
           v.add("top");
           v.add(textbloc.getTop().toString());
           v.add("bottom");
           v.add(textbloc.getBottom().toString());
        }
        if(name.equals("imageblock")){
           ImageBlockType textbloc = (ImageBlockType)node.getUserObject();
           v.add("refid");
           v.add(textbloc.getRefid());
           v.add("left");
           v.add((textbloc.getLeft().toString()));
           v.add("right");
           v.add(textbloc.getRight().toString());
           v.add("top");
           v.add(textbloc.getTop().toString());
           v.add("bottom");
           v.add(textbloc.getBottom().toString());
        }
        if(name.equals("point")){
           PointType point = (PointType)node.getUserObject();
           v.add("x");
           v.add(point.getX().toString());
           v.add("y");
           v.add(point.getY().toString());
        }
        if(name.equals("document")){
           
           DocumentType doc = (DocumentType)node.getUserObject();
           v.add("image");
           v.add(doc.getImage());
           v.add("direction");
           if (doc.getDirection()==DirType.ASCENDING) v.add("ascending");
           if (doc.getDirection()==DirType.DESCENDING) v.add("descending");
           v.add("id");
           v.add(doc.getId());
        }
        
        
        return v;
    }
    
    public static void changeAtrribute(DefaultMutableTreeNode node, String old, String nou){
        
        String name=getName(node.getUserObject());
        if(name.equals("composedblock")){
        ComposedBlockType bloc= (ComposedBlockType) node.getUserObject();
        if (nou.equals("title")) bloc.setType(ImposedType.TITLE);
        if (nou.equals("page_number")) bloc.setType(ImposedType.PAGE_NUMBER);
        if (nou.equals("article")) bloc.setType(ImposedType.ARTICLE);
        if (nou.equals("paragraph")) bloc.setType(ImposedType.PARAGRAPH);
        if (nou.equals("subtitle")) bloc.setType(ImposedType.SUBTITLE);
        if (nou.equals("body")) bloc.setType(ImposedType.BODY);
        }
        if(name.equals("textblock")){
            TextBlockType text= (TextBlockType) node.getUserObject();
             if (old.equals("left")) text.setLeft(new BigInteger(nou));
             if (old.equals("right")) text.setRight(new BigInteger(nou));
             if (old.equals("top")) text.setTop(new BigInteger(nou));
             if (old.equals("bottom")) text.setBottom(new BigInteger(nou));
              if (old.equals("refid")) text.setRefid(nou);
        }
        if(name.equals("imageblock")){
            ImageBlockType text= (ImageBlockType) node.getUserObject();
             if (old.equals("left")) text.setLeft(new BigInteger(nou));
             if (old.equals("right")) text.setRight(new BigInteger(nou));
             if (old.equals("top")) text.setTop(new BigInteger(nou));
             if (old.equals("bottom")) text.setBottom(new BigInteger(nou));
              if (old.equals("refid")) text.setRefid(nou);
        }
        
        if(name.equals("point")){
            PointType text= (PointType) node.getUserObject();
             if (old.equals("x")) text.setX(new BigInteger(nou));
             if (old.equals("y")) text.setY(new BigInteger(nou));

        }
        
        if(name.equals("document")){
            DocumentType text= (DocumentType) node.getUserObject();
             if (old.equals("image")) text.setImage(nou);
             if (old.equals("direction")) 
             {
                 if (nou.equals("ascending")) text.setDirection(DirType.ASCENDING);
                 if (nou.equals("descending")) text.setDirection(DirType.DESCENDING);
             }
             if (old.equals("id")) text.setId(nou);
             
        }
    }
    
    public static void giveName(String s){
        Test4.pathname=s;
    }
    
    private static String pathname;
    
    public static void save(){
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(HierarchyType.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
            m.marshal(rootElement, new File(pathname));
        } catch (JAXBException ex) {
            Logger.getLogger(Test4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void init() {
                 try {
            JAXBContext jc = JAXBContext.newInstance ("generated");

            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File (pathname);
           JAXBElement element = (JAXBElement) u.unmarshal (f);
           
           rootElement = element;
           
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
           
           //HierarchyType nodstart = (HierarchyType) element.getValue();
           
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
           //System.out.println(((DocumentType)nodstart));
          /* testPanel a = new testPanel();
           
           a.setVisible(true);
           if(       "hierarchy".equals(element.getName().toString())){
               HierarchyType n1 = (HierarchyType) element.getValue();
               Object xx = n1.getHierarchyBlocks();
               System.out.println(xx.getClass().toString() );
               
           }
           DefaultMutableTreeNode x = transform(nodstart);
           
           a.jTree1.setModel(new DefaultTreeModel(x));        
           JFrame frame = new JFrame();
           frame.add(a);
           frame.show();
           frame.setSize(600, 400);
           frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           */
           /*ComposedBlockType imagine = (ComposedBlockType) nodstart.getHierarchyBlocks().getTextBlockOrImageBlockOrComposedBlock().get(0);
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
           */
           
       } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
