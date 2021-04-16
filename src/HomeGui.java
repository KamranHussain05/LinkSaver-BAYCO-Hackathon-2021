import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGui extends JFrame implements ActionListener {
	
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
	    GridLayout layout = new GridLayout(2,4);
	    layout.setVgap(10);
	    layout.setHgap(10);
	    panel.setLayout(layout);
	    panel.setBackground(new Color(200,200,200));
	
	    //Tile 1
	    course = new JTextField(1);
	    course.setText(Data.getCourseName(0));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 2
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(1));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 3
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(2));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 4
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(3));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 5
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(4));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 6
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(5));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 7
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(6));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	    
	    //Tile 8
	    course = new JTextField(20);
	    course.setText(Data.getCourseName(7));
	    course.setEditable(false);
	    course.setHorizontalAlignment(JTextField.RIGHT);
	    course.setBackground(new Color(230,230,225));
	    course.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
	    panel.add(course);
	
	    JButton calc = new JButton("Course Planner");
	    calc.addActionListener(this);
	    calc.setBackground(new Color(213, 109, 97));
	    calc.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 40));
	    calc.setBounds(100, 100, 10, 10);
	    calc.enable(false);
	
	    Container c = getContentPane();
	    c.add(panel, BorderLayout.CENTER);
	    c.add(calc, BorderLayout.BEFORE_FIRST_LINE);
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
	    courseWindow.setBounds(500, 500, 1080, 720);
	    courseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    courseWindow.setBackground(new Color(211,211,211));
	    courseWindow.setVisible(true);
	}
}