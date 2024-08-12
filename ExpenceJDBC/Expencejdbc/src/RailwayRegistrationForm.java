import javax.swing.*;
import javax.swing.text.PlainView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.chrono.JapaneseDate;
import java.util.jar.JarOutputStream;

public class RailwayRegistrationForm {
    public static void main(String[]args){
        String  username= "root";
        String password ="";
        String url ="jdbc:mysql://localhost:3307/railwaydb";
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("database is connected");

            JFrame frame= new JFrame("Railway Registration Form");

            JLabel form = new JLabel("Railway Registration Form");
              form.setBounds(200,18,300,60);
             form.setFont(new Font("arial",Font.PLAIN ,25));
              form.setForeground(Color.BLUE);
              frame.add(form);

            JLabel name = new JLabel("Enter a Full Name:-");
            name.setBounds(130,80,200,30);
            JTextField nameField = new JTextField();
            nameField.setBounds(250,80,150,30);
            frame.add(nameField);
            frame.add(name);


            JLabel last = new JLabel("Enter a Train N0./Name:-");
            last.setBounds(100,120,230,30);
            JTextField lastField = new JTextField();
            lastField.setBounds(250,120,150,30);
            frame.add(lastField);
            frame.add(last);


        JLabel journey= new JLabel("Journey From:-");
        journey.setBounds(150,160,100,30);
        JTextField journeyField = new JTextField();
        journeyField.setBounds(250,160,150,30);
        frame.add(journeyField);
        frame.add(journey);


        JLabel from = new JLabel("Journey To:-");
        from.setBounds(420,160,100,30);
        JTextField fromField = new JTextField();
        fromField.setBounds(500,160,150,30);
        frame.add(fromField);
        frame.add(from);


        JLabel travel = new JLabel("Travel Choose:-");
        travel.setBounds(140,200,100,30);
        JTextField travelField = new JTextField();
        String values[] ={"FirstClass(AC)","SecondClass(AC)","ThirdClass(AC)","General"};
        JComboBox abc=new JComboBox(values);
        abc.setBounds(250,200,150,30);
        frame.add(abc);
        abc.setSelectedItem(values);


//        travelField.setBounds(250,200,150,30);
        frame.add(travelField);
        frame.add(travel);


        JLabel phone = new JLabel("Phone Number:-");
        phone.setBounds(140,240,100,30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(250,240,150,30);
        frame.add(phoneField);
        frame.add(phone);



        JLabel date = new JLabel("Joureny Date:-");
        date.setBounds(140,280,100,30);
        JTextField dateField = new JTextField();
        dateField.setBounds(250,280,150,30);
        frame.add(dateField);
        frame.add(date);



        JLabel age = new JLabel("Age:-");
        age.setBounds(190,320,100,30);
        JTextField ageField = new JTextField();
        ageField.setBounds(250,320,150,30);
        frame.add(ageField);
        frame.add(age);


        JLabel gender = new JLabel("Gender:-");
        gender.setBounds(130,355,120,30);
        JTextField genderField = new JTextField();
        JCheckBox cb= new JCheckBox("Male");
        JCheckBox ab= new JCheckBox("Female");
        JCheckBox bb= new JCheckBox("Other");
        cb.setBounds(200,360,70,20);
        ab.setBounds(300,360,70,20);
        bb.setBounds(400,360,70,20);
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
        emailField.setBounds(250,400,150,30);
        frame.add(emailField);
        frame.add(email);


        JButton reset = new JButton("Reset");
        reset.setBounds(130,450,150,50);
        frame.add(reset);


        JButton submit = new JButton("Submit");
        submit.setBounds(290,450,150,50);
        frame.add(submit);



        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(abc.getSelectedItem());
                String insert = " insert into railwaytd (Name,TrainNo/Name,JourneyFrom,JourneyTo,TravelChoose,PhoneNo.,JourneyDate,Age,Gender,Email.Id)  values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement sql = null;

                try {


                    sql = con.prepareStatement(insert);
                    sql.setString(1, nameField.getText());
                    sql.setString(2, lastField.getText());
                    sql.setString(3, journeyField.getText());
                    sql.setString(4, fromField.getText());
                    sql.setString(5, travelField.getText());
                    sql.setString(6, phoneField.getText());
                    sql.setString(7, dateField.getText());
                    sql.setString(8, ageField.getText());
//                   sql.setString(9, ab.getSelectedItem());
                    sql.setString(10, emailField.getText());
                    sql.executeUpdate();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        frame.setSize(700,700);
            frame.setLayout(null);
            frame.setVisible(true);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
