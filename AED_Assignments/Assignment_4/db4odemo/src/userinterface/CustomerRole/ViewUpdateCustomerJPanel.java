/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Saivignesh Sridhar
 */
public class ViewUpdateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerJPanel
     */
    public ViewUpdateCustomerJPanel() {
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

        lblCustPhoto = new javax.swing.JLabel();
        btnCustPhotoUpload = new javax.swing.JButton();
        txtCustContact = new javax.swing.JTextField();
        lblCustEmail = new javax.swing.JLabel();
        txtCustEmail = new javax.swing.JTextField();
        lblViewUpdateCust = new javax.swing.JLabel();
        lblCustAddr = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();
        txtCustAddr = new javax.swing.JTextField();
        lblCustZip = new javax.swing.JLabel();
        txtCustZip = new javax.swing.JTextField();
        lblCustContact = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        btnEnableUpdate = new javax.swing.JButton();

        lblCustPhoto.setBackground(new java.awt.Color(222, 236, 236));
        lblCustPhoto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCustPhoto.setForeground(new java.awt.Color(0, 102, 102));
        lblCustPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCustPhotoUpload.setBackground(new java.awt.Color(222, 236, 236));
        btnCustPhotoUpload.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCustPhotoUpload.setForeground(new java.awt.Color(0, 102, 102));
        btnCustPhotoUpload.setText("Upload");
        btnCustPhotoUpload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnCustPhotoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustPhotoUploadActionPerformed(evt);
            }
        });

        lblCustEmail.setText("Enter Email ID:");

        lblViewUpdateCust.setText("Customer Details");

        lblCustAddr.setText("Enter Street Address :");

        lblCustName.setText("Enter Full Name :");

        lblCustZip.setText("Enter Zip Code :");

        lblCustContact.setText("Enter Contact No :");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnEnableUpdate.setText("Enable Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCustName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustAddr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustZip, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCustAddr)
                                .addComponent(txtCustContact, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCustEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCustZip, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(txtCustName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCustPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblViewUpdateCust))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack1)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEnableUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCustPhotoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblViewUpdateCust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustContact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustEmail)
                            .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustAddr)
                            .addComponent(txtCustAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustZip)
                            .addComponent(txtCustZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustPhotoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnableUpdate)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack1)
                    .addComponent(btnSaveChanges))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustPhotoUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustPhotoUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);

        BufferedImage bfImage = null;
        try {
            File fileImage = fileChooser.getSelectedFile();
            bfImage = ImageIO.read(new File(fileImage.getAbsolutePath()));
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image imPhoto = bfImage.getScaledInstance(lblCustPhoto.getWidth(), lblCustPhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imIcon = new ImageIcon(imPhoto);

        lblCustPhoto.setIcon(imIcon);
        cust.setCustPhoto(imPhoto);
    }//GEN-LAST:event_btnCustPhotoUploadActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String custName = txtCustName.getText();
        String custContact = txtCustContact.getText();
        String custAddr = txtCustAddr.getText();
        String custZipCode = txtCustZip.getText();
        String custEmail = txtCustEmail.getText();
        
        if( custName.isEmpty() || custContact.isEmpty() || custAddr.isEmpty() || custZipCode.isEmpty() || custEmail.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(custEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(custUserName)) {
            JOptionPane.showMessageDialog(null, "Sorry! User with this username already exist!");    
        }   else if (!custDirectory.isEmailUnique(custEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Customer.");
        }   else if (!custDirectory.isContactNoUnique(custContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Customer.");
        }   else {
        }
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCustPhotoUpload;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblCustAddr;
    private javax.swing.JLabel lblCustContact;
    private javax.swing.JLabel lblCustEmail;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblCustPhoto;
    private javax.swing.JLabel lblCustZip;
    private javax.swing.JLabel lblViewUpdateCust;
    private javax.swing.JTextField txtCustAddr;
    private javax.swing.JTextField txtCustContact;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustZip;
    // End of variables declaration//GEN-END:variables
}
