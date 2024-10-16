package com.jb.ui;

import com.jb.controller.UIController;
import com.jb.entity.Product;
import com.jb.service.ManagerDBService;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ashwa
 */
public class ManagerForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagerForm
     */
    public ManagerForm() {
        initComponents();

        // Add an onload event handler
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Code to be executed when the JFrame is loaded


                System.out.println("JFrame is loaded");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mgrSuccess = new javax.swing.JDialog();
        mgrSuccessLabel = new javax.swing.JLabel();
        mgrSuccessOkButton = new javax.swing.JButton();
        managerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mgrTable = new javax.swing.JTable();
        mgrOkButton = new javax.swing.JButton();
        mgrBackButton = new javax.swing.JButton();

        mgrSuccess.setSize(new java.awt.Dimension(300, 200));

        mgrSuccessLabel.setText("Inventory updated successfully.");

        mgrSuccessOkButton.setText("Ok");
        mgrSuccessOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrSuccessOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mgrSuccessLayout = new javax.swing.GroupLayout(mgrSuccess.getContentPane());
        mgrSuccess.getContentPane().setLayout(mgrSuccessLayout);
        mgrSuccessLayout.setHorizontalGroup(
                mgrSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mgrSuccessLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(mgrSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mgrSuccessOkButton)
                                        .addComponent(mgrSuccessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                .addGap(137, 137, 137))
        );
        mgrSuccessLayout.setVerticalGroup(
                mgrSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mgrSuccessLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(mgrSuccessLabel)
                                .addGap(18, 18, 18)
                                .addComponent(mgrSuccessOkButton)
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 300));

        managerLabel.setText("Manager Table");

        mgrTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "SKU", "Prod. Desc.", "Qty. in WH", "Qty. on Shelf", "Cost per Unit", "Total Qty.", "Price per Unit", "Profit per Unit"
                }
        ));
        jScrollPane1.setViewportView(mgrTable);

        mgrOkButton.setText("Ok");
        mgrOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrOkButtonActionPerformed(evt);
            }
        });

        mgrBackButton.setText("Back");
        mgrBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(managerLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 226, Short.MAX_VALUE)
                                                .addComponent(mgrOkButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(mgrBackButton)))
                                .addContainerGap())
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(managerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mgrOkButton)
                                        .addComponent(mgrBackButton))
                                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>
    private ArrayList<Product> tableToProductList() {
        javax.swing.table.TableModel model = mgrTable.getModel();
        ArrayList<Product> products = new ArrayList<>();
        for (int rowNum = 0; rowNum < model.getRowCount(); rowNum++) {
            products.add(new Product(
                    Integer.parseInt(model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("SKU")).toString()),
                    model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("Prod. Desc.")).toString(),
                    Integer.parseInt(model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("Qty. in WH")).toString()),
                    Integer.parseInt(model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("Qty. on Shelf")).toString()),
                    Double.parseDouble(model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("Cost per Unit")).toString()),
                    Double.parseDouble(model.getValueAt(rowNum, mgrTable.getColumnModel().getColumnIndex("Price per Unit")).toString())
            ));
        }
        return products;
    }

    private void mgrOkButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        managerDBService.tableToDB(tableToProductList());
        mgrSuccess.setVisible(true);
    }

    private void mgrBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
        UIController.uiController.showRoleSelector();
    }

    private void mgrSuccessOkButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        mgrSuccess.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JButton mgrBackButton;
    private javax.swing.JButton mgrOkButton;
    private javax.swing.JDialog mgrSuccess;
    private javax.swing.JLabel mgrSuccessLabel;
    private javax.swing.JButton mgrSuccessOkButton;
    private javax.swing.JTable mgrTable;
    public static ManagerDBService managerDBService = new ManagerDBService();

    // End of variables declaration
}