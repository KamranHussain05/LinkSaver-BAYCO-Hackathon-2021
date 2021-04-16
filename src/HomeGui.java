import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeGui extends JFrame implements ActionListener {
	
	private int courseCounter;
	private Data d;
	
	@SuppressWarnings("deprecation")
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
	    JButton course1 = new JButton();
	    course1.setText(Data.getCourseName(0));
	    course1.enable(false);
	    course1.setHorizontalAlignment(JTextField.CENTER);
	    course1.setBackground(new Color(230, 183, 97));
	    course1.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course1);
	    
	    //Tile 2
	    JButton course2 = new JButton();
	    course2.setText(Data.getCourseName(1));
	    course2.enable(false);
	    course2.setHorizontalAlignment(JTextField.CENTER);
	    course2.setBackground(new Color(230, 183, 97));
	    course2.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course2);
	    
	    //Tile 3
	    JButton course3 = new JButton();
	    course3.setText(Data.getCourseName(2));
	    course3.enable(false);
	    course3.setHorizontalAlignment(JTextField.CENTER);
	    course3.setBackground(new Color(230, 183, 97));
	    course3.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course3);
	    
	    //Tile 4
	    JButton course4 = new JButton();
	    course4.setText(Data.getCourseName(3));
	    course4.enable(false);
	    course4.setHorizontalAlignment(JTextField.CENTER);
	    course4.setBackground(new Color(230, 183, 97));
	    course4.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course4);
	    
	    //Tile 5
	    JButton course5 = new JButton();
	    course5.setText(Data.getCourseName(4));
	    course5.enable(false);
	    course5.setHorizontalAlignment(JTextField.CENTER);
	    course5.setBackground(new Color(230, 183, 97));
	    course5.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course5);
	    
	    //Tile 6
	    JButton course6 = new JButton();
	    course6.setText(Data.getCourseName(5));
	    course6.enable(false);
	    course6.setHorizontalAlignment(JTextField.CENTER);
	    course6.setBackground(new Color(230, 183, 97));
	    course6.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course6);
	    
	    //Tile 7
	    JButton course7 = new JButton();
	    course7.setText(Data.getCourseName(6));
	    course7.enable(false);
	    course7.setHorizontalAlignment(JTextField.CENTER);
	    course7.setBackground(new Color(230, 183, 97));
	    course7.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course7);
	    
	    //Tile 8
	    JButton course8 = new JButton();
	    course8.setText(Data.getCourseName(7));
	    course8.enable(false);
	    course8.setHorizontalAlignment(JTextField.CENTER);
	    course8.setBackground(new Color(230, 183, 97));
	    course8.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 30));
	    panel.add(course8);
	
	    JButton title = new JButton("Course Planner");
	    title.addActionListener(this);
	    title.enable(false);
	    title.setBackground(new Color(213, 109, 97));
	    title.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 40));
	    title.setBounds(100, 100, 10, 10);
	    
	    JButton addCourse = new JButton("+");
	    addCourse.addActionListener(this);
	    addCourse.setBackground(new Color(213, 109, 97));
	    addCourse.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 40));
	    addCourse.setBounds(100, 100, 10, 10);
	    addCourse.enable(true);
	    this.getContentPane().add(addCourse);
	
	    Container c = getContentPane();
	    c.add(panel, BorderLayout.CENTER);
	    c.add(title, BorderLayout.BEFORE_FIRST_LINE);
	    
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


	public void refresh() {
		// TODO Auto-generated method stub
		
	}
}