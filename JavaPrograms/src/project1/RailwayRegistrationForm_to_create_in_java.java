package project1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RailwayRegistrationForm_to_create_in_java {
    public static void main(String[]args){


            JFrame frame= new JFrame("Railway Registration Form");

            JLabel form = new JLabel("Railway Registration Form");
            form.setBounds(200,18,300,60);
            form.setFont(new Font("arial",Font.PLAIN ,25));
            form.setForeground(Color.black);
            frame.add(form);



            JLabel name = new JLabel("Enter a Full Name:-");
            name.setBounds(130,80,200,30);
            JTextField nameField = new JTextField();
            nameField.setBorder(new LineBorder(Color.WHITE,2));
            nameField.setBounds(250,80,150,30);
            frame.add(nameField);
            frame.add(name);


            JLabel last = new JLabel("Enter a Train N0./Name:-");
            last.setBounds(100,120,230,30);
            JTextField lastField = new JTextField();
            lastField.setBorder(new LineBorder(Color.WHITE,2));
            lastField.setBounds(250,120,150,30);
            frame.add(lastField);
            frame.add(last);


            JLabel journey= new JLabel("Journey From:-");
            journey.setBounds(150,160,100,30);
            JTextField journeyField = new JTextField();
            journeyField.setBorder(new LineBorder(Color.WHITE,2));
            journeyField.setBounds(250,160,150,30);
            frame.add(journeyField);
            frame.add(journey);


            JLabel from = new JLabel("Journey To:-");
            from.setBounds(420,160,100,30);
            JTextField fromField = new JTextField();
            fromField.setBorder(new LineBorder(Color.WHITE,2));
            fromField.setBounds(500,160,150,30);
            frame.add(fromField);
            frame.add(from);


            JLabel travel = new JLabel("Travel Choose:-");
            travel.setBounds(140,200,100,30);
            JTextField travelField = new JTextField();
            travelField.setBorder(new LineBorder(Color.WHITE,4));
            String values[] ={"FirstClass(AC)","SecondClass(AC)","ThirdClass(AC)","General"};
            JComboBox abc=new JComboBox(values);
            abc.setBounds(250,200,150,30);
            frame.add(abc);
            abc.setSelectedItem(values);


//        travelField.setBounds(250,200,150,30);
//            frame.add(travelField);
            frame.add(travel);


            JLabel phone = new JLabel("Phone Number:-");
            phone.setBounds(140,240,100,30);
            JTextField phoneField = new JTextField();
            phoneField.setBorder(new LineBorder(Color.WHITE,2));
            phoneField.setBounds(250,240,150,30);
            frame.add(phoneField);
            frame.add(phone);



            JLabel date = new JLabel("Joureny Date:-");
            date.setBounds(140,280,100,30);
            JTextField dateField = new JTextField();
            dateField.setBorder(new LineBorder(Color.WHITE,2));
            dateField.setBounds(250,280,150,30);
            frame.add(dateField);
            frame.add(date);



            JLabel age = new JLabel("Age:-");
            age.setBounds(190,320,100,30);
            JTextField ageField = new JTextField();
            ageField .setBorder(new LineBorder(Color.WHITE,2));
            ageField.setBounds(250,320,150,30);
            frame.add(ageField);
            frame.add(age);


            JLabel gender = new JLabel("Gender:-");
            gender.setBounds(130,355,120,30);
            JTextField genderField = new JTextField();
            JCheckBox ab= new JCheckBox("Male");
            JCheckBox bb= new JCheckBox("Female");
            JCheckBox cb= new JCheckBox("Other");
            ab.setBounds(200,360,60,20);
            bb.setBounds(300,360,70,20);
            cb.setBounds(400,360,60,20);
            frame.add(cb);
            frame.add(ab);
//        ab.setSelectedItem();
            frame.add(bb);


//        genderField.setBounds(250,360,150,30);
            frame.add(genderField);
            frame.add(gender);


            JLabel email = new JLabel("Enter your Email Id:-");
            email.setBounds(110,400,130,30);
            JTextField emailField = new JTextField();
            emailField.setBorder(new LineBorder(Color.WHITE,2));
            emailField.setBounds(250,400,150,30);
            frame.add(emailField);
            frame.add(email);


            JButton reset = new JButton("Reset");
            reset.setBorder(new LineBorder(Color.WHITE,2));
            reset.setBounds(130,450,150,50);
            frame.add(reset);

            reset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String str="";
                    if (ab.isSelected()){
                        str="male";
                    }else if (bb.isSelected()){
                        str="female";
                    } else if (cb.isSelected()) {
                        str="other";
                    }
                    String data = (String) abc.getItemAt(abc.getSelectedIndex());
                    nameField.setText("");
                    lastField.setText("");
                    journeyField.setText("");
                    fromField.setText("");
                    phoneField.setText("");
                    dateField.setText("");
                    ageField.setText("");
                    emailField.setText("");
                }
            });


            JButton submit = new JButton("Submit");
            submit.setBounds(290,450,150,50);
            submit.setBorder(new LineBorder(Color.WHITE,2));
            frame.add(submit);
//            frame.getContentPane().setBackground(new Color(160, 186, 241));
        frame.getContentPane().setBackground(new Color(144, 220, 195, 255));

        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  username= "root";
                String password ="";
                String url ="jdbc:mysql://localhost:3307/railwayto";

                try {
                    Connection connection=DriverManager.getConnection(url,username,password);
                    System.out.println("database is connected");

                    String a1= nameField.getText();
                    String a2= lastField.getText();
                    String a3=journeyField.getText();
                    String a4=fromField.getText();
                    String a5=phoneField.getText();
                    String a6=dateField.getText();
                    int a7= Integer.parseInt(ageField.getText());
                    String a8=emailField.getText();

                    String str="";
                    if (ab.isSelected()){
                        str="male";
                    }else if (bb.isSelected()){
                        str="female";
                    } else if (cb.isSelected()) {
                        str="other";
                    }
                    String data = (String) abc.getItemAt(abc.getSelectedIndex());

//                    frame.getContentPane().setBackground(new Color(160, 186, 241));



                    String query="insert into railwaytable (FullName,TrainNo,JourneyFrom,JourneyTo,Travel,PhoneNo,JourneyDate,Age,Gender,Emailid)"+" values (?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement sql = connection.prepareStatement(query);

                    sql.setString(1, a1);
                    sql.setString(2, a2);
                    sql.setString(3, a3);
                    sql.setString(4, a4);
                    sql.setString(5,data );
                    sql.setString(6, a5);
                    sql.setString(7, a6);
                    sql.setInt(8, a7);
                    sql.setString(9, str);
                    sql.setString(10, a8);
                    sql.executeUpdate();





                } catch (SQLException ex) {
                    throw new RuntimeException("not connected"+ex);
                }

            }
        });




    }
}

