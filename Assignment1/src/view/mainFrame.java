/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Person;

/**
 *
 * @author Saivignesh Sridhar
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    Person person;
    public mainFrame() {
        initComponents();
        person = new Person();
        greet();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        splitPaneMain = new javax.swing.JSplitPane();
        splitPaneLeft = new javax.swing.JSplitPane();
        createPane = new javax.swing.JPanel();
        btnDemoCreate = new javax.swing.JButton();
        btnAddrCreate = new javax.swing.JButton();
        btnAccCreate = new javax.swing.JButton();
        btnLiceCreate = new javax.swing.JButton();
        btnMedCreate = new javax.swing.JButton();
        lblViewsTitle = new javax.swing.JLabel();
        viewPane = new javax.swing.JPanel();
        btnViewDetails = new javax.swing.JButton();
        btnGenReport = new javax.swing.JButton();
        btnSubmitDetails = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        mainPane = new javax.swing.JPanel();
        lblMainTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPaneMain.setDividerLocation(130);

        splitPaneLeft.setDividerLocation(320);
        splitPaneLeft.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        createPane.setBackground(new java.awt.Color(222, 236, 236));
        createPane.setMaximumSize(new java.awt.Dimension(133, 319));
        createPane.setPreferredSize(new java.awt.Dimension(133, 319));

        btnDemoCreate.setBackground(new java.awt.Color(222, 236, 236));
        btnDemoCreate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnDemoCreate.setForeground(new java.awt.Color(0, 102, 102));
        btnDemoCreate.setText("Demographic");
        btnDemoCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnDemoCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemoCreateActionPerformed(evt);
            }
        });

        btnAddrCreate.setBackground(new java.awt.Color(222, 236, 236));
        btnAddrCreate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnAddrCreate.setForeground(new java.awt.Color(0, 102, 102));
        btnAddrCreate.setText("Address");
        btnAddrCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnAddrCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddrCreateActionPerformed(evt);
            }
        });

        btnAccCreate.setBackground(new java.awt.Color(222, 236, 236));
        btnAccCreate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnAccCreate.setForeground(new java.awt.Color(0, 102, 102));
        btnAccCreate.setText("Accounts");
        btnAccCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnAccCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccCreateActionPerformed(evt);
            }
        });

        btnLiceCreate.setBackground(new java.awt.Color(222, 236, 236));
        btnLiceCreate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnLiceCreate.setForeground(new java.awt.Color(0, 102, 102));
        btnLiceCreate.setText("License");
        btnLiceCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnLiceCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiceCreateActionPerformed(evt);
            }
        });

        btnMedCreate.setBackground(new java.awt.Color(222, 236, 236));
        btnMedCreate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnMedCreate.setForeground(new java.awt.Color(0, 102, 102));
        btnMedCreate.setText("Medical");
        btnMedCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnMedCreate.setOpaque(false);
        btnMedCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedCreateActionPerformed(evt);
            }
        });

        lblViewsTitle.setBackground(new java.awt.Color(222, 236, 236));
        lblViewsTitle.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        lblViewsTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblViewsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewsTitle.setText("Submit Details");
        lblViewsTitle.setPreferredSize(new java.awt.Dimension(394, 451));

        javax.swing.GroupLayout createPaneLayout = new javax.swing.GroupLayout(createPane);
        createPane.setLayout(createPaneLayout);
        createPaneLayout.setHorizontalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDemoCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnAddrCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLiceCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(createPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblViewsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createPaneLayout.setVerticalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPaneLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblViewsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDemoCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddrCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAccCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLiceCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMedCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        splitPaneLeft.setTopComponent(createPane);

        viewPane.setBackground(new java.awt.Color(222, 236, 236));

        btnViewDetails.setBackground(new java.awt.Color(222, 236, 236));
        btnViewDetails.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnViewDetails.setText("View Details");
        btnViewDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnGenReport.setBackground(new java.awt.Color(222, 236, 236));
        btnGenReport.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnGenReport.setForeground(new java.awt.Color(0, 102, 102));
        btnGenReport.setText("Generate Report");
        btnGenReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnGenReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenReportActionPerformed(evt);
            }
        });

        btnSubmitDetails.setBackground(new java.awt.Color(222, 236, 236));
        btnSubmitDetails.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        btnSubmitDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitDetails.setText("Submit Details");
        btnSubmitDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnSubmitDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewPaneLayout = new javax.swing.GroupLayout(viewPane);
        viewPane.setLayout(viewPaneLayout);
        viewPaneLayout.setHorizontalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmitDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        viewPaneLayout.setVerticalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnSubmitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        splitPaneLeft.setRightComponent(viewPane);

        splitPaneMain.setLeftComponent(splitPaneLeft);

        mainPane.setBackground(new java.awt.Color(222, 236, 236));
        mainPane.setMaximumSize(new java.awt.Dimension(673, 436));
        mainPane.setPreferredSize(new java.awt.Dimension(673, 436));

        lblMainTitle.setBackground(new java.awt.Color(222, 236, 236));
        lblMainTitle.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        lblMainTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("Good <Day>, Thank you for choosing this Application!");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(222, 236, 236));
        jTextArea1.setColumns(22);
        jTextArea1.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 102, 102));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("  Instructions :\n\n1. Submit your details by clicking on the corresponding buttons under \"Submit Details\".\n\n2. Click \"View Details\" button to view and validate if the submitted details are correct.\n\n3. Click on \"Generate Report\" to get a consolidated view of all the  submitted details.\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        splitPaneMain.setRightComponent(mainPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDemoCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemoCreateActionPerformed
        // TODO add your handling code here:
        DemographPanel demoPanel = new DemographPanel(person);
        splitPaneMain.setRightComponent(demoPanel);
         
    }//GEN-LAST:event_btnDemoCreateActionPerformed

    private void btnAddrCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddrCreateActionPerformed
        // TODO add your handling code here:
        AddressPanel addrPanel = new AddressPanel(person);
        splitPaneMain.setRightComponent(addrPanel);
    }//GEN-LAST:event_btnAddrCreateActionPerformed

    private void btnAccCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccCreateActionPerformed
        // TODO add your handling code here:
        AccountPanel accPanel = new AccountPanel(person);
        splitPaneMain.setRightComponent(accPanel);
    }//GEN-LAST:event_btnAccCreateActionPerformed

    private void btnLiceCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiceCreateActionPerformed
        // TODO add your handling code here:
         LicensePanel licePanel = new LicensePanel(person);
        splitPaneMain.setRightComponent(licePanel);
    }//GEN-LAST:event_btnLiceCreateActionPerformed

    private void btnMedCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedCreateActionPerformed
        // TODO add your handling code here:
        MedicalPanel medPanel = new MedicalPanel(person);
        splitPaneMain.setRightComponent(medPanel);
    }//GEN-LAST:event_btnMedCreateActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        ViewsPanel views = new ViewsPanel(person,splitPaneMain);
        splitPaneLeft.setTopComponent(views);
        
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSubmitDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitDetailsActionPerformed
        // TODO add your handling code here:
     
        splitPaneLeft.setTopComponent(createPane);
    }//GEN-LAST:event_btnSubmitDetailsActionPerformed

    private void btnGenReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenReportActionPerformed
        // TODO add your handling code here:
        ReportPanel reportPanel = new ReportPanel(person);
        splitPaneMain.setRightComponent(reportPanel);
    }//GEN-LAST:event_btnGenReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccCreate;
    private javax.swing.JButton btnAddrCreate;
    private javax.swing.JButton btnDemoCreate;
    private javax.swing.JButton btnGenReport;
    private javax.swing.JButton btnLiceCreate;
    private javax.swing.JButton btnMedCreate;
    private javax.swing.JButton btnSubmitDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JPanel createPane;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblViewsTitle;
    private javax.swing.JPanel mainPane;
    private javax.swing.JSplitPane splitPaneLeft;
    private javax.swing.JSplitPane splitPaneMain;
    private javax.swing.JPanel viewPane;
    // End of variables declaration//GEN-END:variables

    private void greet() {
        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    	String stDate = dateFormat.format(new Date());
        String stGreet = "";
        if(stDate.substring(6,8).equals("AM")){
            stGreet = "Morning";
        }else if (Integer.parseInt(stDate.substring(0,2)) < 4 && stDate.substring(6,8).equals("PM")){
        stGreet = "Afternoon";
        } else stGreet = "Evening";
        
        lblMainTitle.setText("Good "+stGreet+", Thank you for choosing this Application!");
    }
}
