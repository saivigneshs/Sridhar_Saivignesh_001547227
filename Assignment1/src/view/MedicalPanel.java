/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Medical;
import model.Person;

/**
 *
 * @author Saivignesh Sridhar
 */
public class MedicalPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalPanel
     */
    Person person;
 
    public MedicalPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMedTitle = new javax.swing.JLabel();
        lblMedRecNo = new javax.swing.JLabel();
        txtMedRecNo = new javax.swing.JTextField();
        lblAllergy1 = new javax.swing.JLabel();
        txtAllergy1 = new javax.swing.JTextField();
        lblAllergy2 = new javax.swing.JLabel();
        txtAllergy2 = new javax.swing.JTextField();
        lblAllergy3 = new javax.swing.JLabel();
        txtAllergy3 = new javax.swing.JTextField();
        btnMedSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 236, 236));
        setForeground(new java.awt.Color(0, 102, 102));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(673, 436));
        setMinimumSize(new java.awt.Dimension(673, 436));
        setPreferredSize(new java.awt.Dimension(673, 436));

        lblMedTitle.setBackground(new java.awt.Color(222, 236, 236));
        lblMedTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblMedTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblMedTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedTitle.setText("Medical Details");

        lblMedRecNo.setBackground(new java.awt.Color(222, 236, 236));
        lblMedRecNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMedRecNo.setForeground(new java.awt.Color(0, 102, 102));
        lblMedRecNo.setText("Medical Record Number :");

        txtMedRecNo.setBackground(new java.awt.Color(222, 236, 236));
        txtMedRecNo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtMedRecNo.setForeground(new java.awt.Color(0, 102, 102));
        txtMedRecNo.setToolTipText("Enter the Medical Record Number");
        txtMedRecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedRecNoActionPerformed(evt);
            }
        });

        lblAllergy1.setBackground(new java.awt.Color(222, 236, 236));
        lblAllergy1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAllergy1.setForeground(new java.awt.Color(0, 102, 102));
        lblAllergy1.setText("Allergy 1 :");

        txtAllergy1.setBackground(new java.awt.Color(222, 236, 236));
        txtAllergy1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAllergy1.setForeground(new java.awt.Color(0, 102, 102));
        txtAllergy1.setToolTipText("What are you Allergic to?");
        txtAllergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergy1ActionPerformed(evt);
            }
        });

        lblAllergy2.setBackground(new java.awt.Color(222, 236, 236));
        lblAllergy2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAllergy2.setForeground(new java.awt.Color(0, 102, 102));
        lblAllergy2.setText("Allergy 2 :");
        lblAllergy2.setPreferredSize(new java.awt.Dimension(74, 26));

        txtAllergy2.setBackground(new java.awt.Color(222, 236, 236));
        txtAllergy2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAllergy2.setForeground(new java.awt.Color(0, 102, 102));
        txtAllergy2.setToolTipText("What are you Allergic to?");
        txtAllergy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergy2ActionPerformed(evt);
            }
        });

        lblAllergy3.setBackground(new java.awt.Color(222, 236, 236));
        lblAllergy3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAllergy3.setForeground(new java.awt.Color(0, 102, 102));
        lblAllergy3.setText("Allergy 3 :");
        lblAllergy3.setPreferredSize(new java.awt.Dimension(74, 26));

        txtAllergy3.setBackground(new java.awt.Color(222, 236, 236));
        txtAllergy3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAllergy3.setForeground(new java.awt.Color(0, 102, 102));
        txtAllergy3.setToolTipText("What are you Allergic to?");
        txtAllergy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergy3ActionPerformed(evt);
            }
        });

        btnMedSubmit.setBackground(new java.awt.Color(222, 236, 236));
        btnMedSubmit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMedSubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnMedSubmit.setText("Submit");
        btnMedSubmit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnMedSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAllergy1)
                            .addComponent(lblAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAllergy1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(txtAllergy2)
                            .addComponent(txtAllergy3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addComponent(lblMedTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMedSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMedTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedRecNo))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnMedSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAllergy1, txtAllergy2});

    }// </editor-fold>//GEN-END:initComponents

    private void txtMedRecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedRecNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedRecNoActionPerformed

    private void txtAllergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergy1ActionPerformed

    private void txtAllergy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergy2ActionPerformed

    private void txtAllergy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergy3ActionPerformed

    private void btnMedSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedSubmitActionPerformed
        // TODO add your handling code here:
        Medical medical = new Medical();
        medical.setStMedRecNo(txtMedRecNo.getText());
        medical.setStAllergy1(txtAllergy1.getText());
        medical.setStAllergy2(txtAllergy2.getText());
        medical.setStAllergy3(txtAllergy3.getText());
        person.setMedical(medical);
        
        JOptionPane.showMessageDialog(this, "Medical Details Saved");
    }//GEN-LAST:event_btnMedSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedSubmit;
    private javax.swing.JLabel lblAllergy1;
    private javax.swing.JLabel lblAllergy2;
    private javax.swing.JLabel lblAllergy3;
    private javax.swing.JLabel lblMedRecNo;
    private javax.swing.JLabel lblMedTitle;
    private javax.swing.JTextField txtAllergy1;
    private javax.swing.JTextField txtAllergy2;
    private javax.swing.JTextField txtAllergy3;
    private javax.swing.JTextField txtMedRecNo;
    // End of variables declaration//GEN-END:variables
}
