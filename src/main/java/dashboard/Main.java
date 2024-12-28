package dashboard;

import dashboard.layouts.MainLayout;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy | HH:mm:ss");
            String currentDateTime = formatter.format(new Date());

            ImageIcon icon = new ImageIcon(Main.class.getResource("../images/icon.png"));

            JFrame frame = new JFrame("MELO SOFTWARE V2 | WORKING MODE | CB-LINK LTD | " + currentDateTime);
            frame.setIconImage(icon.getImage());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 800);
            frame.add(new MainLayout());
            frame.setVisible(true);
        });
    }
}