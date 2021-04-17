/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HostRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Host.Host;
import Business.Host.HostDirectory;
import Business.Role.HostRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
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
import javax.swing.JPanel;
/**
 *
 * @author Saivignesh Sridhar
 */
public class AddHostJPanel extends javax.swing.JPanel {

    private HostDirectory hostDirectory;
    private JPanel container;
    private EcoSystem system;
    
    Host host = new Host();
    
    public AddHostJPanel(JPanel container, EcoSystem system, HostDirectory hostDir) {
        initComponents();
        this.hostDirectory = hostDir;
        this.system = system;
        this.container = container;
        System.out.println("-- "+system);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddCustomer = new javax.swing.JLabel();
        lblHostName = new javax.swing.JLabel();
        lblHostUserName = new javax.swing.JLabel();
        lblHostPass = new javax.swing.JLabel();
        lblHostContact = new javax.swing.JLabel();
        txtHostName = new javax.swing.JTextField();
        txtHostUserName = new javax.swing.JTextField();
        txtHostContact = new javax.swing.JTextField();
        lblHostEmail = new javax.swing.JLabel();
        txtHostEmail = new javax.swing.JTextField();
        pbHostPassStr = new javax.swing.JProgressBar();
        lblHostAddr = new javax.swing.JLabel();
        txtHostAddr = new javax.swing.JTextField();
        lblHostZip = new javax.swing.JLabel();
        txtHostZip = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblHostPhoto = new javax.swing.JLabel();
        btnHostPhotoUpload = new javax.swing.JButton();
        lblAddHost = new javax.swing.JButton();
        pwHostPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddCustomer.setBackground(new java.awt.Color(204, 255, 255));
        lblAddCustomer.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblAddCustomer.setForeground(new java.awt.Color(0, 51, 51));
        lblAddCustomer.setText("Add Customer");
        add(lblAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        lblHostName.setBackground(new java.awt.Color(204, 255, 255));
        lblHostName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostName.setForeground(new java.awt.Color(0, 51, 51));
        lblHostName.setText("Enter Full Name :");
        add(lblHostName, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 72, -1, -1));

        lblHostUserName.setBackground(new java.awt.Color(204, 255, 255));
        lblHostUserName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostUserName.setForeground(new java.awt.Color(0, 51, 51));
        lblHostUserName.setText("Set Username :");
        add(lblHostUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 99, -1, -1));

        lblHostPass.setBackground(new java.awt.Color(204, 255, 255));
        lblHostPass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostPass.setForeground(new java.awt.Color(0, 51, 51));
        lblHostPass.setText("Set Password :");
        add(lblHostPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 134, -1, -1));

        lblHostContact.setBackground(new java.awt.Color(204, 255, 255));
        lblHostContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostContact.setForeground(new java.awt.Color(0, 51, 51));
        lblHostContact.setText("Enter Contact No :");
        add(lblHostContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 190, -1, -1));

        txtHostName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 69, 127, -1));

        txtHostUserName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostUserName.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 96, 127, -1));

        txtHostContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostContact.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 187, 127, -1));

        lblHostEmail.setBackground(new java.awt.Color(204, 255, 255));
        lblHostEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostEmail.setForeground(new java.awt.Color(0, 51, 51));
        lblHostEmail.setText("Enter Email ID:");
        add(lblHostEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 222, -1, -1));

        txtHostEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostEmail.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 220, 127, -1));

        pbHostPassStr.setBackground(new java.awt.Color(204, 255, 255));
        pbHostPassStr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pbHostPassStr.setForeground(new java.awt.Color(0, 51, 51));
        pbHostPassStr.setMaximum(13);
        pbHostPassStr.setMinimum(1);
        pbHostPassStr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbHostPassStrStateChanged(evt);
            }
        });
        add(pbHostPassStr, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 162, 127, 10));

        lblHostAddr.setBackground(new java.awt.Color(204, 255, 255));
        lblHostAddr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostAddr.setForeground(new java.awt.Color(0, 51, 51));
        lblHostAddr.setText("Enter Street Address :");
        add(lblHostAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 251, -1, -1));

        txtHostAddr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostAddr.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 249, 127, -1));

        lblHostZip.setBackground(new java.awt.Color(204, 255, 255));
        lblHostZip.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblHostZip.setForeground(new java.awt.Color(0, 51, 51));
        lblHostZip.setText("Enter Zip Code :");
        add(lblHostZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 283, -1, -1));

        txtHostZip.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtHostZip.setForeground(new java.awt.Color(0, 51, 51));
        add(txtHostZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 280, 127, -1));

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 321, 60, -1));

        lblHostPhoto.setBackground(new java.awt.Color(222, 236, 236));
        lblHostPhoto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblHostPhoto.setForeground(new java.awt.Color(0, 102, 102));
        lblHostPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHostPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lblHostPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 94, 102, 129));

        btnHostPhotoUpload.setBackground(new java.awt.Color(204, 255, 255));
        btnHostPhotoUpload.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnHostPhotoUpload.setForeground(new java.awt.Color(0, 102, 102));
        btnHostPhotoUpload.setText("Upload");
        btnHostPhotoUpload.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHostPhotoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostPhotoUploadActionPerformed(evt);
            }
        });
        add(btnHostPhotoUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 232, 67, 27));

        lblAddHost.setBackground(new java.awt.Color(204, 255, 255));
        lblAddHost.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblAddHost.setForeground(new java.awt.Color(0, 51, 51));
        lblAddHost.setText("Add");
        lblAddHost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAddHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddHostActionPerformed(evt);
            }
        });
        add(lblAddHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 321, 60, -1));

        pwHostPass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pwHostPass.setForeground(new java.awt.Color(0, 51, 51));
        pwHostPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwHostPassActionPerformed(evt);
            }
        });
        pwHostPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwHostPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwHostPassKeyTyped(evt);
            }
        });
        add(pwHostPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 131, 127, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHostPhotoUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostPhotoUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);

        BufferedImage bfImage = null;
        try {
            File fileImage = fileChooser.getSelectedFile();
            bfImage = ImageIO.read(new File(fileImage.getAbsolutePath()));
        } catch (IOException ex) {
            Logger.getLogger(AddHostJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image imPhoto = bfImage.getScaledInstance(lblHostPhoto.getWidth(), lblHostPhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imIcon = new ImageIcon(imPhoto);
       
        lblHostPhoto.setIcon(imIcon);
        host.setHostPhoto(imPhoto);

    }//GEN-LAST:event_btnHostPhotoUploadActionPerformed

    private void lblAddHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddHostActionPerformed
        // TODO add your handling code here:
        
        String hostName = txtHostName.getText();
        String hostContact = txtHostContact.getText();
        String hostAddr = txtHostAddr.getText();
        String hostZipCode = txtHostZip.getText();
        String hostUserName = txtHostUserName.getText();
        String hostPass = String.valueOf(pwHostPass.getPassword());
        String hostEmail = txtHostEmail.getText();
     
        if( hostName.isEmpty() || hostContact.isEmpty() || hostAddr.isEmpty() || hostZipCode.isEmpty() ||
                hostUserName.isEmpty() || hostPass.isEmpty() || hostEmail.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(hostContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(hostEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(hostUserName)) {
            JOptionPane.showMessageDialog(null, "Entered User Name is already mapped to another Host");    
        }   else if (!hostDirectory.isEmailUnique(hostEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Host.");
        }   else if (!hostDirectory.isContactNoUnique(hostContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Host.");
        }   else {
        
            host.setHostID(hostDirectory.genHostID() );
            host.setHostName(hostName);
            host.setHostAddr(hostAddr);
            host.setHostContact(hostContact);
            host.setHostEmail(hostEmail);
            host.setHostZipCode(hostZipCode);
            hostDirectory.addHost(host);
            Employee employee = system.getEmployeeDirectory().createEmployee(host.getHostID());
            system.setHostDirectory(hostDirectory);
             UserAccount account = system.getUserAccountDirectory().createUserAccount(hostUserName, hostPass, employee, new HostRole());
            JOptionPane.showMessageDialog(null, "New Host "+account.getUsername()+" added to the System Successfully!");
            resetFields();
        }
    }//GEN-LAST:event_lblAddHostActionPerformed
   public void resetFields() {
        txtHostAddr.setText("");
        txtHostContact.setText("");
        txtHostEmail.setText("");
        txtHostName.setText("");
        pwHostPass.setText("");
        txtHostUserName.setText("");
        txtHostZip.setText("");
        pbHostPassStr.setValue(0);
        lblHostPhoto.setText("");
    }
    private void pbHostPassStrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbHostPassStrStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pbHostPassStrStateChanged

    private void pwHostPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwHostPassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pwHostPassActionPerformed

    private void pwHostPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwHostPassKeyTyped
        // TODO add your handling code here:
        int pwSize = pwHostPass.getText().length();
//        System.out.println("PassKeyTyped PwSize :: "+pwSize);
        pbHostPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwHostPassKeyTyped

    private void pwHostPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwHostPassKeyReleased
       
    }//GEN-LAST:event_pwHostPassKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageHostJPanel manageHostJPanel = (ManageHostJPanel) component;
        manageHostJPanel.populateHostListTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHostPhotoUpload;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JButton lblAddHost;
    private javax.swing.JLabel lblHostAddr;
    private javax.swing.JLabel lblHostContact;
    private javax.swing.JLabel lblHostEmail;
    private javax.swing.JLabel lblHostName;
    private javax.swing.JLabel lblHostPass;
    private javax.swing.JLabel lblHostPhoto;
    private javax.swing.JLabel lblHostUserName;
    private javax.swing.JLabel lblHostZip;
    private javax.swing.JProgressBar pbHostPassStr;
    private javax.swing.JPasswordField pwHostPass;
    private javax.swing.JTextField txtHostAddr;
    private javax.swing.JTextField txtHostContact;
    private javax.swing.JTextField txtHostEmail;
    private javax.swing.JTextField txtHostName;
    private javax.swing.JTextField txtHostUserName;
    private javax.swing.JTextField txtHostZip;
    // End of variables declaration//GEN-END:variables
}
