/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.hierarchy.UI.execWrapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import ro.hierarchy.Main;



/**
 *
 * @author RavenX86
 */
public class Wrapper {
    
    private static Vector<String> inputFiles;
    private static String outputFile;
    private static String configXML;
    private static boolean indentation = false;
    private static String pathToExe = "";
    
    /**
     * Set path to binaries (example: "C:\Bin")
     * @param path A string containing the path where the binaries are stored
     */
    public static void setPathToExe(String path){
        pathToExe = path;
    }
    
    /**
     * Get path to binaries (example: "C:\Bin")
     */
    public static void run(String configFile){
        try {
            Process p = Runtime.getRuntime().exec(pathToExe+"hierarchy.exe "+configFile);
            //Process p = Runtime.getRuntime().exec("l");
            generated.Test4.giveName(outputFile);
            } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static String getOutputfile(){
        return outputFile;
    }
    
    /**
     * Set config file indentation on/of
     * @param indent boolean representing is indentation should be used or not
     */
    public static void setIndentation(boolean indent){
        indentation = indent;
    }
    
    /**
     * Set input Files
     * @param fileNames path to each input file
     */
    public static void setInputFiles(Vector<String> fileNames){
        inputFiles = fileNames;
    }
    
    /**
     * Set output file
     * @param fileName path to output file
     */
    public static void setOutputFile(String fileName){
        outputFile = fileName;
    }
    
    private static void writeFile(String path, String text){
        try{
            FileWriter fstream = new FileWriter(path);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(text);
            out.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * Create the config XML
     * @param path path for the config XML
     */
    public static void createConfigXML(String path){
 
        configXML = path;
        
        String xml = "<?xml version=\"1.0\"?>\n";
        xml+= "<task>";
        if(indentation){
            xml+="\n";
        }
        for(int i =0; i<inputFiles.size(); i++){
            if(indentation){
                xml+="    ";
            }
            xml+= "<inputFile name=\""+inputFiles.get(i) +"\"/>";
            if(indentation){
                xml+="\n";
            }
        }
        if(indentation){
            xml+="    ";
        }
        xml+= "<outputFile name=\""+outputFile+"\"/>";
        if(indentation){
            xml+="\n";
        }
        xml+= "</task>\n";
        
        System.out.println(xml);
        writeFile(path,xml);
    }
    
    /**
     * Used to delete the config XML after use.
     */
    public static void clean(){
        try{
            File file = new File(configXML);
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }
        }catch(Exception e){
            e.printStackTrace();
    	}
    }
}
