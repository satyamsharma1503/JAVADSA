package oopsinjava;

//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GUIcurrencyconvertor {
//    public static void main(String[] args) {
//        // to create a frame using swing in java
//        JFrame frame = new JFrame("Currency Convertor");
//        JLabel INRLable = new JLabel("enter your INR: ");
//        JLabel USDLable = new JLabel("enter your USD: ");
//        JLabel result= new JLabel();
//
//        JTextField INRField = new JTextField();
//        JTextField USDField = new JTextField();
//
//
//        JButton Button = new JButton("converter");
//
//        INRLable.setBounds(30,30,150,40);
//        INRField.setBounds(150,30,50,40);
//        USDLable.setBounds(30,80,150,40);
//        USDField.setBounds(150,80,50,40);
//        Button.setBounds(30,120,120,40);
////        result.setBounds(30,120,120,40);
//        result.setBounds(150, 120, 350, 60);
//
//
//        frame.add(INRField);
//        frame.add(USDField);
//        frame.add(INRLable);
//        frame.add(USDLable);
//        frame.add(Button);
//        frame.add(result);
//
//
//        // to build the defaultn layout
//        frame.setLayout(null);
//        // to set the size for frame
//        frame.setSize(500, 550);
//        frame.setVisible(true);
//
//        Button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!INRField.getText().isEmpty()
//                        && USDField.getText().isEmpty()) {
//                    float INR = Float.parseFloat(INRField.getText());
//                    float INRToUSD = (float) (INR/ 83.73);
//                    result.setText("INR to usd :" + String.valueOf(INRToUSD));
//                }
//                else if (INRField.getText().isEmpty()
//                        && !USDField.getText().isEmpty()) {
//                    float USD = Float.parseFloat(USDField.getText());
//                    float USDToINR = (float) (USD * 83.73);
//                    result.setText("INR to usd :" + String.valueOf(USDToINR));
//                }
//                else if (INRField.getText().isEmpty()
//                        && USDField.getText().isEmpty()) {
//
//                    result.setText("At least one vale enter");
//                }
//                else {
//                    float INR = Float.parseFloat(INRField.getText());
//                    float INRToUSD = (float) (INR / 83.73);
//                    float USD = Float.parseFloat(USDField.getText());
//                    float USDToINR = (float) (USD * 83.73);
//                    result.setText("INR to usd :" + String.valueOf(INRToUSD)+"INR to usd :" + String.valueOf(USDToINR));
//                }
//            }
//        });
//    }
//
//}
