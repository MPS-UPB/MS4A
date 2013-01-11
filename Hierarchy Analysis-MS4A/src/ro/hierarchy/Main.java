/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.hierarchy;

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
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[1]);
        System.out.println(args.length);
        if(args.length>0){
            String config = args[0];
            ro.hierarchy.UI.execWrapper.Wrapper.run(config);
            hier = new ro.hierarchy.UI.Hierarchy();
            generated.Test4.giveName("C:\\Users\\mittoria\\Documents\\ceva.xml");
            generated.Test4.init();
            ro.hierarchy.Main.hier.jTree1.setModel(new DefaultTreeModel (generated.Test4.transform()));
            hier.setVisible(true);
        }else{
            select = new ro.hierarchy.UI.SelectFiles();
            select.setVisible(true);
            hier = new ro.hierarchy.UI.Hierarchy();
        }
        //generated.Test4.giveName("C:\\Users\\mittoria\\Documents\\ex2.xml");
        //generated.Test4.init();
        //generated.Test4.transform();
    }
}
