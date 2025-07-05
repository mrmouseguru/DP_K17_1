package temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {

    private JTextField celsiusField;
    private JTextField fahrenheitField;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100); // Adjusted size to better match the image
        setLocationRelativeTo(null); // Center the window

        // Set a default look and feel that might be closer to the Windows XP style
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20)); // Adjusted padding

        JLabel celsiusLabel = new JLabel("Celsius");
        celsiusField = new JTextField(5); // Shorter field for input

        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitField = new JTextField(6); // Shorter field for display
        fahrenheitField.setEditable(false); // Fahrenheit output is not directly editable

        // Add action listener to Celsius field for conversion
        celsiusField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCelsiusToFahrenheit();
            }
        });

        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);

        add(panel);
    }

    private void convertCelsiusToFahrenheit() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitField.setText(String.format("%.1f", fahrenheit)); // Format to one decimal place
        } catch (NumberFormatException ex) {
            fahrenheitField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}