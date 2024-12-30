package dashboard.layouts;

import dashboard.components.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainLayout extends JPanel implements HeaderPanel.TabChangeListener {
    private final CardLayout cardLayout;
    private final JPanel contentPanel;
    private final HeaderPanel headerPanel;

    public MainLayout() {
        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(Color.WHITE);

        // Create card layout for content panels
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        contentPanel.setBackground(Color.WHITE);

        // Create header panel with tab change listener
        headerPanel = new HeaderPanel();
        headerPanel.setTabChangeListener(this);

        // Add tab panels
        addTabPanels();

        // Add components to main layout
        add(headerPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
    }

    private void addTabPanels() {
        contentPanel.add(createHomePanel(), "HOME");
        contentPanel.add(createConteLessPanel("Inventory store"), "INVENTORY STORE");
        contentPanel.add(createConteLessPanel("Sales page"), "SALES");
        contentPanel.add(createConteLessPanel("Expenses page"), "EXPENSES");
        contentPanel.add(createConteLessPanel("Reports page "), "REPORTS");
        contentPanel.add(createConteLessPanel("Manager page"), "MANAGER");
    }

    private JPanel createHomePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);

        // Wrapper panel for layout with left and right borders
        JPanel wrapperPanel = createWrapperPanel();

        // Main content panel
        JPanel contentPanel = createContentPanel();

        wrapperPanel.add(contentPanel, BorderLayout.CENTER);
        panel.add(wrapperPanel, BorderLayout.CENTER);

        return panel;
    }


    private JPanel createConteLessPanel(String title) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);

        // Wrapper panel for layout with left and right borders
        JPanel wrapperPanel = createWrapperPanel();

        // Main content panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);

        // Text Label
        JLabel text = new JLabel(title, SwingConstants.CENTER); // Center the text horizontally
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Arial", Font.BOLD, 36)); // Make the text as large as possible
        text.setHorizontalAlignment(SwingConstants.CENTER); // Align horizontally
        text.setVerticalAlignment(SwingConstants.CENTER);   // Align vertically

        contentPanel.add(text, BorderLayout.CENTER);

        wrapperPanel.add(contentPanel, BorderLayout.CENTER);
        panel.add(wrapperPanel, BorderLayout.CENTER);

        return panel;
    }


    private JPanel createWrapperPanel() {
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 10, 0, 10, new Color(1, 0, 102, 255)), // Thick blue borders on left and right
                BorderFactory.createEmptyBorder(0, 2, 0, 2) // Padding on left and right
        ));
        wrapperPanel.setBackground(Color.WHITE);
        return wrapperPanel;
    }

    private JPanel createContentPanel() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);

        // Add center panel
        JPanel centerPanel = createCenterPanel();
        contentPanel.add(centerPanel, BorderLayout.CENTER);

        return contentPanel;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();

        // Add intro panel
        Intro introPanel = new Intro();
        introPanel.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.10; // 1/4 of the height
        gbc.fill = GridBagConstraints.BOTH;
        centerPanel.add(introPanel, gbc);

        // Add main panel with statistics and graph
        JPanel mainPanelWrapper = createMainPanelWrapper();
        gbc.gridy = 1;
        gbc.weighty = 0.8;
        centerPanel.add(mainPanelWrapper, gbc);

        return centerPanel;
    }

    private JPanel createMainPanelWrapper() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 110, 199, 255), 5), // Outer thick blue border
                BorderFactory.createEmptyBorder(10, 10, 10, 10) // Inner padding
        ));
        mainPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();

        // Add statistics panel
        StatisticsPanel statsPanel = new StatisticsPanel();
        statsPanel.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.15;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(statsPanel, gbc);

        // Add graph panel
        GraphPanel graphPanel = new GraphPanel();
        graphPanel.setBackground(Color.WHITE);
        gbc.gridy = 1;
        gbc.weighty = 0.85;
        mainPanel.add(graphPanel, gbc);

        JPanel mainPanelWrapper = new JPanel(new BorderLayout());
        mainPanelWrapper.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Margin around mainPanel
        mainPanelWrapper.setBackground(Color.WHITE);
        mainPanelWrapper.add(mainPanel, BorderLayout.CENTER);

        return mainPanelWrapper;
    }

    @Override
    public void onTabChanged(String tabName) {
        cardLayout.show(contentPanel, tabName);
    }
}
