import java.awt.Color;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		    AddCourse courseWindow = new AddCourse();
		    courseWindow.setBounds(500, 500, 550, 350);
		    courseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    courseWindow.setBackground(new Color(211,211,211));
		    courseWindow.setVisible(true);
		  }
}