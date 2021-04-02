/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Order;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class OrderRequestJPanel extends javax.swing.JPanel {
    
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final OrderDirectory orderDirectory;
    private final JPanel container;
    /**
     * Creates new form OrderRequestJPanel
     */
    public OrderRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, Menu menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.orderDirectory = orderDirectory;
        this.container = userProcessContainer;
        
        populateWorkRequestTable();
    }
    public void populateWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : orderDirectory.getOrderDir()) {
            if (order.getCustomer().getCustID().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                Object[] row = new Object[9];
                row[8] = order.getMessage();
                row[6] = (order.getDeliveryMan() == null) ? "Awaiting Confirmation" : order.getDeliveryMan().getDeliName();
                row[3] = order.getStatus();
                row[7] = (order.getConfirmOrder()== null ? "Waiting" : order.getConfirmOrder());
                row[0] = order.getRestaurant().getRestName();
                row[2] = order.getOrderItem().getItemName();
                row[4] = order.getQuantity();
                row[5] = order.getQuantity() * order.getOrderItem().getPrice();
                row[1] = order.getOrderNo();
                model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        orderComment = new javax.swing.JTextField();
        btnOrderCmnt = new javax.swing.JButton();
        lblOrderFeedback = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(0, 51, 51));

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 255));
        workRequestJTable.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(0, 51, 51));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Order Id", "Item", "Status", "Quantity", "Total Cost", "Delivery Man", "DeliveryMan Message", "Customer Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        orderComment.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        orderComment.setForeground(new java.awt.Color(0, 51, 51));

        btnOrderCmnt.setBackground(new java.awt.Color(204, 255, 255));
        btnOrderCmnt.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnOrderCmnt.setForeground(new java.awt.Color(0, 51, 51));
        btnOrderCmnt.setText("Comment");
        btnOrderCmnt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrderCmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderCmntActionPerformed(evt);
            }
        });

        lblOrderFeedback.setBackground(new java.awt.Color(204, 255, 255));
        lblOrderFeedback.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblOrderFeedback.setForeground(new java.awt.Color(0, 51, 51));
        lblOrderFeedback.setText("Order Feedback :");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Order Work List");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lblOrderFeedback)
                                .addGap(18, 18, 18)
                                .addComponent(orderComment, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnOrderCmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jLabel1)))
                        .addGap(0, 219, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderFeedback)
                    .addComponent(btnOrderCmnt))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderCmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderCmntActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        int count = workRequestJTable.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                String orderId = workRequestJTable.getValueAt(row, 1).toString();
                Order order = orderDirectory.fetchOrders(orderId);
               String comment = orderComment.getText();
                    if (!comment.isEmpty()) {
                        order.setMessage(comment);
                        orderComment.setText("");
                        JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
                        populateWorkRequestTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Feedback is Mandatory!");
                    }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnOrderCmntActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderCmnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrderFeedback;
    private javax.swing.JTextField orderComment;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
