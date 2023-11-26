package MenuBar;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JPanel {
    private Color normalColor = new Color(153, 153, 153);
    private Color chooseColor = new Color(238, 116, 0);
    private int buttonNumber = 0;
    private final int HOME = 1;
    private final int ORDER = 2;
    private final int STORE = 3;
    private final int COUPON = 4;
    private final int SETTING = 5;
    
    public Menu() {
        initComponents();
        homeButton.setBackground(Color.WHITE);
        orderButton.setBackground(Color.WHITE);
        storeButton.setBackground(Color.WHITE);
        couponButton.setBackground(Color.WHITE);
        settingButton.setBackground(Color.WHITE);
        
        homeButton.setForeground(chooseColor);
        homeButton.setIcon(new ImageIcon(getClass().getResource("/data/img/home-or.png")));
        buttonNumber = HOME;
    }
    
    private void normalizeButton() {
        switch (buttonNumber) {
            case HOME:
            {
                homeButton.setForeground(normalColor);
                homeButton.setIcon(new ImageIcon(getClass().getResource("/data/img/home.png")));
            }
                break;
            case ORDER:
            {
                orderButton.setForeground(normalColor);
                orderButton.setIcon(new ImageIcon(getClass().getResource("/data/img/coffee.png")));
            }
                break;
            case STORE:
            {
                storeButton.setForeground(normalColor);
                storeButton.setIcon(new ImageIcon(getClass().getResource("/data/img/shop.png")));
            }
                break;
            case COUPON:
            {
                couponButton.setForeground(normalColor);
                couponButton.setIcon(new ImageIcon(getClass().getResource("/data/img/ticket.png")));
            }
                break;
            case SETTING:
            {
                settingButton.setForeground(normalColor);
                settingButton.setIcon(new ImageIcon(getClass().getResource("/data/img/menu-burger.png")));
            }
                break;
            default:
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new Swing.Button();
        orderButton = new Swing.Button();
        storeButton = new Swing.Button();
        couponButton = new Swing.Button();
        settingButton = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        homeButton.setForeground(new java.awt.Color(153, 153, 153));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/home.png"))); // NOI18N
        homeButton.setText("Trang chủ");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        orderButton.setForeground(new java.awt.Color(153, 153, 153));
        orderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/coffee.png"))); // NOI18N
        orderButton.setText("Đặt hàng");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        storeButton.setForeground(new java.awt.Color(153, 153, 153));
        storeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/shop.png"))); // NOI18N
        storeButton.setText("Cửa hàng");
        storeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeButtonActionPerformed(evt);
            }
        });

        couponButton.setForeground(new java.awt.Color(153, 153, 153));
        couponButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/ticket.png"))); // NOI18N
        couponButton.setText("Ưu đãi");
        couponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponButtonActionPerformed(evt);
            }
        });

        settingButton.setForeground(new java.awt.Color(153, 153, 153));
        settingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/menu-burger.png"))); // NOI18N
        settingButton.setText("Mục khác");
        settingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(storeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(couponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        normalizeButton();
        orderButton.setForeground(chooseColor);
        orderButton.setIcon(new ImageIcon(getClass().getResource("/data/img/coffee-or.png")));
        buttonNumber = ORDER;
    }//GEN-LAST:event_orderButtonActionPerformed

    private void couponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponButtonActionPerformed
        normalizeButton();
        couponButton.setForeground(chooseColor);
        couponButton.setIcon(new ImageIcon(getClass().getResource("/data/img/ticket-or.png")));
        buttonNumber = COUPON;
    }//GEN-LAST:event_couponButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        normalizeButton();
        homeButton.setForeground(chooseColor);
        homeButton.setIcon(new ImageIcon(getClass().getResource("/data/img/home-or.png")));
        buttonNumber = HOME;
    }//GEN-LAST:event_homeButtonActionPerformed

    private void storeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtonActionPerformed
        normalizeButton();
        storeButton.setForeground(chooseColor);
        storeButton.setIcon(new ImageIcon(getClass().getResource("/data/img/shop-or.png")));
        buttonNumber = STORE;
    }//GEN-LAST:event_storeButtonActionPerformed

    private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingButtonActionPerformed
        normalizeButton();
        settingButton.setForeground(chooseColor);
        settingButton.setIcon(new ImageIcon(getClass().getResource("/data/img/menu-burger-or.png")));
        buttonNumber = SETTING;
    }//GEN-LAST:event_settingButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button couponButton;
    private Swing.Button homeButton;
    private Swing.Button orderButton;
    private Swing.Button settingButton;
    private Swing.Button storeButton;
    // End of variables declaration//GEN-END:variables
}
