package Swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
    private int round = 0;
    private Color color1 = Color.WHITE;
    private Color color2 = Color.WHITE;
    private int y_endGradient = 0;
    private int x_endGradient = 0;
    private boolean vertical = true;
    private boolean lineBorder = false;

    public RoundedPanel() {
        setOpaque(false);
    }

    public RoundedPanel(int round) {
        this.round = round;
        repaint();
        setOpaque(false);
    }

    public RoundedPanel(int round, Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public int getY_endGradient() {
        return y_endGradient;
    }

    public void setY_endGradient(int y_endGradient) {
        this.y_endGradient = y_endGradient;
    }

    public int getX_endGradient() {
        return x_endGradient;
    }

    public void setX_endGradient(int x_endGradient) {
        this.x_endGradient = x_endGradient;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public boolean isLineBorder() {
        return lineBorder;
    }

    public void setLineBorder(boolean lineBorder) {
        this.lineBorder = lineBorder;
    }

    
    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp;
        if (vertical) {
            gp = new GradientPaint(0, 0, color1, 0, y_endGradient, color2);
        } else {
            gp = new GradientPaint(0, 0, color1, x_endGradient, 0, color2);
        }
        g2.setPaint(gp);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, round, round));
        if (lineBorder) {
            g2.setColor(getBackground());
            g2.draw(new RoundRectangle2D.Double(1, 1, width - 2, height - 2, round, round));
        }
        g2.dispose();
        super.paintComponent(grphcs);
    }
}
