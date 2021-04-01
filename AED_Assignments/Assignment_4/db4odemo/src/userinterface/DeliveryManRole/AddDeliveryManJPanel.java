/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AddDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDeliveryManJPanel
     */
    private final DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;
    private final JPanel container;
    public AddDeliveryManJPanel(JPanel container, EcoSystem system, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        this.container = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeliName = new javax.swing.JLabel();
        lblDeliUserName = new javax.swing.JLabel();
        lblDeliPass = new javax.swing.JLabel();
        lblDeliContact = new javax.swing.JLabel();
        lblDeliEmail = new javax.swing.JLabel();
        txtRestName = new javax.swing.JTextField();
        txtRestUserName = new javax.swing.JTextField();
        pwDeliPass = new javax.swing.JPasswordField();
        txtDeliContact = new javax.swing.JTextField();
        txtDeliEmail = new javax.swing.JTextField();
        lblAddRest = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddRest = new javax.swing.JButton();
        pbDeliPassStr = new javax.swing.JProgressBar();

        lblDeliName.setText("Enter Full Name :");

        lblDeliUserName.setText("Set Username :");

        lblDeliPass.setText("Set Password :");

        lblDeliContact.setText("Enter Contact No :");

        lblDeliEmail.setText("Enter Email ID :");

        pwDeliPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwDeliPassActionPerformed(evt);
            }
        });
        pwDeliPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwDeliPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwDeliPassKeyTyped(evt);
            }
        });

        lblAddRest.setText("Add Delivery Person");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddRest.setText("Add");
        btnAddRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRestActionPerformed(evt);
            }
        });

        pbDeliPassStr.setMaximum(30);
        pbDeliPassStr.setMinimum(1);
        pbDeliPassStr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbDeliPassStrStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnBack)
                        .addGap(95, 95, 95)
                        .addComponent(btnAddRest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblAddRest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeliContact)
                            .addComponent(lblDeliEmail))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeliContact, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtDeliEmail)
                            .addComponent(pbDeliPassStr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDeliUserName)
                        .addComponent(lblDeliName)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(lblDeliPass)))
                    .addGap(70, 70, 70)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtRestUserName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRestName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pwDeliPass, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(96, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAddRest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(pbDeliPassStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeliContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeliContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliEmail)
                    .addComponent(txtDeliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddRest))
                .addGap(89, 89, 89))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeliName)
                        .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeliUserName)
                        .addComponent(txtRestUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeliPass)
                        .addComponent(pwDeliPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(232, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pwDeliPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwDeliPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwDeliPassActionPerformed

    private void pwDeliPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwDeliPassKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_pwDeliPassKeyReleased

    private void pwDeliPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwDeliPassKeyTyped
        // TODO add your handling code here:
        int pwSize = pwDeliPass.getText().length();
        pbDeliPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwDeliPassKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantsJPanel manageRestJPanel = (ManageRestaurantsJPanel) component;
        manageRestJPanel.populateRestaurantsTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRestActionPerformed
        // TODO add your handling code here:

        String custName = txtRestName.getText();
        String custContact = txtDeliContact.getText();
        String custUserName = txtRestUserName.getText();
        String custPass = String.valueOf(pwDeliPass.getPassword());
        String custEmail = txtDeliEmail.getText();

        if( custName.isEmpty() || custContact.isEmpty() || 
            custUserName.isEmpty() || custPass.isEmpty() || custEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(custEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(custUserName)) {
            JOptionPane.showMessageDialog(null, "Entered User Name is already mapped to another Restaurant");
        }   else if (!deliveryManDirectory.isEmailUnique(custEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Restaurant.");
        }   else if (!deliveryManDirectory.isContactNoUnique(custContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Restaurant.");
        }   else {
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryMan.setDeliName(custName);
            deliveryMan.setDeliPhoneNo(custContact);
            deliveryMan.setDeliEmail(custEmail);
            restDirectory.addRestaurant(rest);
            Employee employee = system.getEmployeeDirectory().createEmployee(rest.getRestNo() );
            system.setRestaurantDirectory(restDirectory);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(custUserName, custPass, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant "+account.getUsername()+" added to the System Successfully!");
            clearAllFields();
        }
    }//GEN-LAST:event_btnAddRestActionPerformed

    private void pbDeliPassStrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbDeliPassStrStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pbDeliPassStrStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRest;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddRest;
    private javax.swing.JLabel lblDeliContact;
    private javax.swing.JLabel lblDeliEmail;
    private javax.swing.JLabel lblDeliName;
    private javax.swing.JLabel lblDeliPass;
    private javax.swing.JLabel lblDeliUserName;
    private javax.swing.JProgressBar pbDeliPassStr;
    private javax.swing.JPasswordField pwDeliPass;
    private javax.swing.JTextField txtDeliContact;
    private javax.swing.JTextField txtDeliEmail;
    private javax.swing.JTextField txtRestName;
    private javax.swing.JTextField txtRestUserName;
    // End of variables declaration//GEN-END:variables
}
