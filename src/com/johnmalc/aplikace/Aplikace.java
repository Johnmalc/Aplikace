package com.johnmalc.aplikace;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Color;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Popup;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DropMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.eclipse.swt.widgets.Item;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Window.Type;

/**
 * @author  John Malc
 * @version 1.3
 *
 */
public class Aplikace extends JFrame { 
		/**
		 *  Java doesn't allowed you to use multiple class inheritance
		 *  http://stackoverflow.com/questions/880662/include-one-java-file-in-another-java-file
		 */

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JPanel ButtonPanel_1;
		private JPanel ContentPanel;
		private JButton btnCheck;
		private JButton btnExit;
		private JTextArea LeftTextArea;
		private JTextArea RightTextArea;
		private JScrollPane LeftScrollPane;
		private JScrollPane RightScrollPane;
		/**
		 * Launch the application.
		 */
			public static void main(String[] args) {
			
			/**
			 * Windows Look and Feel (generated try & catch by Eclipse)
			 */ 
			try {
				UIManager.setLookAndFeel(new WindowsLookAndFeel());
			} catch (UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			
			/** 
			 *  from setup, DONT change 
			 */	
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
			
			/**
			 * 
			 * System tray icon (only 16x16)
			 * http://kahimyang.info/kauswagan/howto_blogs/655-how_to_add_a_system_try_icon_with_bubble_message_to_java_application
			 * 
			 */
		  	
			if (SystemTray.isSupported()) {
		        Image icon = Toolkit.getDefaultToolkit().getImage(Aplikace.class.getResource("/res/icon.png"));       
		        // create the trayIcon itself.
		        final TrayIcon trayIcon = new TrayIcon(icon);
		 
		       /**
		        *  access the system tray. If not supported
		        *  or if notification area is not present (Ubuntu) 
		        *  a NotSupportedException exception is trown;
		        */
		 
		        final SystemTray tray = SystemTray.getSystemTray();
		 
		        // Create popup menu
		        PopupMenu popup = new PopupMenu();
		        MenuItem exit = new MenuItem("Exit");
		        // exit popup button
		        exit.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Do some cleanup
		                tray.remove(trayIcon);
		                System.exit(0);
		            }
		        });
		 		
		        // add to popup menu
		        popup.add(exit);
		 
		        /**
		         *  Add tooltip and menu to trayicon
		         */
		        trayIcon.setToolTip("Aplikace");
		        trayIcon.setPopupMenu(popup);
		 
		        /**
		         *  Add the trayIcon to system tray/notification area
		         */
		        try {
		            tray.add(trayIcon);
		        } catch (AWTException e) {
		            System.out.println("Could not load tray icon !");
		        }
		       		 		       
		        /**
		         *  Continue/Simulate long running application code
		         */
		        try {
		            java.lang.Thread.sleep(1000 * 5);
		        } catch (Exception e) {
		        }		 
		        
		        /**
		         *  remove the icon.  Task is done.
		         */
		        tray.remove(trayIcon);
		    }
		 
		}
		          
		/**
		 * Create the frame. Main application
		 */
		public Aplikace() {
			setTitle("Conrad - Project Nocona");
			
			/**
			 *  Icons for application (32*32 px (optinal) taskbar icon and 16*16 for topleft icon)
			 */
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
		
		/**
		* Button for checking of numbers
		*/ 
		private JButton getBtnCheck() { 
			if (btnCheck == null) {
				btnCheck = new JButton("Check");
				btnCheck.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnCheck.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						RightTextArea.append("Checking....");
						// TODO if clicked it will connect & check the input numbers
					}
				});
				btnCheck.setBounds(244, 0, 81, 23);
			}
			return btnCheck;
		}
		
		/**
		*	Button for Exit
		*/ 
		private JButton getBtnExit() {
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
		
		/**
		 *  left text area for input numbers
		 */
		private JTextArea getLeftTextArea() {
			if (LeftTextArea == null) {
			    LeftTextArea = new JTextArea();
			    LeftTextArea.setDropMode(DropMode.INSERT);
			    LeftTextArea.setFont(new Font("Arial", Font.PLAIN, 13));
			    LeftTextArea.setLineWrap(true);
			} 
			 return LeftTextArea;
		}
		
		  /**
		   *  right text area for output (connection est./not-est. & checking numbers)
		   */
		private JTextArea getRightTextArea() { 
			if (RightTextArea == null) {
				RightTextArea = new JTextArea();			
				RightTextArea.setFont(new Font("Century", Font.PLAIN, 15));
				RightTextArea.setForeground(Color.WHITE); // color of the font
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
