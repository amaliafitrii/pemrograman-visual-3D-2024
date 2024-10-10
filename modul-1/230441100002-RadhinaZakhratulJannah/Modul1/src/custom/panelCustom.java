package custom;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class panelCustom extends JPanel {

    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
    }

    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
    }

    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
    }

    public panelCustom() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);  // Tambahkan ini untuk melukis komponen dasar

        Graphics2D g2 = (Graphics2D) graphic.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());

        // Membuat area dengan sudut bulat
        Area area = new Area(createRoundTopLeft());

        if (roundTopRight > 0) {
            area.add(new Area(createRoundTopRight()));
        }
        if (roundBottomLeft > 0) {
            area.add(new Area(createRoundBottomLeft()));
        }
        if (roundBottomRight > 0) {
            area.add(new Area(createRoundBottomRight()));
        }

        g2.fill(area);
        g2.dispose();
    }

    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);

        // Menggunakan RoundRectangle2D.Double untuk sudut melengkung
        return new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY);
    }

    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);

        return new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY);
    }

    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);

        return new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY);
    }

    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);

        return new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY);
    }
}
