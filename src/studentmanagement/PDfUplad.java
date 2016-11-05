/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PDfUplad.java
 *
 * Created on Sep 19, 2007, 1:36:02 AM
 */
package studentmanagement;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author RIIT_comp
 */
public class PDfUplad extends javax.swing.JInternalFrame {

    /** Creates new form PDfUplad */
    public PDfUplad() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setName("Form"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jFileChooser1.setName("jFileChooser1"); // NOI18N
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        jPanel1.add(jFileChooser1);
        jFileChooser1.setBounds(2, 7, 820, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

  
     int val=jFileChooser1.showOpenDialog(this);
     if(val==jFileChooser1.APPROVE_OPTION)
     {
         
     
    File file= jFileChooser1.getSelectedFile();
    File destination=new File("C:/Users/RIIT_comp/Desktop/StudentManagement/src/studentmanagement/resources/"+file.getName());
        try {
            FileUtils.copyFile(file.getAbsoluteFile(), destination);
             JOptionPane.showMessageDialog(this, "Upload");
             this.setVisible(false);
        StudentManagementView.mainPanel.add(new ViewPDf()).setVisible(true);
        repaint();
        validate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
     else
     {
          this.setVisible(false);
        StudentManagementView.mainPanel.add(new ViewPDf()).setVisible(true);
        repaint();
        validate();
     }
        
   // TODO add your handling code here:
}//GEN-LAST:event_jFileChooser1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
