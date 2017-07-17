package pp2017.team10.client.gui;
/*
 * 
 * Bitte starten sie Hier das Spiel.
 * 
 * 
 * 
 * 
 * @author <Tokmak, Mehmet, 5784093>
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainMenuB extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1506712517684413988L;
	JTextField chatEingabe;
	JLabel text1, text2, welcome, logo;
	private int FrameWidth = 1000;
	private int FrameHeight = 500;
	private String name = "Main Menu";
	private boolean visibility = true;
	private boolean resizability = true;
	JButton startButton, highscoreButton, exitButton;

	public MainMenuB() {
		setVisible(visibility);
		setSize(FrameWidth, FrameHeight);
		setResizable(resizability);
		setTitle(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

	/*	text1 = new JLabel("Study Dungeons");
		text1.setForeground(Color.YELLOW);
		text1.setBounds(208, 0, 653, 96);
		text1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 75));
		getContentPane().add(text1);*/

		text2 = new JLabel("Main Menu");
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setForeground(Color.YELLOW);
		text2.setBounds(10, 11, 964, 96);
		// text.setBounds(x, y, width, height);
		Font schrift2 = new Font("Serif", Font.BOLD, 40);
		text2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		getContentPane().add(text2);

		startButton = new JButton("Start");
		startButton.setFont(new Font("X-Files", Font.BOLD, 25));
		startButton.setBackground(Color.YELLOW);
		startButton.setBounds(10, 155, 282, 35);
		startButton.setEnabled(true);
		startButton.addActionListener(this);
		getContentPane().add(startButton);

		highscoreButton = new JButton("Highscore");
		highscoreButton.setFont(new Font("X-Files", Font.BOLD, 25));
		highscoreButton.setBackground(Color.YELLOW);
		highscoreButton.setBounds(10, 201, 282, 35);
		highscoreButton.setEnabled(true);
		highscoreButton.addActionListener(this);
		getContentPane().add(highscoreButton);

		exitButton = new JButton("EXIT");
		exitButton.setFont(new Font("X-Files", Font.BOLD, 40));
		exitButton.setBackground(Color.RED);
		exitButton.setBounds(392, 390, 180, 60);
		exitButton.setEnabled(true);
		exitButton.addActionListener(this);
		getContentPane().add(exitButton);

		welcome = new JLabel();
		welcome.setLayout(null);
		welcome.setIcon(new ImageIcon(getClass().getResource("/StudyDungeonsMainIcon.png")));
		welcome.setBounds(0, 0, 1000, 461);
		getContentPane().add(welcome);

		repaint();

	}

	public static void main(String[] args) {

		new MainMenuB();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			new Login();
			this.dispose();
		} else if (e.getSource() == highscoreButton) {
			new Highscore();
		} else if (e.getSource() == exitButton) {
			System.exit(0);
		}

	}

}