import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{
    JLabel l1, l2, l3, l4;
    JTextField f1, f2, f3, f4;
    JButton b1, b2, b3;
    JTextArea a;
    Library lib;
    MyPanel(){
        lib = new Library();
        l1 = new JLabel("Name");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);

        l2 = new JLabel("Author");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);

        l3 = new JLabel("Year");
        add(l3);
        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);

        l4 = new JLabel("Name to del");
        add(l4);
        f4 = new JTextField();
        f4.setColumns(10);
        add(f4);

        b1 = new JButton("Add");
        MyAddListener m1 = new MyAddListener();
        b1.addActionListener(m1);
        add(b1);
        a = new JTextArea();
        a.setColumns(20);
        a.setRows(10);
        add(a);
        a.setText("");


        b2 = new JButton("Deleate");
        MyAddListener m2 = new MyAddListener();
        b2.addActionListener(m2);
        add(b2);
        a = new JTextArea();
        a.setColumns(20);
        a.setRows(10);
        a.setText("");

        b3 = new JButton("Sort");
        MyAddListener m3 = new MyAddListener();
        b3.addActionListener(m3);
        add(b3);



    }
    public class MyAddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = f1.getText();
            String s2 = f2.getText();
            int s3 = Integer.parseInt(f3.getText());
            Book b = new Book(s1, s2, s3);
            lib.add(b);
            f1.setText("");
            a.append(b.toString());
            System.out.println(b.getAuthor());
        }
    }

    public class MySortListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            a.setText("");
            lib.sortByName();
            a.setText(lib.toString());
        }
    }

}
