package HomePage;

import Swing.RoundedPanel;

public class fourImagePanel extends RoundedPanel {

    public fourImagePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new Swing.ImagePanel();
        imagePanel2 = new Swing.ImagePanel();
        imagePanel3 = new Swing.ImagePanel();
        imagePanel4 = new Swing.ImagePanel();
        imagePanel5 = new Swing.ImagePanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLineBorder(true);
        setRound(20);

        imagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/delivery-man.png"))); // NOI18N
        imagePanel1.setText("Giao hàng");

        imagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/order.png"))); // NOI18N
        imagePanel2.setText("Đơn hàng");

        imagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/take away.png"))); // NOI18N
        imagePanel3.setText("Mang đi");

        imagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/coffee-beans.png"))); // NOI18N
        imagePanel4.setText("Đổi Bean");

        imagePanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/feedback.png"))); // NOI18N
        imagePanel5.setText("Góp ý");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(imagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(imagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(imagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ImagePanel imagePanel1;
    private Swing.ImagePanel imagePanel2;
    private Swing.ImagePanel imagePanel3;
    private Swing.ImagePanel imagePanel4;
    private Swing.ImagePanel imagePanel5;
    // End of variables declaration//GEN-END:variables
}
