package online.common.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import online.repository.com.Property;
import online.testcases.com.PlacedOrderd;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

public class Scripts extends JFrame {

	private JPanel contentPane;
	private static JTextField url;
	public static JTextField username;
	public static JPasswordField password;
	private JTextField textField;
	public static JComboBox env;
	private JComboBox dt;
	private JLabel lblPassword;
	private JComboBox tsr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					Scripts frame = new Scripts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Scripts() {
		setTitle("Moglix|| Scripts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon("//home//moglix//Desktop//SeleniumDriver//Shalini//sIceon.png"));

		JLabel lblNewLabel_1 = new JLabel("@Design&Developed By: SHALINI SINGH");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));

		JButton btnNewButton = new JButton("RUN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				
				

				if (tsr.getSelectedItem().equals("SALES PROCESS")) {
					
				
					
				//	Connectivity bttn = new Connectivity();
				//	System.out.println(url.getText()+ " launch URL ");
				//	bttn.launchBrowser("http://qatesting.scrmpro.com");
					selectEnviorment();
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG tng = new TestNG();
					List<String> suites =  new ArrayList<>();
				
					suites.add(
							"//home//moglix//MoglixSelenium//MoglixOnline//framework.testing//online//testsuite//com//RequestforQuoteProcess.xml");
					tng.setTestSuites(suites);
					tng.run();

				}

			}

		});

		JLabel lblSelectServer = new JLabel("SELECT ENVIORMENT");
		lblSelectServer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectServer.setForeground(new Color(255, 255, 255));
		lblSelectServer.setBackground(new Color(255, 255, 255));

		JLabel lblSelectTestdata = new JLabel("TEST DATATYPE");
		lblSelectTestdata.setForeground(Color.WHITE);
		lblSelectTestdata.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectTestdata.setBackground(Color.WHITE);

		env = new JComboBox();
		env.setToolTipText("Select your enviorment to execute test scripts ");
		env.setModel(new DefaultComboBoxModel(new String[] { "---SELECT---", "DEVELOPEMENT", "INTERNAL TESTING", "SIT",
				"UAT-DEMO2", "QATESTING", "PARKER", "FOR NEW REQUEST" }));

		dt = new JComboBox();
		dt.setToolTipText("Select DataType to run script");
		dt.setModel(new DefaultComboBoxModel(
				new String[] { "AUTO-GENERATE BY SYSTEM", "IMPORT FROM EXCEL/CSV", "IMPORT FROM DATABASE" }));

		JLabel lblNewLabel_2 = new JLabel("WEB URL");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));

		url = new JTextField();
		url.setColumns(10);

		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));

		username = new JTextField();
		username.setToolTipText("ENTER USERNAME TO CONNECT WITH SCRIPTS");
		username.setColumns(10);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));

		password = new JPasswordField();
		password.setToolTipText("ENTER PASSWORD TO CONNECT SCRIPT");

		JLabel lblNewLabel_3 = new JLabel("");

		textField = new JTextField();
		textField.setToolTipText("EMAIL ADDRESS TO SENT TESTING REPORT");
		textField.setColumns(10);

		JLabel lblTestSuite = new JLabel("TEST SUITE");
		lblTestSuite.setForeground(Color.WHITE);
		lblTestSuite.setFont(new Font("Tahoma", Font.BOLD, 12));

		JComboBox ts = new JComboBox();
		ts.setModel(new DefaultComboBoxModel(new String[] { "SMOKE SUITE", "SANITY SUITE", "REGRESSION SUITE" }));
		ts.setToolTipText("SELECT YOUR SCRIPT TO EXCEUTE");

		JLabel lblNewLabel_4 = new JLabel("REPORT SENT TO");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblNewLabel_5 = new JLabel("TEST SCRIPT");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));

		tsr = new JComboBox();
		tsr.setModel(new DefaultComboBoxModel(new String[] { "SALES PROCESS", "SALES TARGET", "CAMPAIGN MARKETING",
				"COMPANY SETUP", "MASTER SETUP" }));

		JButton btnNewButton_1 = new JButton("VIEW LOG");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					Desktop.getDesktop()
							.open(new java.io.File("//home//moglix//MoglixSelenium//MoglixOnline//logfile.log"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(255, 255, 255));

		JButton btnNewButton_2 = new JButton("VIEW REPORT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Desktop.getDesktop().open(new java.io.File(
							"//home//moglix//MoglixSelenium//MoglixOnline//test-output//emailable-report.html"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(0, 0, 255));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3, Alignment.LEADING).addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(
												gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
														.createParallelGroup(Alignment.LEADING).addGroup(
																gl_contentPane
																		.createSequentialGroup().addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(lblNewLabel_2)
																				.addComponent(lblSelectServer))
																		.addGap(18)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING,
																						false)
																				.addComponent(password)
																				.addComponent(url, Alignment.LEADING)
																				.addComponent(env, Alignment.LEADING, 0,
																						189, Short.MAX_VALUE)))
														.addGroup(gl_contentPane.createSequentialGroup().addGap(146)
																.addComponent(ts, 0, 188, Short.MAX_VALUE)))
														.addGap(118))
												.addComponent(lblNewLabel_1))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(0)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_4, Alignment.TRAILING,
																		GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
																.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE,
																		104, Short.MAX_VALUE)
																.addComponent(lblUsername, Alignment.TRAILING,
																		GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
																.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE,
																		86, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblSelectTestdata, GroupLayout.DEFAULT_SIZE, 104,
																Short.MAX_VALUE)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(tsr, 0, 249, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(btnNewButton_1).addGap(18).addComponent(
																		btnNewButton_2, GroupLayout.PREFERRED_SIZE, 131,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(username)
														.addComponent(dt, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 249,
														Short.MAX_VALUE))))
				.addGap(6))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblTestSuite, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(679, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(262).addComponent(lblNewLabel)
						.addContainerGap(278, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel))
						.addGap(130)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblSelectServer)
								.addComponent(env, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(dt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSelectTestdata, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE))
						.addGap(21)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
								.addComponent(url, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername).addComponent(username, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTestSuite, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
								.addComponent(ts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5).addComponent(tsr, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(161)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton).addComponent(btnNewButton_2)
										.addComponent(btnNewButton_1)))
						.addContainerGap())
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(238)))));
		contentPane.setLayout(gl_contentPane);
	}

	public static String selectEnviorment() {

		String demo2 = "https://www.moglix.com/login";
		String travel = "https://newplatform.moglix.com/login";
		String extra = "More links are not allowed in Trial version";
		String newReq = "FOR NEW REQUEST";

		if (env.getSelectedItem().equals("UAT-DEMO2")) {
			url.setText(demo2);
			return demo2;
		} else {
			if (env.getSelectedItem().equals("QATESTING")) {
				url.setText(travel);
				return travel;
			} else {
				if (env.getSelectedItem().equals("FOR NEW REQUEST")) {
					url.setEditable(true);
					return (String) url.getText();
				}
			}
		}
		
		return (String) url.getText();

	}

	public static String enterusername() {

		return (String) username.getText();

	}

	public static String enterpassword() {

		return (String) password.getText();

	}
}

