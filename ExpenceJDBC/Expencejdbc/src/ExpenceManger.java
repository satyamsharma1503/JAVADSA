import com.mysql.cj.protocol.AbstractProtocol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenceManger {
    public static void main(String[] args){
        String username="root";
        String password="";
        String url ="jdbc:mysql://localhost:3307/expencedb";
        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("DataBase is Connected");

            // design java ui frame for expence calculator

            JFrame frame = new JFrame("Expence Calcultor");
            JLabel income = new JLabel("Expencese");
            income.setBounds(200,18,70,30);
            income.setForeground(Color.black);
            frame.add(income);


            JLabel expencetype = new JLabel("Enter  Expence Type");
           expencetype.setBounds(30,50,150,50);
            JTextField expenscetypetextfeild= new JTextField();
            expencetype.setForeground(Color.red);
           frame.add(expencetype);
            expenscetypetextfeild.setBounds(180,60,100,30);
            frame.add(expenscetypetextfeild);




            JLabel expenceamount = new JLabel("Enter Expence Amount ");
            expenceamount.setBounds(30,100,150,50);
            JTextField expensceamountTextField= new JTextField();
            expenceamount.setForeground(Color.red);
            frame.add(expenceamount);
            expensceamountTextField.setBounds(180,110,100,30);
            frame.add(expensceamountTextField);


            JLabel incomeamount = new JLabel("Enter Income  Amount ");
            incomeamount.setBounds(30,150,150,50);
            JTextField incomeamounts= new JTextField();
            incomeamount.setForeground(Color.red);
            frame.add(incomeamount);
            incomeamounts.setBounds(180,160,100,30);
            frame.add(incomeamounts);


            JButton saveButton = new JButton("Save ");
            saveButton.setBounds(180,220,100,40);
            frame.add(saveButton);

            //to click save button
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert =" insert into expencetb (incomeamount,expencetype,expenceamount)"
                            + " values (?,?,?)";
                    PreparedStatement ps = null;
                    try {
                        ps = conn.prepareStatement(insert);
                        ps.setInt(1, Integer.parseInt(incomeamounts.getText()));
                        ps.setString(2,expenscetypetextfeild.getText());
                        ps.setInt(3, Integer.parseInt(expensceamountTextField.getText()));
                        ps.executeUpdate();


                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }


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


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
