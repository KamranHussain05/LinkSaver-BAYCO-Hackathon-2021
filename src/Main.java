import java.awt.Color;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		    AddCourse window = new AddCourse();
		    window.setBounds(500, 500, 550, 350);
		    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    window.setBackground(new Color(211,211,211));
		    window.setVisible(true);
		  }
}