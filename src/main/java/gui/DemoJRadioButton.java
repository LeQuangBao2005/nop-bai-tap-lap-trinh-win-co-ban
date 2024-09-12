/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class DemoJRadioButton extends JFrame {

    private JLabel lbNum1, lbNum2, lbOp, lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btAdd, btSub, btMul, btDiv;

    public class DemoJRadioButton extends JFrame {

        private JLabel lbNum1, lbNum2, lbOp, lbResult;
        private JTextField txtNum1, txtNum2, txtResult;
        private JButton btTinh, btNhapLai;
        private JRadioButton rdCong, rdTru, rdNhan, rdChia;

        public DemoJRadioButton(String title) {
            super(title);
            createGUI();
            setSize(400, 250);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }

        private void createGUI() {
            JPanel p = new JPanel();
            p.setLayout(new GridLayout(5, 2, 10, 10));

            p.add(lbNum1 = new JLabel("Num 1"));
            p.add(txtNum1 = new JTextField(10));

            p.add(lbNum2 = new JLabel("Num 2"));
            p.add(txtNum2 = new JTextField(10));

            JPanel pPhepTinh = new JPanel();
            pPhepTinh.add(rCong = new JRadioButton("+"));
            pPhepTinh.add(rTru = new JRadioButton("_"));
            pPhepTinh.add(rNhan = new JRadioButton("*"));
            pPhepTinh.add(rChia = new JRadioButton("/"));

            p.add(lbOp = new JLabel("Phép Tính"));
            p.add(pPhepTinh);

            p.add(lbResult = new JLabel("Result"));
            p.add(txtResult = new JTextField(10));
            txtNum1.setEditable(false);

            p.add(btAdd = new JButton("Add"));
            p.add(btSub = new JButton("Sub"));
            p.add(btMul = new JButton("Mul"));
            p.add(btDiv = new JButton("Div"));

            lbNum1.setBounds(10, 10, 100, 30);
            txtNum1.setBounds(120, 10, 200, 30);

            lbNum1.setBounds(10, 50, 100, 30);
            txtNum1.setBounds(120, 50, 200, 30);

        }
    }
}
