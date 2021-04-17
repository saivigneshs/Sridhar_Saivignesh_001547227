/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;        
        this.ecosystem=ecosystem;
        manageNetwork();
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    
    private void manageNetwork(){
        userinterface.SystemAdminWorkArea.ManageNetworkJPanel manageNetworkPanel = new userinterface.SystemAdminWorkArea.ManageNetworkJPanel(ecosystem);
        rightSystemAdminPanel.add("ManageNetworkJPanel",manageNetworkPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
     }
    
    private void manageEnterprise(){
        userinterface.SystemAdminWorkArea.ManageEnterpriseJPanel manageEnterprise = new userinterface.SystemAdminWorkArea.ManageEnterpriseJPanel(ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    private void manageEnterpriseAdmin(){
        userinterface.SystemAdminWorkArea.ManageEnterpriseAdminJPanel manageEnterpriseAdmin = new userinterface.SystemAdminWorkArea.ManageEnterpriseAdminJPanel(ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseAdminJPanel",manageEnterpriseAdmin);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        leftSystemAdminPanel = new javax.swing.JPanel();
        manageNetworkPanel = new javax.swing.JPanel();
        manageNetwork = new javax.swing.JLabel();
        manageEnterprise = new javax.swing.JPanel();
        manageEnterpriseLabel = new javax.swing.JLabel();
        manageEnterpriseAdmin = new javax.swing.JPanel();
        manageEnterpriseAdminLabel1 = new javax.swing.JLabel();
        lblSelectedNode1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jSeparator2 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 229, 180));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        leftSystemAdminPanel.setBackground(new java.awt.Color(127, 165, 221));
        leftSystemAdminPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftSystemAdminPanel.setMinimumSize(new java.awt.Dimension(280, 148));
        leftSystemAdminPanel.setPreferredSize(new java.awt.Dimension(280, 148));
        leftSystemAdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkPanel.setBackground(new java.awt.Color(127, 165, 221));
        manageNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetworkPanelMousePressed(evt);
            }
        });

        manageNetwork.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageNetwork.setText("Manage Network");
        manageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetworkMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageNetworkPanelLayout = new javax.swing.GroupLayout(manageNetworkPanel);
        manageNetworkPanel.setLayout(manageNetworkPanelLayout);
        manageNetworkPanelLayout.setHorizontalGroup(
            manageNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageNetworkPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(manageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageNetworkPanelLayout.setVerticalGroup(
            manageNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftSystemAdminPanel.add(manageNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 50));

        manageEnterprise.setBackground(new java.awt.Color(127, 165, 221));
        manageEnterprise.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseMousePressed(evt);
            }
        });

        manageEnterpriseLabel.setBackground(new java.awt.Color(127, 165, 221));
        manageEnterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEnterpriseLabel.setText("Manage Enterprise");
        manageEnterpriseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEnterpriseLayout = new javax.swing.GroupLayout(manageEnterprise);
        manageEnterprise.setLayout(manageEnterpriseLayout);
        manageEnterpriseLayout.setHorizontalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(manageEnterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        manageEnterpriseLayout.setVerticalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageEnterpriseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        leftSystemAdminPanel.add(manageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        manageEnterpriseAdmin.setBackground(new java.awt.Color(127, 165, 221));
        manageEnterpriseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseAdminMousePressed(evt);
            }
        });

        manageEnterpriseAdminLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageEnterpriseAdminLabel1.setText("Manage Enterprise Admin");
        manageEnterpriseAdminLabel1.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageEnterpriseAdminLayout = new javax.swing.GroupLayout(manageEnterpriseAdmin);
        manageEnterpriseAdmin.setLayout(manageEnterpriseAdminLayout);
        manageEnterpriseAdminLayout.setHorizontalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(manageEnterpriseAdminLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        manageEnterpriseAdminLayout.setVerticalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageEnterpriseAdminLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        leftSystemAdminPanel.add(manageEnterpriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 280, 40));

        lblSelectedNode1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        leftSystemAdminPanel.add(lblSelectedNode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Control Over at :");
        leftSystemAdminPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        jTree1.setBackground(new java.awt.Color(127, 165, 221));
        jTree1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTree1.setForeground(new java.awt.Color(0, 0, 0));
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        leftSystemAdminPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 270));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        leftSystemAdminPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        rightSystemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(leftSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseLabelMousePressed
      manageEnterprise();
    }//GEN-LAST:event_manageEnterpriseLabelMousePressed

    private void manageEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseMousePressed
        // TODO add your handling code here:
      manageEnterprise();
    }//GEN-LAST:event_manageEnterpriseMousePressed

    private void manageEnterpriseAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminMousePressed
       manageEnterpriseAdmin();
    }//GEN-LAST:event_manageEnterpriseAdminMousePressed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        // TODO add your handling code here:
         DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode1.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private void manageNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkPanelMousePressed
        // TODO add your handling code here:
        manageNetwork();
    }//GEN-LAST:event_manageNetworkPanelMousePressed

    private void manageNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkMousePressed
        manageNetwork();
    }//GEN-LAST:event_manageNetworkMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblSelectedNode1;
    private javax.swing.JPanel leftSystemAdminPanel;
    private javax.swing.JPanel manageEnterprise;
    private javax.swing.JPanel manageEnterpriseAdmin;
    private javax.swing.JLabel manageEnterpriseAdminLabel1;
    private javax.swing.JLabel manageEnterpriseLabel;
    private javax.swing.JLabel manageNetwork;
    private javax.swing.JPanel manageNetworkPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
