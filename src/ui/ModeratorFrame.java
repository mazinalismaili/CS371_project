/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import db.DBManager;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lesd4f
 */
public class ModeratorFrame extends javax.swing.JFrame {

    /**
     * Creates new form Mod
     */
    DBManager DB;
    
    String User_ID;
    
    //columns for unclaimedAdv_table
    String[] columnsUnclaimedAdv=new String[] {
         "ID", "Title", "Description", "Price", "Date", "Username"
    };
    
    //columns for myAdv_table
    String[] columnsMyAdv=new String[] {
         "ID", "Title", "Description", "Price", "Status", "Date", "Username"
    };
    
    
    
    public ModeratorFrame(DBManager DB, String username) {
        
        //set up general attributes
        this.setTitle("Username: " + username);
        this.DB=DB;
        this.User_ID = username;
        
        initComponents();
        
        //set combo box items
        //categoryDrop.setModel(new javax.swing.DefaultComboBoxModel (new String[] {"All", "CAT", "HOU", "ELC", "CCA"}));
        //periodDrop.setModel(new javax.swing.DefaultComboBoxModel (new String[] {"Last 3 Months", "Last 6 Months", "Last 12 Months", "Life"}));
    
        //populate tables
        this.populate_unclaimedAdv_table();
        this.populate_myAdv_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyAdvTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        categoryDrop = new javax.swing.JComboBox<>();
        periodDrop = new javax.swing.JComboBox<>();
        titleDescText = new javax.swing.JTextField();
        goFilterButton = new javax.swing.JButton();
        claimAdButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        unclaimedAdv_table = new javax.swing.JTable();
        CatLabel = new javax.swing.JLabel();
        PeriodLabel = new javax.swing.JLabel();
        DescLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myAdv_table = new javax.swing.JTable();
        approveButton = new javax.swing.JButton();
        Disapprove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        categoryDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CAT", "HOU", "ELC", "CCA" }));
        categoryDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDropActionPerformed(evt);
            }
        });

        periodDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Last 3 months", "Last 6 months", "Last 12 months", "Life" }));

        goFilterButton.setText("GO");
        goFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goFilterButtonActionPerformed(evt);
            }
        });

        claimAdButton.setText("Claim Ad");
        claimAdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claimAdButtonActionPerformed(evt);
            }
        });

        unclaimedAdv_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Description", "Price", "Date", "Username"
            }
        ));
        jScrollPane2.setViewportView(unclaimedAdv_table);

        CatLabel.setText("Category");

        PeriodLabel.setText("Period");

        DescLabel.setText("Title, Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatLabel))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(periodDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PeriodLabel))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleDescText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(goFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescLabel)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(claimAdButton)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatLabel)
                    .addComponent(PeriodLabel)
                    .addComponent(DescLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleDescText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goFilterButton))
                .addGap(17, 17, 17)
                .addComponent(claimAdButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MyAdvTab.addTab("Unclaimed Advertisements", jPanel1);

        myAdv_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Description", "Price", "Status", "Date", "Username"
            }
        ));
        jScrollPane1.setViewportView(myAdv_table);

        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        Disapprove.setText("Disapprove");
        Disapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisapproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Disapprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Disapprove)
                    .addComponent(approveButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MyAdvTab.addTab("My Advertisements", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(MyAdvTab, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyAdvTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryDropActionPerformed

    private void claimAdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claimAdButtonActionPerformed
        // TODO add your handling code here:
        int row = this.unclaimedAdv_table.getSelectedRow();
         
         if (row >= 0) {
             String Advertisement_ID=(String)unclaimedAdv_table.getValueAt(row, 0);
             //FIXME: make sure user_id is the moderator
             DB.claimAdvertisement(Advertisement_ID, User_ID);
            this.populate_unclaimedAdv_table();
            this.populate_myAdv_table();
         }
         
         //populate tables
        this.populate_unclaimedAdv_table();
        this.populate_myAdv_table();
    }//GEN-LAST:event_claimAdButtonActionPerformed

    private void goFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goFilterButtonActionPerformed
        // TODO add your handling code here:
        String category = categoryDrop.getItemAt(categoryDrop.getSelectedIndex()) ;
        String details = titleDescText.getText().toString();
        String period = periodDrop.getItemAt(periodDrop.getSelectedIndex());
        if(period == "Last 3 months"){
        period = "3";
        } else if(period == "Last 6 months"){
        period = "6";
        } else if(period == "Last 12 months"){
        period = "12";
        } else{
        period = "Life";
        }
       
        
        Object[][] ads = DB.getFilteredModAdv(category,period,details);
        this.unclaimedAdv_table.setModel(new DefaultTableModel(ads,columnsUnclaimedAdv));
    }//GEN-LAST:event_goFilterButtonActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        int row = this.myAdv_table.getSelectedRow();
         
         if (row >= 0) {
             String Advertisement_ID=(String)myAdv_table.getValueAt(row, 0);
             DB.approveAdvertisement(Advertisement_ID,"AC");
             this.populate_myAdv_table();
         }
         
         //populate tables
        this.populate_myAdv_table();
    }//GEN-LAST:event_approveButtonActionPerformed

    private void DisapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisapproveActionPerformed
        // TODO add your handling code here:
        int row = this.myAdv_table.getSelectedRow();
         
         if (row >= 0) {
             String Advertisement_ID=(String)myAdv_table.getValueAt(row, 0);
             DB.approveAdvertisement(Advertisement_ID,"DI");
             this.populate_myAdv_table();
         }
         
         //populate tables
        this.populate_myAdv_table();
    }//GEN-LAST:event_DisapproveActionPerformed

    
    /*~~~~~~~~~~ Populate Functions ~~~~~~~~~~*/
    public void populate_unclaimedAdv_table() {
        Object[][] ads = DB.getModUnclaimedAdv(User_ID);
        this.unclaimedAdv_table.setModel(new DefaultTableModel(ads, columnsUnclaimedAdv));
    }
    
    public void populate_myAdv_table(){
        Object[][] ads = DB.getModMyAdv(User_ID);
        this.myAdv_table.setModel(new DefaultTableModel(ads, columnsMyAdv));
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
            java.util.logging.Logger.getLogger(ModeratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ModeratorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatLabel;
    private javax.swing.JLabel DescLabel;
    private javax.swing.JButton Disapprove;
    private javax.swing.JTabbedPane MyAdvTab;
    private javax.swing.JLabel PeriodLabel;
    private javax.swing.JButton approveButton;
    private javax.swing.JComboBox<String> categoryDrop;
    private javax.swing.JToggleButton claimAdButton;
    private javax.swing.JButton goFilterButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable myAdv_table;
    private javax.swing.JComboBox<String> periodDrop;
    private javax.swing.JTextField titleDescText;
    private javax.swing.JTable unclaimedAdv_table;
    // End of variables declaration//GEN-END:variables
}
