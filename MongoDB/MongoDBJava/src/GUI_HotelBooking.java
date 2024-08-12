import com.mongodb.client.MongoClients;
import org.bson.Document;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.Executor;


public class GUI_HotelBooking {
    public static void main(String[]args){

                JFrame frame = new JFrame("Hotel Management System");


                JLabel form = new JLabel("Hotel Booking Form ");
                form.setBounds(160,15,300,60);
                form.setFont(new Font("arial",Font.PLAIN ,25));
                form.setForeground(Color.black);
                frame.add(form);

                JLabel name = new JLabel("FullName:-");
                name.setBounds(20,80,100,30);
                JTextField nameField = new JTextField();
                nameField.setBounds(110,80,140,30);
                nameField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(nameField);
                frame.add(name);

                JLabel room = new JLabel("Your Choice:-");
                room.setBounds(300,80,100,30);
//        JTextField roomField = new JTextField();
                String values[] = {"RoomPrefernce", "AC", "Non-AC"};
                JComboBox roomField = new JComboBox(values);
                roomField.setBounds(400,80,150,30);
                roomField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(roomField);
                frame.add(room);


                JLabel dob = new JLabel("Date-of-Birth:-");
                dob.setBounds(20,120,100,30);
                JTextField dobField = new JTextField();
                dobField .setBorder(new LineBorder(Color.WHITE,2));
                dobField.setBounds(110,120,140,30);
                dob.add(dobField);
                frame.add(dobField);
                frame.add(dob);

                JLabel floor = new JLabel("Which floor:-");
                floor.setBounds(300,120,100,30);
                String value[] = {"Ground","1st", "2nd", "3rd","4th","5th"};
                JComboBox floorField = new JComboBox(value);
                floorField.setBounds(400,120,150,30);
                floorField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(floorField);
                frame.add(floor);


                JLabel gender = new JLabel("Gender:-");
                gender.setBounds(20,160,120,30);
                String valueg[] = {"Male","Female", "Other"};
                JComboBox genderField = new JComboBox(valueg);
                genderField.setBounds(110,160,140,30);
                genderField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(gender);
                frame.add(genderField);

                JLabel entry = new JLabel("CheckInDate:-");
                entry.setBounds(300,160,100,30);
                JTextField entryField = new JTextField();
                entryField .setBorder(new LineBorder(Color.WHITE,2));
                entryField.setBounds(400,160,150,30);
                frame.add(entryField);
                frame.add(entry);


                JLabel phone = new JLabel("Phone No:-");
                phone.setBounds(20,200,120,30);
                JTextField phoneField = new JTextField();
                phoneField .setBorder(new LineBorder(Color.WHITE,2));
                phoneField.setBounds(110,200,140,30);
                frame.add(phone);
                frame.add(phoneField);

                JLabel deperture = new JLabel("CheckOutDate:-");
                deperture.setBounds(300,200,100,30);
                JTextField depertureField = new JTextField();
                depertureField.setBounds(400,200,150,30);
                depertureField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(depertureField);
                frame.add(deperture);

                JLabel email = new JLabel("Email id:-");
                email.setBounds(20,240,120,30);
                JTextField emailField = new JTextField();
                emailField.setBounds(110,240,140,30);
                emailField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(email);
                frame.add(emailField);

                JLabel addhar = new JLabel("Addhar No:-");
                addhar.setBounds(300,240,100,30);
                JTextField addharField = new JTextField();
                addharField.setBounds(400,240,150,30);
                addharField .setBorder(new LineBorder(Color.WHITE,2));
                frame.add(addhar);
                frame.add(addharField);

        JLabel adults = new JLabel("No. of Adults:-");
        adults.setBounds(20,280,120,30);
//        JTextField adultsField = new JTextField();
        String adult[] = {"0","1", "2","3","4","5","6","7","8","9"};
        JComboBox adultsField = new JComboBox(adult);
        adultsField.setBounds(110,280,140,30);
        adultsField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(adults);
        frame.add(adultsField);


        JLabel children = new JLabel("No. of Children:-");
        children.setBounds(300,280,120,30);
//        JTextField adultsField = new JTextField();
        String child[] = {"0","1", "2","3","4","5","6","7","8","9"};
        JComboBox childField = new JComboBox(child);
        childField.setBounds(400,280,150,30);
        childField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(children);
        frame.add(childField);

                JLabel address = new JLabel("Address:-");
                address.setBounds(20,320,120,30);
                JTextField addressField = new JTextField();
                addressField.setBounds(110,320,140,30);
                addressField.setBorder(new LineBorder(Color.WHITE,2));
                frame.add(address);
                frame.add(addressField);


        JLabel city = new JLabel("City  :-");
        city.setBounds(320,320,80,30);
        JTextField cityField = new JTextField();
        cityField.setBounds(400,320,150,30);
        cityField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(city);
        frame.add(cityField);


        JLabel state = new JLabel("State:-");
        state.setBounds(20,360,70,30);
        JTextField stateField = new JTextField();
        stateField.setBounds(110,360,140,30);
        stateField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(state);
        frame.add(stateField);

        JLabel pin = new JLabel("PIN Code:-");
        pin.setBounds(320,360,70,30);
        JTextField pinField = new JTextField();
        pinField.setBounds(400,360,150,30);
        pinField.setBorder(new LineBorder(Color.WHITE,2));
        frame.add(pin);
        frame.add(pinField);


        JLabel meal = new JLabel("Meal:-");
        meal.setBounds(20,400,50,30);
        JCheckBox ab= new JCheckBox("YES");
        JCheckBox bb= new JCheckBox("NO");
        ab.setBounds(120,400,50,30);
        bb.setBounds(200,400,50,30);
        frame.add(ab);
        frame.add(bb);
        frame.add(meal);



                JButton reservation = new JButton("New Reservation");
                reservation.setBounds(50,450,200,50);
                frame.add(reservation);

                JButton submit = new JButton("Submit");
                submit.setBounds( 300,450,200,50);
                frame.add(submit);
                
                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        var client = MongoClients.create("mongodb://localhost:27017/");
                        var database = client.getDatabase("HotelBookingForm");
                        var bookingCollection = database.getCollection("bookingCollection");
                        database.createCollection("bookingCollection");
                        var  bookingDocument = new Document();
                        String str="";
                        if (ab.isSelected()){
                            str="YES";
                        }else if (bb.isSelected()){
                            str="NO";
                        }
                        String abc = (String) floorField.getItemAt(floorField.getSelectedIndex());
                        String number = (String) adultsField.getItemAt(adultsField.getSelectedIndex());
                        String childrens = (String) childField.getItemAt(childField.getSelectedIndex());
                        String bc = (String) roomField.getItemAt(roomField.getSelectedIndex());
                        String data = (String) genderField.getItemAt(genderField.getSelectedIndex());



                        Random random = new Random();
                         int  no = random.nextInt( 999999);
                         bookingDocument.append("bookingID",random.nextInt( 999999));
                         bookingDocument.append("FullName",nameField.getText());
                         bookingDocument.append("DOB",dobField.getText());
                         bookingDocument.append("Gender",data);
                         bookingDocument.append("PhoneNo",phoneField.getText());
                         bookingDocument.append("Emailid",emailField.getText());
                        bookingDocument.append("NoOfAdults",number);
                        bookingDocument.append("NoOfChildren",childrens);
                        bookingDocument.append("RoomPreference",bc);
                         bookingDocument.append("WhichFloor",abc);
                         bookingDocument.append("CheckInDate",entryField.getText());
                         bookingDocument.append("CheckOutDate",depertureField.getText());
                         bookingDocument.append("AddharNo",addharField.getText());
                         bookingDocument.append("Address",addressField.getText());
                        bookingDocument.append("City",cityField.getText());
                        bookingDocument.append("StateName",stateField.getText());
                        bookingDocument.append("PinCode",pinField.getText());
                        bookingDocument.append("Meal",str);
                         bookingCollection.insertOne(bookingDocument);

                        JOptionPane.showMessageDialog( null, "record has been added");


                    }
                });



        reservation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nameField.setText("");
                dobField.setText("");
                phoneField.setText("");
               emailField.setText("");
               entryField.setText("");
               depertureField.setText("");
               addharField.setText("");
               addressField.setText("");
               cityField.setText("");
               stateField.setText("");
               pinField.setText("");

            }
        });

                frame.getContentPane().setBackground(new Color(160, 186, 241));


                frame.setSize(600,600);
                frame.setLayout(null);
                frame.setVisible(true);
    }
}
