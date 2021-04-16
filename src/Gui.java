import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Gui extends JFrame implements ActionListener {
  private JTextField inputCourseName, inputMeetingLink; //input variables
  private JTextField display; //Output Variable, NOT NEEDED
  private DecimalFormat money = new DecimalFormat("$0.00");

  public Gui() {
    super("Class Scheduler");

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));

    panel.add(new JLabel("   Class:"));
    inputCourseName = new JTextField(5);
    inputCourseName.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputCourseName);

    panel.add(new JLabel("   Meeting Link:"));
    inputMeetingLink = new JTextField(5);
    inputMeetingLink.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputMeetingLink);

    panel.add(new JLabel("   Total wages:"));
    display = new JTextField(20);
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setEditable(false);
    display.setBackground(Color.gray);
    panel.add(display);

    JButton calc = new JButton("Calculate wages");
    calc.addActionListener(this);

    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    String s = inputCourseName.getText();
    double hours = Double.parseDouble(s);
    s = inputMeetingLink.getText();
    double rate = Double.parseDouble(s);
    double wages = result(hours, rate);
    display.setText(money.format(wages));
  }

private double result(double hours, double rate) {
	// TODO Auto-generated method stub
	return 0;
}
}



