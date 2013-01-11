/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.hierarchy.UI;

import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author mittoria
 */
public class SelectFiles extends javax.swing.JFrame {

    
    /**
     * Creates new form SelectFiles
     */
    public SelectFiles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));

        jButton1.setText("BrowseInput");
        jButton1.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButton1ComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton1ComponentShown(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setPreferredSize(new java.awt.Dimension(400, 30));

        jButton2.setLabel("BrowseOutput");
        jButton2.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Generate");
        jButton3.setMaximumSize(new java.awt.Dimension(101, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(101, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(300, 60));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select input files");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Select output files");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(449, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method is called to open a JFileChooser when action is performed on 
     * jButton1.
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       fileChooserInput();
        
    }
    /**
     * Array for the files to be opened. 
     */
    private File[] inFile = null;
    /**
     * This method verifies if the file selected is ".xml".
     * @param path
     * @return 
     */
    static boolean verifyExtension(String path){
        String extension = path.substring(path.length()-4, path.length());
        if (extension.equals(".xml"))
            return true;
        return false;
    }
    /**
     * This method creates and opens a JFileChooser for the input files. 
     * JFileChooser is allowed to select multiple files, which will be added
     * in the inFile array. Paths of the files will be stored in a fileName variable.
     * jTextArea1 will be set as the fileName variable.
     */
    public void fileChooserInput(){
            Vector<String> input = new Vector();
            
            JFileChooser chooser = new JFileChooser("");
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setMultiSelectionEnabled(true);
                      
            int returnVal = chooser.showOpenDialog((java.awt.Component) null);
            if (returnVal == JFileChooser.APPROVE_OPTION ){
            inFile = chooser.getSelectedFiles();
           
      //      chooser.addPropertyChangeListener(".xlm", JFileChooser.FILE_FILTER_CHANGED_PROPERTY );
            
            for (int i=0; i<inFile.length;i++){
                if(verifyExtension(inFile[i].getPath())){
                 //   fileName.setInputText(inFile[i].getPath());
                  jTextArea1.setText( inFile[i].getPath()+ "\n");// + jTextArea1.getText());
                  input.add(inFile[i].getPath());
                }
            }
        }    
            ro.hierarchy.UI.execWrapper.Wrapper.setInputFiles(input);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * The file for output. 
     */
    private File outFile = null;
    /**
     *  This method creates and opens a JFileChooser for the output file. 
     * JFileChooser selects only one file. The path of the file
     * will be stored in a fileName variable.
     * jTextField2 will be set as the fileName variable.
     */
    public void fileChooserOutput(){
         String outputFile = new String();
         
         JFileChooser chooser = new JFileChooser("");
         chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
         chooser.enableInputMethods(rootPaneCheckingEnabled);
                 
         int returnVal = chooser.showOpenDialog((java.awt.Component) null);
         if (returnVal == JFileChooser.APPROVE_OPTION ){
            outFile = chooser.getSelectedFile();
            if (verifyExtension(outFile.getPath())){
                jTextField2.setText(outFile.getPath());
                outputFile = outFile.getPath();
            }
        }
        ro.hierarchy.UI.execWrapper.Wrapper.setOutputFile(outputFile);
        generated.Test4.giveName(outputFile);
    }
    
    public void generateXML(){
                          
        ro.hierarchy.UI.execWrapper.Wrapper.setIndentation(true);
        ro.hierarchy.UI.execWrapper.Wrapper.createConfigXML("conf.xml");
        ro.hierarchy.UI.execWrapper.Wrapper.run("conf.xml");   
        
        
    }
    
    private void jButton1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComponentShown

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentHidden
        
    }//GEN-LAST:event_jButton1ComponentHidden

    /**
     * This method is called to open a JFileChooser when action is performed on 
     * jButton2.
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fileChooserOutput();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * This method calls the method that generates the hierarchy.
     * @param evt 
     */    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
//        NewJFrame n = new NewJFrame();
//        n.setVisible(true);
//        
        generateXML();
        ro.hierarchy.Main.select.setVisible(false);
        ro.hierarchy.Main.hier.setVisible(true);
        
        generated.Test4.init();
        ro.hierarchy.Main.hier.jTree1.setModel(new DefaultTreeModel (generated.Test4.transform()));
        
        
    }//GEN-LAST:event_jButton3ActionPerformed


    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectFiles().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
