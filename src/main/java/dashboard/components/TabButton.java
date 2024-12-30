package dashboard.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabButton extends JButton {
    private boolean isActive;

    public interface TabButtonListener {
        void onTabSelected(String tabName);
    }

    private TabButtonListener listener;

    // Constructor to set up the initial state of the button
    public TabButton(String text, TabButtonListener listener) {
        super(text); // Wrap text in HTML for alignment and wrapping
        this.listener = listener;
        setOpaque(true); // Makes the button background fully opaque
        setBackground(new Color(0, 0, 101, 255)); // Initial background color
        setForeground(Color.WHITE); // Set the foreground (text) color
        setFont(new Font("Arial", Font.BOLD, 16)); // Set font
        setFocusable(false);
        setBorderPainted(false);

        // Center align text vertically and horizontally
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);

        // Add action listener for toggling active state
        addActionListener(e -> {
            if (listener != null) {
                listener.onTabSelected(getText());
            }
        });
    }

    // Method to update the button's appearance based on its active state
    private void updateAppearance() {
        if (isActive) {
            setBackground(Color.WHITE); // Set active background color
            setForeground(new Color(0, 0, 101, 255)); // Set active text color
        } else {
            setBackground(new Color(0, 0, 101, 255)); // Set inactive background color
            setForeground(Color.WHITE); // Set inactive text color
        }
    }

    public void setActive(boolean active) {
        isActive = active;
        updateAppearance();
    }

    public boolean isActive() {
        return isActive;
    }
}
