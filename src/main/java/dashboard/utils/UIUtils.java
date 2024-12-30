package dashboard.utils;

import javax.swing.*;
import java.awt.*;

public class UIUtils {

//    public static JPanel createStatBox(String title, String value) {
//        JPanel panel = new JPanel(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 3)); // Blue border
//        panel.setBackground(Color.WHITE); // White background
//
//        // Title label
//        JLabel titleLabel = new JLabel(title);
//        titleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
//        titleLabel.setForeground(Color.BLACK);
//        titleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        // Value label
//        JLabel valueLabel = new JLabel(value);
//        valueLabel.setForeground(Color.BLACK);
//        valueLabel.setFont(new Font("Arial", Font.BOLD, 16));
//
//        // Add title and value to the main panel with BorderLayout.CENTER
//        JPanel mainPanel = new JPanel(new BorderLayout());
//        mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
//        mainPanel.add(titleLabel, BorderLayout.WEST);
//        mainPanel.add(valueLabel, BorderLayout.EAST);
//
//        // Add title and value panel to the main panel
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.weightx = 1.0;
//        gbc.weighty = 0.7; // 70% of the panel height
//        gbc.fill = GridBagConstraints.BOTH;
//        panel.add(mainPanel, gbc);
//
//        // Details button
//        JButton DetailsButton = new JButton("VIEW DETAILS");
//        DetailsButton.setFont(new Font("Arial", Font.BOLD, 16));
//        DetailsButton.setForeground(Color.white);
//        DetailsButton.setBackground(Color.BLUE);
//        DetailsButton.setFocusable(false);
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.weightx = 1.0;
//        gbc.weighty = 0.3; // 30% of the panel height
//        gbc.fill = GridBagConstraints.BOTH;
//        panel.add(DetailsButton, gbc);
//
//        return panel;
//    }


    // Constructor for handling multiple data key-value pairs
    public static JPanel createStatBox(String... data) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBorder(BorderFactory.createLineBorder(new Color(0,110,199,255), 3));// Blue border
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);

        JPanel mainPanel = new JPanel(new GridLayout(0, 2, 0, 0)); // Dynamic rows, 2 columns for key-value pairs
        mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0)); // Padding inside the grid
        mainPanel.setOpaque(true);
        mainPanel.setBackground(Color.WHITE);

        // Populate the grid with key-value pairs
        for (int i = 0; i < data.length; i += 2) {
            String key = data[i];
            String value = (i + 1 < data.length) ? data[i + 1] : "";

            // Key Label
            JLabel keyLabel = new JLabel(key);
            keyLabel.setFont(new Font("Arial", Font.PLAIN, 18));
            keyLabel.setForeground(Color.BLACK);
            mainPanel.add(keyLabel);

            // Value Label
            JLabel valueLabel = new JLabel(value);
            valueLabel.setFont(new Font("Arial", Font.BOLD, 20));
            valueLabel.setForeground(Color.BLACK);
            mainPanel.add(valueLabel);
        }


        // Details button
        JButton detailsButton = new JButton("VIEW DETAILS");
        detailsButton.setFont(new Font("Arial", Font.BOLD, 16));
        detailsButton.setForeground(Color.white);
        detailsButton.setBackground(new Color(0,110,199,255));
        detailsButton.setFocusable(false);


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.7; // 70% of the panel height
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(mainPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.3; // 30% of the panel height
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(detailsButton, gbc);

        return panel;
    }
}