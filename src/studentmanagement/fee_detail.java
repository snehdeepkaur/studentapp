/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fee_detail.java
 *
 * Created on Jul 1, 2015, 12:32:08 PM
 */
package studentmanagement;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javax.swing.JOptionPane;
import studentmanagement.service.feesOperationDB;
import studentmanagement.template.fee_detailtemplate;

/**
 *
 * @author win 7
 */
public class fee_detail extends javax.swing.JInternalFrame {
    private int hostellerfee;
    private String Course;
    private String Studentid;

    /** Creates new form fee_detail */
    public fee_detail() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setName("Form"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(studentmanagement.StudentManagementApp.class).getContext().getResourceMap(fee_detail.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 30, 210, 44);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 210, 80, 22);

        jComboBox1.setFont(resourceMap.getFont("jComboBox1.font")); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B.tech", "M.tech" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(260, 200, 180, 40);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 350, 90, 22);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 460, 130, 22);

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(610, 460, 110, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 530, 120, 22);

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(610, 530, 110, 30);

        jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 610, 170, 50);

        jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(550, 610, 170, 50);

        jComboBox3.setFont(resourceMap.getFont("jComboBox3.font")); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer science and engineering", "Information technology", "Civil engineerng", "Mechanical engineering", "Electrical and communication engineering", "Production engineering" }));
        jComboBox3.setName("jComboBox3"); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(260, 270, 240, 50);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 280, 70, 22);

        jButton4.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(820, 610, 160, 50);

        jComboBox2.setFont(resourceMap.getFont("jComboBox2.font")); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester1", "Semester2", "Semester3", "Semester4", "Semester5", "Semester6", "Semester7", "Semester8" }));
        jComboBox2.setName("jComboBox2"); // NOI18N
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(260, 350, 170, 40);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 130, 110, 30);

        jButton5.setFont(resourceMap.getFont("jButton5.font")); // NOI18N
        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(50, 610, 160, 50);

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 140, 100, 20);

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(260, 140, 150, 20);

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(94, 410, 90, 20);

        jRadioButton1.setFont(resourceMap.getFont("jRadioButton1.font")); // NOI18N
        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(90, 420, 150, 31);

        jRadioButton2.setFont(resourceMap.getFont("jRadioButton2.font")); // NOI18N
        jRadioButton2.setText(resourceMap.getString("jRadioButton2.text")); // NOI18N
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(90, 470, 140, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);
StudentManagementView.mainPanel.add(new buttons1()).setVisible(true);
repaint();
validate();// TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String type="";
        if(jRadioButton1.isSelected()==true)
       {
            type="hostler";
        }
        else
       {
            type="daysscholar";
        }
        
    String Course=(String) jComboBox1.getSelectedItem();

String Branch=(String) jComboBox3.getSelectedItem();
String Semester=(String) jComboBox2.getSelectedItem();
String stuid=jTextField1.getText();
int Student_ID=Integer.parseInt(stuid);
 String hstfee=jTextField2.getText();
  int Hostellerfee =Integer.parseInt(hstfee);
 String semfee=jTextField3.getText();
 int Semesterfee =Integer.parseInt(semfee);
 fee_detailtemplate T=new fee_detailtemplate(); 
 T.setStudentid(Student_ID);
T.setCourse(Course);
 T.setBranch(Branch);
 T.setSemester(Semester);
 T.setType(type);
T.setHostellerfee(Hostellerfee);
 T.setSemesterfee(Semesterfee);    
 feesOperationDB gh=new feesOperationDB();
 gh.Savefee_detail(T);
 JOptionPane.showMessageDialog(this, "save successfully");
         
 //TODO add youlerfeIDTH);r handling code here: int college=Integer.parseInt(collrollno);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String type="";
        if(jRadioButton1.isSelected()==true)
       {
            type="hostler";
        }
        else
       {
            type="daysscholar";
        }
        

String stuid=jTextField1.getText();
int Student_ID=Integer.parseInt(stuid);
feesOperationDB hh=new feesOperationDB();
String Course=(String) jComboBox1.getSelectedItem();

String Branch=(String) jComboBox3.getSelectedItem();
String Semester=(String) jComboBox2.getSelectedItem();



  
        
        
        //T.setHostellerfee(hostellerfee);
        
 

 String hstfee=jTextField2.getText();
  int Hosteller =Integer.parseInt(hstfee);
 String semfee=jTextField3.getText();
 int Semesterfee =Integer.parseInt(semfee);
  fee_detailtemplate T=new fee_detailtemplate();
 T.setStudentid(Student_ID);
 T.setBranch(Branch);
 T.setSemester(Semester);
 T.setCourse(Course);
T.setHostellerfee(Hosteller);
T.setType(type);
 T.setSemesterfee(Semesterfee); 
 hh.updatefee_detail(T);
JOptionPane.showMessageDialog(this,"Update successfully");
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
String stuid=jTextField1.getText();
int Student_ID=Integer.parseInt(stuid);
feesOperationDB tt=new feesOperationDB();
DBCursor cursor=tt.searchfee_detail(Student_ID);
        while(cursor.hasNext())
        {
             DBObject dbo= cursor.next();
               
        if(dbo.get("type").equals("hostler"))
        {
            jRadioButton1.setSelected(true);
        }
        else
        {
            jRadioButton2.setSelected(true);
        }
        System.out.println("branch is=="+dbo.get("Branch"));
        System.out.println("sem is=="+dbo.get("Semester"));
        jComboBox1.setSelectedItem(dbo.get("Course"));
        jComboBox3.setSelectedItem(dbo.get("Branch"));
        jComboBox2.setSelectedItem(dbo.get("Semester"));
        jTextField2.setText(dbo.get("Hosteller")+"");
        jTextField3.setText(dbo.get("Semesterfee")+"");
        JOptionPane.showMessageDialog(this, "search successfully");
         
                           // TODO add your handling code here:
        
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 this.setVisible(false);
StudentManagementView.mainPanel.add(new fee_detail()).setVisible(true);
repaint();
validate();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBox3ActionPerformed

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
jRadioButton2.setSelected(false);// TODO add your handling code here:
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
jRadioButton1.setSelected(false);// TODO add your handling code here:
}//GEN-LAST:event_jRadioButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}