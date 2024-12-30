package dashboard.components;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DebitGraph extends JPanel { ;
    private static final long serialVersionUID = 1L;


    public DebitGraph() {
        setLayout(new BorderLayout());
        DefaultCategoryDataset dataset = createDataset();
        // Create chart
        JFreeChart chart = ChartFactory.createLineChart(
                "MY DEBIT CHARTS | REMAINING :0.00", // Chart title
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
        String series1 = "Category One";
        String series2 = "Category Two";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();

        // Reverse order of dates and add random values
        dataset.addValue(245 + random.nextInt(50), series1, "2016-12-25");
        dataset.addValue(195 + random.nextInt(50), series1, "2016-12-24");
        dataset.addValue(240 + random.nextInt(50), series1, "2016-12-23");
        dataset.addValue(210 + random.nextInt(50), series1, "2016-12-22");
        dataset.addValue(100 + random.nextInt(50), series1, "2016-12-21");
        dataset.addValue(150 + random.nextInt(50), series1, "2016-12-20");
        dataset.addValue(200 + random.nextInt(50), series1, "2016-12-19");

        dataset.addValue(230 + random.nextInt(50), series2, "2016-12-25");
        dataset.addValue(180 + random.nextInt(50), series2, "2016-12-24");
        dataset.addValue(200 + random.nextInt(50), series2, "2016-12-23");
        dataset.addValue(195 + random.nextInt(50), series2, "2016-12-22");
        dataset.addValue(95 + random.nextInt(50), series2, "2016-12-21");
        dataset.addValue(130 + random.nextInt(50), series2, "2016-12-20");
        dataset.addValue(150 + random.nextInt(50), series2, "2016-12-19");

        return dataset;
    }
}

