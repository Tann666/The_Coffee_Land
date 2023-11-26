package login;

import Swing.RoundedPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Background extends RoundedPanel {
    private final Icon backgroundImg = new ImageIcon(getClass().getResource("/data/img/background login.png")); 
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        int imgWidth = backgroundImg.getIconWidth();
        int imgHeight = backgroundImg.getIconHeight();
        int x = width / 2 - imgWidth / 2;
        int y = height / 2 - imgHeight / 2;
        g2.drawImage(((ImageIcon) backgroundImg).getImage(), x, y, imgWidth, imgHeight, null);
        g2.dispose();
    }
}
