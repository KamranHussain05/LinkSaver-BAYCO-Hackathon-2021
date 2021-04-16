import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class DrawingSurface extends JFrame implements ActionListener {
  private JTextField inputCourseName, inputMeetingLink, display;
  private DecimalFormat money = new DecimalFormat("$0.00");

  public DrawingSurface() {
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

public double totalWages(double hours, double rate)
  {
    double wages;
    
    	if(hours>40) {
    		double overWage = 1.5*(rate*(hours-40));
    		wages = overWage + rate*40;
    	} else {
    		wages = rate*hours;
    	}	

    return wages;
  }

  public void actionPerformed(ActionEvent e)
  {
    String s = inputCourseName.getText();
    double hours = Double.parseDouble(s);
    s = inputMeetingLink.getText();
    double rate = Double.parseDouble(s);
    double wages = totalWages(hours, rate);
    display.setText(money.format(wages));
  }

  public static void main(String[] args)
  {
    DrawingSurface window = new DrawingSurface();
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}



