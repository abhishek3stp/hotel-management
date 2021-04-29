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
        JButton b_reception, b_admin, b_log_out;
        JPanel container;
        
        
        
//        To set the image..
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/icons/nalanda.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

//        Heading at the top..
        JLabel l_welcome = new JLabel("The Hotel Nalanda Welcomes You");
        l_welcome.setForeground(Color.BLACK);
        l_welcome.setFont(new Font("Tahoma", Font.PLAIN, 46));
        l_welcome.setBounds(400, 60, 1000, 85);
        NewLabel.add(l_welcome);   
        
        
        if(admin != 1)
        {
           
        JLabel UserWelcome = new JLabel("Welcome " + username);
        UserWelcome.setForeground(Color.RED);
        UserWelcome.setFont(new Font("Tahoma", Font.PLAIN, 24));
        UserWelcome.setBounds(580, 480, 1000, 85);
        NewLabel.add(UserWelcome);
        }
        else{
          
        JLabel UserWelcome = new JLabel("Welcome " + username + " (Admin)");
        UserWelcome.setForeground(Color.RED);
        UserWelcome.setFont(new Font("Tahoma", Font.PLAIN, 24));
        UserWelcome.setBounds(640, 480, 1000, 85);
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
                new Admin(curr,username);
            }
        });
        container.add(b_reception);      
        container.add(b_admin);

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
