import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class CoinTossFrame {

	private JFrame frame;
	private JLabel messageLabel;
	private JLabel resultLabel;
	private JButton quitButton;
	private JButton tossButton;
	private JButton pennyButton;
	private JButton dimeButton;
	private JButton quarterButton;
	
	int noOfFlips = 0;    //total number of flips
	int headsCount = 0;   //total number of heads flipped
	int tailsCount = 0;   //total number of tails flipped
	String headsImage;
	String tailsImage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinTossFrame window = new CoinTossFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoinTossFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		messageLabel = new JLabel("Welcome! Choose your coin.");
		messageLabel.setVerticalAlignment(SwingConstants.TOP);
		messageLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		messageLabel.setForeground(Color.BLACK);
		messageLabel.setBounds(10, 11, 338, 30);
		frame.getContentPane().add(messageLabel);
		
		resultLabel = new JLabel("");
		resultLabel.setVisible(false);
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setBounds(80, 11, 268, 239);
		frame.getContentPane().add(resultLabel);
		
		tossButton = new JButton("TOSS");
		tossButton.setVisible(false);
		tossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultLabel.setVisible(true);
				Flip flip = new Flip();
				flip.setResult();
				++noOfFlips;
				
				if (flip.getResult() == "Heads") {
					messageLabel.setText("You flipped heads! You can toss again or quit.");
					resultLabel.setIcon(new ImageIcon(headsImage));
					++headsCount;
				}
				else {
					messageLabel.setText("You flipped tails! You can toss again or quit.");
					resultLabel.setIcon(new ImageIcon(tailsImage));
					++tailsCount;
				}
				
				quitButton.setVisible(true);
			}
		});
		tossButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		tossButton.setBackground(UIManager.getColor("Button.darkShadow"));
		tossButton.setForeground(Color.BLACK);
		tossButton.setBounds(347, 11, 77, 30);
		frame.getContentPane().add(tossButton);
		
		quitButton = new JButton("QUIT");
		quitButton.setVisible(false);
		quitButton.setFont(new Font("Stencil", Font.PLAIN, 14));
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messageLabel.setVisible(false);
				tossButton.setVisible(false);
				quitButton.setVisible(false);
				resultLabel.setIcon(null);
				resultLabel.setText("<html><center>Thanks for tossing! You flipped a total</br> of " + noOfFlips + " time(s). You flipped heads " + headsCount + " time(s) and tails " + tailsCount + " time(s).</center></html>");
				resultLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
				resultLabel.setForeground(Color.BLACK);
			}
		});
		quitButton.setBounds(347, 220, 77, 30);
		frame.getContentPane().add(quitButton);
		
		pennyButton = new JButton("PENNY");
		pennyButton.setFont(new Font("Stencil", Font.PLAIN, 15));
		pennyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				headsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\penny heads.jpg");
				tailsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\penny tails.jpg");
				pennyButton.setVisible(false);
				dimeButton.setVisible(false);
				quarterButton.setVisible(false);
				messageLabel.setText("Let's toss!");
				tossButton.setVisible(true);
			}
		});	
		pennyButton.setBounds(160, 69, 109, 30);
		frame.getContentPane().add(pennyButton);
		
		dimeButton = new JButton("DIME");
		dimeButton.setFont(new Font("Stencil", Font.PLAIN, 15));
		dimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				headsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\dime heads.jpg");
				tailsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\dime tails.jpg");
				pennyButton.setVisible(false);
				dimeButton.setVisible(false);
				quarterButton.setVisible(false);
				messageLabel.setText("Let's toss!");
				tossButton.setVisible(true);
			}
		});
		dimeButton.setBounds(160, 126, 109, 30);
		frame.getContentPane().add(dimeButton);
		
		quarterButton = new JButton("QUARTER");
		quarterButton.setFont(new Font("Stencil", Font.PLAIN, 15));
		quarterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				headsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\quarter heads.jpg");
				tailsImage = ("C:\\\\Users\\\\user\\\\Documents\\\\Ferris Summer 2022\\\\quarter tails.jpg");
				pennyButton.setVisible(false);
				dimeButton.setVisible(false);
				quarterButton.setVisible(false);
				messageLabel.setText("Let's toss!");
				tossButton.setVisible(true);
			}
		});
		quarterButton.setBounds(160, 182, 109, 30);
		frame.getContentPane().add(quarterButton);
		
	}
}
