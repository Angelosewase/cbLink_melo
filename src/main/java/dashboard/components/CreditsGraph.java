package dashboard.components;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class CreditsGraph extends JPanel { ;
    private static final long serialVersionUID = 1L;


    public CreditsGraph() {
        setLayout(new BorderLayout());
        DefaultCategoryDataset dataset = createDataset();
        // Create chart
        JFreeChart chart = ChartFactory.createLineChart(
                "MY CREDIT CHARTS | REMAINING :0.00", // Chart title
                "year", // X-Axis Label
                "AMOUNT/(T-Credentials)0.00", // Y-Axis Label
                dataset
        );

        // Create ChartPanel and add it to this JPanel
        ChartPanel chartPanel = new ChartPanel(chart);


        chartPanel.setPreferredSize(null);
        this.add(chartPanel, BorderLayout.CENTER);
    }

    private DefaultCategoryDataset createDataset() {
        String series1 = "category one";
        String series2 = "category two";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(200, series1, "2016-12-19");
        dataset.addValue(150, series1, "2016-12-20");
        dataset.addValue(100, series1, "2016-12-21");
        dataset.addValue(210, series1, "2016-12-22");
        dataset.addValue(240, series1, "2016-12-23");
        dataset.addValue(195, series1, "2016-12-24");
        dataset.addValue(245, series1, "2016-12-25");

        dataset.addValue(150, series2, "2016-12-19");
        dataset.addValue(130, series2, "2016-12-20");
        dataset.addValue(95, series2, "2016-12-21");
        dataset.addValue(195, series2, "2016-12-22");
        dataset.addValue(200, series2, "2016-12-23");
        dataset.addValue(180, series2, "2016-12-24");
        dataset.addValue(230, series2, "2016-12-25");

        return dataset;
    }
}

