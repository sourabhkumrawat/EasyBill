import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.TextField;
import javax.swing.JTextPane;
import java.awt.Color;

public class DialogAtAdmin extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogAtAdmin dialog = new DialogAtAdmin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogAtAdmin() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(211, 211, 211));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Name  :");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(27, 11, 132, 28);
		contentPanel.add(lblNewLabel);
		
		JLabel lblCustomerId = new JLabel("Customer ID  :");
		lblCustomerId.setForeground(new Color(0, 0, 128));
		lblCustomerId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomerId.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCustomerId.setBounds(27, 50, 132, 28);
		contentPanel.add(lblCustomerId);
		
		JLabel lblBillNumber = new JLabel("Bill Number  :");
		lblBillNumber.setForeground(new Color(0, 0, 128));
		lblBillNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBillNumber.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBillNumber.setBounds(27, 89, 132, 28);
		contentPanel.add(lblBillNumber);
		
		JLabel lblConsumedUnits = new JLabel("Consumed Units  :");
		lblConsumedUnits.setForeground(new Color(0, 0, 128));
		lblConsumedUnits.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConsumedUnits.setFont(new Font("Arial", Font.PLAIN, 15));
		lblConsumedUnits.setBounds(27, 128, 132, 28);
		contentPanel.add(lblConsumedUnits);
		
		JLabel lblTotalAmount = new JLabel("Total Amount  :");
		lblTotalAmount.setForeground(new Color(0, 0, 128));
		lblTotalAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmount.setFont(new Font("Arial", Font.BOLD, 16));
		lblTotalAmount.setBounds(27, 167, 132, 44);
		contentPanel.add(lblTotalAmount);
		
		JTextPane AtAdminTotalAmt = new JTextPane();
		AtAdminTotalAmt.setBackground(new Color(211, 211, 211));
		AtAdminTotalAmt.setBounds(169, 189, 210, 22);
		contentPanel.add(AtAdminTotalAmt);
		
		JTextPane atAdminCusName = new JTextPane();
		atAdminCusName.setBackground(new Color(211, 211, 211));
		atAdminCusName.setBounds(165, 17, 214, 22);
		contentPanel.add(atAdminCusName);
		
		JTextPane AtAdminCusId = new JTextPane();
		AtAdminCusId.setBackground(new Color(211, 211, 211));
		AtAdminCusId.setBounds(165, 56, 214, 22);
		contentPanel.add(AtAdminCusId);
		
		JTextPane AtAdminBillNo = new JTextPane();
		AtAdminBillNo.setBackground(new Color(211, 211, 211));
		AtAdminBillNo.setBounds(165, 95, 214, 22);
		contentPanel.add(AtAdminBillNo);
		
		JTextPane AtAdminCusUnit = new JTextPane();
		AtAdminCusUnit.setBackground(new Color(211, 211, 211));
		AtAdminCusUnit.setBounds(165, 134, 214, 22);
		contentPanel.add(AtAdminCusUnit);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButtonAtAdminDialod = new JButton("OK");
				okButtonAtAdminDialod.setActionCommand("OK");
				buttonPane.add(okButtonAtAdminDialod);
				getRootPane().setDefaultButton(okButtonAtAdminDialod);
			}
			{
				JButton cancelButtonAtAdminDialog = new JButton("Cancel");
				cancelButtonAtAdminDialog.setActionCommand("Cancel");
				buttonPane.add(cancelButtonAtAdminDialog);
			}
		}
	}
}
