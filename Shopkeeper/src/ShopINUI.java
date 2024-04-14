import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShopINUI.java
 *
 *
 */

/**
 *
 * 
 */
public class ShopINUI extends javax.swing.JFrame {

  
    public ShopINUI() {
        initComponents();
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSHPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSHName = new javax.swing.JTextField();
        txtSHAddress = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSHCity = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSHno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shopkeepers data entry screen");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtSHPhone.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel6.setText("Customer Data Input Form");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Shopper's ID.:");

        txtSHName.setFont(new java.awt.Font("Tahoma", 1, 12));

        txtSHAddress.setFont(new java.awt.Font("Tahoma", 1, 12));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBack.setText("Back to Main");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14));
        jLabel7.setText("Shopper Details...");

        txtSHCity.setFont(new java.awt.Font("Tahoma", 1, 12));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("City:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Name:");

        txtSHno.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Phone No.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSHno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSHName, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSHAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtSHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSHPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnSave)
                        .addGap(50, 50, 50)
                        .addComponent(btnBack)
                        .addGap(45, 45, 45)
                        .addComponent(btnClear)))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSHno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSHName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSHAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSHPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack)
                    .addComponent(btnClear))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MainMenuUI().setVisible(true);
}//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/shopkeeper","root","123");
            Statement stmt = null;
            ResultSet rs = null;        
            String SQL = "SELECT * FROM shopkeeper";
            stmt = con.createStatement();  
            rs = stmt.executeQuery(SQL);

            String shno = txtSHno.getText().trim();
            String shname = txtSHName.getText();
            String shadd = txtSHAddress.getText();
            String shcity = txtSHCity.getText();
            double shphone = Double.parseDouble(txtSHPhone.getText());
            if (shno.length() <= 4) {
                String strSQL = "INSERT INTO shopkeeper(Shopper_id, Name, Address, City, Phone) VALUES ('"+(shno)+"','"+(shname)+"','"+(shadd)+"','"+(shcity)+"',"+(shphone)+")";
                JOptionPane.showMessageDialog(this, "Record successfully inserted");
                int rowsEffected = stmt.executeUpdate(strSQL);
                System.out.println(rowsEffected + " rows effected");
            }
            else {
                JOptionPane.showMessageDialog(this, "Customer ID should not more than 4 character.");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
}//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtSHno.setText("");
        txtSHName.setText("");
        txtSHAddress.setText("");
        txtSHCity.setText("");
        txtSHPhone.setText("");
}//GEN-LAST:event_btnClearActionPerformed

    /**
    *
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopINUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtSHAddress;
    private javax.swing.JTextField txtSHCity;
    private javax.swing.JTextField txtSHName;
    private javax.swing.JTextField txtSHPhone;
    private javax.swing.JTextField txtSHno;
    // End of variables declaration//GEN-END:variables

}
