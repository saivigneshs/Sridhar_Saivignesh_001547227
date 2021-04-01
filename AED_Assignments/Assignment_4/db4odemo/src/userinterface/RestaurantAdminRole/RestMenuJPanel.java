/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderItem;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Order.AddMenuItemJPanel;
import userinterface.Order.EditMenuItemJPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class RestMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestMenuJPanel
     */
    
    private final JPanel container;
    private final EcoSystem system;
    private final RestaurantDirectory restaurantDirectory;
    private final Menu menuDirectory;
    private final UserAccount account;

    public RestMenuJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, Menu menuDirectory) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.restaurantDirectory = restaurantDirectory;
        this.menuDirectory = menuDirectory;
        this.account = account;
        populateMenuTable();
    }
    public void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) tblResMenu.getModel();
        model.setRowCount(0);
        for (OrderItem item : menuDirectory.getMenuList()) {
            if (item.getRestaurantNo().equalsIgnoreCase(account.getEmployee().getName())) {
                Object[] row = new Object[5];
                row[0] = item.getItemNo();
                row[1] = item.getItemName();
                row[2] = item.getCategory();
                row[3] = item.getIngredients();
                row[4] = item.getPrice();
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

        lblRestaurantMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResMenu = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnEditItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();

        lblRestaurantMenu.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblRestaurantMenu.setText("Restaurant Menu");

        tblResMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item No.", "Name", "Category", "Ingredients", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResMenu);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddItem.setText("Add Order Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnEditItem.setText("Edit Order Item");
        btnEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setText("Delete Order Item");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnBack)
                        .addGap(282, 282, 282)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteItem)
                            .addComponent(btnEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(193, 193, 193)
                            .addComponent(lblRestaurantMenu))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblRestaurantMenu)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAddItem)
                        .addGap(11, 11, 11)
                        .addComponent(btnEditItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteItem)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        AddMenuItemJPanel addMenuItem = new AddMenuItemJPanel(container, account, system, restaurantDirectory, menuDirectory);
        container.add(addMenuItem);
        layout.next(container);
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblResMenu.getSelectedRow();
        int count = tblResMenu.getSelectedRowCount();
        if (count == 1) {
            CardLayout layout = (CardLayout) container.getLayout();
            String itemID = (String) tblResMenu.getValueAt(selectedRow, 0);
            OrderItem item = menuDirectory.fetchOrderItem(itemID);
            EditMenuItemJPanel editMenuItem = new EditMenuItemJPanel(container, item, menuDirectory);
            container.add(editMenuItem);
            layout.next(container);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
    }//GEN-LAST:event_btnEditItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblResMenu.getSelectedRow();
        int delectedRowCount = tblResMenu.getSelectedRowCount();
        if (delectedRowCount == 1) {
            int confirmOptions = JOptionPane.YES_NO_OPTION;
            int response = JOptionPane.showConfirmDialog(null, "Are you sure want to delete this menu item?", "Warning", confirmOptions);
            if (response == JOptionPane.YES_OPTION) {
                String itemID = (String) tblResMenu.getValueAt(selectedRow, 0);
                menuDirectory.deleteOrderItem(itemID);
                populateMenuTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first!!");
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRestaurantMenu;
    private javax.swing.JTable tblResMenu;
    // End of variables declaration//GEN-END:variables
}
