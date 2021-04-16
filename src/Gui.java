import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Gui extends JFrame implements ActionListener {
  private JTextField inputCourseName, inputMeetingLink; //input variables

  public Gui() {
    super("Class Scheduler");

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,8));

    JLabel nameLabel = new JLabel("   Course Name:\n");
    panel.add(nameLabel);
    inputCourseName = new JTextField(5);
    inputCourseName.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputCourseName);

    JLabel linkLabel = new JLabel("   Meeting Link:\n");
    panel.add(linkLabel);
    inputMeetingLink = new JTextField(5);
    inputMeetingLink.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputMeetingLink);

    JButton calc = new JButton("Add Class");
    calc.addActionListener(this);
    calc.setBackground(Color.LIGHT_GRAY);

    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(nameLabel, BorderLayout.CENTER);
    c.add(linkLabel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    
  }
}



