import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface ChampionshipManager {
    class Demo extends JFrame {
        Demo() {
            super("Formulary 1 Race");
            JLabel background;
            setSize(1200, 675);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImageIcon img = new ImageIcon("../1663505.jpg");

            background = new JLabel("", img, JLabel.CENTER);
            background.setBounds(0, 0, 1200, 675);
            JButton c1 = new JButton("Formula1 Table ");
            c1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"C:\\Users\\Sajith Nirman\\Desktop\\2019048\\w1809739\\src\\formula.txt");
                    }catch (Exception e2){

                    }
                }
            });

            c1.setBounds(400, 100, 400, 40);
            add(c1);

            JButton c2 = new JButton("Starting Position");
            c2.setBounds(400, 200, 400, 40);
            add(c2);

            JButton c3 = new JButton("Completed Races ");
            c3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"C:\\Users\\Sajith Nirman\\Desktop\\2019048\\w1809739\\information_entered.txt");
                    }catch (Exception e2){

                    }
                }
            });
            c3.setBounds(400, 300, 400, 40);
            add(c3);

            JButton c4 = new JButton("Next Race ");
            c4.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                JFrame f= new JFrame("Next Race");
                JLabel lbl=new JLabel("Enter the driver name -");
                lbl.setBounds(50,100,200,30);
                JTextField t1;
                t1=new JTextField();
                t1.setBounds(190,100, 200,30);
                JButton w = new JButton("FIND");
                w.setBounds(50,150,100,30);
                f.add(lbl);
                f.add(w);
                f.add(t1);
                f.setSize(500,500);
                f.setLayout(null);
                f.setVisible(true);
                f.getContentPane().setBackground(Color.CYAN);


                w.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                    }
                });
            }
            });
            c4.setBounds(400, 400, 400, 40);
            add(c4);

            add(background);
            setVisible(true);

        }
    }
    public static void main(String[]args){
        new Demo();
    }
}

