/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_2;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Q2_temperatureConversion extends JFrame{
    JLabel labelHead = new JLabel("Enter Celsius temperature");
    JTextField textField = new JTextField(16);
    JRadioButton buttonF = new JRadioButton("Fahrenheit");
    JRadioButton buttonK = new JRadioButton("Kelvin");
    JLabel labelTemperature = new JLabel("New Temperature in is : ");
    
    JPanel panelHead = new JPanel(new GridLayout(1, 1));
    JPanel panelTextF = new JPanel(new GridLayout(1, 1));
    JPanel panelRedioBot = new JPanel(new GridLayout(1, 2));
    JPanel panelTemperature = new JPanel(new GridLayout(1, 2));
    
    ButtonGroup group = new ButtonGroup();

    public Q2_temperatureConversion() {
        group.add(buttonF);
        group.add(buttonK);
        
        panelHead.add(labelHead);
        panelTextF.add(textField);
        panelRedioBot.add(buttonF);
        panelRedioBot.add(buttonK);
        panelTemperature.add(labelTemperature);
  
        add(panelHead);
        add(panelTextF);
        add(panelRedioBot);
        add(panelTemperature);
        
        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Celsius = Integer.valueOf(textField.getText());
                float Fahrenheit =  Celsius * 9/5 + 32 ;
                labelTemperature.setText("New Temperature in is : "+Fahrenheit);
            }
        });
        
        buttonK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Celsius = Integer.valueOf(textField.getText());
                float Kelvin = (float)(Celsius + 273.15);
                labelTemperature.setText("New Temperature in is : "+Kelvin);
            }
        });
        
        setTitle("Temperature-Conversion");
        setSize(280, 160);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
     public static void main(String[] args) {
        new Q2_temperatureConversion();
    }
}

