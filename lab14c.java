import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DetailsForm extends JFrame implements ActionListener {

    // Input components
    JTextField    tfName;
    JRadioButton  rbMale, rbFemale;
    ButtonGroup   bgGender;
    JCheckBox     cbMusic, cbSwimming;
    JComboBox<String> cbPlace;
    JTextArea     taDetails;

    // Buttons
    JButton btnSubmit, btnQuit;

    // Display panel (shown after Submit)
    JTextArea taOutput;
    JLabel    lblDetailsHeader;

    String[] places = {"Bangladesh", "India", "USA", "UK", "Australia",
                       "Japan", "France", "Canada", "Germany", "Singapore"};

    public DetailsForm() {
        setTitle("Welcome to Manan's Classroom!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 520);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));
        getContentPane().setBackground(Color.WHITE);

        // ─── FORM PANEL ───────────────────────────────────────────────────
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(12, 16, 8, 16));
        GridBagConstraints g = new GridBagConstraints();
        g.insets  = new Insets(5, 5, 5, 5);
        g.anchor  = GridBagConstraints.WEST;

        Font labelFont = new Font("SansSerif", Font.PLAIN, 13);
        Font inputFont = new Font("SansSerif", Font.PLAIN, 13);

        // Name
        g.gridx = 0; g.gridy = 0; g.weightx = 0;
        formPanel.add(styledLabel("Name:", labelFont), g);
        tfName = new JTextField(18);
        tfName.setFont(inputFont);
        g.gridx = 1; g.weightx = 1; g.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(tfName, g);

        // Gender
        g.gridx = 0; g.gridy = 1; g.weightx = 0; g.fill = GridBagConstraints.NONE;
        formPanel.add(styledLabel("Gender:", labelFont), g);
        rbMale   = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbMale.setFont(inputFont);   rbMale.setBackground(Color.WHITE);
        rbFemale.setFont(inputFont); rbFemale.setBackground(Color.WHITE);
        rbMale.setSelected(true);
        bgGender = new ButtonGroup();
        bgGender.add(rbMale); bgGender.add(rbFemale);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        genderPanel.setBackground(Color.WHITE);
        genderPanel.add(rbMale); genderPanel.add(rbFemale);
        g.gridx = 1; g.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(genderPanel, g);

        // Interest
        g.gridx = 0; g.gridy = 2; g.fill = GridBagConstraints.NONE;
        formPanel.add(styledLabel("Interest:", labelFont), g);
        cbMusic    = new JCheckBox("Music");
        cbSwimming = new JCheckBox("Swimming");
        cbMusic.setFont(inputFont);    cbMusic.setBackground(Color.WHITE);
        cbSwimming.setFont(inputFont); cbSwimming.setBackground(Color.WHITE);
        JPanel interestPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        interestPanel.setBackground(Color.WHITE);
        interestPanel.add(cbMusic); interestPanel.add(cbSwimming);
        g.gridx = 1; g.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(interestPanel, g);

        // Favourite Place
        g.gridx = 0; g.gridy = 3; g.fill = GridBagConstraints.NONE;
        formPanel.add(styledLabel("Favourite Place:", labelFont), g);
        cbPlace = new JComboBox<>(places);
        cbPlace.setFont(inputFont);
        g.gridx = 1; g.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(cbPlace, g);

        // Details textarea (user input)
        g.gridx = 0; g.gridy = 4; g.fill = GridBagConstraints.NONE;
        formPanel.add(styledLabel("Details:", labelFont), g);
        taDetails = new JTextArea(4, 18);
        taDetails.setFont(inputFont);
        taDetails.setLineWrap(true);
        taDetails.setWrapStyleWord(true);
        JScrollPane spDetails = new JScrollPane(taDetails);
        g.gridx = 1; g.fill = GridBagConstraints.BOTH; g.weighty = 1;
        formPanel.add(spDetails, g);

        // ─── OUTPUT PANEL (hidden until Submit) ───────────────────────────
        lblDetailsHeader = new JLabel("Submitted Details:");
        lblDetailsHeader.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblDetailsHeader.setForeground(new Color(30, 100, 200));
        lblDetailsHeader.setVisible(false);

        taOutput = new JTextArea(6, 30);
        taOutput.setEditable(false);
        taOutput.setFont(new Font("Monospaced", Font.PLAIN, 12));
        taOutput.setBackground(new Color(245, 245, 245));
        taOutput.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        taOutput.setVisible(false);

        JPanel outputPanel = new JPanel(new BorderLayout(4, 4));
        outputPanel.setBackground(Color.WHITE);
        outputPanel.setBorder(BorderFactory.createEmptyBorder(0, 16, 8, 16));
        outputPanel.add(lblDetailsHeader, BorderLayout.NORTH);
        outputPanel.add(new JScrollPane(taOutput), BorderLayout.CENTER);

        // ─── BUTTON PANEL ─────────────────────────────────────────────────
        btnSubmit = new JButton("Submit");
        btnQuit   = new JButton("Quit");
        btnSubmit.setFont(new Font("SansSerif", Font.BOLD, 13));
        btnQuit.setFont(new Font("SansSerif", Font.BOLD, 13));
        btnSubmit.setBackground(new Color(70, 130, 180));
        btnSubmit.setForeground(Color.WHITE);
        btnQuit.setBackground(new Color(200, 80, 80));
        btnQuit.setForeground(Color.WHITE);
        btnSubmit.setFocusPainted(false);
        btnQuit.setFocusPainted(false);
        btnSubmit.addActionListener(this);
        btnQuit.addActionListener(this);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 8));
        btnPanel.setBackground(Color.WHITE);
        btnPanel.add(btnSubmit);
        btnPanel.add(btnQuit);

        // ─── ASSEMBLE ─────────────────────────────────────────────────────
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(formPanel,   BorderLayout.NORTH);
        centerPanel.add(outputPanel, BorderLayout.CENTER);

        add(centerPanel,  BorderLayout.CENTER);
        add(btnPanel,     BorderLayout.SOUTH);

        setVisible(true);
    }

    private JLabel styledLabel(String text, Font f) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(f);
        return lbl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name   = tfName.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Please enter your name.", "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String gender  = rbMale.isSelected() ? "Male" : "Female";
            StringBuilder interests = new StringBuilder();
            if (cbMusic.isSelected())    interests.append("Music ");
            if (cbSwimming.isSelected()) interests.append("Swimming");
            String interest = interests.toString().trim().isEmpty()
                              ? "None selected" : interests.toString().trim();
            String place    = (String) cbPlace.getSelectedItem();
            String details  = taDetails.getText().trim();

            // Build display text
            String out =
                "Name           : " + name     + "\n" +
                "Gender         : " + gender   + "\n" +
                "Interest       : " + interest + "\n" +
                "Favourite Place: " + place    + "\n" +
                "Details        : " + (details.isEmpty() ? "(none)" : details);

            taOutput.setText(out);
            lblDetailsHeader.setVisible(true);
            taOutput.setVisible(true);
            pack();
            setSize(Math.max(getWidth(), 420), Math.min(getHeight(), 600));

        } else if (e.getSource() == btnQuit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DetailsForm::new);
    }
}
