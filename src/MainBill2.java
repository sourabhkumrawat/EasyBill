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

public class MainBill2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBill2 window = new MainBill2();
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
	public MainBill2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Name  :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(60, 32, 101, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCustomerId = new JLabel("Customer ID  :");
		lblCustomerId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomerId.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCustomerId.setBounds(60, 63, 101, 20);
		frame.getContentPane().add(lblCustomerId);
		
		JLabel lblBillingMonth = new JLabel("Billing Month  :");
		lblBillingMonth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBillingMonth.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBillingMonth.setBounds(60, 96, 101, 20);
		frame.getContentPane().add(lblBillingMonth);
		
		JLabel lblUnits = new JLabel("Units  :");
		lblUnits.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnits.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUnits.setBounds(60, 127, 101, 20);
		frame.getContentPane().add(lblUnits);
		
		JLabel lblCostPerUnit = new JLabel("Cost per Unit  :");
		lblCostPerUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostPerUnit.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCostPerUnit.setBounds(60, 158, 101, 20);
		frame.getContentPane().add(lblCostPerUnit);
		
		JLabel lblTotalAmmount = new JLabel("Total Amount :");
		lblTotalAmmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmmount.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTotalAmmount.setBounds(60, 189, 101, 20);
		frame.getContentPane().add(lblTotalAmmount);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTax.setBounds(60, 220, 101, 20);
		frame.getContentPane().add(lblTax);
		
		JLabel lblFinalAmount = new JLabel("Final Amount :");
		lblFinalAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFinalAmount.setFont(new Font("Arial", Font.BOLD, 14));
		lblFinalAmount.setBounds(60, 251, 101, 32);
		frame.getContentPane().add(lblFinalAmount);
		
		JLabel lblBillingDetails = new JLabel("Billing Details :");
		lblBillingDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblBillingDetails.setFont(new Font("Arial", Font.BOLD, 14));
		lblBillingDetails.setBounds(60, 12, 242, 20);
		frame.getContentPane().add(lblBillingDetails);
		
		JLabel label = new JLabel("12%");
		label.setBounds(171, 224, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u20B99");
		label_1.setBounds(171, 162, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnPayNow = new JButton("Pay Now");
		btnPayNow.setBounds(378, 260, 89, 23);
		frame.getContentPane().add(btnPayNow);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(171, 36, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(171, 67, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(171, 100, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(171, 131, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(171, 193, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Arial", Font.PLAIN, 13));
		label_7.setBounds(171, 260, 75, 23);
		frame.getContentPane().add(label_7);
		frame.setBounds(100, 100, 562, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill","root","123456");
			
			String query = "select * from calculatebill where cust_id=id";
			PreparedStatement psmt=(PreparedStatement) con.prepareStatement(query);

			ResultSet rs=psmt.executeQuery();
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
