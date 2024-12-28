package dashboard.components;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    public FooterPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        JLabel footerText = new JLabel("©2024 CB-Link Ltd. All Rights Reserved.", SwingConstants.CENTER);
        footerText.setForeground(Color.WHITE);
        footerText.setFont(new Font("Arial", Font.PLAIN, 12));

        add(footerText, BorderLayout.CENTER);
    }
}
