package dashboard.layouts;


import dashboard.components.*;

import javax.swing.*;
import java.awt.*;

public class MainLayout extends JPanel {
    public MainLayout() {
        setLayout(new BorderLayout());

        // Add header
        add(new HeaderPanel(), BorderLayout.NORTH);

        // Add center panel (statistics and graph)
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Intro Panel (1/4 height)
        JPanel introPanel = new Intro();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.15; // 1/4 of the height
        gbc.fill = GridBagConstraints.BOTH; // Expand both horizontally and vertically
        centerPanel.add(introPanel, gbc);

        // Statistics Panel (1/4 height)
        JPanel statsPanel = new StatisticsPanel();
        gbc.gridy = 1;
        gbc.weighty = 0.15; // 1/4 of the height
        centerPanel.add(statsPanel, gbc);

        // Graph Panel (1/2 height)
        JPanel graphPanel = new GraphPanel();
        gbc.gridy = 2;
        gbc.weighty = 0.7; // 1/2 of the height
        centerPanel.add(graphPanel, gbc);

        add(centerPanel, BorderLayout.CENTER);

        // Add footer
        add(new FooterPanel(), BorderLayout.SOUTH);
    }
}
