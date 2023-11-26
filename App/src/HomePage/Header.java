package HomePage;

import java.awt.Color;

public class Header extends javax.swing.JPanel {
    private String nameAcc;
    private final String WELCOME = " ơi, CloudTea nhé!";
    
    public Header() {
        initComponents();
        headerText.setText("Bạn" + WELCOME);
        notification.setBackground(Color.WHITE);
        coupon.setBackground(Color.WHITE);
    }
    
    public void setBadgesOfNoticefication(int badges) {
        notification.setBadges(badges);
    }
    
    public void setBadgesOfCoupon(int badges) {
        coupon.setBadges(badges);
    }
    
    public String getNameAcc() {
        return nameAcc;
    }

    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
        headerText.setText(nameAcc + WELCOME);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar = new Swing.circleComponent();
        headerText = new javax.swing.JLabel();
        notification = new Swing.ButtonBadges();
        coupon = new Swing.ButtonBadges();

        setOpaque(false);

        avatar.setBackground(new java.awt.Color(255, 255, 255));
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/default avt.png"))); // NOI18N

        headerText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headerText.setText("Bạn ơi, CloudTea nhé!");
        headerText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        notification.setForeground(new java.awt.Color(220, 0, 51));
        notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/notification.gif"))); // NOI18N
        notification.setBadges(10);

        coupon.setForeground(new java.awt.Color(220, 0, 51));
        coupon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/coupon24.png"))); // NOI18N
        coupon.setBadges(2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(headerText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(coupon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.circleComponent avatar;
    private Swing.ButtonBadges coupon;
    private javax.swing.JLabel headerText;
    private Swing.ButtonBadges notification;
    // End of variables declaration//GEN-END:variables
}
