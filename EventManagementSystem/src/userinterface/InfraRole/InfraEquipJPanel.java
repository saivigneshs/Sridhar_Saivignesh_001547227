/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InfraRole;

import Business.EcoSystem;
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
public class InfraEquipJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InfraEquipJPanel
     */
    
    private final JPanel container;
    private final EcoSystem system;
    private final UserAccount account;

    public InfraEquipJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.account = account;
        populateMenuTable();
    }
    public void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) tblResMenu.getModel();
        model.setRowCount(0);
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

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestaurantMenu.setBackground(new java.awt.Color(204, 255, 255));
        lblRestaurantMenu.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblRestaurantMenu.setForeground(new java.awt.Color(0, 51, 51));
        lblRestaurantMenu.setText("Infra Equipment");
        add(lblRestaurantMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 27, -1, -1));

        tblResMenu.setBackground(new java.awt.Color(204, 204, 255));
        tblResMenu.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblResMenu.setForeground(new java.awt.Color(0, 51, 51));
        tblResMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Equip. No", "Name", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 77, 505, 204));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 327, 56, -1));

        btnAddItem.setBackground(new java.awt.Color(204, 255, 255));
        btnAddItem.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(0, 51, 51));
        btnAddItem.setText("Add Equipment");
        btnAddItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 299, 123, -1));

        btnEditItem.setBackground(new java.awt.Color(204, 255, 255));
        btnEditItem.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnEditItem.setForeground(new java.awt.Color(0, 51, 51));
        btnEditItem.setText("Edit Equipment");
        btnEditItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditItemActionPerformed(evt);
            }
        });
        add(btnEditItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 333, 123, -1));

        btnDeleteItem.setBackground(new java.awt.Color(204, 255, 255));
        btnDeleteItem.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnDeleteItem.setForeground(new java.awt.Color(0, 51, 51));
        btnDeleteItem.setText("Delete Equipment");
        btnDeleteItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });
        add(btnDeleteItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 368, 123, -1));
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
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditItemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEditItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        
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
