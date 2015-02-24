package hangmanGUI;

import javax.swing.JFrame;

/**
 * The About box. It's great.
 * @author nicomp
 *
 */
public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public About() {
		setTitle("About Hangman, Bill Nicholson, nicholdw@ucmail.uc.edu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 400, 450, 300);
	}
}
