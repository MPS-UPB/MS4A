/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.hierarchy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Avner Solomon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ro.hierarchy.UI.SelectFiles select;
    public static ro.hierarchy.UI.Hierarchy hier;
    
    private static String readFile(String path) throws IOException {
        FileInputStream stream = new FileInputStream(new File(path));
        try {
          FileChannel fc = stream.getChannel();
          MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
          /* Instead of using default, pass in a decoder. */
          return Charset.defaultCharset().decode(bb).toString();
        }
        finally {
          stream.close();
        }
      }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[1]);
        System.out.println(args.length);
        if(args.length>0){
            String config = args[0];
            ro.hierarchy.UI.execWrapper.Wrapper.run(config);
            hier = new ro.hierarchy.UI.Hierarchy();
            String configFileContent= new String();
            try {
                configFileContent = readFile(args[0]);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            int temp_index = configFileContent.indexOf("outputFile");
            temp_index = configFileContent.indexOf('\"', temp_index);
            int temp_index2 = configFileContent.indexOf('\"', temp_index+1);
            System.out.println(configFileContent.substring(temp_index+1, temp_index2));
            generated.Test4.giveName(configFileContent.substring(temp_index+1, temp_index2));
            generated.Test4.init();
            ro.hierarchy.Main.hier.jTree1.setModel(new DefaultTreeModel (generated.Test4.transform()));
            hier.setVisible(true);
        }else{
            select = new ro.hierarchy.UI.SelectFiles();
            select.setVisible(true);
            hier = new ro.hierarchy.UI.Hierarchy();
            select.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            hier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        //generated.Test4.giveName("C:\\Users\\mittoria\\Documents\\ex2.xml");
        //generated.Test4.init();
        //generated.Test4.transform();
    }
}
