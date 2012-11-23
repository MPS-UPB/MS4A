/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.hierarchy;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Avner Solomon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // exemplu de creare a fisierului de configurare
        Vector<String> input = new Vector();
        input.add("input.xml");
        
        ro.hierarchy.execWrapper.Wrapper.setIndentation(true);
        ro.hierarchy.execWrapper.Wrapper.setInputFiles(input);
        ro.hierarchy.execWrapper.Wrapper.setOutputFile("output_test.xml");
        ro.hierarchy.execWrapper.Wrapper.createConfigXML("conf.xml");
        //sfarsit exemplu
        
        
        try {
            Process p = Runtime.getRuntime().exec("mock_hierarchy.exe conf.xml");
            //ro.hierarchy.execWrapper.Wrapper.clean();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

