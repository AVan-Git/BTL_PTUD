/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dao.NhanvienDAO;
import dao.TaiKhoanDAO;
import dao.impl.NhanvienImpl;
import dao.impl.TaiKhoanImpl;
import entity.KhachHang;
import entity.NhanVien;
import entity.TaiKhoan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class QLNV extends javax.swing.JFrame implements ActionListener, MouseListener {

	private DefaultTableModel modelTable;

	/**
	 * Creates new form QLNV
	 */
	public QLNV() {
		initComponents();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		X = new javax.swing.JButton();
		txtHoTenNV = new swing.TextField();
		txtDiaChiNV = new swing.TextField();
		txtSoDTNV = new swing.TextField();
		cbbNgay = new swing.Combobox();
		cbbThang = new swing.Combobox();
		cbbNam = new swing.Combobox();
		btnXoaNV = new swing.Button();
		btnCapNhatNV = new swing.Button();
		btnThemNV = new swing.Button();
		jScrollPane1 = new javax.swing.JScrollPane();
		tableQLNV = new swing.Table();
		jLabel7 = new javax.swing.JLabel();
		txtMaNV = new swing.TextField();
		btnLamMoi = new swing.Button();
		jLabel5 = new javax.swing.JLabel();
		cbbCaLam = new swing.Combobox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(204, 204, 204));
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(153, 255, 153));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		jLabel1.setText("Quản Lý Nhân Viên");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 51, 51));
		jLabel4.setText("Năm Sinh");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 51, 51));
		jLabel2.setText("Họ Tên");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 51, 51));
		jLabel6.setText("Địa Chỉ");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 51, 51));
		jLabel3.setText("Số Điện Thoại");

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		txtHoTenNV.setHintText("Hoàng Kha Khoa");

		txtDiaChiNV.setHintText("556 Đinh Tiên Hoàng");

		txtSoDTNV.setHintText("0222222222");

		cbbNgay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07",
				"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31" }));

		cbbThang.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

		cbbNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2021", "2020", "2019", "2018", "2017",
				"2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004",
				"2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991",
				"1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978",
				"1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965",
				"1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952",
				"1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939",
				"1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926",
				"1925", "1924", "1923", "1922", "1921" }));

		btnXoaNV.setText("Xóa Nhân Viên");
		btnXoaNV.setColor1(new java.awt.Color(255, 51, 51));
		btnXoaNV.setColor2(new java.awt.Color(255, 153, 153));
		btnXoaNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		btnCapNhatNV.setText("Cập nhật thông tin");
		btnCapNhatNV.setColor1(new java.awt.Color(255, 51, 51));
		btnCapNhatNV.setColor2(new java.awt.Color(255, 153, 153));
		btnCapNhatNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		btnThemNV.setText("Thêm Nhân Viên");
		btnThemNV.setColor1(new java.awt.Color(255, 51, 51));
		btnThemNV.setColor2(new java.awt.Color(255, 153, 153));
		btnThemNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		tableQLNV.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Năm sinh", "Ca làm", "Địa chỉ" }));
		tableQLNV.setShowGrid(true);
		jScrollPane1.setViewportView(tableQLNV);

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(255, 51, 51));
		jLabel7.setText("Mã nhân viên");

		txtMaNV.setHintText("NV0001");

		btnLamMoi.setText("Làm mới");
		btnLamMoi.setColor1(new java.awt.Color(255, 51, 51));
		btnLamMoi.setColor2(new java.awt.Color(255, 153, 153));
		btnLamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 51, 51));
		jLabel5.setText("Ca Làm");

		cbbCaLam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(234, 234, 234).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2).addComponent(jLabel6))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57)
														.addComponent(txtHoTenNV,
																javax.swing.GroupLayout.PREFERRED_SIZE, 271,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														jPanel1Layout.createSequentialGroup().addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(txtDiaChiNV,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 271,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31)
										.addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(110, 110, 110)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(btnCapNhatNV, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(91, 91, 91)
												.addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
																126, Short.MAX_VALUE)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel5).addGap(0, 0, Short.MAX_VALUE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		false)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(cbbNgay,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				61,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18, 18, 18)
																		.addComponent(cbbThang,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				61,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(cbbNam,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				89,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(txtSoDTNV,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 271,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(cbbCaLam, javax.swing.GroupLayout.PREFERRED_SIZE,
																61, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addContainerGap(344, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(0,
												0, Short.MAX_VALUE))))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jLabel1).addGap(487, 487, 487).addComponent(X))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 271,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))))
				.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(X).addComponent(jLabel1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel7).addComponent(jLabel3))
								.addComponent(txtSoDTNV, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2).addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel6))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(cbbCaLam, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
																14, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(3, 3, 3)))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCapNhatNV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
		btnCapNhatNV.addActionListener(this);
		btnThemNV.addActionListener(this);
		btnXoaNV.addActionListener(this);
		btnLamMoi.addActionListener(this);
		tableQLNV.addMouseListener(this);

		txtMaNV.setEnabled(false);
		btnCapNhatNV.setEnabled(false);
		btnXoaNV.setEnabled(false);

		cbbNam.addActionListener(this);
		cbbThang.addActionListener(this);
		cbbNgay.addActionListener(this);

//      
		modelTable = (DefaultTableModel) tableQLNV.getModel();
		addTable_sql();

		tableQLNV.setDefaultEditor(Object.class, null);
//	
		addComboBox();
	}// </editor-fold>//GEN-END:initComponents

	private void XActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XActionPerformed
		// TODO add your handling code here:
		new QL(QL.taiKhoan).setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_XActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new QLNV().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private swing.Button btnCapNhatNV;
	private swing.Button btnLamMoi;
	private swing.Button btnThemNV;
	private swing.Button btnXoaNV;
	private swing.Combobox cbbCaLam;
	private swing.Combobox cbbNam;
	private swing.Combobox cbbNgay;
	private swing.Combobox cbbThang;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private swing.Table tableQLNV;
	private swing.TextField txtDiaChiNV;
	private swing.TextField txtHoTenNV;
	private swing.TextField txtMaNV;
	private swing.TextField txtSoDTNV;
	// End of variables declaration//GEN-END:variables
	NhanvienDAO nhanVienDAO = new NhanvienImpl();

	@Override
	public void mouseClicked(MouseEvent e) {
		btnCapNhatNV.setEnabled(true);
		btnLamMoi.setEnabled(true);
		btnThemNV.setEnabled(true);
		btnXoaNV.setEnabled(true);

		int row = tableQLNV.getSelectedRow();

		txtMaNV.setText(modelTable.getValueAt(row, 0).toString());
		txtHoTenNV.setText(modelTable.getValueAt(row, 1).toString());
		txtDiaChiNV.setText(modelTable.getValueAt(row, 5).toString());
		txtSoDTNV.setText(modelTable.getValueAt(row, 2).toString());

//		
		String ngaySinh = modelTable.getValueAt(row, 3).toString();

		cbbNam.setSelectedItem(ngaySinh.substring(0, 4));
		cbbThang.setSelectedItem(ngaySinh.substring(5, 7));
		cbbNgay.setSelectedItem(ngaySinh.substring(8, 10));

		cbbCaLam.setSelectedItem(modelTable.getValueAt(row, 4));

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnLamMoi)) {
			XoaRongJText();
		} else if (o.equals(btnThemNV)) {

			if (check_data()) {
				getThemNhanVien();
			}

		} else if (o.equals(btnCapNhatNV)) {

			if (check_data()) {
				getSuaNhanVien();
			}
		} else if (o.equals(btnXoaNV)) {

			getXoaNhanVien();
		} else if (o.equals(cbbThang)) {
			getCBBThang();
		} else if (o.equals(cbbNam)) {
			getCBBNam();
		} else if (o.equals(cbbCaLam)) {
//			getCBBCaLam();
		}

	}

//	private void getCBBCaLam() {
//		int calam = Integer.parseInt(cbbCaLam.getSelectedItem().toString());
//		
//	}
	private void getCBBNam() {
		String dd = cbbNgay.getSelectedItem().toString();
		String mm = cbbThang.getSelectedItem().toString();
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

		if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0)) {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07",
						"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
						"24", "25", "26", "27", "28", "29" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			}

		} else {
			if (mm.equals("02")) {
				cbbNgay.setModel(new DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07",
						"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
						"24", "25", "26", "27", "28" }));
			} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30" }));

			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			}

		}

		cbbNgay.setSelectedItem(dd);

	}

	private void getCBBThang() {
		String dd = cbbNgay.getSelectedItem().toString();
		String mm = cbbThang.getSelectedItem().toString();
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());
		if (mm.equalsIgnoreCase("02")) {
			if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0)) {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28", "29" }));
			} else {
				cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05",
						"06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
						"22", "23", "24", "25", "26", "27", "28" }));
			}

		} else if (mm.equals("04") || mm.equals("06") || mm.equals("09") || mm.equals("11")) {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06",
					"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
					"23", "24", "25", "26", "27", "28", "29", "30" }));

		} else {
			cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06",
					"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
					"23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		}
		cbbNgay.setSelectedItem(dd);

	}

	private void addComboBox() {
		GregorianCalendar gcalendar = new GregorianCalendar();

		String dd = "" + gcalendar.get(Calendar.DATE);
		String mm = "" + (gcalendar.get(Calendar.MONTH) + 1);
		String yy = "" + gcalendar.get(Calendar.YEAR);

		cbbNgay.setSelectedItem(dd);
		cbbThang.setSelectedItem(mm);
		cbbNam.setSelectedItem(yy);

	}

//	
	private void addTable_sql() {
		List<NhanVien> dsNhanVien = nhanVienDAO.getDsNhanVien();

		for (NhanVien a : dsNhanVien) {
			modelTable.addRow(new Object[] { a.getMaNV(), a.getTenNV(), a.getSoDT(), a.getNamSinh(), a.getCaLam(),
					a.getDiaChi() });
		}

		txtMaNV.setText(phatSinhMa());
	}

//
	private String phatSinhMa() {
		String ma_new = "";
		String ma_old = nhanVienDAO.getMaCuoiNV();

		String ma0_2 = ma_old.substring(0, 2);
		String ma3_7 = ma_old.substring(3, 7);

		int n = Integer.parseInt(ma3_7) + 1;

		if (n < 10) {
			ma_new = ma0_2 + "0000" + n;
		} else if (n < 100) {
			ma_new = ma0_2 + "000" + n;
		} else if (n < 1000) {
			ma_new = ma0_2 + "00" + n;
		} else if (n < 10000) {
			ma_new = ma0_2 + "0" + n;
		} else if (n < 100000) {
			ma_new = ma0_2 + "" + n;
		} else
			System.err.println("Full ma");

		return ma_new;
	}

//    
	private void getXoaNhanVien() {
		String ma_xoa = txtMaNV.getText().trim();

		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa mã: " + ma_xoa + " không?", "Cảnh Báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

			TaiKhoanDAO taiKhoanDAO = new TaiKhoanImpl();

			List<TaiKhoan> dsTaiKhoan = taiKhoanDAO.getTaiKhoan_maNV(ma_xoa);
			for (TaiKhoan tk : dsTaiKhoan) {
				taiKhoanDAO.xoaTaiKhoan(tk.getTenTK());
			}

			nhanVienDAO.xoaNhanVien(ma_xoa);

			XoaRongJText();
		}

	}

//
	private void getThemNhanVien() {
		String ma = phatSinhMa();
		String hoten = txtHoTenNV.getText().trim();
		String diaChi = txtDiaChiNV.getText().trim();
		String soDT = txtSoDTNV.getText().trim();
		int calam = cbbCaLam.getSelectedIndex();

		int dd = Integer.parseInt(cbbNgay.getSelectedItem().toString());
		int mm = Integer.parseInt(cbbThang.getSelectedItem().toString()) - 1;
		int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

		NhanVien a = new NhanVien(ma, hoten, new Date(yy - 1900, mm, dd), soDT, diaChi, calam);
//		NhanVien a = new NhanVien(ma, hoten, soDT, new Date(yy - 1900, mm, dd), diaChi);
		if (nhanVienDAO.themNhanVien(a)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công.");

			XoaRongJText();
		}

	}

//
	private void getSuaNhanVien() {

		String ma = txtMaNV.getText().trim();
		String hoten = txtHoTenNV.getText().trim();

		if (JOptionPane.showConfirmDialog(this,
				"Bạn có muốn sửa lại thông tin cho mã:' " + ma + " ' có tên là:' " + hoten + " '" + " không?",
				"Cảnh Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

			String diaChi = txtSoDTNV.getText().trim();
			String soDT = txtSoDTNV.getText().trim();
			String email = txtSoDTNV.getText().trim();
			int calam = cbbCaLam.getSelectedIndex();

			int dd = Integer.parseInt(cbbNgay.getSelectedItem().toString());
			int mm = Integer.parseInt(cbbThang.getSelectedItem().toString()) - 1;
			int yy = Integer.parseInt(cbbNam.getSelectedItem().toString());

			NhanVien a = new NhanVien(ma, hoten, new Date(yy - 1900, mm, dd), soDT, diaChi, calam);

			if (nhanVienDAO.suaNhanVien(a)) {

				JOptionPane.showMessageDialog(this, "Cập nhật thành công.");

				XoaRongJText();

			}
		}
	}

	private void XoaRongJText() {
		txtMaNV.setText(phatSinhMa());
		txtHoTenNV.setText("");
		txtSoDTNV.setText("");
		txtDiaChiNV.setText("");
		txtHoTenNV.requestFocus();
//		
		btnThemNV.setEnabled(true);
		btnCapNhatNV.setEnabled(false);
		btnXoaNV.setEnabled(false);
//        
		DefaultTableModel dm = (DefaultTableModel) tableQLNV.getModel();
		dm.getDataVector().removeAllElements();
//		
		addTable_sql();

		addComboBox();
	}

	private boolean check_data() {
		String ten = txtHoTenNV.getText().trim();
		String Sodt = txtSoDTNV.getText().trim();

		if (!(ten.length() > 0 && ten.matches(
				"^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ]+[aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]*(\\s*[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ]+[aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]*)$"))) {

			if (ten.length() == 0) {
				JOptionPane.showMessageDialog(this, "Hãy nhập tên nhân viên.");
			} else {
				JOptionPane.showMessageDialog(this, "Tên nhân viên không sử dụng ký tự đặc biệt(!@#$%^&*...).");
			}
			txtHoTenNV.selectAll();
			txtHoTenNV.requestFocus();
			return false;
		}

		if (!(Sodt.length() > 0 && Sodt.matches("^(84|0[3|5|7|8|9])+([0-9]{8})+$"))) {

			if (Sodt.length() == 0) {
				JOptionPane.showMessageDialog(this, "Hãy nhập số điện thoại nhân viên.");
			} else {
				JOptionPane.showMessageDialog(this,
						"Số điện thoại nhân vi không sử dụng ký tự chữ, theo VD sau \nVD: 0963325809");
			}
			txtSoDTNV.selectAll();
			txtSoDTNV.requestFocus();
			return false;
		}

		return true;
	}
}
