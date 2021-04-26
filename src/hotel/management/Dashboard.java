package hotel.management;

import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public Dashboard(Login parent, String username, int admin) {
        super("HOTEL MANAGEMENT APP");
        Dashboard curr = this;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setForeground(Color.CYAN);
        setLayout(null);
        JButton b_reception, b_admin,b_close,b_add_room, b_add_emp, b_add_driver;
        JPanel container;
        
        
        
//        To set the image..
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/icons/nalanda.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

//        Heading at the top..
        JLabel AirlineManagementSystem = new JLabel("The Hotel Nalanda Welcomes You");
        AirlineManagementSystem.setForeground(Color.BLACK);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        AirlineManagementSystem.setBounds(400, 60, 1000, 85);
        NewLabel.add(AirlineManagementSystem);   
        
        
        if(admin != 1)
        {
           
        JLabel UserWelcome = new JLabel("Welcome " + username + "  (Privialge: Receptionist)");
        UserWelcome.setForeground(Color.RED);
        UserWelcome.setFont(new Font("Tahoma", Font.PLAIN, 24));
        UserWelcome.setBounds(580, 480, 1000, 85);
        NewLabel.add(UserWelcome);
        }
        else{
          
        JLabel UserWelcome = new JLabel("Welcome " + username + "  (Privilage: Admin)");
        UserWelcome.setForeground(Color.RED);
        UserWelcome.setFont(new Font("Tahoma", Font.PLAIN, 24));
        UserWelcome.setBounds(580, 480, 1000, 85);
        NewLabel.add(UserWelcome);
        }
        
        
        
       
        
        
        
        container = new JPanel();
        container.setBackground(Color.WHITE);
        container.setLayout(null);
        container.setBounds(470, 460, 580, 200);
        NewLabel.add(container);
        
        
        
        b_reception = new JButton("RECEPTION");
        b_reception.setBounds(100, 120, 160, 40);
        b_reception.setFont(new Font("Tahoma", Font.BOLD, 15));
        b_reception.setBackground(Color.BLACK);
        b_reception.setForeground(Color.WHITE);
        b_reception.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Reception(curr,parent);
            }
        });
        container.add(b_reception);


        b_add_emp = new JButton("ADD EMPLOYEE");
        b_add_emp.setBounds(20, 120, 160, 40);
        b_add_emp.setFont(new Font("Tahoma", Font.BOLD, 15));
        b_add_emp.setBackground(Color.BLACK);
        b_add_emp.setForeground(Color.WHITE);
        b_add_emp.setVisible(false);
        b_add_emp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddEmployee().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
        container.add(b_add_emp);
        
        b_add_room = new JButton("ADD ROOMS");
        b_add_room.setBounds(190, 120, 140, 40);
        b_add_room.setFont(new Font("Tahoma", Font.BOLD, 15));
        b_add_room.setBackground(Color.BLACK);
        b_add_room.setForeground(Color.WHITE);
        b_add_room.setVisible(false);
        b_add_room.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddRoom().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
        container.add(b_add_room);

        b_add_driver = new JButton("ADD DRIVERS");
        b_add_driver.setBounds(340, 120, 150, 40);
        b_add_driver.setFont(new Font("Tahoma", Font.BOLD, 15));
        b_add_driver.setBackground(Color.BLACK);
        b_add_driver.setForeground(Color.WHITE);
        b_add_driver.setVisible(false);
        b_add_driver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddDrivers().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
        container.add(b_add_driver);
        
        b_close = new JButton("x");
        b_close.setBounds(500, 120, 50, 40);
        b_close.setFont(new Font("Tahoma", Font.PLAIN, 25));
        b_close.setBackground(Color.BLACK);
        b_close.setForeground(Color.WHITE);
        b_close.setVisible(false);
        
        
         b_admin = new JButton("ADMIN");
        b_admin.setBounds(320, 120, 160, 40);
        b_admin.setFont(new Font("Tahoma", Font.BOLD, 15));
        b_admin.setBackground(Color.BLACK);
        b_admin.setForeground(Color.WHITE);

        if(admin != 1)
        {
            b_admin.setEnabled(false);
        }
        else{
            b_admin.setEnabled(true);
        }
       
        b_admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                b_reception.setVisible(false);
                b_admin.setVisible(false);
                b_add_emp.setVisible(true);
                b_add_room.setVisible(true);
                b_add_driver.setVisible(true);
                b_close.setVisible(true);
            }
        });        
        
        

        b_close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                b_reception.setVisible(true);
                b_admin.setVisible(true);
                b_add_emp.setVisible(false);
                b_add_room.setVisible(false);
                b_add_driver.setVisible(false);
                b_close.setVisible(false);
            }
        });
        


        container.add(b_admin);
        container.add(b_close);

        setSize(1950, 1090);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        //new Dashboard().setVisible(true);
    }

    Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
