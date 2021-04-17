// Author Kamran Hussain
// Date: 4/17/2021
// Rev 01
// Notes: 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ErrorMessage extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static boolean dismissed = false;

	public ErrorMessage() {
		super("ERROR 400: BAD REQUEST ERROR");
		
		JPanel panel = new JPanel();
	    GridLayout layout = new GridLayout(2,1);
	    panel.setLayout(layout);
	    panel.setBackground(new Color(200,200,200));
	    
	    
	    JLabel error = new JLabel("The link you added is invalid", SwingConstants.CENTER);
	    error.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    JLabel error2 = new JLabel("Link must have https://", SwingConstants.CENTER);
	    error2.setFont(new Font("Montserrat", Font.PLAIN, 17));
	    panel.add(error, BorderLayout.CENTER);
	    panel.add(error2, BorderLayout.CENTER);
	    
	    JPanel foot = new JPanel();
	    GridLayout footLayout = new GridLayout(1,1);
	    foot.setLayout(footLayout);
	    JButton dismiss = new JButton();
	    dismiss.setText("Dismiss");
	    dismiss.setBackground(new Color(79, 93, 117));
	    dismiss.setForeground(Color.WHITE);
	    dismiss.addActionListener(this);
	    this.add(dismiss);
	    foot.add(dismiss);
	    foot.setBackground(new Color(79, 93, 117));
	    
	    Container c = getContentPane();
	    c.add(panel, BorderLayout.CENTER);
	    c.add(foot, BorderLayout.AFTER_LAST_LINE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	    dispose();
	    dismissed = true;
	}
	
	public static boolean isDismissed() {
		return dismissed;
	}

}
