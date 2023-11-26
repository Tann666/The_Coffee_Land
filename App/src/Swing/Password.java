package Swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Password extends JPasswordField {

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    private String hint = "";

    public Password() {
        super.setBackground(new Color(255, 255, 255, 0)); //  Remove background
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 10)); //  Set Right border 50
        setHorizontalAlignment(JTextField.CENTER);
    }

    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth() - 2;
        int height = getHeight() - 2;
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height, height, height);
        g2.setColor(getForeground());
        g2.draw(new RoundRectangle2D.Double(0, 0, width, height, height, height));
        g2.dispose();
        super.paintComponent(grphcs);
    }
    private String text;
    
    public void paint(Graphics g) {
        super.paint(g);
        if (0 == getText().length()) {
            int h = getHeight() - 2;
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hint, ((getWidth() - fm.stringWidth(hint)) / 2), getHeight() / 2 + fm.getAscent() / 2 - 2);
        }
    }
}

