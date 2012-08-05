package com.johnmalc.aplikace;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author  John Malc
 * @version 1.1
 *
 */
public class Aplikace extends JFrame { 

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JPanel ContentPanel;
		private JPanel ButtonPanel;
		private JButton btnCheck;
		private JButton btnExit;
		private JTextArea LeftTextArea;
		private JButton btnConnect;
		private JTextArea RightTextArea;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Aplikace frame = new Aplikace();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Aplikace() {
			// Icons for application (32*32 px (optinal) taskbar icon and 16*16 for topleft icon)
			setIconImage(Toolkit.getDefaultToolkit().getImage(Aplikace.class.getResource("/res/conrad.png")));
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			contentPane.add(getContentPanel());
			contentPane.add(getButtonPanel());
		}

		private JPanel getContentPanel() {
			if (ContentPanel == null) {
				ContentPanel = new JPanel();
				ContentPanel.setBounds(0, 229, 434, 33);
				ContentPanel.setLayout(null);
				ContentPanel.add(getBtnCheck());
				ContentPanel.add(getBtnExit());
				ContentPanel.add(getBtnConnect());
			}
			return ContentPanel;
		}

		private JPanel getButtonPanel() {
			if (ButtonPanel == null) {
				ButtonPanel = new JPanel();
				ButtonPanel.setBounds(0, 0, 434, 228);
				ButtonPanel.setLayout(null);
				ButtonPanel.add(getLeftTextArea());
				ButtonPanel.add(getRightTextArea());
			}
			return ButtonPanel;
		}

		private JButton getBtnCheck() { // Button for checking of numbers
			if (btnCheck == null) {
				btnCheck = new JButton("Check");
				btnCheck.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnCheck.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						// TODO if clicked it will check the input numbers
					}
				});
				btnCheck.setBounds(244, 0, 81, 23);
			}
			return btnCheck;
		}

		private JButton getBtnExit() { // Button for Exit
			if (btnExit == null) {
				btnExit = new JButton("Exit");
				btnExit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(EXIT_ON_CLOSE); // if clicked it will exit the app
					}
				});
				btnExit.setBounds(335, 0, 89, 23);
			}
			return btnExit;
		}
		private JButton getBtnConnect() { // Button for Connection
			if (btnConnect == null) {
				btnConnect = new JButton("Connect");
				btnConnect.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println("jdknsns");
						// zde past connection
						
					}
				});
				btnConnect.setBounds(140, 0, 89, 23);
			}
			return btnConnect;
		}
		private JTextArea getLeftTextArea() { // left text area for input numbers
			if (LeftTextArea == null) {
				LeftTextArea = new JTextArea();
				LeftTextArea.setFont(new Font("Arial", Font.PLAIN, 13));
				LeftTextArea.setLineWrap(true);
				LeftTextArea.setBounds(10, 11, 174, 206);
			} 
			return LeftTextArea;
		}
		private JTextArea getRightTextArea() { // right text area for output (connection est./not-est.)
			if (RightTextArea == null) {
				RightTextArea = new JTextArea();
				RightTextArea.setBounds(194, 14, 230, 109);
			}
			return RightTextArea;
		}
	}
