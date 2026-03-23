import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrationForm2{
  public static void main(String[] args) {
    JFrame frame = new JFrame("Registration Form");
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 2, 10, 10));
    JLabel nameLabel = new JLabel("Name:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passLabel = new JLabel("Password:");
    JLabel genderLabel = new JLabel("Gender:");
    JTextField nameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();
    bg.add(male);
    bg.add(female);
    JPanel genderPanel = new JPanel();
    genderPanel.add(male);
    genderPanel.add(female);
    JButton submitBtn = new JButton("Submit");
    submitBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Registeration Form filled successfully");
      } });
    panel.add(nameLabel);
    panel.add(nameField);
    panel.add(emailLabel);
    panel.add(emailField);
    panel.add(passLabel);
    panel.add(passField);
    panel.add(genderLabel);
    panel.add(genderPanel);
    panel.add(new JLabel("")); 
    panel.add(submitBtn);
    frame.add(panel);
    frame.setSize(350, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}