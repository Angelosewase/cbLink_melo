package dashboard.components;

import javax.swing.*;
import java.awt.*;

public class Intro extends JPanel{
    private JButton switchModeButton;
    private JLabel administratorLabel;
    private JLabel supportContactLabel;
    private JLabel viewUserManualLabel;
    private JLabel paperSizeLabel;
    private JLabel paperSizeValueLabel;
    private JLabel companyLabel;

    public Intro() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Padding around components
        constraints.fill = GridBagConstraints.BOTH; // Make components expand
        setAlignmentY(GridBagConstraints.LINE_START);

        // Switch Mode Button
        switchModeButton = new JButton("SWITCH MODE");
        switchModeButton.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1; // Span 1 column
        constraints.weightx = 0.25; // 25% width
        add(switchModeButton, constraints);

        // Administrator Label
        administratorLabel = new JLabel("ADMINISTRATOR", SwingConstants.CENTER);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2; // Span 2 columns
        constraints.weightx = 0.5; // 50% width
        add(administratorLabel, constraints);

        // View User Manual Label
        viewUserManualLabel = new JLabel("View The User Manual", SwingConstants.RIGHT);
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1; // Span 1 column
        constraints.weightx = 0.25; // 25% width
        add(viewUserManualLabel, constraints);

        // Support Contact Label
        supportContactLabel = new JLabel("Support Contact --->");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.25;
        add(supportContactLabel, constraints);

        // Company Label
        companyLabel = new JLabel("CB-LINK LTD", SwingConstants.CENTER);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        add(companyLabel, constraints);

        // Paper Size Label
        paperSizeLabel = new JLabel("Paper size --->", SwingConstants.RIGHT);
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.25;
        add(paperSizeLabel, constraints);

        // Paper Size Value Label
        paperSizeValueLabel = new JLabel("80mm", SwingConstants.CENTER);
        paperSizeValueLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.25;
        add(paperSizeValueLabel, constraints);
    }
}
