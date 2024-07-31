package project1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUIotpgenerate {
    public static void main(String[]args){
                otpgenerate();
    }
    public static void otpgenerate(){
        JFrame frame = new JFrame("otpgenerate");
        JLabel  otpLable = new JLabel("Click to the Button");
        JButton otpbutton = new JButton("generate otp ");
        otpbutton.setBounds(100,80,120,40);
        otpLable.setBounds(100,40,200,40);

        otpbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String val = " 1234567890";
                Random ran =new Random();
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<6; i++){
                    int num = ran.nextInt(val.length());

                    sb.append(val.charAt(num));
                }
                String str = sb.toString();

                otpLable.setText("Generated OTP: " + str);
            }
        });

        frame.add(otpbutton);
        frame.add(otpLable);


        frame.setLayout(null);
        frame.setSize(340,280);
        frame.setVisible(true);
    }

}
