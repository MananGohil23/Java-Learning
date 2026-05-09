import javax.swing.*;
class myFrame {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("First GUI");
        f1.setVisible(true);
        f1.setSize(700,800);
        JLabel l1 = new JLabel("UserName");
        f1.add(l1);
        JTextField tf1 = new JTextField("input username");
        f1.add(tf1);
        tf1.setBounds(20 , 30, 20, 30);
    }
    
}
