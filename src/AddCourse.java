import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AddCourse extends JFrame implements ActionListener {
  private JTextField inputCourseName, inputMeetingLink; //input variables

  public AddCourse() {
    super("Class Scheduler");

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,3));
    panel.setBackground(new Color(169,169,169));

    JLabel nameLabel = new JLabel("   Course Name:\n");
    nameLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(nameLabel);
    inputCourseName = new JTextField(20);
    inputCourseName.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputCourseName);
    
    JLabel courseLabel = new JLabel("   Course Link:\n");
    courseLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(courseLabel);
    inputCourseName = new JTextField(20);
    inputCourseName.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputCourseName);

    JLabel linkLabel = new JLabel("   Meeting Link:\n");
    linkLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(linkLabel);
    inputMeetingLink = new JTextField(20);
    inputMeetingLink.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputMeetingLink);

    JButton calc = new JButton("Add Class");
    calc.addActionListener(this);
    calc.setBackground(new Color(0,200,200));
    calc.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 20));

    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    
  }
}



