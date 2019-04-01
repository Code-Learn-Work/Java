import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class CharCount extends JFrame implements ActionListener {
    JLabel label1,label2;
    JTextArea textArea;
    JButton b;
    JButton pad,text;
    CharCount(){
        super("Char Word Count Tool - JTP");
        label1 = new JLabel("Characters : ");
        label1.setBounds(50, 50, 100, 20);
        label2 = new JLabel("Words : ");
        label2.setBounds(50, 80, 100, 20);

        textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(50, 110, 300, 200);
        
        b = new JButton("Count");
        b.setBounds(50, 320, 80, 30);
        b.addActionListener(this);

        pad = new JButton("Pad Color");
        pad.setBounds(140, 320, 110, 30);
        pad.addActionListener(this);

        text = new JButton("Text Color");
        text.setBounds(260, 320, 110, 30);
        text.addActionListener(this);

        add(label1);
        add(label2);
        add(scroll);
        add(b);
        add(pad);
        add(text);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            String text1 = textArea.getText();
            label1.setText("Characters : " + text1.length());
            String words[] = text1.split("\\s");
            label2.setText("Words : " + words.length);
        }else if(e.getSource()==pad){
            Color color = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            textArea.setBackground(color);
        }else if(e.getSource()==text){
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            textArea.setForeground(c);
        }
    }

    public static void main(String[] args) {
        new CharCount();
    }
}