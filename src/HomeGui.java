import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGui extends JFrame implements ActionListener {
	
	private AddCourse courseName;
	private JTextField course;
	private int courseCounter;
	private Data d;
	
	
	public HomeGui() {
		super("Home");
		
		courseCounter = -1;
		d = new Data(8);
		if(FileChanger.checkFile())
		{
			FileChanger.readFile(d);
		}
		else
		{
			FileChanger.createFile();
			FileChanger.readFile(d);
		}
		
		AddCourse courseName = new AddCourse(d, courseCounter);
		
	    JPanel panel = new JPanel();
	    GridLayout layout = new GridLayout(2,8);
	    layout.setVgap(30);
	    layout.setHgap(30);
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
	    c.add(calc);
	  }


	@Override
	public void actionPerformed(ActionEvent e) {
		courseCounter++;
		if(courseCounter <= 7)
		{
			//AddCourse courseWindow = new AddCourse();
			AddCourse courseWindow = new AddCourse(d, courseCounter);
	    	courseWindow.setBounds(500, 500, 550, 350);
	    	courseWindow.setBackground(new Color(211,211,211));
	    	courseWindow.setVisible(true);
		}
	}
	
	public static void main(String [] args) {
		HomeGui courseWindow = new HomeGui();
	    courseWindow.setBounds(500, 500, 550, 350);
	    courseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    courseWindow.setBackground(new Color(211,211,211));
	    courseWindow.setVisible(true);
	}
}
