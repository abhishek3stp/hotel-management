package hotel.management;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class HotelManagement extends JFrame {

    HotelManagement() {
        setBounds(100, 100, 1365, 721);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/icons/first.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1365, 721);
        add(l1);

        JLabel l2 = new JLabel("Hotel Management App");
        l2.setBounds(20, 550, 1000, 90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 60));
        l1.add(l2);
        
        JButton b1 = new JButton("NEXT");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1100, 575, 150, 50);
        l1.add(b1);

        setLayout(null);
        setVisible(true);

        while (true) {
            l2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            l2.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        new HotelManagement();
    }

}
