package GUI.Dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.Size;

import dao.SachDAO;
import dao.impl.SachImpl;
import entity.Sach;

import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class DialogTongTKSach extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTongSach;
	private JTextField txtSoQuyen;
	private JTextField txtTongGia;
	private JComboBox<String> cbbLoaiSach;

	private SachDAO sachDAO = new SachImpl();
	List<Sach> dsSach = sachDAO.getDsSach();
	private JLabel lblNewLabel_1;

	private DecimalFormat dformat = new DecimalFormat("###,###,###.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogTongTKSach frame = new DialogTongTKSach();
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
	public DialogTongTKSach() {
		setResizable(false);
		setTitle("Thống kê Sách");
		setSize(450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		cbbLoaiSach = new JComboBox();
		cbbLoaiSach.addItem("    <== Chọn loại sách ==>");
		cbbLoaiSach.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbbLoaiSach.setBounds(85, 29, 250, 32);
		panel.add(cbbLoaiSach);

		JLabel lblNewLabel = new JLabel("Tổng số tên sách:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(65, 85, 136, 32);
		panel.add(lblNewLabel);

		JLabel lblTngSQuyn = new JLabel("Tổng số quyển:");
		lblTngSQuyn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTngSQuyn.setBounds(65, 132, 120, 32);
		panel.add(lblTngSQuyn);

		txtTongSach = new JTextField();
		txtTongSach.setEditable(false);
		txtTongSach.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTongSach.setHorizontalAlignment(SwingConstants.CENTER);
		txtTongSach.setBounds(201, 85, 157, 32);
		panel.add(txtTongSach);
		txtTongSach.setColumns(10);

		JLabel lblTngGiThnh = new JLabel("Tổng giá thành:");
		lblTngGiThnh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTngGiThnh.setBounds(65, 179, 120, 32);
		panel.add(lblTngGiThnh);

		txtSoQuyen = new JTextField();
		txtSoQuyen.setEditable(false);
		txtSoQuyen.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoQuyen.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSoQuyen.setColumns(10);
		txtSoQuyen.setBounds(201, 132, 157, 32);
		panel.add(txtSoQuyen);

		txtTongGia = new JTextField();
		txtTongGia.setEditable(false);
		txtTongGia.setHorizontalAlignment(SwingConstants.CENTER);
		txtTongGia.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtTongGia.setColumns(10);
		txtTongGia.setBounds(201, 179, 157, 32);
		panel.add(txtTongGia);

		lblNewLabel_1 = new JLabel("VND");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(371, 178, 45, 32);
		panel.add(lblNewLabel_1);
//		
		cbbLoaiSach.addActionListener(this);
		addCBBLoaiSach();
	}

	private void addCBBLoaiSach() {
		int s2 = 0;
		double s3 = 0.0;

		for (Sach a : dsSach) {
			s2 += a.getSoLuong();
			s3 += a.getGiaThanh() * a.getSoLuong();
		}
		xuatThongTin(dsSach.size(), s2, s3);
		
		List<String> loaiString = sachDAO.getDsLoaiSach();
		for (String str : loaiString) {

			cbbLoaiSach.addItem("     " + str);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();
		if (o.equals(cbbLoaiSach)) {
			getThongTin();
		}
	}

	private void getThongTin() {
		int row = cbbLoaiSach.getSelectedIndex();
		int s1 = 0;
		int s2 = 0;
		double s3 = 0.0;
		String loaiString;

		if (row == 0) {
//			loaiString = null; 
//			xuatThongTin(loaiString);
			s1 = dsSach.size();

			for (Sach a : dsSach) {
				s2 += a.getSoLuong();
				s3 += a.getGiaThanh() * a.getSoLuong();
			}
			xuatThongTin(s1, s2, s3);
		} else {
			loaiString = cbbLoaiSach.getItemAt(row);

			for (Sach a : dsSach) {
				if (a.getLoai().equals(cbbLoaiSach.getSelectedItem().toString().trim())) {
					s1++;
					s2 += a.getSoLuong();
					s3 += a.getGiaThanh() * a.getSoLuong();
				}
			}
			xuatThongTin(s1, s2, s3);
		}
	}

	private void xuatThongTin(int s1, int s2, double s3) {
		txtTongSach.setText(s1 + "");
		txtSoQuyen.setText(s2 + "");
		txtTongGia.setText(dformat.format(s3));
	}

//
}
