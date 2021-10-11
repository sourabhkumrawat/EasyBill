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

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.sql.*;
import javax.swing.*;
public class AdminWindow {

	JFrame frmBoltBillingInterface;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JPasswordField passwordField1;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTable tableViewCust;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWindow window = new AdminWindow();
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
	public AdminWindow() {
		
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
		frmBoltBillingInterface.setTitle("Bolt Billing Interface");
		frmBoltBillingInterface.setResizable(false);
		frmBoltBillingInterface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sourabh\\Desktop\\Lightning_bolt.png"));
		frmBoltBillingInterface.setBounds(100, 100, 450, 336);
		frmBoltBillingInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmBoltBillingInterface.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblElectricityBillPayment = new JLabel("Electricity Bill Payment ");
		lblElectricityBillPayment.setBounds(171, 11, 279, 48);
		lblElectricityBillPayment.setForeground(SystemColor.text);
		lblElectricityBillPayment.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(lblElectricityBillPayment);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 70, 634, 421);
		panel.add(tabbedPane);
		
		JPanel CusReg = new JPanel();
		CusReg.setOpaque(false);
		tabbedPane.addTab("Customer Registration", null, CusReg, null);
		CusReg.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(50, 11, 515, 371);
		CusReg.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCustomerRegistration = new JLabel("Customer Registration");
		lblCustomerRegistration.setFont(new Font("Arial", Font.BOLD, 18));
		lblCustomerRegistration.setBounds(161, 11, 203, 31);
		panel_1.add(lblCustomerRegistration);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(82, 69, 90, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password\r\n");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassword.setBounds(82, 109, 90, 14);
		panel_1.add(lblPassword);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 13));
		lblName.setBounds(82, 147, 90, 14);
		panel_1.add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact No.");
		lblContactNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblContactNumber.setBounds(82, 186, 90, 14);
		panel_1.add(lblContactNumber);
		
		JLabel lblEmailId = new JLabel("E-mail ID");
		lblEmailId.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailId.setBounds(82, 227, 90, 14);
		panel_1.add(lblEmailId);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.BOLD, 13));
		lblAddress.setBounds(82, 264, 90, 14);
		panel_1.add(lblAddress);
		
		textField1 = new JTextField();
		textField1.setBounds(278, 67, 140, 20);
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(278, 145, 140, 20);
		panel_1.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(278, 184, 140, 20);
		panel_1.add(textField3);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(278, 225, 140, 20);
		panel_1.add(textField4);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(278, 262, 140, 20);
		panel_1.add(textField5);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(278, 108, 140, 18);
		panel_1.add(passwordField1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
//					if(textField1.getText().equals(null)|passwordField1.getText()=null|textField2.getText()=null|textField3.getText()=null|textField4.getText()=null|textField5.getText()=null)
//					{
//						JOptionPane.showMessageDialog(tabbedPane,"enter all the information");
//					}
					String qry = "INSERT INTO registration values(?,?,?,?,?,?)";
					PreparedStatement ps=(PreparedStatement) con.prepareStatement(qry);
					ps.setString(1,textField1.getText());
					ps.setString(2,passwordField1.getText());
					ps.setString(3,textField2.getText());
					ps.setString(4,textField3.getText());
					ps.setString(5,textField4.getText());
					ps.setString(6,textField5.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(null,"Registration Complete" );
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(205, 337, 89, 23);
		panel_1.add(btnNewButton);
		
		JPanel ViewCus = new JPanel();
		ViewCus.setOpaque(false);
		tabbedPane.addTab("View Customer", null, ViewCus, null);
		ViewCus.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(58, 11, 520, 371);
		
		ViewCus.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(39, 28, 451, 235);
		panel_2.add(scrollPane);
		
		tableViewCust = new JTable();
		scrollPane.setViewportView(tableViewCust);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Connection con;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
					String query = "select id,name,contact,email,address from registration";
				    java.sql.PreparedStatement pst=con.prepareStatement(query);
					ResultSet rst=pst.executeQuery();
					tableViewCust.setModel(DbUtils.resultSetToTableModel(rst));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnRefresh.setBounds(191, 306, 115, 23);
		panel_2.add(btnRefresh);
		
		JPanel CalBill = new JPanel();
		CalBill.setOpaque(false);
		tabbedPane.addTab("Calculate Bill", null, CalBill, null);
		CalBill.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setOpaque(false);
		panel_3.setBounds(55, 11, 515, 371);
		CalBill.add(panel_3);
		
		JLabel lblCalculateBill = new JLabel("Calculate Bill");
		lblCalculateBill.setFont(new Font("Arial", Font.BOLD, 18));
		lblCalculateBill.setBounds(182, 11, 131, 31);
		panel_3.add(lblCalculateBill);
		
		JLabel lblCustomerNo = new JLabel("Customer No.");
		lblCustomerNo.setFont(new Font("Arial", Font.BOLD, 13));
		lblCustomerNo.setBounds(82, 110, 90, 14);
		panel_3.add(lblCustomerNo);
		
		JLabel lblBillNo = new JLabel("Bill No.");
		lblBillNo.setFont(new Font("Arial", Font.BOLD, 13));
		lblBillNo.setBounds(82, 147, 90, 14);
		panel_3.add(lblBillNo);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Arial", Font.BOLD, 13));
		lblMonth.setBounds(82, 186, 90, 14);
		panel_3.add(lblMonth);
		
		JLabel lblConsumedUnits = new JLabel("Consumed Units");
		lblConsumedUnits.setFont(new Font("Arial", Font.BOLD, 13));
		lblConsumedUnits.setBounds(82, 227, 108, 14);
		panel_3.add(lblConsumedUnits);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(278, 108, 140, 20);
		panel_3.add(textField_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(278, 145, 140, 20);
		panel_3.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(278, 225, 140, 20);
		panel_3.add(textField_8);
		String[] months = {"January","Fabuary","March","April","May","June","July","August","September","October","November","December"};
		JComboBox comboBox = new JComboBox(months);
		comboBox.setToolTipText("select1");
		comboBox.setBounds(278, 184, 140, 20);
		panel_3.add(comboBox);
		
		JButton btnCalculate = new JButton("calculate");
		btnCalculate.setBounds(178, 285, 89, 23);
		panel_3.add(btnCalculate);
		String choice=(String) comboBox.getSelectedItem();
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogAtAdmin aaa = new DialogAtAdmin();
				JOptionPane.showConfirmDialog(null,"Do You Want to Submit Bill.");
				AdminWindow.this.frmBoltBillingInterface.setVisible(false);
				AdminWindow window = new AdminWindow();
				window.frmBoltBillingInterface.setVisible(true);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
					
					String qury = "INSERT INTO calculatebill values(?,?,?,?,?)";
					PreparedStatement psmt=(PreparedStatement) con.prepareStatement(qury);
					psmt.setString(1,textField_1.getText());
					psmt.setString(2,choice);
					psmt.setString(3,textField_6.getText());
					psmt.setString(4,textField_8.getText());
					int amt=(Integer.parseInt(textField_8.getText()))*9;
					psmt.setInt(5,amt);
					

					psmt.execute();
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				AdminWindow.this.frmBoltBillingInterface.setVisible(false);
				LoginPage l=new LoginPage();
				l.frmBoltBillingInterface.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Sourabh\\Downloads\\icons8-shutdown-48 (2).png"));
		button.setBounds(559, 21, 51, 48);
		panel.add(button);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBounds(0, 0, 634, 491);
		label.setIcon(new ImageIcon("images\\Screen-Shot-2017-12-16-at-1.31.32-PM.png"));
		panel.add(label);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
