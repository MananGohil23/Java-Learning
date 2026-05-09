import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener {

    JLabel  lblLogin, lblPassword, lblDisplay;
    JTextField  tfLogin, tfDisplay;
    JPasswordField tfPassword;
    JButton btnOK, btnReset;

    public LoginForm() {
        setTitle("Login");
        setSize(420, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill   = GridBagConstraints.HORIZONTAL;

        // ── Row 0: Login label + field, Password label + field, OK, RESET ──
        lblLogin = new JLabel("Login :");
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0;
        add(lblLogin, gbc);

        tfLogin = new JTextField(10);
        gbc.gridx = 1; gbc.weightx = 1;
        add(tfLogin, gbc);

        lblPassword = new JLabel("Password :");
        gbc.gridx = 2; gbc.weightx = 0;
        add(lblPassword, gbc);

        tfPassword = new JPasswordField(10);
        gbc.gridx = 3; gbc.weightx = 1;
        add(tfPassword, gbc);

        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        gbc.gridx = 4; gbc.weightx = 0;
        add(btnOK, gbc);

        btnReset = new JButton("RESET");
        btnReset.addActionListener(this);
        gbc.gridx = 5;
        add(btnReset, gbc);

        // ── Row 1: Third text field — hidden until OK is clicked ──
        lblDisplay = new JLabel("Credentials :");
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0;
        lblDisplay.setVisible(false);
        add(lblDisplay, gbc);

        tfDisplay = new JTextField(30);
        tfDisplay.setEditable(false);
        tfDisplay.setForeground(new Color(0, 100, 0));
        tfDisplay.setFont(new Font("Monospaced", Font.BOLD, 12));
        tfDisplay.setVisible(false);
        gbc.gridx = 1; gbc.gridy = 1; gbc.gridwidth = 5; gbc.weightx = 1;
        add(tfDisplay, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            String login    = tfLogin.getText().trim();
            String password = new String(tfPassword.getPassword());

            if (login.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Please enter both Login ID and Password.",
                    "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Show third text field with the entered credentials
            tfDisplay.setText("Login: " + login + "   |   Password: " + password);
            lblDisplay.setVisible(true);
            tfDisplay.setVisible(true);
            pack();
        } else if (e.getSource() == btnReset) {
            // Clear both input fields and hide the display field
            tfLogin.setText("");
            tfPassword.setText("");
            tfDisplay.setText("");
            lblDisplay.setVisible(false);
            tfDisplay.setVisible(false);
            pack();
            tfLogin.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginForm::new);
    }
}
