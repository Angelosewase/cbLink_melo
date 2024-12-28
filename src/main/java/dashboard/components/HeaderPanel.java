package dashboard.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class HeaderPanel extends JPanel {
    private ImageIcon logoImage = new ImageIcon(HeaderPanel.class.getResource("../../images/logo.png"));
    private ImageIcon settingsIcon = new ImageIcon(HeaderPanel.class.getResource("../../images/settings.png"));
    private JPanel buttonsPanel = new JPanel();
    private JButton settingsButton  = new JButton();

    JLabel logo = new JLabel();


    public void createHeaderPanelButtons() {
        List<String> buttonLabels = Arrays.asList(
                "HOME", "INVENTORY STORE", "SALES", "EXPENSES", "REPORTS", "MANAGER"
        );
        buttonsPanel.setBackground(Color.blue);
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        buttonsPanel.setBorder(new EmptyBorder(0, 30, 0, 0)); // Top, left, bottom, right
        for (String label : buttonLabels) {
            JButton button = new TabButton(label); // Create the custom button
            buttonsPanel.add(button); // Add the button to the panel
        }

    }

    public void createLogo() {
        logo.setForeground(Color.BLUE);
        logo.setFont(new Font("Arial", Font.BOLD, 20));
        logo.setIcon(logoImage);
    }

    public void initSettingsIcon(){
        settingsButton.setIcon(settingsIcon);
        settingsButton.setBackground(Color.blue);
        settingsButton.setBorderPainted(false);
        settingsButton.addChangeListener(e-> settingsButton.setBackground(Color.blue));
    }


    public HeaderPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.white);
        createLogo();
        createHeaderPanelButtons();
         initSettingsIcon();
        add(settingsButton, BorderLayout.EAST);
        add(logo, BorderLayout.WEST);
        add(buttonsPanel);
    }
}
