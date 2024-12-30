package dashboard.components;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class GraphicsComboBox extends JPanel {
    private JComboBox<String> comboBox;

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox<String> comboBox) {
        this.comboBox = comboBox;
    }

    public GraphicsComboBox() {
        setLayout(new BorderLayout());
        String[] days = {"Today", "Yesterday", "Tomorrow", "Custom"}; // Add more days as needed

        comboBox = new JComboBox<>(days);

        // Customize the JComboBox UI
        comboBox.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton button = super.createArrowButton();
                return button;
            }
        });

        comboBox.setFont(new Font("Arial", Font.BOLD, 12)); // Set font for the text
        comboBox.setForeground(Color.BLUE);// Set text color to blue
        comboBox.setPreferredSize(null);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 22));
        add(comboBox, BorderLayout.CENTER);
    }
}
