/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AddRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddRestaurantJPanel
     */
    private final RestaurantDirectory restDirectory;
    private final JPanel container;
    private final EcoSystem system;
    
    Restaurant  rest = new Restaurant();
    public AddRestaurantJPanel(JPanel container, EcoSystem system, RestaurantDirectory restDir) {
        initComponents();
        this.restDirectory = restDir;
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

        txtRestEmail = new javax.swing.JTextField();
        lblRestEmail = new javax.swing.JLabel();
        pwRestPass = new javax.swing.JPasswordField();
        txtRestUserName = new javax.swing.JTextField();
        txtRestName = new javax.swing.JTextField();
        lblRestContact = new javax.swing.JLabel();
        lblRestPass = new javax.swing.JLabel();
        txtRestZip = new javax.swing.JTextField();
        lblRestUserName = new javax.swing.JLabel();
        lblRestZip = new javax.swing.JLabel();
        lblRestName = new javax.swing.JLabel();
        txtRestAddr = new javax.swing.JTextField();
        lblAddRest = new javax.swing.JLabel();
        lblRestAddr = new javax.swing.JLabel();
        pbRestPassStr = new javax.swing.JProgressBar();
        txtRestContact = new javax.swing.JTextField();
        btnAddRest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtMgrName = new javax.swing.JTextField();
        lblMgrName = new javax.swing.JLabel();

        lblRestEmail.setText("Enter Email ID :");

        pwRestPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwRestPassActionPerformed(evt);
            }
        });
        pwRestPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwRestPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwRestPassKeyTyped(evt);
            }
        });

        lblRestContact.setText("Enter Contact No :");

        lblRestPass.setText("Set Password :");

        lblRestUserName.setText("Set Username :");

        lblRestZip.setText("Enter Zip Code :");

        lblRestName.setText("Enter Restaurant Name :");

        lblAddRest.setText("Add Restaurant");

        lblRestAddr.setText("Enter Street Address :");

        pbRestPassStr.setMaximum(30);
        pbRestPassStr.setMinimum(1);
        pbRestPassStr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbRestPassStrStateChanged(evt);
            }
        });

        btnAddRest.setText("Add");
        btnAddRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRestActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMgrName.setText("Manager's Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRestUserName)
                            .addComponent(lblRestName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRestContact)
                                    .addComponent(lblRestPass)
                                    .addComponent(lblRestEmail)
                                    .addComponent(lblRestAddr)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMgrName)
                                        .addComponent(lblRestZip, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRestAddr)
                            .addComponent(pbRestPassStr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtRestUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestZip)
                            .addComponent(pwRestPass, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMgrName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnAddRest))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblAddRest)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAddRest)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestName)
                    .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestUserName)
                    .addComponent(txtRestUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestPass)
                    .addComponent(pwRestPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbRestPassStr, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestEmail)
                    .addComponent(txtRestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestAddr)
                    .addComponent(txtRestAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestZip)
                    .addComponent(txtRestZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMgrName)
                    .addComponent(txtMgrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddRest))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pwRestPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwRestPassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pwRestPassActionPerformed

    private void pwRestPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwRestPassKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_pwRestPassKeyReleased

    private void pwRestPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwRestPassKeyTyped
        // TODO add your handling code here:
        int pwSize = pwRestPass.getText().length();
        pbRestPassStr.setValue(pwSize);
    }//GEN-LAST:event_pwRestPassKeyTyped

    private void pbRestPassStrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbRestPassStrStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pbRestPassStrStateChanged

    private void btnAddRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRestActionPerformed
        // TODO add your handling code here:

        String custName = txtRestName.getText();
        String custContact = txtRestContact.getText();
        String custAddr = txtRestAddr.getText();
        String custZipCode = txtRestZip.getText();
        String custUserName = txtRestUserName.getText();
        String custPass = String.valueOf(pwRestPass.getPassword());
        String custEmail = txtRestEmail.getText();
        String mgrName = txtMgrName.getText();

        if( custName.isEmpty() || custContact.isEmpty() || custAddr.isEmpty() || custZipCode.isEmpty() ||
            custUserName.isEmpty() || custPass.isEmpty() || custEmail.isEmpty() || mgrName.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   else if (!system.validateEmail(custEmail)) {
            JOptionPane.showMessageDialog(null, "Kindly check the entered Email ID format.");
        }   else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(custUserName)) {
            JOptionPane.showMessageDialog(null, "Entered User Name is already mapped to another Restaurant");
        }   else if (!restDirectory.isEmailUnique(custEmail)) {
            JOptionPane.showMessageDialog(null, "Entered Email ID is already mapped to another Restaurant.");
        }   else if (!restDirectory.isContactNoUnique(custContact)) {
            JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Restaurant.");
        }   else {

            rest.setRestName(custName);
            rest.setRestAddress(custAddr);
            rest.setRestContact(custContact);
            rest.setRestEmail(custEmail);
            rest.setRestZipCode(custZipCode);
            rest.setRestManager(mgrName);
            restDirectory.addRestaurant(rest);
            Employee employee = system.getEmployeeDirectory().createEmployee(rest.getRestNo() );
            system.setRestaurantDirectory(restDirectory);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(custUserName, custPass, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant "+account.getUsername()+" added to the System Successfully!");
            clearAllFields();
        }
    }//GEN-LAST:event_btnAddRestActionPerformed
 public void clearAllFields() {
        txtRestName.setText("");
        txtRestAddr.setText("");
        txtRestContact.setText("");
        txtRestUserName.setText("");
        pwRestPass.setText("");
        txtMgrName.setText("");
        txtRestZip.setText("");
        txtRestEmail.setText("");
    }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRest;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAddRest;
    private javax.swing.JLabel lblMgrName;
    private javax.swing.JLabel lblRestAddr;
    private javax.swing.JLabel lblRestContact;
    private javax.swing.JLabel lblRestEmail;
    private javax.swing.JLabel lblRestName;
    private javax.swing.JLabel lblRestPass;
    private javax.swing.JLabel lblRestUserName;
    private javax.swing.JLabel lblRestZip;
    private javax.swing.JProgressBar pbRestPassStr;
    private javax.swing.JPasswordField pwRestPass;
    private javax.swing.JTextField txtMgrName;
    private javax.swing.JTextField txtRestAddr;
    private javax.swing.JTextField txtRestContact;
    private javax.swing.JTextField txtRestEmail;
    private javax.swing.JTextField txtRestName;
    private javax.swing.JTextField txtRestUserName;
    private javax.swing.JTextField txtRestZip;
    // End of variables declaration//GEN-END:variables
}
