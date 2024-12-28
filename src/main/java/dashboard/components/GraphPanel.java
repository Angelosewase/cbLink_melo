package dashboard.components;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {
    public GraphPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Credits & Debits Graph"));

        // Placeholder graph panel
        JLabel placeholder = new JLabel("Graph will be displayed here", SwingConstants.CENTER);
        placeholder.setFont(new Font("Arial", Font.ITALIC, 16));

        add(placeholder, BorderLayout.CENTER);
    }
}