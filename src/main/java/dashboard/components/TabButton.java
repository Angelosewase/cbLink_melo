package dashboard.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabButton extends JButton {
    private boolean isActive;

    // Constructor to set up the initial state of the button
    public TabButton(String text) {
        super(text);  // Set the button text
        setOpaque(true);  // Makes the button background fully opaque
        setBackground(Color.BLUE);  // Initial background color
        setForeground(Color.WHITE);  // Set the foreground (text) color
        setFont(new Font("Arial", Font.BOLD, 16));  // Set font
        setFocusable(false);
        setBorderPainted(false);
        // Set an ActionListener to toggle active state
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isActive = !isActive;  // Toggle active state
                updateButtonAppearance();  // Update appearance based on active state
            }
        });
    }

    // Method to update the button's appearance based on its active state
    private void updateButtonAppearance() {
        if (isActive) {
            setBackground(Color.CYAN);
            setForeground(Color.darkGray);// Set active background color
        } else {
            setBackground(Color.BLUE);
            setForeground(Color.white);// Set inactive background color
        }
    }

  //  @Override
//    public Dimension getPreferredSize() {
//        FontMetrics fontMetrics = getFontMetrics(getFont()); // Get the font metrics for the current font
//        int textWidth = fontMetrics.stringWidth(getText()); // Calculate the width of the text
//        int padding = 20; // Add padding to ensure extra space around the text
//        int height = fontMetrics.getHeight() + 10; // Calculate height with some additional space
//        return new Dimension(textWidth + padding, height); // Set width and height
//    }
}
