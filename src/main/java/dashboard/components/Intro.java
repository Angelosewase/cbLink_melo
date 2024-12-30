package dashboard.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Intro extends JPanel {
    private JButton switchModeButton;
    private JLabel administratorLabel;
    private JLabel supportContactLabel;
    private JButton viewUserManualLabel;
    private JLabel paperSizeLabel;
    private JLabel paperSizeValueLabel;
    private JLabel companyLabel;
    private JLabel contactsLabel;

    public Intro() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Consistent outer padding

        // LEFT SECTION
        JPanel leftPanel = new JPanel(new GridLayout(2, 1, 0, 0));
        leftPanel.setOpaque(true);
        leftPanel.setBackground(Color.white);

        switchModeButton = ButtonFactory.createSwitchModeButton();

        supportContactLabel = new JLabel("Support Contact --->");
        supportContactLabel.setFont(new Font("Arial", Font.BOLD, 16));
        supportContactLabel.setOpaque(true);
        supportContactLabel.setBackground(Color.white);

        ImageIcon icon = new ImageIcon(ButtonFactory.class.getResource("../../images/phone.png"));
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(40, 20, Image.SCALE_SMOOTH); // Resize icon to 25 height
        icon = new ImageIcon(newImg);
        contactsLabel = new JLabel("+250 791 377 829");
        contactsLabel.setIcon(icon);
        contactsLabel.setFont(new Font("Arial", Font.BOLD, 19));
        contactsLabel.setOpaque(true);
        contactsLabel.setBackground(new Color(0, 0, 101, 255));
        contactsLabel.setForeground(Color.WHITE);
        contactsLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20)); // Padding for text

        JPanel leftBottomPanel = new JPanel(new GridLayout(1, 2, 0, 0));
        leftBottomPanel.setBackground(Color.white); // Match background
        leftBottomPanel.add(supportContactLabel);
        leftBottomPanel.add(contactsLabel);

        leftPanel.add(switchModeButton);
        leftPanel.add(leftBottomPanel);
        add(leftPanel, BorderLayout.WEST);

        // CENTER SECTION
        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 0, 0));
        centerPanel.setOpaque(true);
        centerPanel.setBackground(Color.white);

        administratorLabel = new JLabel("ADMINISTRATOR", SwingConstants.CENTER);
        administratorLabel.setFont(new Font("Arial", Font.BOLD, 19));
        companyLabel = new JLabel("CB-LINK LTD", SwingConstants.CENTER);
        companyLabel.setFont(new Font("Arial", Font.PLAIN, 19));
        centerPanel.add(administratorLabel);
        centerPanel.add(companyLabel);

        add(centerPanel, BorderLayout.CENTER);

        // RIGHT SECTION
        JPanel rightPanel = new JPanel(new GridLayout(2, 1, 0, 0));
        rightPanel.setOpaque(true);
        rightPanel.setBackground(Color.white);

        viewUserManualLabel = ButtonFactory.createViewUserManualButton();

        paperSizeLabel = new JLabel("Paper size --->");
        paperSizeLabel.setFont(new Font("Arial", Font.BOLD, 19));
        paperSizeLabel.setOpaque(true);
        paperSizeLabel.setBackground(Color.white);

        paperSizeValueLabel = new JLabel("80mm");
        paperSizeValueLabel.setFont(new Font("Arial", Font.BOLD, 19));
        paperSizeValueLabel.setOpaque(true);
        paperSizeValueLabel.setBackground(new Color(0, 0, 101, 255));
        paperSizeValueLabel.setForeground(Color.WHITE);
        paperSizeValueLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        JPanel rightBottomSection = new JPanel(new GridLayout(1, 2, 0, 0));
        rightBottomSection.setBackground(Color.white); // Match background
        rightBottomSection.add(paperSizeLabel);
        rightBottomSection.add(paperSizeValueLabel);

        paperSizeValueLabel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension size = e.getComponent().getSize();
                paperSizeValueLabel.setText(size.width + "mm x " + size.height + "mm");
            }
        });

        rightPanel.add(viewUserManualLabel);
        rightPanel.add(rightBottomSection);

        add(rightPanel, BorderLayout.EAST);

//        leftPanel.setPreferredSize(new Dimension(0, 80)); // Example dimensions
        rightPanel.setPreferredSize(new Dimension(400, 80));
    }

    public JLabel getContactsLabel() {
        return contactsLabel;
    }

    public void setContactsLabel(JLabel contactsLabel) {
        this.contactsLabel = contactsLabel;
    }

    public JLabel getCompanyLabel() {
        return companyLabel;
    }

    public void setCompanyLabel(JLabel companyLabel) {
        this.companyLabel = companyLabel;
    }

    public JLabel getPaperSizeValueLabel() {
        return paperSizeValueLabel;
    }

    public void setPaperSizeValueLabel(JLabel paperSizeValueLabel) {
        this.paperSizeValueLabel = paperSizeValueLabel;
    }

    public JLabel getPaperSizeLabel() {
        return paperSizeLabel;
    }

    public void setPaperSizeLabel(JLabel paperSizeLabel) {
        this.paperSizeLabel = paperSizeLabel;
    }

    public JButton getViewUserManualLabel() {
        return viewUserManualLabel;
    }

    public void setViewUserManualLabel(JButton viewUserManualLabel) {
        this.viewUserManualLabel = viewUserManualLabel;
    }

    public JLabel getSupportContactLabel() {
        return supportContactLabel;
    }

    public void setSupportContactLabel(JLabel supportContactLabel) {
        this.supportContactLabel = supportContactLabel;
    }

    public JLabel getAdministratorLabel() {
        return administratorLabel;
    }

    public void setAdministratorLabel(JLabel administratorLabel) {
        this.administratorLabel = administratorLabel;
    }

    public JButton getSwitchModeButton() {
        return switchModeButton;
    }

    public void setSwitchModeButton(JButton switchModeButton) {
        this.switchModeButton = switchModeButton;
    }
}
