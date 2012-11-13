/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generated;
import generated.ItemT;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author Alin
 */
public class Test_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            JAXBContext jc = JAXBContext.newInstance ("generated");

            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File ("item.xml");
           JAXBElement element = (JAXBElement) u.unmarshal (f);
            //System.out.println(element);
           ExpenseT item = (ExpenseT) element.getValue();
           System.out.println (item.getUser());
           System.out.println (item.getItems());
        
           
           //System.out.println(element);
           //ItemT item = (ItemT) element.();
           //System.out.println (element.getPurchasedOn());
           //System.out.println (item.getItemName());
          // System.out.println (item.getAmount());
       } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
