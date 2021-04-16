import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CourseCell extends JFrame {
	
	private AddCourse courseName;
	private JTextField course;

	public CourseCell() {
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
	}
}
