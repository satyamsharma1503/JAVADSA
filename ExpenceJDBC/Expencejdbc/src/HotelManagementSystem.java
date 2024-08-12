import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class HotelManagementSystem {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3307/railwaydb";
//        try {
//            Connection con = DriverManager.getConnection(url,username,password);
//            System.out.println("database is connected");

            JFrame frame = new JFrame("Hotel Management System");


            JLabel form = new JLabel("Hotel Management System");
            form.setBounds(160,15,300,60);
            form.setFont(new Font("arial",Font.PLAIN ,25));
            form.setForeground(Color.black);
            frame.add(form);

        JLabel name = new JLabel("FullName:-");
        name.setBounds(20,80,100,30);
        JTextField nameField = new JTextField();
        nameField.setBounds(110,80,140,30);
        frame.add(nameField);
        frame.add(name);

        JLabel room = new JLabel("your choice:-");
        room.setBounds(300,80,100,30);
//        JTextField roomField = new JTextField();
        String values[] = {"roomtype", "AC", "Non-AC"};
        JComboBox roomField = new JComboBox(values);
        roomField.setBounds(400,80,150,30);
        frame.add(roomField);
        frame.add(room);


        JLabel dob = new JLabel("Date-of-Birth:-");
        dob.setBounds(20,120,100,30);
        JTextField dobField = new JTextField();
        dobField.setBounds(110,120,140,30);
        dob.add(dobField);
        frame.add(dobField);
//        dob.setForeground(Color.BLUE);
        frame.add(dob);

        JLabel floor = new JLabel("which floor:-");
        floor.setBounds(300,120,100,30);
//        JTextField roomField = new JTextField();
        String value[] = {"Ground","1st", "2nd", "3rd","4th","5th"};
        JComboBox floorField = new JComboBox(value);
        floorField.setBounds(400,120,150,30);
        frame.add(floorField);
        frame.add(floor);


        JLabel gender = new JLabel("Gender:-");
        gender.setBounds(20,160,120,30);
//        JTextField genderField = new JTextField();
        String valueg[] = {"Male","Female", "Other"};
        JComboBox genderField = new JComboBox(valueg);
        genderField.setBounds(110,160,140,30);
        JCheckBox cb= new JCheckBox("Male");
        JCheckBox ab= new JCheckBox("Female");
        JCheckBox bb= new JCheckBox("Other");
        cb.setBounds(110,166,70,20);
        ab.setBounds(210,166,70,20);
        bb.setBounds(310,166,70,20);
        frame.add(cb);
        frame.add(ab);
        frame.add(bb);
        frame.add(gender);
        frame.add(genderField);

        JLabel entry = new JLabel("Entry Date:-");
        entry.setBounds(300,160,100,30);
        JTextField entryField = new JTextField();
        entryField.setBounds(400,160,150,30);
        frame.add(entryField);
        frame.add(entry);


        JLabel phone = new JLabel("Phone No:-");
        phone.setBounds(20,200,120,30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(110,200,140,30);
        frame.add(phone);
        frame.add(phoneField);

        JLabel deperture = new JLabel("Deperture Date:-");
        deperture.setBounds(300,200,100,30);
        JTextField depertureField = new JTextField();
        depertureField.setBounds(400,200,150,30);
        frame.add(depertureField);
        frame.add(deperture);

        JLabel email = new JLabel("Email id:-");
        email.setBounds(20,240,120,30);
        JTextField emailField = new JTextField();
        emailField.setBounds(110,240,140,30);
        frame.add(email);
        frame.add(emailField);

        JLabel addhar = new JLabel("Addhar No:-");
        addhar.setBounds(300,240,100,30);
        JTextField addharField = new JTextField();
        addharField.setBounds(400,240,150,30);
        frame.add(addhar);
        frame.add(addharField);

//         JButtond=foodFiel new JButton("foodmenu");
//        foodField.setBounds(300,240,250,30);
//        frame.add(foodField);


        JLabel address = new JLabel("Address:-");
        address.setBounds(20,280,120,30);
//        address.setForeground(Color.white);
        JTextField addressField = new JTextField();
        addressField.setBounds(110,280,445,30);
        addressField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(address);
        frame.add(addressField);


        JTextField addressfield1=new JTextField("District");
        addressfield1.setBounds(110,320,130,30);
        frame.add(addressfield1);

        JTextField statefield=new JTextField("State Name");
        statefield.setBounds(270,320,130,30);
        frame.add(statefield);

        JTextField pinfield=new JTextField("PIN Code");
        pinfield.setBounds(427,320,130,30);
        frame.add(pinfield);


        JButton calculate = new JButton("Calculate Bill");
        calculate.setBounds(180,380,250,30);
        frame.add(calculate);


        JButton reservation = new JButton("New Reservation");
        reservation.setBounds(50,450,220,30);
        frame.add(reservation);

//        300,450,220,30
        JButton editreservation = new JButton("Edit Reservation");
        editreservation.setBounds( 300,450,220,30);
        frame.add(editreservation);


        JButton submit = new JButton("Submit");
        submit.setBounds( 300,500,220,30);
        frame.add(submit);

        frame.getContentPane().setBackground(new Color(160, 186, 241));


        frame.setSize(600,600);
            frame.setLayout(null);
            frame.setVisible(true);

//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }


    }
}