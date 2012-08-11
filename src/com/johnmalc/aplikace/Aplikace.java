package com.johnmalc.aplikace;

// import com.johnmalc.aplikace.Console;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DropMode;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;



/**
 * @author  John Malc
 * @version 1.2
 *
 */
public class Aplikace extends JFrame { 

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JPanel ButtonPanel_1;
		private JPanel ContentPanel;
		private JButton btnCheck;
		private JButton btnExit;
		private JTextArea LeftTextArea;
		private JButton btnConnect;
		private JTextArea RightTextArea;
		private JScrollPane LeftScrollPane;
		private JScrollPane RightScrollPane;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			
			// Windows Look and Feel (generated try & catch by Eclipse)
			try {
				UIManager.setLookAndFeel(new WindowsLookAndFeel());
			} catch (UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			
			// from setup, DONT change 
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
			
		  // System tray icon (only 16x16)		
		  if (SystemTray.isSupported()) {
		          SystemTray tray = SystemTray.getSystemTray();
		          Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
		          PopupMenu popup = new PopupMenu();
		          // 
		          // MenuItem item = new MenuItem("A MenuItem");
		          // popup.add(item);
		          TrayIcon trayIcon = new TrayIcon(image, "Conrad Application", popup);
		          try {
		            tray.add(trayIcon);
		          } catch (AWTException e) {
		            System.err.println("Can't add to tray");
		          }
		        } else {
		          System.err.println("Tray unavailable");
		        }
		      }
		   
			

		/**
		 * Create the frame.
		 */
		public Aplikace() {
			
			// Icons for application (32*32 px (optinal) taskbar icon and 16*16 for topleft icon)
			setIconImage(Toolkit.getDefaultToolkit().getImage(Aplikace.class.getResource("/res/conrad.png")));
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(521, 341); // custom size due to rezing (width and lenght)
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			contentPane.add(getButtonPanel_1());
			contentPane.add(getContentPanel());
		}

		private JPanel getButtonPanel_1() {
			if (ButtonPanel_1 == null) {
				ButtonPanel_1 = new JPanel();
				ButtonPanel_1.setBounds(10, 256, 485, 36);
				ButtonPanel_1.setLayout(null);
				ButtonPanel_1.add(getBtnCheck());
				ButtonPanel_1.add(getBtnExit());
				ButtonPanel_1.add(getBtnConnect());
			}
			return ButtonPanel_1;
		}

		private JPanel getContentPanel() {
			if (ContentPanel == null) {
				ContentPanel = new JPanel();
				ContentPanel.setBounds(0, 0, 495, 245);
				ContentPanel.setLayout(null);
				ContentPanel.add(getLeftScrollPane());
				ContentPanel.add(getRightScrollPane());
			}
			return ContentPanel;
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
						
						// TODO zde past connection
					  	//    System.out.println("jdknsns");
						
						HttpURLConnection connection = null;
					    try {
					        URL url = new URL("http://www.conrad.cz");
					        connection = (HttpURLConnection) url.openConnection();
					        connection.connect();
					        connection.getInputStream();  		        
					        System.out.println("Connected to conrad.cz");   
					       
					       // do something with the input stream here
					       // InputStream error = ((HttpURLConnection) connection).getErrorStream();
					      
					       // # means special ID to understand where & what is wrong
					    } catch (MalformedURLException e1) {
					        e1.printStackTrace();
					        System.err.println("Something's wrong #1");
					    } catch (IOException e1) {
					        e1.printStackTrace();
					        System.err.println("Something's wrong #2");
					    } finally {
					        if(null != connection) { connection.disconnect(); }
					    }									
					}
				});
				btnConnect.setBounds(140, 0, 89, 23);
			}
			return btnConnect;
		}
		private JTextArea getLeftTextArea() { // left text area for input numbers
			if (LeftTextArea == null) {
				LeftTextArea = new JTextArea();
				LeftTextArea.setDropMode(DropMode.INSERT);
				LeftTextArea.setFont(new Font("Arial", Font.PLAIN, 13));
				LeftTextArea.setLineWrap(true);
			} 
			return LeftTextArea;
		}
		  private JTextArea getRightTextArea() { // right text area for output (connection est./not-est.)
			if (RightTextArea == null) {
				RightTextArea = new JTextArea();
				RightTextArea.setEnabled(false);
				RightTextArea.setEditable(false);
				RightTextArea.setLineWrap(true);
			}
			return RightTextArea;
		}
		  private JScrollPane getLeftScrollPane() {
			 if (LeftScrollPane == null) {
			    LeftScrollPane = new JScrollPane();
				LeftScrollPane.setBounds(10, 11, 174, 223);
				LeftScrollPane.setViewportView(getLeftTextArea());
		     }
		     return LeftScrollPane;
	    }
		  private JScrollPane getRightScrollPane() {
		     if (RightScrollPane == null) {
		         RightScrollPane = new JScrollPane();
		         RightScrollPane.setBounds(194, 11, 291, 126);
			     RightScrollPane.setViewportView(getRightTextArea());
		     }
		     return RightScrollPane;
	    }
}
				
	






