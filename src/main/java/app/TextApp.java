package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextApp extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextApp frame = new TextApp();
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
	public TextApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btn = new JButton("New button");
		btn.setBounds(145, 45, 150, 27);
		panel.add(btn);
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btn)) {
			thanhToan();
			
		}
	}

	private boolean thanhToan() {
		String tien = JOptionPane.showInputDialog("Hãy nhập số tiền khách hàng gửi.");
		if(tien == null) {
			JOptionPane.showMessageDialog(this, "Thanh toán hóa đơn không thành công.");
			return false;
		}
		double x = 0.0;
		try {
			x = Double.parseDouble(tien);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Hãy nhập bằng ký tự số");
			return false;
		}
		
		if (x < 10000) {
			JOptionPane.showMessageDialog(this, "Thanh toán hóa đơn không thành công. \nSố tiền chưa đủ.");
			return false;
		}
		int gia = 5000;
		JOptionPane.showMessageDialog(this, "Số tiền dư là: "+(x-gia));
		System.out.println(tien);
		System.out.println(x);
		return true;
		
	}
}
