package oopsinjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJavaprogramSwing {
    public static void main(String[] args) {
        // to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");


        // create  ui component for Bmi calculator
        JLabel heightLable = new JLabel("enter your height(m): ");
        JLabel weightLable = new JLabel("enter your weight(w): ");
        JLabel bmiLable = new JLabel();

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();


        JButton bmiButton = new JButton("Calculator BMI");
        //to set the size and position of UI components
        heightLable.setBounds(30,30,150,40);
        heightField.setBounds(150,30,50,40);
        weightLable.setBounds(30,80,150,40);
        weightField.setBounds(150,80,50,40);
        bmiButton.setBounds(30,120,120,40);
        bmiLable.setBounds(170,130,100,40);


        // to attach the lable to frame
         frame.add(heightLable);
        frame.add(heightField);
        frame.add(weightLable);
        frame.add(weightField);
        frame.add(bmiButton);
        frame.add(bmiLable);


        // to build the defaultn layout
        frame.setLayout(null);
        // to set the size for frame
        frame.setSize(300, 250);

        // BMI  Calculator
        //1.Enter your weight - JLable
        //2. Enter  your height -JLable
        //3. Enter your BMI - JButton
        //4. user input weight - JTextField
        //5. User input height - JtextField
        //6. Output ke liye - JLable

        // to visible the frame on screen
        frame.setVisible(true);

bmiButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        float weight = Float.parseFloat(weightField.getText().toString());
        float height = Float.parseFloat(heightField.getText().toString());
    }
});

        //to click on the bmi calculator
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float weight = Float.parseFloat(weightField.getText().toString());
                float height = Float.parseFloat(heightField.getText().toString());

                float output = weight / (height * height );
                // 18.5<under weight , 18.5 to 24.9 = normal, 24

                if(output < 18.5){
                    bmiLable.setText("in under weight ");
                    bmiLable.setForeground(Color.lightGray);
                }
                else if (output > 18.5 && output < 24.9){
                    bmiLable.setText("In NORMAL");
                    bmiLable.setForeground(Color.pink);

                }
                else if (output > 24.9 && output < 24.9){
                    bmiLable.setText("In overweight");
                    bmiLable.setForeground(Color.green);
                }
                else {

                    bmiLable.setText("In obesity");
                    bmiLable.setForeground(Color.RED);
                }
            }
        });
    }
}
