import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


// Author: Kamran Hussain
// Date: 4/16/2021
// Rev 04
// Notes: Closed

@SuppressWarnings("serial")
public class AddCourse extends JFrame implements ActionListener {
  private JTextField inputCourseName, inputMeetingLink, inputCourseLink; //input variables
  private String courseName, courseLink, meetingLink;
  private JButton calc;
  private Data d;
  private int num;
  
  
  public AddCourse(Data d, int num) {
    super("Class Scheduler");
    
    this.d = d;
    this.num = num;
    
    JPanel panel = new JPanel();
    GridLayout layout = new GridLayout(3,3);
    layout.setVgap(30);
    panel.setLayout(layout);
    panel.setBackground(new Color(200,200,200));

    JLabel nameLabel = new JLabel("   Course Name:\n");
    nameLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(nameLabel);
    inputCourseName = new JTextField(20);
    inputCourseName.setHorizontalAlignment(JTextField.RIGHT);
    inputCourseName.setBackground(new Color(230,230,225));
    inputCourseName.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(inputCourseName);
    
    JLabel courseLabel = new JLabel("   Course Link:\n");
    courseLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(courseLabel);
    inputCourseLink = new JTextField(20);
    inputCourseLink.setHorizontalAlignment(JTextField.RIGHT);
    inputCourseLink.setBackground(new Color(225,225,225));
    inputCourseLink.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(inputCourseLink);

    JLabel linkLabel = new JLabel("   Meeting Link:\n");
    linkLabel.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(linkLabel);
    inputMeetingLink = new JTextField(20);
    inputMeetingLink.setHorizontalAlignment(JTextField.RIGHT);
    inputMeetingLink.setBackground(new Color(225,225,225));
    inputMeetingLink.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 17));
    panel.add(inputMeetingLink);

    calc = new JButton("Add Class");
    calc.addActionListener(this);
    calc.setBackground(new Color(0,215,215));
    calc.setFont(new Font("Antipasta Pro Regular", Font.PLAIN, 20));

    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    courseName = inputCourseName.getText();
    courseLink = inputCourseLink.getText();
    meetingLink = inputMeetingLink.getText();
    
    String s = courseName + ";" + courseLink + ";" + meetingLink;
    d.replaceStrings(num, s);
    try {
		FileChanger.writeFile(d.returnStrings());
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		System.out.println("AddCourse writing file failed");
		e1.printStackTrace();
	}
    
    calc.setText("Class Added!");
    calc.setBackground(new Color(97, 213, 109));
    calc.setEnabled(false);
  }
}


