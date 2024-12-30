package dashboard.components;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HeaderPanel extends JPanel {
    private ImageIcon logoImage = new ImageIcon(
            new ImageIcon(HeaderPanel.class.getResource("../../images/logo.png"))
                    .getImage()
                    .getScaledInstance(-1, 40, Image.SCALE_SMOOTH)
    );
    private ImageIcon settingsIcon = new ImageIcon(
            new ImageIcon(HeaderPanel.class.getResource("../../images/settings.png"))
                    .getImage()
                    .getScaledInstance(-1, 40, Image.SCALE_SMOOTH)
    );

    private JPanel buttonsPanel = new JPanel();
    private JButton settingsButton = new JButton();
    private JLabel logo = new JLabel();
    private final List<TabButton> tabButtons = new ArrayList<>();
    private TabButton activeTab;

    public interface TabChangeListener {
        void onTabChanged(String tabName);
    }

    private TabChangeListener tabChangeListener;

    public void setTabChangeListener(TabChangeListener listener) {
        this.tabChangeListener = listener;
    }

    public HeaderPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 10, 0, 10, new Color(1, 0, 102, 255)), // Thick blue borders on left and right
                BorderFactory.createEmptyBorder(0, 2, 0, 2) // Padding on left and right
        ));

        createLogo();
        createHeaderPanelButtons();
        initSettingsIcon();

        add(logo, BorderLayout.WEST);
        add(buttonsPanel, BorderLayout.CENTER);
        add(settingsButton, BorderLayout.EAST);
        setPreferredSize(new Dimension(0, 40));
    }

    private void createHeaderPanelButtons() {
        List<String> buttonLabels = Arrays.asList(
                "HOME", "INVENTORY STORE", "SALES", "EXPENSES", "REPORTS", "MANAGER"
        );

        buttonsPanel.setBackground(new Color(0, 0, 101, 255));
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (String label : buttonLabels) {
            final TabButton button = new TabButton(label, tabName -> {
                if (activeTab != null) {
                    activeTab.setActive(false);
                }
                // activeTab = button; // `button` is now final, so it can be safely used here.
                // button.setActive(true);
                if (tabChangeListener != null) {
                    tabChangeListener.onTabChanged(tabName);
                }
            });
            tabButtons.add(button);
            buttonsPanel.add(button);

            if (label.equals("HOME")) {
                button.setActive(true);
                activeTab = button;
            }
        }
    }


    private void createLogo() {
        logo.setForeground(new Color(0, 0, 101, 255));
        logo.setFont(new Font("Arial", Font.BOLD, 20));
        logo.setIcon(logoImage);
        logo.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // Add padding around the logo
    }

    private void initSettingsIcon() {
        settingsButton.setIcon(settingsIcon);
        settingsButton.setBackground(new Color(0, 0, 101, 255));
        settingsButton.setContentAreaFilled(false);
        settingsButton.setOpaque(true);
        settingsButton.setFocusPainted(false);
        settingsButton.setBorderPainted(false);
        settingsButton.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // Add padding
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public ImageIcon getSettingsIcon() {
        return settingsIcon;
    }

    public void setSettingsIcon(ImageIcon settingsIcon) {
        this.settingsIcon = settingsIcon;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }

    public JButton getSettingsButton() {
        return settingsButton;
    }

    public void setSettingsButton(JButton settingsButton) {
        this.settingsButton = settingsButton;
    }
}
