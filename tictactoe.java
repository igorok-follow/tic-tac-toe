import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class tictactoe extends JFrame{


    int n = 0;

    char[] array = {'n', 'n','n','n','n','n','n','n','n'};

    HashMap<JButton, Integer> buttons = new HashMap<JButton, Integer>();

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn.isEnabled()) {
                btn.setEnabled(false);
                if (n % 2 == 0) {
                    array[buttons.get(btn)] = 'X';
                    btn.setText("X");
                } else {
                    array[buttons.get(btn)] = 'O';
                    btn.setText("O");
                }
                n++;
                if (array[0] == 'X' && array[1] == 'X' && array[2] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[0] == 'O' && array[1] == 'O' && array[2] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[3] == 'O' && array[4] == 'O' && array[5] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[3] == 'X' && array[4] == 'X' && array[5] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[6] == 'O' && array[7] == 'O' && array[8] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[8] == 'X' && array[8] == 'X' && array[8] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[0] == 'O' && array[3] == 'O' && array[6] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[0] == 'X' && array[3] == 'X' && array[6] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[1] == 'O' && array[4] == 'O' && array[7] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[1] == 'X' && array[4] == 'X' && array[7] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[2] == 'O' && array[5] == 'O' && array[8] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[2] == 'X' && array[5] == 'X' && array[8] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[0] == 'O' && array[4] == 'O' && array[8] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[0] == 'X' && array[4] == 'X' && array[8] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }
                else if (array[2] == 'O' && array[4] == 'O' && array[6] == 'O') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("O");
                }
                else if (array[2] == 'X' && array[4] == 'X' && array[6] == 'X') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    win("X");
                }

                else if (array[0] != 'n' && array[1] != 'n' && array[2] != 'n' && array[3] != 'n' && array[4] != 'n' && array[5] != 'n' && array[6] != 'n' && array[7] != 'n' && array[8] != 'n') {
                    for (JButton b : buttons.keySet()) {
                        b.setEnabled(false);
                        b.setText("");
                    }
                    draw();
                }

            }


        }
    };

    public void win(String str){
        button2.setText(str);
        button4.setText("W");
        button5.setText("I");
        button6.setText("N");
    }
    public void draw(){
        button4.setText("X");
        button5.setText("/");
        button6.setText("O");
    }

    JButton button1 = new JButton();

    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();


    public tictactoe() {
        super("Tic Tac Toe");
//        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());
        //panel.setBounds(0,0,100,100);
        button1.setPreferredSize(new Dimension(100,100));
        button1.addActionListener(listener);
        button1.setBorderPainted(false);
        button1.setOpaque(true);
        button1.setBackground(new Color(155, 155, 155));
        button1.setFont(new Font("HACKED", Font.PLAIN, 50));
        buttons.put(button1, 0);
        panel.add(button1);
        button2.setPreferredSize(new Dimension(100,100));
        button2.addActionListener(listener);
        button2.setBorderPainted(false);
        button2.setOpaque(true);
        button2.setBackground(new Color(155, 155, 155));
        button2.setFont(new Font("HACKED", Font.PLAIN, 50));
        buttons.put(button2, 1);
        panel.add(button2);
        button3.setPreferredSize(new Dimension(100,100));
        button3.addActionListener(listener);
        button3.setBorderPainted(false);
        button3.setOpaque(true);
        button3.setBackground(new Color(155, 155, 155));
        button3.setFont(new Font("HACKED", Font.PLAIN, 50));
        buttons.put(button3, 2);
        panel.add(button3);
        button4.setPreferredSize(new Dimension(100,100));
        button4.addActionListener(listener);
        button4.setBorderPainted(false);
        button4.setOpaque(true);
        button4.setBackground(new Color(155, 155, 155));;
        button4.setFont(new Font("HACKED", Font.PLAIN, 50));
        buttons.put(button4, 3);
        panel.add(button4);
        button5.setPreferredSize(new Dimension(100,100));
        button5.addActionListener(listener);
        button5.setBorderPainted(false);
        button5.setOpaque(true);
        button5.setFont(new Font("HACKED", Font.PLAIN, 50));
        button5.setBackground(new Color(155, 155, 155));;
        buttons.put(button5, 4);
        panel.add(button5);
        button6.setPreferredSize(new Dimension(100,100));
        button6.addActionListener(listener);
        button6.setBorderPainted(false);
        button6.setOpaque(true);
        button6.setFont(new Font("HACKED", Font.PLAIN, 50));
        button6.setBackground(new Color(155, 155, 155));;
        buttons.put(button6, 5);
        panel.add(button6);
        button7.setPreferredSize(new Dimension(100,100));
        button7.addActionListener(listener);
        button7.setBorderPainted(false);
        button7.setOpaque(true);
        button7.setFont(new Font("HACKED", Font.PLAIN, 50));
        button7.setBackground(new Color(155, 155, 155));;
        buttons.put(button7, 6);
        panel.add(button7);
        button8.setPreferredSize(new Dimension(100,100));
        button8.addActionListener(listener);
        button8.setBorderPainted(false);
        button8.setOpaque(true);
        button8.setFont(new Font("HACKED", Font.PLAIN, 50));
        button8.setBackground(new Color(155, 155, 155));;
        buttons.put(button8, 7);
        panel.add(button8);
        button9.setPreferredSize(new Dimension(100,100));
        button9.addActionListener(listener);
        button9.setBorderPainted(false);
        button9.setOpaque(true);
        button9.setFont(new Font("HACKED", Font.PLAIN, 50));
        button9.setBackground(new Color(155, 155, 155));;
        buttons.put(button9, 8);
        panel.add(button9);

        getContentPane().add(panel);
        panel.setBackground(new Color(100,100 ,100));
        setPreferredSize(new Dimension(340, 360));
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {}

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                tictactoe frame = new tictactoe();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }
        );
    }
}
