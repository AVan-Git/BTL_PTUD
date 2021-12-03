package GUI.Dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.CT_HoaDonDAO;
import dao.HoaDonDAO;
import dao.impl.CT_HoaDonImpl;
import dao.impl.HoaDonImpl;
import entity.CT_HoaDon;
import entity.HoaDon;

import javax.swing.JScrollPane;
import java.awt.Color;

public class DialogCT_HoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaHD;
	private JTextField txtNgayLap;
	private JTextField txtTenNV;
	private JTextField txtDTNV;
	private JTextField txtTenKH;
	private JTextField txtDTKH;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private DefaultTableModel modelTable;
	private JTextField txtTongTien;

	private HoaDonDAO hoaDonDAO = new HoaDonImpl();
	private CT_HoaDonDAO ct_HoaDonDAO = new CT_HoaDonImpl();

	private SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
	private DecimalFormat dfMonkey = new DecimalFormat("###,###,###.0");
	
	private static String maHD = "HD00001";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogCT_HoaDon frame = new DialogCT_HoaDon(maHD);
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
	public DialogCT_HoaDon(String maHD) {
		setResizable(false);
		setTitle("Chi tiết hóa đơn.");
		setSize(1300, 750);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHI TIẾT HÓA ĐƠN BÁN HÀNG");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(483, 20, 299, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 131, 100, 32);
		panel.add(lblNewLabel_1);
		
		txtMaHD = new JTextField();
		txtMaHD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMaHD.setText("HD00001");
		txtMaHD.setEditable(false);
		txtMaHD.setBounds(150, 132, 200, 32);
		panel.add(txtMaHD);
		txtMaHD.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cửa hàng bán sách JPA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(50, 89, 400, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày lập:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(50, 191, 100, 32);
		panel.add(lblNewLabel_1_1);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNgayLap.setText("12-12-2021");
		txtNgayLap.setEditable(false);
		txtNgayLap.setColumns(10);
		txtNgayLap.setBounds(150, 194, 200, 32);
		panel.add(txtNgayLap);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Họ tên nhân viên:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(454, 131, 114, 32);
		panel.add(lblNewLabel_1_1_1);
		
		txtTenNV = new JTextField();
		txtTenNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTenNV.setText("Nguyễn văn Hoàng");
		txtTenNV.setEditable(false);
		txtTenNV.setColumns(10);
		txtTenNV.setBounds(572, 134, 210, 32);
		panel.add(txtTenNV);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(454, 191, 100, 32);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtDTNV = new JTextField();
		txtDTNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDTNV.setText("0159357001");
		txtDTNV.setEditable(false);
		txtDTNV.setColumns(10);
		txtDTNV.setBounds(572, 194, 211, 32);
		panel.add(txtDTNV);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Họ tên khách hàng:");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2.setBounds(885, 131, 125, 32);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_3.setBounds(885, 191, 125, 32);
		panel.add(lblNewLabel_1_1_1_3);
		
		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTenKH.setText("Nguyễn văn Hoàng");
		txtTenKH.setEditable(false);
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(1011, 134, 210, 32);
		panel.add(txtTenKH);
		
		txtDTKH = new JTextField();
		txtDTKH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDTKH.setText("0159357101");
		txtDTKH.setEditable(false);
		txtDTKH.setColumns(10);
		txtDTKH.setBounds(1011, 194, 210, 32);
		panel.add(txtDTKH);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(50, 233, 1170, 2);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(830, 135, 2, 100);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(406, 135, 2, 100);
		panel.add(textField_6);
		
		JLabel lblNewLabel_3 = new JLabel("Danh sách các sản phẩm đã mua:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(50, 236, 282, 27);
		panel.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(50, 280, 1170, 365);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 S\u00E1ch", "T\u00EAn s\u00E1ch", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 th\u00E0nh", "T\u1ED5ng ti\u1EC1n"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(73);
		table.getColumnModel().getColumn(2).setMinWidth(25);
		table.getColumnModel().getColumn(3).setMinWidth(25);
		table.getColumnModel().getColumn(4).setMinWidth(25);
		table.getColumnModel().getColumn(5).setMinWidth(25);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Tổng tiền:");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_3_1.setBounds(910, 658, 100, 32);
		panel.add(lblNewLabel_1_1_1_3_1);
		
		txtTongTien = new JTextField();
		txtTongTien.setForeground(Color.BLACK);
		txtTongTien.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTongTien.setText("100,000,000,000.0");
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		txtTongTien.setBounds(1002, 658, 160, 34);
		panel.add(txtTongTien);
		
		JLabel lblNewLabel_4 = new JLabel("VND");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(1172, 658, 45, 32);
		panel.add(lblNewLabel_4);
		
//		

		table.setDefaultEditor(Object.class, null);
		modelTable = (DefaultTableModel) table.getModel();
		addData(maHD);
	}

	private void addData(String maHD) {
		double sumMonkey = 0;
		int i = 1;
		HoaDon hd = hoaDonDAO.getHoaDon_Id(maHD);
		
		txtMaHD.setText(" " + maHD);
		txtNgayLap.setText(" " + dformat.format(hd.getNgaylap()));
		txtTenNV.setText(" " + hd.getNhanVien().getTenNV());
		txtDTNV.setText(" " + hd.getNhanVien().getSoDT());
		txtTenKH.setText(" " + hd.getKhachHang().getTenKH());
		txtDTKH.setText(" " + hd.getKhachHang().getSoDT());
		
		List<CT_HoaDon> dsHD = ct_HoaDonDAO.getDsCT_HoaDon(maHD);
		
		for (CT_HoaDon a : dsHD) {
			modelTable.addRow(new Object[] {
					i++,a.getSach().getMaSach(),a.getSach().getTenSach(), a.getSoluong(), a.getGiaban(), a.getTongTien()
			});
			sumMonkey += a.getTongTien();
		}
		txtTongTien.setText(dfMonkey.format(sumMonkey));
		
	}
}
