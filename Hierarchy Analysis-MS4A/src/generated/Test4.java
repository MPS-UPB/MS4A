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
         
         if(x==null) return "null Object";
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
         if(x.getClass().toString().equals("class generated.TextBlockType$TextLine")){
             return "textline";
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
           if(name.equals("textline")){
           
           TextBlockType.TextLine doc = (TextBlockType.TextLine)node.getUserObject();
           v.add("left");
           v.add((doc.getLeft().toString()));
           v.add("right");
           v.add(doc.getRight().toString());
           v.add("top");
           v.add(doc.getTop().toString());
           v.add("bottom");
           v.add(doc.getBottom().toString());
           v.add("text");
           v.add(getString(node));
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
        if(name.equals("textline")){
            TextBlockType.TextLine text= (TextBlockType.TextLine) node.getUserObject();
             if (old.equals("left")) text.setLeft(new BigInteger(nou));
             if (old.equals("right")) text.setRight(new BigInteger(nou));
             if (old.equals("top")) text.setTop(new BigInteger(nou));
             if (old.equals("bottom")) text.setBottom(new BigInteger(nou));
             if (old.equals("text")) setString(node, nou);
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
    
    public static List<String> getChilds(DefaultMutableTreeNode node){
        List <String> v = new ArrayList<String>();
        //String clasa =node.getUserObject().getClass().toString();
        if (getName(node.getUserObject())=="hierarchy"){
        v.add("hierarchy_docs");
        v.add("hierarchy_blocks");
        }
        if (getName(node.getUserObject())=="hierarchyblocks"){
        v.add("textblock");
        v.add("imageblock");
        v.add("composedblock");
        }
        if (getName(node.getUserObject())=="hierarchydocs"){
        v.add("document");
        }
        if (getName(node.getUserObject())=="composedblock"){
        v.add("textblock");
        v.add("imageblock");
        v.add("composedblock");
        }
        if (getName(node.getUserObject())=="textblock"){
        v.add("textline");
        }
        if (getName(node.getUserObject())=="imageblock"){
        v.add("polygon");
        }
        //getName nu returneaza niciodata textline 
        /*if (getName(node.getUserObject())=="textline"){
        v.add("string");
        }*/
        if (getName(node.getUserObject())=="polygon"){
        v.add("point");
        }
    return v;
    }
    
    public static void insertChild (DefaultMutableTreeNode node, String child){
        
        if (getName(node.getUserObject())=="hierarchy"){
        if (child.equals("hierarchydocs")){
        HierarchyDocsType doc=new HierarchyDocsType();
        ((HierarchyType) node.getUserObject()).setHierarchyDocs(doc);
        }
        if (child.equals("hierarchyblocks")){
        HierarchyBlocksType doc=new HierarchyBlocksType();
        ((HierarchyType) node.getUserObject()).setHierarchyBlocks(doc);
        }
        }
        
        if (getName(node.getUserObject())=="hierarchydocs"){
        if (child.equals("document")){
        DocumentType doc=new DocumentType();
        doc.setDirection(DirType.ASCENDING);
        ((HierarchyDocsType) node.getUserObject()).getDocument().add(doc);
        }
        }
        if ((getName(node.getUserObject())=="hierarchyblocks")) {
        if (child.equals("imageblock")){
        ImageBlockType doc=new ImageBlockType();
        doc.setBottom(BigInteger.ZERO);
        doc.setLeft(BigInteger.ZERO);
        doc.setRight(BigInteger.ZERO);
        doc.setTop(BigInteger.ZERO);
        doc.setRefid("0");
        ((HierarchyBlocksType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }
        
        if (child.equals("textblock")){
        TextBlockType doc=new TextBlockType();
        doc.setBottom(BigInteger.ZERO);
        doc.setLeft(BigInteger.ZERO);
        doc.setRight(BigInteger.ZERO);
        doc.setTop(BigInteger.ZERO);
        doc.setRefid("0");
        ((HierarchyBlocksType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }
        
        if (child.equals("composedblock")){
        ComposedBlockType doc=new ComposedBlockType();
        doc.setType(ImposedType.BODY);
        ((HierarchyBlocksType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }   
        }
        
        if ((getName(node.getUserObject())=="composedblock")) {
        if (child.equals("imageblock")){
        ImageBlockType doc=new ImageBlockType();
        doc.setBottom(BigInteger.ZERO);
        doc.setLeft(BigInteger.ZERO);
        doc.setRight(BigInteger.ZERO);
        doc.setTop(BigInteger.ZERO);
        doc.setRefid("0");
        ((ComposedBlockType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }
        
        if (child.equals("textblock")){
        TextBlockType doc=new TextBlockType();
        doc.setBottom(BigInteger.ZERO);
        doc.setLeft(BigInteger.ZERO);
        doc.setRight(BigInteger.ZERO);
        doc.setTop(BigInteger.ZERO);
        doc.setRefid("0");
        ((ComposedBlockType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }
        
        if (child.equals("composedblock")){
        ComposedBlockType doc=new ComposedBlockType();
        doc.setType(ImposedType.BODY);
        ((ComposedBlockType) node.getUserObject()).getTextBlockOrImageBlockOrComposedBlock().add(doc);
        }   
        }
        
        
        if (getName(node.getUserObject())=="imageblock"){
        if (child.equals("polygon")){
        PolygonType doc=new PolygonType();
        ((ImageBlockType) node.getUserObject()).setPolygon(doc);
        }
        }
        
        if (getName(node.getUserObject())=="textblock"){
        if (child.equals("textline")){
        TextBlockType.TextLine doc=new TextBlockType.TextLine();
        doc.setBottom(BigInteger.ZERO);
        doc.setLeft(BigInteger.ZERO);
        doc.setRight(BigInteger.ZERO);
        doc.setTop(BigInteger.ZERO);
        
        ((TextBlockType) node.getUserObject()).getTextLine().add(doc);
        }
        }
        
        if (getName(node.getUserObject())=="textline"){
        if (child.equals("string")){
        String doc=new String();
        ((TextBlockType.TextLine) node.getUserObject()).getString().add(doc);
        }
        }
        
        if (getName(node.getUserObject())=="polygon"){
        if (child.equals("point")){
        PointType doc=new PointType();
        doc.setX(BigInteger.ZERO);
        doc.setY(BigInteger.ZERO);
        ((PolygonType) node.getUserObject()).getPoint().add(doc);
        }
        }  
    }
    
     public static void deleteNode(DefaultMutableTreeNode node) {
 
            if(getName(node.getUserObject()).equals("hierarchy")){
                node.setUserObject(null);
                return;
            }
            if(getName(node.getUserObject()).equals("hierarchydocs"))
            {
                /*HierarchyType parent=(HierarchyType)node.getParent();
                parent.setHierarchyDocs(null);*/
                return;
            }
            if(getName(node.getUserObject()).equals("hierarchyblocks"))
            {
                /*HierarchyType parent=(HierarchyType)node.getParent();
                parent.setHierarchyBlocks(null);*/
                return;
            }
 
            if(getName(node.getUserObject()).equals("document")){
                HierarchyDocsType parent=(HierarchyDocsType)((DefaultMutableTreeNode)node.getParent()).getUserObject();
                parent.getDocument().remove(node.getUserObject());         
                return;
            }
 
            if((getName(node.getUserObject()).equals("imageblock"))||
                    (getName(node.getUserObject()).equals("textblock"))||
                        (getName(node.getUserObject()).equals("composedblock")))
                    {
                DefaultMutableTreeNode parent= (DefaultMutableTreeNode) node.getParent();
                if(getName(parent.getUserObject()).equals("hierarchyblocks")){
                   HierarchyBlocksType block= (HierarchyBlocksType)parent.getUserObject(); 
                   block.getTextBlockOrImageBlockOrComposedBlock().remove(node.getUserObject());
                   return;
            }
                 if(getName(parent.getUserObject()).equals("composedblock")){
                   ComposedBlockType block= (ComposedBlockType)parent.getUserObject(); 
                   block.getTextBlockOrImageBlockOrComposedBlock().remove(node.getUserObject());
                   return;
            }
                 return;
            }
            if(getName(node.getUserObject()).equals("polygon")){
                ImageBlockType parent=(ImageBlockType)((DefaultMutableTreeNode)node.getParent()).getUserObject();
                parent.setPolygon(null);         
                return;
            }
            if(getName(node.getUserObject()).equals("point")){
                PolygonType parent=(PolygonType)((DefaultMutableTreeNode)node.getParent()).getUserObject();
                parent.getPoint().remove(node.getUserObject());        
                return;
            }
            if(getName(node.getUserObject()).equals("textline")){
                TextBlockType parent=(TextBlockType)((DefaultMutableTreeNode)node.getParent()).getUserObject();
                parent.getTextLine().remove(node.getUserObject());        
                return;
            }
            if(getName(node.getUserObject()).equals("string")){
                TextBlockType.TextLine parent=(TextBlockType.TextLine)((DefaultMutableTreeNode)node.getParent()).getUserObject();
                parent.getString().remove(node.getUserObject());        
                return;
            }
    }
     
     public static String getString( DefaultMutableTreeNode node){       
        String strings= new String();
       
        TextBlockType.TextLine textline=(TextBlockType.TextLine) node.getUserObject();
        List <String> s=textline.getString();
        for (int i=0; i<s.size();i++)
        {
        strings+= s.get(i);
        strings+=" ";
        }
        
       
        return strings;
    }
     public static void setString( DefaultMutableTreeNode node, String s)
     {
        String[] temp;
        for (int i=0; i< ((TextBlockType.TextLine)node.getUserObject()).getString().size();i++){
            ((TextBlockType.TextLine)node.getUserObject()).getString().remove(i);
        }
        String delimiter = " ";
        temp = s.split(delimiter);
        for(int i =0; i < temp.length ; i++){
            ((TextBlockType.TextLine)node.getUserObject()).getString().add(temp[i]);
        }
      
     
     }
    
    public static void init() {
                 try {
            JAXBContext jc = JAXBContext.newInstance ("generated");

            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File (pathname);
           JAXBElement element = (JAXBElement) u.unmarshal (f);
           
           rootElement = element;
           
           
       } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
