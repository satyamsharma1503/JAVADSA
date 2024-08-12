import com.mysql.cj.protocol.AbstractProtocol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ExpenceManger {
    static String username="root";
    static String password="";
    static String url =("jdbc:mysql://localhost:3307/expencedb");
    static  Connection conn;
     static  JTextField incomeamounts,expenscetypetextfeild,expensceamountTextField;
    public static void main(String[] args){
//        String username="root";
//        String password="";
//        String url =("jdbc:mysql://localhost:3307/expencedb");



        try {
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("DataBase is Connected");

            // design java ui frame for expence calculator

            JFrame frame = new JFrame("Expence Calcultor");
            JLabel income = new JLabel("Expencese");
            income.setBounds(200,18,70,30);
            income.setForeground(Color.black);
            frame.add(income);


            JLabel expencetype = new JLabel("Enter  Expence Type");
           expencetype.setBounds(30,50,150,50);
             expenscetypetextfeild= new JTextField();
            expencetype.setForeground(Color.red);
           frame.add(expencetype);
            expenscetypetextfeild.setBounds(180,60,100,30);
            frame.add(expenscetypetextfeild);




            JLabel expenceamount = new JLabel("Enter Expence Amount ");
            expenceamount.setBounds(30,100,150,50);
            expensceamountTextField= new JTextField();
            expenceamount.setForeground(Color.red);
            frame.add(expenceamount);
            expensceamountTextField.setBounds(180,110,100,30);
            frame.add(expensceamountTextField);


            JLabel incomeamount = new JLabel("Enter Income  Amount ");
            incomeamount.setBounds(30,150,150,50);
            incomeamount.setForeground(Color.red);
            incomeamounts= new JTextField();
            frame.add(incomeamount);
            incomeamounts.setBounds(180,160,100,30);
            frame.add(incomeamounts);


            JButton clearButton = new JButton("clear ");
            clearButton.setBounds(70,220,100,40);
            frame.add(clearButton);

            JButton saveButton = new JButton("Save ");
            saveButton.setBounds(190,220,100,40);
            frame.add(saveButton);

            JButton deleteButton = new JButton("Delete");
            deleteButton.setBounds(310,220,100,40);
            frame.add(deleteButton);
            //to click save button


            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(saveButton.isVisible()) {
                        incomeamount.setVisible(false);
                        incomeamounts.setVisible(false);
                        expenceamount.setVisible(false);
                        expencetype.setVisible(false);
                        expenscetypetextfeild.setVisible(false);
                        expensceamountTextField.setVisible(false);
                        saveButton.setVisible(false);
                        income.setText("enter id to delete field");
                        JTextField deleteField = new JTextField();
                        deleteField.setBounds(50, 60, 100, 40);
                        frame.add(deleteField);
                    }

//                    else {
//                        String deleteQuery = "delete * from expencetb where id = ?";
//                        try {
//                            PreparedStatement ps = conn.prepareStatement(deleteQuery);
//                            ps.setInt(1, Integer.parseInt(deleteQuery.getText()));
//                            ResultSet rs = ps.executeQuery();
//                        }
//                    }
//                    catch (SQLException ex) {
//                            throw new RuntimeException(ex);
//                        }
                    }
            });
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

//                    insert the data into database
//                    insertExpencedb();

                    String insert =" insert into expencetb (incomeamount,expencetype,expenceamount)"
                            + " values (?,?,?)";
                    PreparedStatement ps = null;
                    try {
                        ps = conn.prepareStatement(insert);
                        ps.setInt(1, Integer.parseInt(incomeamounts.getText()));
                        ps.setString(2,expenscetypetextfeild.getText());
                        ps.setInt(3, Integer.parseInt(expensceamountTextField.getText()));
                        ps.executeUpdate();


//                         to
                        JOptionPane.showMessageDialog( null, "record has been added");


//                        JButton clear = new JButton("clear");

//                        to clear the form after submit data to mysql
                       clearForm();

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


                }
            });

            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clearForm();

                }
            });
            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);


//            // to insert data into table
//            String insert =" insert into expencetb (incomeamount,expencetype,expenceamount)"
//                    + " values (?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setInt(1,500);
//            ps.setString(2,"travel");
//            ps.setInt(3,250);
//            ps.executeUpdate();

//to pass data submission respose







        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void clearForm() {
        incomeamounts.setText("");
        expenscetypetextfeild.setText("");
        expensceamountTextField.setText("");
    }
}
