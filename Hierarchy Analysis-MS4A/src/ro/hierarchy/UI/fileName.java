/*
 * Class that stores the path of a selected file .
 * 
 */
package ro.hierarchy.UI;

/**
 *
 * @author mittoria
 */
class fileName {

    static String fileName="";
    
    static void setText(String path) {
       fileName+=path + "; ";
    }
    
}
