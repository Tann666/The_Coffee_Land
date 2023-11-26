package Swing;

import javax.swing.Icon;

public class ImagePanel extends javax.swing.JPanel {
    private Icon icon;
    private String Text;
    
    public ImagePanel() {
        initComponents();
        setOpaque(false);
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        img.setIcon(icon);
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
        text.setText(Text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        text = new javax.swing.JLabel();

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        text.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
