/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewPDf.java
 *
 * Created on Sep 19, 2007, 1:50:51 AM
 */
package studentmanagement;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author RIIT_comp
 */
public class ViewPDf extends javax.swing.JInternalFrame {

    /** Creates new form ViewPDf */
    public ViewPDf() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jFileChooser1.setName("jFileChooser1"); // NOI18N

        setName("Form"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 100, 100, 70);

        jButton2.setName("jButton2"); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 40, 70, 50);

        jButton3.setName("jButton3"); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 40, 80, 40);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(studentmanagement.StudentManagementApp.class).getContext().getResourceMap(ViewPDf.class);
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(40, 83, 190, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        Desktop.getDesktop().open(new File("C:/Users/RIIT_comp/Desktop/StudentManagement/src/studentmanagement/resources/Fee Notice July - Dec, 2015.pdf"));
    } catch (Exception e) {
    }
    
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
}//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
