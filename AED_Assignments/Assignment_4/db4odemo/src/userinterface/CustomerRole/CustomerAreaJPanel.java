/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Order.OrderItem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Order.OrderRequestJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

   private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final CustomerDirectory customerDirectory;
    private final RestaurantDirectory restaurantDirectory;
    private final DeliveryManDirectory deliveryManDirectory;
    private final Menu menuDirectory;
    private final OrderDirectory orderDirectory;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, Menu menuDirectory,OrderDirectory orderDirectory) {
        initComponents();
      
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.customerDirectory = customerDirectory;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory;
        populateMenuTable();
    }
    public void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) tblRestaurantList.getModel();
        model.setRowCount(0);
        for (OrderItem item : menuDirectory.getMenuList()) {
            Object[] row = new Object[5];
            row[0] = restaurantDirectory.getRestName(item.getRestaurantNo());
            row[1] = item.getItemName();
            row[2] = item.getCategory();
            row[3] = item.getIngredients();
            row[4] = item.getPrice();
            model.addRow(row);
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

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantList = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        cmboxQtyCount = new javax.swing.JComboBox();
        lblQuantity = new javax.swing.JLabel();
        btnViewOrders = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        refreshTestJButton.setBackground(new java.awt.Color(204, 255, 255));
        refreshTestJButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(0, 51, 51));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 51));
        enterpriseLabel.setText("Restaurants in Vicinity");

        tblRestaurantList.setBackground(new java.awt.Color(204, 255, 255));
        tblRestaurantList.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblRestaurantList.setForeground(new java.awt.Color(0, 51, 51));
        tblRestaurantList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant", "Item", "Category", "Ingredients", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantList);

        btnPlaceOrder.setBackground(new java.awt.Color(204, 255, 255));
        btnPlaceOrder.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(0, 51, 51));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        cmboxQtyCount.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cmboxQtyCount.setForeground(new java.awt.Color(0, 51, 51));
        cmboxQtyCount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        cmboxQtyCount.setToolTipText("");
        cmboxQtyCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxQtyCountActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(0, 51, 51));
        lblQuantity.setText("Quantity:");

        btnViewOrders.setBackground(new java.awt.Color(204, 255, 255));
        btnViewOrders.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(0, 51, 51));
        btnViewOrders.setText("View Orders");
        btnViewOrders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateMenuTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurantList.getSelectedRow();
        int count = tblRestaurantList.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                int quantity = Integer.parseInt(cmboxQtyCount.getSelectedItem().toString());
                Restaurant restaurant = restaurantDirectory.getRestaurant(menuDirectory.getOrderItemByKey(row).getRestaurantNo());
                Customer customer = customerDirectory.getCustomer(userAccount.getEmployee().getName());
                OrderItem item = menuDirectory.getOrderItemByKey(row);
                String status = "Awaiting Order Confirmation";

                Order orderRequest = orderDirectory.add();
                orderRequest.setOrderNo("Order " + (orderDirectory.getOrderDir().size()));
                orderRequest.setOrderItem(item);
                orderRequest.setRestaurant(restaurant);
                orderRequest.setCustomer(customer);
                orderRequest.setQuantity(quantity);
                orderRequest.setMessage("Order Placed");
                orderRequest.setSender(userAccount);
                orderRequest.setStatus(status);
                system.setOrderDirectory(orderDirectory);
                system.getWorkQueue().getWorkRequestList().add(orderRequest);
                JOptionPane.showMessageDialog(null, "Your Order has been sucessfully placed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        OrderRequestJPanel orderRequest = new OrderRequestJPanel(userProcessContainer, userAccount, system, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory,orderDirectory);
        userProcessContainer.add(orderRequest);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void cmboxQtyCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxQtyCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxQtyCountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JComboBox cmboxQtyCount;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblRestaurantList;
    // End of variables declaration//GEN-END:variables
}
