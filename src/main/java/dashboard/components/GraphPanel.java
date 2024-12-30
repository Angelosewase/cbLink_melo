package dashboard.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GraphPanel extends JPanel {
    private JPanel graphDesc;
    private Integer total = 0;
    private JLabel graphTotal, graphDescText;
    private GraphicsComboBox dayCombobox;
    private JButton credit, debit ;
    private JPanel buttonsPanel;
    private CreditsGraph creditsGraph;
    private  DebitGraph debitsGraph;
    private JPanel graphsMainPanel;

    public GraphPanel() {
        setLayout(new BorderLayout());
        graphDescText = new JLabel("CREDITS & DEBITS");
        graphDescText.setFont(new Font("Arial", Font.PLAIN, 25));
        graphDescText.setForeground(new Color(0, 0, 101, 255));

        graphTotal = new JLabel(total.toString());
        graphTotal.setFont(new Font("Arial", Font.PLAIN, 25));
        graphTotal.setForeground(new Color(0, 0, 101, 255));

        dayCombobox = new GraphicsComboBox();

        graphDesc = new JPanel(new GridLayout(1, 3));
        graphDesc.setOpaque(true);
        graphDesc.setBackground(Color.white);
        graphDesc.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        graphDescText.setHorizontalAlignment(SwingConstants.LEADING);
        graphTotal.setHorizontalAlignment(SwingConstants.CENTER);
        dayCombobox.setAlignmentX(Component.RIGHT_ALIGNMENT);


        graphDesc.add(graphDescText);
        graphDesc.add(graphTotal);
        graphDesc.add(dayCombobox);
        add(graphDesc, BorderLayout.NORTH);


        createAndAddGraphs();

    }


    public void createAndAddGraphs() {
        // Create buttons
        credit = new JButton("Credit Graphs");
        credit.setFocusable(false);
        credit.setFont(new Font("Arial", Font.BOLD, 18));
        credit.setBorder(null);
        credit.setBackground(Color.white);
        credit.setForeground(new Color(1, 0, 102, 255));
        debit = new JButton("Debit Graphs");
        debit.setFocusable(false);
        debit.setFont(new Font("Arial", Font.BOLD, 18));
        debit.setBorder(null);
        debit.setBackground(Color.white);
        debit.setForeground(new Color(1, 0, 102, 255));

        // Create a new panel for buttons
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel.setBackground(Color.WHITE); // Match background with the panel
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, -5, 15)); // Add padding
        buttonsPanel.add(credit);
        buttonsPanel.add(debit);


        //graph main panel

         graphsMainPanel = new JPanel(new BorderLayout());
        graphsMainPanel.setBorder(BorderFactory.createLineBorder(new Color(249, 249, 249, 255), 2));
        graphsMainPanel.setOpaque(true);



        // Add the buttonsPanel below the graphDesc
        graphsMainPanel.add(buttonsPanel,BorderLayout.NORTH);

        // Create graph panels
        creditsGraph = new CreditsGraph();
         debitsGraph = new DebitGraph();

        // Initially display Credit Graph
        graphsMainPanel.add(creditsGraph, BorderLayout.CENTER);
        add(graphsMainPanel, BorderLayout.CENTER);

        // Add action listeners for toggling graphs
        credit.addActionListener(e-> showCreditGraph(e));
        debit.addActionListener(e-> showDebitGraph(e));
    }

    // Method to show Credit Graph
    private void showCreditGraph(ActionEvent e) {
        this.graphsMainPanel.remove(debitsGraph); // Remove Debit Graph if present
        graphsMainPanel.add(creditsGraph, BorderLayout.CENTER); // Add Credit Graph
        revalidate(); // Refresh layout
        repaint(); // Repaint to reflect changes
    }

    // Method to show Debit Graph
    private void showDebitGraph(ActionEvent e) {
        graphsMainPanel.remove(creditsGraph); // Remove Credit Graph if present
        graphsMainPanel.add(debitsGraph, BorderLayout.CENTER); // Add Debit Graph
        revalidate(); // Refresh layout
        repaint(); // Repaint to reflect changes
    }

    public JPanel getGraphDesc() {
        return graphDesc;
    }

    public void setGraphDesc(JPanel graphDesc) {
        this.graphDesc = graphDesc;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public JLabel getGraphTotal() {
        return graphTotal;
    }

    public void setGraphTotal(JLabel graphTotal) {
        this.graphTotal = graphTotal;
    }

    public JLabel getGraphDescText() {
        return graphDescText;
    }

    public void setGraphDescText(JLabel graphDescText) {
        this.graphDescText = graphDescText;
    }

    public GraphicsComboBox getDayCombobox() {
        return dayCombobox;
    }

    public void setDayCombobox(GraphicsComboBox dayCombobox) {
        this.dayCombobox = dayCombobox;
    }

    public JButton getCredit() {
        return credit;
    }

    public void setCredit(JButton credit) {
        this.credit = credit;
    }

    public JButton getDebit() {
        return debit;
    }

    public void setDebit(JButton debit) {
        this.debit = debit;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public CreditsGraph getCreditsGraph() {
        return creditsGraph;
    }

    public void setCreditsGraph(CreditsGraph creditsGraph) {
        this.creditsGraph = creditsGraph;
    }

    public DebitGraph getDebitsGraph() {
        return debitsGraph;
    }

    public void setDebitsGraph(DebitGraph debitsGraph) {
        this.debitsGraph = debitsGraph;
    }

    public JPanel getGraphsMainPanel() {
        return graphsMainPanel;
    }

    public void setGraphsMainPanel(JPanel graphsMainPanel) {
        this.graphsMainPanel = graphsMainPanel;
    }
}