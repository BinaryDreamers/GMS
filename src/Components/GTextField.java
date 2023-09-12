package Components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GTextField extends JTextField {
    final private Color backgroundColor = new Color(0x262626);
    final private Color textColor = new Color(0xA6A3A1);
    final private Icon searchIcon = new ImageIcon("assets/images/carSearch.png");
    public GTextField(){
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(10,158,10,10));
        this.setSelectionColor(new Color(0xA62631));
        this.setForeground(textColor);
        this.setFont(new Font("Segoe UI", Font.PLAIN, 32));
    }
    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        graphics2D.setColor(backgroundColor);
        graphics2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), this.getHeight(),this.getHeight());

        graphics2D.drawImage(((ImageIcon) searchIcon).getImage(), 31, 10,74, 40, null);

        if (this.getText().equals("")){
            graphics2D.setColor(textColor);
            graphics2D.drawString("Search Plate Number", getInsets().left, graphics.getFontMetrics()
                    .getMaxAscent() + getInsets().top);
        }
        super.paintComponent(graphics);
    }
}
