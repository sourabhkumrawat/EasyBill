import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.SwingConstants;
public class LoginPage {

	JFrame frmBoltBillingInterface;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmBoltBillingInterface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoltBillingInterface = new JFrame();
		frmBoltBillingInterface.setMinimumSize(new Dimension(640, 520));
		frmBoltBillingInterface.setBackground(SystemColor.activeCaptionText);
		frmBoltBillingInterface.setVisible(true);
		frmBoltBillingInterface.setForeground(SystemColor.text);
		frmBoltBillingInterface.setTitle("Bolt Billing Interface\r\n");
		frmBoltBillingInterface.setResizable(false);
		frmBoltBillingInterface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sourabh\\Desktop\\Lightning_bolt.png"));
		frmBoltBillingInterface.setBounds(100, 100, 450, 336);
		frmBoltBillingInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmBoltBillingInterface.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblElectricityBillPayment = new JLabel("Electricity Bill Payment ");
		lblElectricityBillPayment.setBounds(176, 39, 279, 48);
		lblElectricityBillPayment.setForeground(SystemColor.text);
		lblElectricityBillPayment.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(lblElectricityBillPayment);
		
		JLabel lblCustomerNumber = new JLabel("User ID  :");
		lblCustomerNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomerNumber.setBounds(254, 156, 84, 37);
		lblCustomerNumber.setForeground(SystemColor.info);
		lblCustomerNumber.setBackground(SystemColor.textHighlightText);
		lblCustomerNumber.setFont(new Font("Arial", Font.BOLD, 18));
		panel.add(lblCustomerNumber);
		
		username = new JTextField();
		username.setBounds(365, 161, 237, 30);
		username.setSelectionColor(SystemColor.activeCaption);
		username.setName("\r\n");
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password\r\n  :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(SystemColor.info);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 18));
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setBounds(221, 213, 117, 37);
		panel.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(365, 218, 237, 30);
		panel.add(password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char ch[]=password.getPassword();
				String pass=new String(ch);
				String id=username.getText();
				//java.sql.PreparedStatement p;
				if(id.equals("admin")&&pass.equals("123456"))
					{
						AdminWindow a=new AdminWindow();
						LoginPage.this.frmBoltBillingInterface.setVisible(false);
						a.frmBoltBillingInterface.setVisible(true);}
				else
				{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
			    String qr = "select * from registration where id=? and password=?";
			    PreparedStatement p=(PreparedStatement) con.prepareStatement(qr);
				p.setString(1,id);
				p.setString(2,pass);
				ResultSet rs=p.executeQuery();
			
				
				if(rs.next())
				{
					JOptionPane.showMessageDialog(btnLogin,"login Successful" );
					
					if(id.equals("admin"))
					{
						AdminWindow a=new AdminWindow();
						LoginPage.this.frmBoltBillingInterface.setVisible(false);
						a.frmBoltBillingInterface.setVisible(true);
					}
					else {
						CustomerWindow c=new CustomerWindow();
						LoginPage.this.frmBoltBillingInterface.setVisible(false);
						c.frmBoltBillingInterface.setVisible(true);
					}
				}
				else {
					JOptionPane.showMessageDialog(btnLogin,"login unsuccessful" );					
				}
				
			}
			catch(Exception e) {
				
			}
			}
		}});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
		btnLogin.setBounds(365, 276, 90, 30);
		panel.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 634, 491);
		label.setIcon(new ImageIcon("images\\Screen-Shot-2017-12-16-at-1.31.32-PM.png"));
		panel.add(label);
	}


}
