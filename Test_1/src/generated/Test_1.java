/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generated;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;
/**
 *
 * @author Alin
 */
public class Test_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ObjectFactory factory = new ObjectFactory();
 
        UserT user = factory.createUserT();
        user.setUserName("Sanaulla");
        ItemT item = factory.createItemT();
        item.setItemName("Seagate External HDD");
        item.setPurchasedOn("August 24, 2010");
        item.setAmount(new BigDecimal("6776.5"));
 
        ItemListT itemList = factory.createItemListT();
        itemList.getItem().add(item);
 
        ExpenseT expense = factory.createExpenseT();
        expense.setUser(user);
        expense.setItems(itemList);
  try {
        JAXBContext context = JAXBContext.newInstance("generated");
        JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(element,System.out);
        
         } catch (JAXBException e) {
           e.printStackTrace ();
       }
    }
}
