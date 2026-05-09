import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

    JTextField display;
    double num1 = 0, num2 = 0, result = 0;
    String operator = "";
    boolean newInput = false;

    String[] btnLabels = {
        "C",  "±",  "%",  "÷",
        "7",  "8",  "9",  "×",
        "4",  "5",  "6",  "−",
        "1",  "2",  "3",  "+",
        "00", "0",  ".",  "="
    };

    Color COLOR_OP     = new Color(255, 149,   0);  // orange  – operators
    Color COLOR_FUNC   = new Color(165, 165, 165);  // grey    – C, ±, %
    Color COLOR_NUM    = new Color( 51,  51,  51);  // dark    – digits
    Color COLOR_EQUALS = new Color(255, 149,   0);  // same orange for =

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout(4, 4));
        getContentPane().setBackground(Color.BLACK);

        // ── Display ──
        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.PLAIN, 36));
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // ── Button Grid ──
        JPanel panel = new JPanel(new GridLayout(5, 4, 4, 4));
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createEmptyBorder(4, 4, 8, 4));

        for (String label : btnLabels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("SansSerif", Font.BOLD, 20));
            btn.setFocusPainted(false);
            btn.setBorderPainted(false);
            btn.setForeground(Color.WHITE);
            btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            switch (label) {
                case "÷": case "×": case "−": case "+":
                    btn.setBackground(COLOR_OP); break;
                case "=":
                    btn.setBackground(COLOR_EQUALS); break;
                case "C": case "±": case "%":
                    btn.setBackground(COLOR_FUNC);
                    btn.setForeground(Color.BLACK); break;
                default:
                    btn.setBackground(COLOR_NUM); break;
            }
            btn.addActionListener(this);
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);

        pack();
        setSize(320, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd) {
            case "C":
                num1 = num2 = result = 0;
                operator = "";
                newInput = false;
                display.setText("0");
                break;

            case "±":
                try {
                    double val = Double.parseDouble(display.getText());
                    display.setText(format(-val));
                } catch (NumberFormatException ignored) {}
                break;

            case "%":
                try {
                    double val = Double.parseDouble(display.getText());
                    display.setText(format(val / 100));
                } catch (NumberFormatException ignored) {}
                break;

            case "÷": case "×": case "−": case "+":
                num1     = Double.parseDouble(display.getText());
                operator = cmd;
                newInput = true;
                break;

            case "=":
                if (operator.isEmpty()) break;
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "−": result = num1 - num2; break;
                    case "×": result = num1 * num2; break;
                    case "÷":
                        if (num2 == 0) { display.setText("Error"); operator = ""; return; }
                        result = num1 / num2; break;
                }
                display.setText(format(result));
                operator = "";
                newInput = true;
                break;

            case ".":
                if (newInput) { display.setText("0."); newInput = false; return; }
                if (!display.getText().contains("."))
                    display.setText(display.getText() + ".");
                break;

            default: // digits 0-9, 00
                if (newInput) {
                    display.setText(cmd);
                    newInput = false;
                } else {
                    String cur = display.getText();
                    display.setText(cur.equals("0") ? cmd : cur + cmd);
                }
                break;
        }
    }

    // Format: remove .0 for whole numbers
    private String format(double val) {
        if (val == (long) val) return String.valueOf((long) val);
        return String.valueOf(val);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
