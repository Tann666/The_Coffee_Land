package Barcode;

import Swing.RoundedPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BarcodePanel extends CustomPanel {

    public BarcodePanel(String codeText) {
        initComponents();
        code.setIcon(new ImageIcon(Barcode_image.createImage(codeText)));
        this.codeText.setText(codeText);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel = new Swing.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        roundedPanel2 = new Swing.RoundedPanel();
        code = new javax.swing.JLabel();
        codeText = new javax.swing.JLabel();

        setColor1(new java.awt.Color(131, 94, 41));
        setColor2(new java.awt.Color(74, 55, 20));
        setRound(30);
        setY_endGradient(140);

        roundedPanel.setColor1(new java.awt.Color(252, 181, 75));
        roundedPanel.setColor2(new java.awt.Color(51, 51, 51));
        roundedPanel.setRound(25);
        roundedPanel.setVertical(false);
        roundedPanel.setX_endGradient(150);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("100 BEANS");

        javax.swing.GroupLayout roundedPanelLayout = new javax.swing.GroupLayout(roundedPanel);
        roundedPanel.setLayout(roundedPanelLayout);
        roundedPanelLayout.setHorizontalGroup(
            roundedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        roundedPanelLayout.setVerticalGroup(
            roundedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("User name");

        roundedPanel2.setRound(20);

        code.setBackground(new java.awt.Color(255, 255, 255));
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        codeText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codeText.setText("code");

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel code;
    private javax.swing.JLabel codeText;
    private javax.swing.JLabel jLabel2;
    private Swing.RoundedPanel roundedPanel;
    private Swing.RoundedPanel roundedPanel2;
    // End of variables declaration//GEN-END:variables
}
