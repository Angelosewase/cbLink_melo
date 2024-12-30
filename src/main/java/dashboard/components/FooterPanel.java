package dashboard.components;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    public FooterPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(1,0,102,255));

        JLabel footerText = new JLabel("©2024 CB-Link Ltd. Melo software V2 .All rights reserved", SwingConstants.CENTER);
        footerText.setForeground(Color.WHITE);
        footerText.setFont(new Font("Arial", Font.PLAIN, 14));

        add(footerText, BorderLayout.CENTER);
    }
}
