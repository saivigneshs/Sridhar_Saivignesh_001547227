/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
             
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDir()) {
            if (order.getDeliveryMan() != null) {
                if (order.getDeliveryMan().getDeliveryID().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                    Object[] row = new Object[7];
                    row[0] = order.getMessage();
                    row[1] = order.getSender();
                    row[2] = order.getStatus();
                    row[3] = order.getOrderNo();
                    row[4] = order.getCustomer().getCustAddr();
                    row[5] = order.getRestaurant().getRestAddress();
                    row[6] = order.getRestaurant().getRestZipCode();
                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        lblMarkDeli = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        btnDeliComplete = new javax.swing.JButton();
        lblDeliDetails = new javax.swing.JLabel();

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order No", "Order Status", "Ordered By", "Restaurant Address", "Customer Address", "Customer Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnConfirm.setText("Confirm Order Pickup");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblMarkDeli.setText("Mark Delivery Complete (Enter comments) :");

        btnDeliComplete.setText("Delivery Complete");
        btnDeliComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliCompleteActionPerformed(evt);
            }
        });

        lblDeliDetails.setText("Delivery Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(refreshJButton)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(lblDeliDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblMarkDeli)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeliComplete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDeliDetails)
                .addGap(5, 5, 5)
                .addComponent(refreshJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarkDeli)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeliComplete)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 3);
        Order order = business.getOrderDirectory().fetchOrders(selectedOrderId);

        if (order.getStatus().trim().equalsIgnoreCase("Out For Delivery")) {
            order.setConfirmOrder(txtComments.getText());
            order.setStatus("Completed");
            txtComments.setText("");
            JOptionPane.showMessageDialog(null, "Order updated!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please confirm order pick up before confirming delivery!");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeliCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliCompleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 3);
        Order order = business.getOrderDirectory().fetchOrders(selectedOrderId);

        if (order.getStatus().trim().equalsIgnoreCase("Out For Delivery")) {
            order.setConfirmOrder(txtComments.getText());
            order.setStatus("Completed");
            txtComments.setText("");
            JOptionPane.showMessageDialog(null, "Order has been updated!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Kindly confirm the order pick-up before confirming delivery!");
        }
    }//GEN-LAST:event_btnDeliCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeliComplete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliDetails;
    private javax.swing.JLabel lblMarkDeli;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
