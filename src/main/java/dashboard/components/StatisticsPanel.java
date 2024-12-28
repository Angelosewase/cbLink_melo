package dashboard.components;

import javax.swing.*;
import java.awt.*;
import dashboard.utils.UIUtils;

public class StatisticsPanel extends JPanel {
    public StatisticsPanel() {
        setLayout(new GridLayout(1, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Example statistics
        add(UIUtils.createStatBox("Total Products Count", "594"));
        add(UIUtils.createStatBox("Expected Sales", "15,361,501,584,055.11"));
        add(UIUtils.createStatBox("Purchase Cost", "9,007,545,436.94"));
        add(UIUtils.createStatBox("Customers", "19"));
        add(UIUtils.createStatBox("Notifications/Requests", "0"));
    }
}
