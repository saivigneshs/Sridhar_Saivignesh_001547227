/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Account;
import model.Person;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AccountPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountPanel
     */
    Person person;

    public AccountPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAccTitle1 = new javax.swing.JLabel();
        lblAccTitle2 = new javax.swing.JLabel();
        lblCheckBankName = new javax.swing.JLabel();
        lblCheckAccNo = new javax.swing.JLabel();
        lblCheckRouteNo = new javax.swing.JLabel();
        lblCheckAccBal = new javax.swing.JLabel();
        lblSaveBankName = new javax.swing.JLabel();
        lblSaveAccNo = new javax.swing.JLabel();
        lblSaveRoutNo = new javax.swing.JLabel();
        lblSaveAccBal = new javax.swing.JLabel();
        txtCheckBankName = new javax.swing.JTextField();
        txtCheckAccNo = new javax.swing.JTextField();
        txtCheckRoutNo = new javax.swing.JTextField();
        txtCheckAccBal = new javax.swing.JTextField();
        txtSaveBankName = new javax.swing.JTextField();
        txtSaveAccNo = new javax.swing.JTextField();
        txtSaveRoutNo = new javax.swing.JTextField();
        txtSaveAccBal = new javax.swing.JTextField();
        btnCheckSubmit = new javax.swing.JButton();
        lblDollar = new javax.swing.JLabel();
        lblDollar1 = new javax.swing.JLabel();
        btnSaveSubmit = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(222, 236, 236));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(673, 436));
        setMinimumSize(new java.awt.Dimension(673, 436));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(673, 436));

        lblAccTitle1.setBackground(new java.awt.Color(222, 236, 236));
        lblAccTitle1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblAccTitle1.setForeground(new java.awt.Color(0, 102, 102));
        lblAccTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccTitle1.setText("Checking Account Details");

        lblAccTitle2.setBackground(new java.awt.Color(222, 236, 236));
        lblAccTitle2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblAccTitle2.setForeground(new java.awt.Color(0, 102, 102));
        lblAccTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccTitle2.setText("Savings Account Details");

        lblCheckBankName.setBackground(new java.awt.Color(222, 236, 236));
        lblCheckBankName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCheckBankName.setForeground(new java.awt.Color(0, 102, 102));
        lblCheckBankName.setText("Bank Name :");

        lblCheckAccNo.setBackground(new java.awt.Color(222, 236, 236));
        lblCheckAccNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCheckAccNo.setForeground(new java.awt.Color(0, 102, 102));
        lblCheckAccNo.setText("Account Number :");

        lblCheckRouteNo.setBackground(new java.awt.Color(222, 236, 236));
        lblCheckRouteNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCheckRouteNo.setForeground(new java.awt.Color(0, 102, 102));
        lblCheckRouteNo.setText("Routing Number :");

        lblCheckAccBal.setBackground(new java.awt.Color(222, 236, 236));
        lblCheckAccBal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCheckAccBal.setForeground(new java.awt.Color(0, 102, 102));
        lblCheckAccBal.setText("Account Balance :");

        lblSaveBankName.setBackground(new java.awt.Color(222, 236, 236));
        lblSaveBankName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaveBankName.setForeground(new java.awt.Color(0, 102, 102));
        lblSaveBankName.setText("Bank Name :");

        lblSaveAccNo.setBackground(new java.awt.Color(222, 236, 236));
        lblSaveAccNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaveAccNo.setForeground(new java.awt.Color(0, 102, 102));
        lblSaveAccNo.setText("Account Number :");

        lblSaveRoutNo.setBackground(new java.awt.Color(222, 236, 236));
        lblSaveRoutNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaveRoutNo.setForeground(new java.awt.Color(0, 102, 102));
        lblSaveRoutNo.setText("Routing Number :");

        lblSaveAccBal.setBackground(new java.awt.Color(222, 236, 236));
        lblSaveAccBal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaveAccBal.setForeground(new java.awt.Color(0, 102, 102));
        lblSaveAccBal.setText("Account Balance :");

        txtCheckBankName.setBackground(new java.awt.Color(222, 236, 236));
        txtCheckBankName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCheckBankName.setForeground(new java.awt.Color(0, 102, 102));
        txtCheckBankName.setToolTipText("Enter Checking Account Bank Name");
        txtCheckBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckBankNameActionPerformed(evt);
            }
        });

        txtCheckAccNo.setBackground(new java.awt.Color(222, 236, 236));
        txtCheckAccNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCheckAccNo.setForeground(new java.awt.Color(0, 102, 102));
        txtCheckAccNo.setToolTipText("Enter your Check Acc Number");
        txtCheckAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckAccNoActionPerformed(evt);
            }
        });

        txtCheckRoutNo.setBackground(new java.awt.Color(222, 236, 236));
        txtCheckRoutNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCheckRoutNo.setForeground(new java.awt.Color(0, 102, 102));
        txtCheckRoutNo.setToolTipText("Enter your Checking Routing No");
        txtCheckRoutNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckRoutNoActionPerformed(evt);
            }
        });

        txtCheckAccBal.setBackground(new java.awt.Color(222, 236, 236));
        txtCheckAccBal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCheckAccBal.setForeground(new java.awt.Color(0, 102, 102));
        txtCheckAccBal.setToolTipText("Enter your Checking Acc Balance");
        txtCheckAccBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckAccBalActionPerformed(evt);
            }
        });

        txtSaveBankName.setBackground(new java.awt.Color(222, 236, 236));
        txtSaveBankName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSaveBankName.setForeground(new java.awt.Color(0, 102, 102));
        txtSaveBankName.setToolTipText("Enter your Savings Bank Name");
        txtSaveBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveBankNameActionPerformed(evt);
            }
        });

        txtSaveAccNo.setBackground(new java.awt.Color(222, 236, 236));
        txtSaveAccNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSaveAccNo.setForeground(new java.awt.Color(0, 102, 102));
        txtSaveAccNo.setToolTipText("Enter your Savings Account Number");
        txtSaveAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveAccNoActionPerformed(evt);
            }
        });

        txtSaveRoutNo.setBackground(new java.awt.Color(222, 236, 236));
        txtSaveRoutNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSaveRoutNo.setForeground(new java.awt.Color(0, 102, 102));
        txtSaveRoutNo.setToolTipText("Enter your Savings Routing Number");
        txtSaveRoutNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveRoutNoActionPerformed(evt);
            }
        });

        txtSaveAccBal.setBackground(new java.awt.Color(222, 236, 236));
        txtSaveAccBal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSaveAccBal.setForeground(new java.awt.Color(0, 102, 102));
        txtSaveAccBal.setToolTipText("Enter your Savings Account Balance");
        txtSaveAccBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveAccBalActionPerformed(evt);
            }
        });

        btnCheckSubmit.setBackground(new java.awt.Color(222, 236, 236));
        btnCheckSubmit.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnCheckSubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnCheckSubmit.setText("Submit");
        btnCheckSubmit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnCheckSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckSubmitActionPerformed(evt);
            }
        });

        lblDollar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDollar.setText("$");

        lblDollar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDollar1.setText("$");

        btnSaveSubmit.setBackground(new java.awt.Color(222, 236, 236));
        btnSaveSubmit.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSaveSubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnSaveSubmit.setText("Submit");
        btnSaveSubmit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnSaveSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAccTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCheckRouteNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheckRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCheckAccBal)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCheckBankName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheckBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lblCheckAccNo)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtCheckAccBal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDollar1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheckAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSaveBankName)
                            .addComponent(lblSaveRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaveRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaveBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblSaveAccBal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSaveAccBal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDollar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblSaveAccNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSaveAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnCheckSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSaveSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAccTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckBankName)
                    .addComponent(txtCheckBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckAccNo)
                    .addComponent(txtCheckAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheckRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckRouteNo)
                    .addComponent(lblCheckAccBal)
                    .addComponent(txtCheckAccBal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDollar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnCheckSubmit)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccTitle2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaveBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveBankName)
                    .addComponent(lblSaveAccNo)
                    .addComponent(txtSaveAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaveAccBal)
                    .addComponent(txtSaveAccBal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaveRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveRoutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSaveSubmit)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCheckBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckBankNameActionPerformed

    private void txtCheckAccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckAccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckAccNoActionPerformed

    private void txtCheckRoutNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckRoutNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckRoutNoActionPerformed

    private void txtCheckAccBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckAccBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckAccBalActionPerformed

    private void txtSaveBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveBankNameActionPerformed

    private void txtSaveAccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveAccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveAccNoActionPerformed

    private void txtSaveRoutNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveRoutNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveRoutNoActionPerformed

    private void txtSaveAccBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveAccBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveAccBalActionPerformed

    private void btnCheckSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckSubmitActionPerformed
        // TODO add your handling code here:
        Account checkAccount = new Account();
        checkAccount.setStBankName(txtCheckBankName.getText());
        checkAccount.setStAccNo(txtCheckAccNo.getText());
        checkAccount.setDbAccBal(Double.parseDouble(txtCheckAccBal.getText()));
        checkAccount.setStRoutNo(txtCheckRoutNo.getText());      
        
        person.setCheckAccount(checkAccount);
        JOptionPane.showMessageDialog(this, "Checking Account Details Saved");
    }//GEN-LAST:event_btnCheckSubmitActionPerformed

    private void btnSaveSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSubmitActionPerformed
        // TODO add your handling code here:
        Account saveAccount = new Account();
        saveAccount.setStBankName(txtSaveBankName.getText());
        saveAccount.setStAccNo(txtSaveAccNo.getText());
        saveAccount.setDbAccBal(Double.parseDouble(txtSaveAccBal.getText()));
        saveAccount.setStRoutNo(txtSaveRoutNo.getText());
        
        person.setSaveAccount(saveAccount);
        JOptionPane.showMessageDialog(this, "Savings Account Details Saved");
    }//GEN-LAST:event_btnSaveSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckSubmit;
    private javax.swing.JButton btnSaveSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAccTitle1;
    private javax.swing.JLabel lblAccTitle2;
    private javax.swing.JLabel lblCheckAccBal;
    private javax.swing.JLabel lblCheckAccNo;
    private javax.swing.JLabel lblCheckBankName;
    private javax.swing.JLabel lblCheckRouteNo;
    private javax.swing.JLabel lblDollar;
    private javax.swing.JLabel lblDollar1;
    private javax.swing.JLabel lblSaveAccBal;
    private javax.swing.JLabel lblSaveAccNo;
    private javax.swing.JLabel lblSaveBankName;
    private javax.swing.JLabel lblSaveRoutNo;
    private javax.swing.JTextField txtCheckAccBal;
    private javax.swing.JTextField txtCheckAccNo;
    private javax.swing.JTextField txtCheckBankName;
    private javax.swing.JTextField txtCheckRoutNo;
    private javax.swing.JTextField txtSaveAccBal;
    private javax.swing.JTextField txtSaveAccNo;
    private javax.swing.JTextField txtSaveBankName;
    private javax.swing.JTextField txtSaveRoutNo;
    // End of variables declaration//GEN-END:variables
}