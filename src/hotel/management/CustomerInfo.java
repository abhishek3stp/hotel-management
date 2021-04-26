/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Ashirbad
 */
public class CustomerInfo extends JFrame {

    Connection conn = null;
    private JPanel contentPane;
    private JLabel l_id;
    private JLabel l_id_type;
    private JLabel l_id_number;
    private JLabel lNewLabel;
    private JLabel lGender;
    private JTable table;
    private JLabel lCountry;
    private JLabel lRoom;
    private JLabel lStatus;
    private JLabel lNewLabel_1;

    /**
     * Launch the application.
     */

    public void close() {
        this.dispose();
    }

    /**
     * Create the frame.
     *
     * @throws SQLException
     */
    public CustomerInfo(Reception parent) throws SQLException {
        //conn = Javaconnect.getDBConnection();
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 180, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                dispose();
            }
        });
        btnExit.setBounds(450, 510, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    conn c = new conn();

                    String displayCustomersql = "select * from Customer";
                    ResultSet rs = c.s.executeQuery(displayCustomersql);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        btnLoadData.setBounds(300, 510, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
        contentPane.add(btnLoadData);

        l_id = new JLabel("________________ID_______________");
        l_id.setBounds(10, 10, 300, 14);
        contentPane.add(l_id);

        l_id_type = new JLabel("TYPE");
        l_id_type.setBounds(31, 26, 46, 14);
        contentPane.add(l_id_type);

        l_id_number = new JLabel("Number");
        l_id_number.setBounds(150, 26, 46, 14);
        contentPane.add(l_id_number);

        lNewLabel = new JLabel("Name");
        lNewLabel.setBounds(270, 26, 65, 14);
        contentPane.add(lNewLabel);

        lGender = new JLabel("Gender");
        lGender.setBounds(360, 26, 46, 14);
        contentPane.add(lGender);

        table = new JTable();
        table.setBounds(0, 56, 900, 450);
        contentPane.add(table);

        lCountry = new JLabel("Country");
        lCountry.setBounds(480, 26, 46, 14);
        contentPane.add(lCountry);

        lRoom = new JLabel("Room");
        lRoom.setBounds(600, 26, 46, 14);
        contentPane.add(lRoom);

        lStatus = new JLabel("Check-in Status");
        lStatus.setBounds(680, 26, 100, 14);
        contentPane.add(lStatus);

        lNewLabel_1 = new JLabel("Deposit");
        lNewLabel_1.setBounds(800, 26, 100, 14);
        contentPane.add(lNewLabel_1);

        getContentPane().setBackground(Color.WHITE);
    }
}
