import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CustomerWindow {

	JFrame frmBoltBillingInterface;
	private static JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerWindow window = new CustomerWindow();
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
	public CustomerWindow() {
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
		
		JPanel BillView = new JPanel();
		BillView.setOpaque(false);
		tabbedPane.addTab("View Bill", null, BillView, null);
		BillView.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(50, 11, 515, 371);
		BillView.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCustomerRegistration = new JLabel("VIEW  BILL");
		lblCustomerRegistration.setFont(new Font("Arial", Font.BOLD, 18));
		lblCustomerRegistration.setBounds(187, 11, 150, 31);
		panel_1.add(lblCustomerRegistration);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(82, 142, 90, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(278, 140, 140, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		String id1=textField.getText();
		
		JButton btnNewButton = new JButton("View Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainBill window = new MainBill();
				window.setId(id1);
//				window.setMonth(comboBox_1.getSelectedItem());
				window.frame.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(201, 284, 89, 23);
		panel_1.add(btnNewButton);
		
		String[] months = {"January","Fabuary","March","April","May","June","July","August","September","October","November","Dicember"};
		JComboBox comboBox_1 = new JComboBox(months);
		comboBox_1.setBounds(278, 211, 140, 20);
		panel_1.add(comboBox_1);
		
		JLabel label_1 = new JLabel("Month");
		label_1.setFont(new Font("Arial", Font.BOLD, 13));
		label_1.setBounds(82, 213, 90, 14);
		panel_1.add(label_1);
		
		JPanel CusCom = new JPanel();
		CusCom.setOpaque(false);
		tabbedPane.addTab("Complaint", null, CusCom, null);
		CusCom.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBounds(55, 11, 515, 371);
		CusCom.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCalculateBill = new JLabel("Complaint Form");
		lblCalculateBill.setBounds(174, 11, 167, 31);
		lblCalculateBill.setFont(new Font("Arial", Font.BOLD, 18));
		panel_3.add(lblCalculateBill);
		
		JLabel lblCutomerId = new JLabel("Customer ID");
		lblCutomerId.setBounds(71, 103, 108, 29);
		lblCutomerId.setFont(new Font("Arial", Font.BOLD, 16));
		panel_3.add(lblCutomerId);
		
		JLabel lblComplaint = new JLabel("Complaint");
		lblComplaint.setBounds(71, 203, 108, 29);
		lblComplaint.setFont(new Font("Arial", Font.BOLD, 16));
		panel_3.add(lblComplaint);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(240, 207, 243, 87);
		panel_3.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 109, 243, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(197, 319, 120, 41);
		panel_3.add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerWindow.this.frmBoltBillingInterface.setVisible(false);
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
}
