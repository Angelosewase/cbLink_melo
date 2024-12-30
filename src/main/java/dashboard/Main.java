package dashboard;

import dashboard.components.FooterPanel;
import dashboard.layouts.MainLayout;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy | HH:mm:ss");
                String currentDateTime = formatter.format(new Date());

                ImageIcon icon = new ImageIcon(Main.class.getResource("../images/icon.png"));
                if (icon.getImage() == null) {
                    throw new RuntimeException("Failed to load application icon");
                }

                JFrame frame = new JFrame("MELO SOFTWARE V2 | WORKING MODE | CB-LINK LTD | " + currentDateTime);
                frame.setIconImage(icon.getImage());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1500, 900);
                frame.add(new MainLayout());
                frame.add(new FooterPanel(), BorderLayout.SOUTH);
                frame.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                    "Error starting application: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        });
    }
}