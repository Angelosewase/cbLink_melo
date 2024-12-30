package dashboard.components;

import javax.swing.*;
import java.awt.*;

public class ButtonFactory {

    public static JButton createSwitchModeButton() {
        JButton switchModeButton = new JButton("SWITCH MODE");
        switchModeButton.setBackground(new Color(228, 237, 244, 255));

        // Load and resize the icon
        ImageIcon icon = new ImageIcon(ButtonFactory.class.getResource("../../images/switch-mode.png"));
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(-1, 25, Image.SCALE_SMOOTH); // Resize icon to 15 height
        icon = new ImageIcon(newImg);

        switchModeButton.setIcon(icon);

        // Set font, text color, and border
        switchModeButton.setFont(new Font("Arial", Font.BOLD, 16));
        switchModeButton.setForeground(Color.BLUE);
        switchModeButton.setBorder(BorderFactory.createDashedBorder(Color.BLUE, 1, 5, 1, true));
        switchModeButton.setBorder(BorderFactory.createCompoundBorder(
                switchModeButton.getBorder(),
                BorderFactory.createLineBorder(Color.BLACK, 2)  // Outer black border
        ));
        switchModeButton.setFocusable(false);
        switchModeButton.setPreferredSize(new Dimension(400,20));

        return switchModeButton;
    }

    public static JButton createViewUserManualButton() {
        JButton ViewUserManualButton = new JButton("View The User Manual");
        ViewUserManualButton.setBackground(new Color(225,225,225,255));

        // Load and resize the icon
        ImageIcon icon = new ImageIcon(ButtonFactory.class.getResource("../../images/user_manual.png"));
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(-1, 25, Image.SCALE_SMOOTH); // Resize icon to 15 height
        icon = new ImageIcon(newImg);

        ViewUserManualButton.setIcon(icon);

        // Set font, text color, and border
        ViewUserManualButton.setFont(new Font("Arial", Font.BOLD, 16));
        ViewUserManualButton.setForeground(Color.BLUE);
        ViewUserManualButton.setBorder(BorderFactory.createLineBorder(new Color(201, 201, 201, 255), 3));
//        ViewUserManualButton.setMargin(new Insets(10, 20, 10, 20)); // Padding: 10 top, 20 left, 10 bottom, 20 right
        ViewUserManualButton.setFocusable(false);


        return ViewUserManualButton;
    }
}

