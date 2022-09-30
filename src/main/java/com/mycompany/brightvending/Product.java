/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brightvending;

/**
 *
 * @author User
 */
import java.awt.Color;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Product {
    private int productId;
    private String productName;
    private String productPicture;
    private double Price;
    private int Stock;
    private boolean Status;
    
    public javax.swing.JButton PictureBtn;
    private javax.swing.JPanel cardBg;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayPrice;
    private javax.swing.JPanel statusIndicator;
    
    private static final DecimalFormat dformat = new DecimalFormat("0.00");
    
//    setter
    public void setProductID(int id) {
        this.productId = id;
    }
    public void setProductName(String name) {
        this.productName = name;
    }
    public void setProductPicture(String path) {
        this.productPicture = path;
    }
    public void setProductPrice(double price) {
        String temp = dformat.format(price);
        double p_price =  Double.parseDouble(temp);
        this.Price = p_price;
    }
    public void setStock(int stock) {
        this.Stock = stock;
    }
    public void setStatus(boolean status) {
        this.Status = status;
    }
    
//    getter
    public int getProductID() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductPicture() {
        return productPicture;
    }
    public double getProductPrice(){
        return Price;
    }
    public int getStock() {
        return Stock;
    }
    public boolean getStatus() {
        return Status;
    }
    
    public JPanel productCardUI() {
        JPanel parentPanel = new javax.swing.JPanel();
        cardBg = new javax.swing.JPanel();
        statusIndicator = new javax.swing.JPanel();
        PictureBtn = new javax.swing.JButton();
        displayName = new javax.swing.JLabel();
        displayPrice = new javax.swing.JLabel();
        JLabel hiddenID = new javax.swing.JLabel();
        
        parentPanel.setBackground(new java.awt.Color(204, 255, 255));
        parentPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        statusIndicator.setName(""); // NOI18N
        if (Status == false) {
            statusIndicator.setBackground(new java.awt.Color(255,0,0));
            cardBg.setBackground(new java.awt.Color(128,128,128));
        }
        else if(Status == true) {
            statusIndicator.setBackground(new java.awt.Color(255,255,0));
        }
        hiddenID.setText(""+productId);
        hiddenID.setVisible(false);

        javax.swing.GroupLayout statusIndicatorLayout = new javax.swing.GroupLayout(statusIndicator);
        statusIndicator.setLayout(statusIndicatorLayout);
        statusIndicator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        statusIndicatorLayout.setHorizontalGroup(
            statusIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        statusIndicatorLayout.setVerticalGroup(
            statusIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        
        ImageIcon image = new javax.swing.ImageIcon(productPicture);
        Image img = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        PictureBtn.setIcon(new ImageIcon(img));
         PictureBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
         
        displayName.setForeground(new java.awt.Color(102, 102, 102));
        displayName.setText(productName);

        displayPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayPrice.setForeground(new java.awt.Color(0, 0, 0));
        String temp = dformat.format(Price);
        displayPrice.setText("RM" + temp);

        javax.swing.GroupLayout cardBgLayout = new javax.swing.GroupLayout(cardBg);
        cardBg.setLayout(cardBgLayout);
        cardBgLayout.setHorizontalGroup(
            cardBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBgLayout.createSequentialGroup()
                .addGroup(cardBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardBgLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(statusIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardBgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(cardBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayName, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(PictureBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        cardBgLayout.setVerticalGroup(
            cardBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBgLayout.createSequentialGroup()
                .addComponent(statusIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PictureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(parentPanel);
        parentPanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        cardBg.setBackground(Color.white);
        parentPanel.setSize(200,200);
        return parentPanel;
    }
}
