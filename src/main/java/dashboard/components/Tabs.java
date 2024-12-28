package dashboard.components;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class Tabs extends BasicTabbedPaneUI {

    protected void paintTab(Graphics g, int tabPlacement, Rectangle tabRect, int tabIndex, boolean isSelected) {
        Graphics2D g2d = (Graphics2D) g;

        if (isSelected) {
            g2d.setColor(Color.BLUE);
            g2d.fillRect(tabRect.x, tabRect.y, tabRect.width, tabRect.height);
        } else {
            g2d.setColor(Color.GRAY);
            g2d.fillRect(tabRect.x, tabRect.y, tabRect.width, tabRect.height);
        }

        g2d.setColor(Color.WHITE);
        g2d.drawString(tabPane.getTitleAt(tabIndex), tabRect.x + 10, tabRect.y + 15);
    }

    protected int calculateTabHeight(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return 30; // Custom tab height
    }

    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return 100; // Custom tab width
    }
}
