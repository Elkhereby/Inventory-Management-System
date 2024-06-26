/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.EmployeeRole;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 *
 * @author a7med
 */
public class EmployeeRoleWindow extends javax.swing.JFrame implements Node{

    /**
     * Creates new form EmployeeRole
     */
    private final EmployeeRole employee;
    private  Node parent;
    public EmployeeRoleWindow(EmployeeRole employee) throws IOException {
        initComponents();
        this.employee = employee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddProductButton = new javax.swing.JButton();
        ViewProductsButton = new javax.swing.JButton();
        PurchaseProductsButton = new javax.swing.JButton();
        ViewPurchasedProductsButton = new javax.swing.JButton();
        ReturnProductsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        AddProductButton.setBackground(new java.awt.Color(0, 0, 0));
        AddProductButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        AddProductButton.setForeground(new java.awt.Color(255, 255, 255));
        AddProductButton.setText("Add Product");
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });

        ViewProductsButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ViewProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewProductsButton.setText("View Products");
        ViewProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsButtonActionPerformed(evt);
            }
        });

        PurchaseProductsButton.setBackground(new java.awt.Color(0, 0, 0));
        PurchaseProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        PurchaseProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        PurchaseProductsButton.setText("Purchase Products");
        PurchaseProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseProductsButtonActionPerformed(evt);
            }
        });

        ViewPurchasedProductsButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewPurchasedProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ViewPurchasedProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewPurchasedProductsButton.setText("View Purchased Products");
        ViewPurchasedProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPurchasedProductsButtonActionPerformed(evt);
            }
        });

        ReturnProductsButton.setBackground(new java.awt.Color(0, 0, 0));
        ReturnProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ReturnProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        ReturnProductsButton.setText("Return Products");
        ReturnProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnProductsButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ViewPurchasedProductsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ReturnProductsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AddProductButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PurchaseProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ViewProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PurchaseProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewPurchasedProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReturnProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
        Addproduct addProduct = new Addproduct(employee);
        addProduct.setParentNode((Node) this);
        addProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddProductButtonActionPerformed

    private void ViewProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsButtonActionPerformed
        ViewProducts viewProducts = new ViewProducts(employee);
        viewProducts.setParentNode(this);
        viewProducts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewProductsButtonActionPerformed

    private void PurchaseProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseProductsButtonActionPerformed
        PurchaseProduct purchaseProduct = new PurchaseProduct(employee);
        purchaseProduct.setParentNode(this);
        purchaseProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PurchaseProductsButtonActionPerformed

    private void ViewPurchasedProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPurchasedProductsButtonActionPerformed
        ViewPurchasedProducts viewPurchasedProducts = new ViewPurchasedProducts(employee);
        viewPurchasedProducts.setParentNode(this);
        viewPurchasedProducts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewPurchasedProductsButtonActionPerformed

    private void ReturnProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnProductsButtonActionPerformed
        ReturnProduct returnProduct = new ReturnProduct(employee);
        returnProduct.setParentNode(this);
        returnProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReturnProductsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        employee.logout();
        TheInventorySystemWindows theInventorySystemWindows = new TheInventorySystemWindows();
        theInventorySystemWindows.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PurchaseProductsButton;
    private javax.swing.JButton ReturnProductsButton;
    private javax.swing.JButton ViewProductsButton;
    private javax.swing.JButton ViewPurchasedProductsButton;
    // End of variables declaration//GEN-END:variables
}
