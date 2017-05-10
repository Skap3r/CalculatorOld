/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author atifk
 */
public class CalculatorGUI implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
    private JFrame f;
    private JTextField tf1, tf2;
    private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jbAdd, 
        jbSub, jbMultiply, jbDiv, jbDot, jbEquals, jbAddTemp, jbReset, 
        jbAddHundred, tempButton; 
    public String tempStr;
    
    CalculatorGUI() {
        this.tempStr = "";
        f = new JFrame("Dentaku");

        tf1 = new JTextField();
        tf1.setText("0");
        tf1.setBounds(6, 6, 198, 50);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf1.setEditable(false);
        f.add(tf1);
        tf1.setFont(new Font("#GungSeo", Font.BOLD, 15));

        jb0 = new JButton("0");
        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        jbAdd = new JButton("+");
        jbSub = new JButton("-");
        jbMultiply = new JButton("*");
        jbDiv = new JButton("/");
        jbDot = new JButton(".");
        jbEquals = new JButton("=");
        jbReset = new JButton("C");
        jbAddHundred = new JButton("<<");
        jbAddTemp = new JButton();

        jb0.setFont(new Font("Arial", Font.PLAIN, 15));
        jb1.setFont(new Font("Arial", Font.PLAIN, 15));
        jb2.setFont(new Font("Arial", Font.PLAIN, 15));
        jb3.setFont(new Font("Arial", Font.PLAIN, 15));
        jb4.setFont(new Font("Arial", Font.PLAIN, 15));
        jb5.setFont(new Font("Arial", Font.PLAIN, 15));
        jb6.setFont(new Font("Arial", Font.PLAIN, 15));
        jb7.setFont(new Font("Arial", Font.PLAIN, 15));
        jb8.setFont(new Font("Arial", Font.PLAIN, 15));
        jb9.setFont(new Font("Arial", Font.PLAIN, 15));
        jbAdd.setFont(new Font("Arial", Font.PLAIN, 15));
        jbSub.setFont(new Font("Arial", Font.PLAIN, 15));
        jbMultiply.setFont(new Font("Arial", Font.PLAIN, 15));
        jbDiv.setFont(new Font("Arial", Font.PLAIN, 15));
        jbDot.setFont(new Font("Arial", Font.PLAIN, 15));
        jbEquals.setFont(new Font("Arial", Font.PLAIN, 15));
        jbReset.setFont(new Font("Arial", Font.PLAIN, 15));
        jbAddHundred.setFont(new Font("Arial", Font.PLAIN, 15));
        jbAddTemp.setFont(new Font("Arial", Font.PLAIN, 15));

        jb7.setBounds(6, 62, 45, 45);
        f.add(jb7);
        jb8.setBounds(57, 62, 45, 45);
        f.add(jb8);
        jb9.setBounds(108, 62, 45, 45);
        f.add(jb9);
        jbDiv.setBounds(159, 62, 45, 45);
        f.add(jbDiv);
        jb4.setBounds(6, 113, 45, 45);
        f.add(jb4);
        jb5.setBounds(57, 113, 45, 45);
        f.add(jb5);
        jb6.setBounds(108, 113, 45, 45);
        f.add(jb6);
        jbMultiply.setBounds(159, 113, 45, 45);
        f.add(jbMultiply);
        jb1.setBounds(6, 164, 45, 45);
        f.add(jb1);
        jb2.setBounds(57, 164, 45, 45);
        f.add(jb2);
        jb3.setBounds(108, 164, 45, 45);
        f.add(jb3);
        jbSub.setBounds(159, 164, 45, 45);
        f.add(jbSub);
        jbDot.setBounds(6, 215, 45, 45);
        f.add(jbDot);
        jb0.setBounds(57, 215, 45, 45);
        f.add(jb0);
        jbEquals.setBounds(108, 215, 45, 45);
        f.add(jbEquals);
        jbAdd.setBounds(159, 215, 45, 96);
        f.add(jbAdd);
        jbAddHundred.setBounds(6, 266, 96, 45);
        f.add(jbAddHundred);
        jbReset.setBounds(108, 266, 45, 45);
        f.add(jbReset);
        jbAddTemp.setBounds(180, 270, 45, 45);
        f.add(jbAddTemp);

        // f.setSize(247, 410);
        // jbAddTemp.setVisible(false);
        f.setVisible(true);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setLayout(null);
        f.setLocation(600, 180);
        f.setMinimumSize(new Dimension(216, 345));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inter ob = new Inter(this);

        jb0.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        jbAdd.addActionListener(this);
        jbSub.addActionListener(this);
        jbMultiply.addActionListener(this); 
        jbDiv.addActionListener(this);
        jbDot.addActionListener(this);
        jbEquals.addActionListener(this);
        jbReset.addActionListener(this);
//        jbAddHundred.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new CalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Bridge bridge = Bridge.getInstance();
        tempButton = new JButton();
        tempButton = (JButton)e.getSource();
        
        this.tempStr = bridge.inputText(tempButton.getText());
        
        tf1.setText(this.tempStr);
    }
    
}
