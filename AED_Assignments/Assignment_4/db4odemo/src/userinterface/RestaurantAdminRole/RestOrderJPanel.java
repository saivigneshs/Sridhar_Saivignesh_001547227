/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
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
public class RestOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestOrderJPanel
     */
    private final JPanel userProcessContainer;
    private final UserAccount account;
    private final EcoSystem business;
    private final DeliveryManDirectory deliveryManDirectory;
    private final OrderDirectory orderDirectory;
    private final Menu menuDirectory;
    public RestOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, Menu menuDirectory, OrderDirectory orderDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        this.menuDirectory = menuDirectory;
        initComponents();
        populateOrderListTable();
        populateDeliveryManDetailsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        public void populateOrderListTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrderList.getModel();
        model.setRowCount(0);
        for (Order order : orderDirectory.getOrderDir()) {
            if (order.getRestaurant().getRestNo().equalsIgnoreCase(account.getEmployee().getName())) {
                Object[] row = new Object[10];
                row[0] = order.getOrderNo();
                row[7] = order.getSender();
                row[5] = (order.getDeliveryMan() == null) ? "Awaiting Confirmation" : order.getDeliveryMan().getDeliName();
                row[8] = order.getMessage();
                row[4] = order.getStatus();
                row[1] = order.getRestaurant().getRestName();
                row[6] = (order.getConfirmOrder()== null ? "Waiting" : order.getConfirmOrder());
                row[2] = order.getOrderItem().getItemName();
                row[3] = order.getQuantity();
                row[9] = order.getQuantity() * order.getOrderItem().getPrice();
                
                model.addRow(row);
            }
        }
    }
        
      public void populateDeliveryManDetailsTable(){
        DefaultTableModel model = (DefaultTableModel) tblDeliManDetails.getModel();
        model.setRowCount(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()) {
                Object[] row = new Object[3];
                row[0] = deliveryMan.getDeliName();
                row[1] = deliveryMan.getDeliPhoneNo();
                row[2] = deliveryMan.getDeliveryID();
                model.addRow(row);
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRestWorkList = new javax.swing.JLabel();
        scrollOrderList = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        brnConfirmOrder = new javax.swing.JButton();
        scrollDeliveryMan = new javax.swing.JScrollPane();
        tblDeliManDetails = new javax.swing.JTable();
        btnAssignDeliveryMan = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestWorkList.setBackground(new java.awt.Color(204, 255, 255));
        lblRestWorkList.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblRestWorkList.setForeground(new java.awt.Color(0, 51, 51));
        lblRestWorkList.setText("Restaurant Order Work List");
        add(lblRestWorkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 24, -1, -1));

        tblOrderList.setBackground(new java.awt.Color(204, 255, 255));
        tblOrderList.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblOrderList.setForeground(new java.awt.Color(0, 51, 51));
        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order No", "Restaurant Name", "Item Name", "Quantity", "Order Status", "Deliver By", "DeliveryMan Messageg", "Order By", "Feedback", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollOrderList.setViewportView(tblOrderList);

        add(scrollOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 843, 110));

        brnConfirmOrder.setBackground(new java.awt.Color(204, 255, 255));
        brnConfirmOrder.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        brnConfirmOrder.setForeground(new java.awt.Color(0, 51, 51));
        brnConfirmOrder.setText("Confirm Order");
        brnConfirmOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnConfirmOrderActionPerformed(evt);
            }
        });
        add(brnConfirmOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 110, 30));

        tblDeliManDetails.setBackground(new java.awt.Color(204, 255, 255));
        tblDeliManDetails.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblDeliManDetails.setForeground(new java.awt.Color(0, 51, 51));
        tblDeliManDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Delivery Man ID", "Delivery Man Name", "Contact No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDeliveryMan.setViewportView(tblDeliManDetails);

        add(scrollDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 407, 116));

        btnAssignDeliveryMan.setBackground(new java.awt.Color(204, 255, 255));
        btnAssignDeliveryMan.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnAssignDeliveryMan.setForeground(new java.awt.Color(0, 51, 51));
        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });
        add(btnAssignDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 140, 30));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 50, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void brnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnConfirmOrderActionPerformed
        // TODO add your handling code here:
        int row = tblOrderList.getSelectedRow();
        int count = tblOrderList.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                
                String orderStatus = (String) tblOrderList.getValueAt(row, 4);
                if(orderStatus.equals("Completed")){ JOptionPane.showMessageDialog(null, "This order is already complete.");}
                else{
                    if(orderStatus.equals("Awaiting Order Confirmation")){
                    String id = (String) tblOrderList.getValueAt(row, 0);
                    Order order = business.getOrderDirectory().fetchOrders(id);
                    order.setStatus("Confirmed");
                    JOptionPane.showMessageDialog(null, "The Order has been Confirmed!");
                    populateOrderListTable();
                    } else {  JOptionPane.showMessageDialog(null, "This order has already been confirmed.");  }
                    
                    }
                }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a single order at one time!");
        }
    }//GEN-LAST:event_brnConfirmOrderActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
        int row = tblOrderList.getSelectedRow();
        int orderCount = tblOrderList.getSelectedRowCount();
        int deliveryRow = tblDeliManDetails.getSelectedRow();
        int deliverCount = tblDeliManDetails.getSelectedRowCount();
        if(orderCount ==1 && deliverCount == 1){
            if (row >= 0) {
                String orderId = (String) tblOrderList.getValueAt(row,0);
                Order order = business.getOrderDirectory().fetchOrders(orderId);
                System.out.println(order.getStatus().trim());
                if (order.getStatus().trim().equalsIgnoreCase("Confirmed")) {
                    if(deliverCount == 1){
                        if (deliveryRow >= 0) {
                            System.out.println("Inside "+ deliveryRow);
                            order.setDeliveryMan(deliveryManDirectory.getDeliveryManDirectory().get(deliveryRow));
                            String empId = (String) tblDeliManDetails.getValueAt(deliveryRow,0);
                            UserAccount user = business.getUserAccountDirectory().getUserByEmployeeNo(empId);
                            order.setReceiver(user);
                            order.setStatus("Preparing Order.");
                            JOptionPane.showMessageDialog(null, "Delivery Man Assigned");
                            populateOrderListTable();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Select a delivery man to assign from table.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Order has not been confirmed. Kindly confirm the order before assigning it.");
                }
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Kindly select a pair of Order and Delivery man.");
        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnConfirmOrder;
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblRestWorkList;
    private javax.swing.JScrollPane scrollDeliveryMan;
    private javax.swing.JScrollPane scrollOrderList;
    private javax.swing.JTable tblDeliManDetails;
    private javax.swing.JTable tblOrderList;
    // End of variables declaration//GEN-END:variables
}
