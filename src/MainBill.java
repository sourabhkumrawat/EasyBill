import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class MainBill {

	JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldID;
	private JTextField textFieldMonth;
	private JTextField textFieldUnit;
	private JTextField textFieldAmount;
	private JTextField textField;
	private JTextField txtMmyyyy;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	String id;
	public void setId(String id)
	{
		this.id=id;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainBill window = new MainBill();
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
	public MainBill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Name  :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(114, 63, 143, 20);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCustomerId = new JLabel("Customer ID  :");
		lblCustomerId.setForeground(new Color(255, 250, 250));
		lblCustomerId.setBounds(156, 94, 101, 20);
		lblCustomerId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomerId.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblCustomerId);
		JPanel panel = new JPanel();
		panel.setBounds(32, 305, 485, 139);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		JLabel lblBillingMonth = new JLabel("Billing Month  :");
		lblBillingMonth.setForeground(new Color(255, 250, 250));
		lblBillingMonth.setBounds(114, 127, 143, 20);
		lblBillingMonth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBillingMonth.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblBillingMonth);
		
		JLabel lblUnits = new JLabel("Units  :");
		lblUnits.setForeground(new Color(255, 250, 250));
		lblUnits.setBounds(114, 158, 143, 20);
		lblUnits.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnits.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblUnits);
		
		JLabel lblCostPerUnit = new JLabel("Cost per Unit  :");
		lblCostPerUnit.setForeground(new Color(255, 250, 250));
		lblCostPerUnit.setBounds(114, 189, 143, 20);
		lblCostPerUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostPerUnit.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblCostPerUnit);
		
		JLabel lblTotalAmmount = new JLabel("Total Amount :");
		lblTotalAmmount.setForeground(new Color(255, 250, 250));
		lblTotalAmmount.setBounds(156, 220, 101, 20);
		lblTotalAmmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmmount.setFont(new Font("Arial", Font.BOLD, 15));
		frame.getContentPane().add(lblTotalAmmount);
		
		JLabel lblBillingDetails = new JLabel("Billing Details :");
		lblBillingDetails.setBounds(10, 11, 242, 20);
		lblBillingDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblBillingDetails.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblBillingDetails);
		
		JLabel label_1 = new JLabel("\u20B9 9");
		label_1.setBounds(277, 193, 121, 20);
		frame.getContentPane().add(label_1);
		
		JButton btnPayNow = new JButton("PAY NOW");
		btnPayNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
			}
		});
		btnPayNow.setBounds(234, 266, 89, 23);
		frame.getContentPane().add(btnPayNow);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(277, 64, 121, 20);
		textFieldName.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(277, 95, 121, 20);
		textFieldID.setColumns(10);
		textFieldID.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(textFieldID);
		
		textFieldMonth = new JTextField();
		textFieldMonth.setBounds(277, 128, 121, 20);
		textFieldMonth.setColumns(10);
		textFieldMonth.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(textFieldMonth);
		
		textFieldUnit = new JTextField();
		textFieldUnit.setBounds(277, 159, 121, 20);
		textFieldUnit.setColumns(10);
		textFieldUnit.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(textFieldUnit);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(277, 221, 121, 20);
		textFieldAmount.setColumns(10);
		textFieldAmount.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(textFieldAmount);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Card no-");
		lblNewLabel_1.setBounds(24, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("    /    /    /   ");
		textField.setBounds(87, 8, 65, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Validity");
		lblNewLabel_2.setBounds(24, 52, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtMmyyyy = new JTextField();
		txtMmyyyy.setText("MM/YYYY");
		txtMmyyyy.setBounds(87, 49, 53, 20);
		panel.add(txtMmyyyy);
		txtMmyyyy.setColumns(10);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setBounds(24, 96, 46, 14);
		panel.add(lblCvv);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 93, 46, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPayNow_1 = new JButton("PAY ");
		btnPayNow_1.setBounds(248, 105, 89, 23);
		panel.add(btnPayNow_1);
		frame.setBounds(100, 100, 556, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
			
			//String fetch = ;
			
			PreparedStatement psmt=(PreparedStatement) con.prepareStatement("select * from registration");
			//psmt.setString(1,id);
//			psmt.setString(1, (String)lblNewLabel.getSelectedItem());

			ResultSet rest=psmt.executeQuery();
			while(rest.next()) {
				textFieldName.setText(rest.getString("name"));
				textFieldID.setText(rest.getString("id"));
			}
			
//			   .setText(rs.getString(1));
//
//               tf2.setText(rs.getString(2));
//
//               tf3.setText(rs.getString(3));
//
//               tf4.setText(rs.getString(4));
//			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
			
			String fetch = "select * from calculatebill";
			PreparedStatement psmt=(PreparedStatement) con.prepareStatement(fetch);
//			psmt.setString(1, (String)lblNewLabel.getSelectedItem());

			ResultSet rest=psmt.executeQuery();
			while(rest.next()) {
				textFieldMonth.setText(rest.getString("month"));
				textFieldUnit.setText(rest.getString("units"));
				textFieldAmount.setText(rest.getString("amt"));
			}
			
			
//			   .setText(rs.getString(1));
//
//               tf2.setText(rs.getString(2));
//
//               tf3.setText(rs.getString(3));
//
//               tf4.setText(rs.getString(4));
//			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
