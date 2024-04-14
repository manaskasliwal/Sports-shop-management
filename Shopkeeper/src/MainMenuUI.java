/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainMenuUI.java
 *
 *
 */

/**
 *
 *
 */
public class MainMenuUI extends javax.swing.JFrame {

    
    public MainMenuUI() {
        initComponents();
    }

    /** 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCustAdd = new javax.swing.JMenuItem();
        mnuItemAdd = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListCust = new javax.swing.JMenuItem();
        ListItem = new javax.swing.JMenuItem();
        ListOrder = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN MENU");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ty.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 550);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 2, 48));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SPORTS SHOP\n");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 10, 340, 80);

        jMenu1.setText("Sports Club");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuCustAdd.setText("Customer Entry");
        mnuCustAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCustAdd);

        mnuItemAdd.setText("Item Entry");
        mnuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAddActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemAdd);

        mnuOrder.setText("Order Entry");
        mnuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrderActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOrder);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        ListCust.setText("Customer List");
        ListCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCustActionPerformed(evt);
            }
        });
        jMenu2.add(ListCust);

        ListItem.setText("Item List");
        ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListItemActionPerformed(evt);
            }
        });
        jMenu2.add(ListItem);

        ListOrder.setMnemonic('o');
        ListOrder.setText("Order List");
        ListOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOrderActionPerformed(evt);
            }
        });
        jMenu2.add(ListOrder);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("quit");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCustAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustAddActionPerformed
        this.setVisible(false);
        new ShopINUI().setVisible(true);
}//GEN-LAST:event_mnuCustAddActionPerformed

    private void mnuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAddActionPerformed
        this.setVisible(false);
        new ItemINUI().setVisible(true);
}//GEN-LAST:event_mnuItemAddActionPerformed

    private void mnuOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrderActionPerformed
        this.setVisible(false);
        new OrderINUI().setVisible(true);
}//GEN-LAST:event_mnuOrderActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
}//GEN-LAST:event_jMenu2ActionPerformed

    private void ListCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListCustActionPerformed
        this.setVisible(false);
        new CustListUI().setVisible(true);
    }//GEN-LAST:event_ListCustActionPerformed

    private void ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListItemActionPerformed
        this.setVisible(false);
        new ItemListUI().setVisible(true);

    }//GEN-LAST:event_ListItemActionPerformed

    private void ListOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOrderActionPerformed
        this.setVisible(false);
        new OrdListUI().setVisible(true);

    }//GEN-LAST:event_ListOrderActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
      // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    *
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListCust;
    private javax.swing.JMenuItem ListItem;
    private javax.swing.JMenuItem ListOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuCustAdd;
    private javax.swing.JMenuItem mnuItemAdd;
    private javax.swing.JMenuItem mnuOrder;
    // End of variables declaration//GEN-END:variables

}
