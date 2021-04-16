import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGui extends JFrame implements ActionListener{
	
	private AddCourse courseName; //input variables
	private JTextField course;
	
	public HomeGui() {
		super("Home");
		
		AddCourse courseName = new AddCourse();
		
	    JPanel panel = new JPanel();
	    GridLayout layout = new GridLayout(3,8);
	    layout.setVgap(30);
	    panel.setLayout(layout);
	    panel.setBackground(new Color(200,200,200));
	
	    JLabel nameLabel = new JLabel(courseName.toString());
	    nameLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(nameLabel);
	    course = new JTextField(20);
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	
	    JButton calc = new JButton("+");
	    calc.addActionListener(this);
	    calc.setBackground(new Color(213, 109, 97));
	    calc.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 60));
	
	    Container c = getContentPane();
	    c.add(panel, BorderLayout.CENTER);
	    c.add(calc, BorderLayout.NORTH);
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
	public static void main(String [] args) {
		HomeGui courseWindow = new HomeGui();
	    courseWindow.setBounds(500, 500, 550, 350);
	    courseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    courseWindow.setBackground(new Color(211,211,211));
	    courseWindow.setVisible(true);
	}
}
