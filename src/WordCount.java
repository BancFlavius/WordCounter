import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCount extends JFrame implements ActionListener {
    JLabel lb1, lb2;
    JTextArea ta;
    JButton b1;
    WordCount(){
        super("Word Counter");
        lb1 = new JLabel("Characters: ");
        lb1.setBounds(30,30,100,20);
        lb2 = new JLabel("Words: ");
        lb2.setBounds(30, 80, 100, 20);

        ta = new JTextArea();
        ta.setBounds(30,110,320,200);

        b1=new JButton("Count!");
        b1.setBounds(150,320, 80,30);
        b1.addActionListener(this);

        add(lb1);add(lb2);add(ta);add(b1);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String text=ta.getText();
            lb1.setText("Characters: "+text.length());
            String words[]=text.split("\\s");
            if(text.length() == 0){
                lb2.setText("Words: 0");
            } else {
                lb2.setText("Words: "+words.length);
            }
        }
    }
    public static void main(String[] args) {
        new WordCount();
    }}