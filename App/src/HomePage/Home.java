package HomePage;

import Barcode.BarcodePanel;
import Swing.ScrollBarCustom;
import net.miginfocom.swing.MigLayout;

public class Home extends javax.swing.JPanel {
    private String nameAcc;
    private BarcodePanel barcode;
    private fourImagePanel fourImage;
    
    public Home() {
        initComponents();
        ScrollPane.setVerticalScrollBar(new ScrollBarCustom());
        ScrollPane.setHorizontalScrollBar(null);
        panel.setLayout(new MigLayout("nogrid, fillx"));
        
        barcode = new BarcodePanel("123456789");
        panel.add(barcode, "align center, wrap, gaptop 10");
        
        fourImage = new fourImagePanel();
        panel.add(fourImage, "align center, wrap, gaptop 10");
        
        for (int i = 0; i < 10; i++) {
            fourImagePanel im = new fourImagePanel();
            panel.add(im, "align center, wrap, gaptop 10");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Swing.RoundedPanel();
        header1 = new HomePage.Header();
        ScrollPane = new javax.swing.JScrollPane();
        panel = new Swing.RoundedPanel();

        background.setColor1(new java.awt.Color(255, 253, 239));
        background.setY_endGradient(300);

        ScrollPane.setBorder(null);
        ScrollPane.setForeground(new java.awt.Color(186, 91, 20));
        ScrollPane.setOpaque(false);

        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 253, 239)));
        panel.setColor1(new java.awt.Color(255, 253, 239));
        panel.setY_endGradient(80);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(panel);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private Swing.RoundedPanel background;
    private HomePage.Header header1;
    private Swing.RoundedPanel panel;
    // End of variables declaration//GEN-END:variables
}
