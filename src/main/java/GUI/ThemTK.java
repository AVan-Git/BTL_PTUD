/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.NhanvienDAO;
import dao.TaiKhoanDAO;
import dao.impl.NhanvienImpl;
import dao.impl.TaiKhoanImpl;
import entity.NhanVien;
import entity.TaiKhoan;

/**
 *
 * @author LENOVO
 */
public class ThemTK extends JFrame implements ActionListener {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnRefresh;
	private javax.swing.JButton btnThem;
	private javax.swing.JComboBox<String> cbbNhanVien;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField txtSoDTNV;
	private javax.swing.JTextField txtSoDTQL;
	private javax.swing.JTextField txtTaikhoan;
	private javax.swing.JTextField txtPass;
	private javax.swing.JTextField txtTenNV;
	private javax.swing.JTextField txtTenQL;

	private NhanvienDAO nhanvienDAO = new NhanvienImpl();
	private TaiKhoanDAO taiKhoanDAO = new TaiKhoanImpl();

//	private String tk = "Admin";
	private String tk = QL.taiKhoan;
	

	NhanVien nvQL = nhanvienDAO.getNhanVien_TaiKhoan(tk);

	/**
	 * Creates new form ThemTK
	 */
	public ThemTK() {
		initComponents();
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
		jLabel2 = new javax.swing.JLabel();
		txtTaikhoan = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		btnThem = new javax.swing.JButton();
		X = new javax.swing.JButton();
		btnRefresh = new javax.swing.JButton();
		cbbNhanVien = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		txtTenNV = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtSoDTNV = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		txtTenQL = new javax.swing.JTextField();
		txtSoDTQL = new javax.swing.JTextField();
		txtPass = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setPreferredSize(new java.awt.Dimension(1361, 767));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Thêm Tài Khoản");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel2.setText("Tên Tài Khoản");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel3.setText("Mật Khẩu");

		btnThem.setBackground(new java.awt.Color(255, 102, 0));
		btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnThem.setText("Thêm");

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
		btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnRefresh.setText("Làm mới");

		cbbNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <<== Chọn nhân viên ==>> " }));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setText("Tên nhân viên");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setText("Số điện thoại nhân viên:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel6.setText("Số điện thoại người quản lý");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel7.setText("Tên người quản lý ");

		jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
		jSeparator2.setAutoscrolls(true);

	       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap(154, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(jLabel1)
	                        .addGap(501, 501, 501)
	                        .addComponent(X))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(134, 134, 134)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(cbbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(txtSoDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(60, 60, 60))
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGap(77, 77, 77)
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(jLabel2)))
	                                        .addGap(130, 130, 130)))
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel3)
	                                    .addComponent(jLabel7)
	                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(txtTenQL)
	                                    .addComponent(txtSoDTQL, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(144, 144, 144))))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(X)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(jLabel1)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(59, 59, 59)
	                        .addComponent(jLabel7)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(txtTenQL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtSoDTQL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(cbbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(28, 28, 28)
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(1, 1, 1)
	                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(txtSoDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(32, 32, 32)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGap(157, 157, 157)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addGap(133, 133, 133))
	        );

	        jSeparator2.getAccessibleContext().setAccessibleParent(this);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

		pack();
		setLocationRelativeTo(null);
//        
		txtTenQL.setEditable(false);
		txtTenQL.setText(nvQL.getTenNV());

		txtSoDTQL.setEditable(false);
		txtSoDTQL.setText(nvQL.getSoDT());
//        
		btnRefresh.addActionListener(this);
		btnThem.addActionListener(this);

		cbbNhanVien.addActionListener(this);
//        
		txtTenNV.setEditable(false);
		txtSoDTNV.setEditable(false);
		addCBB_sql();

//        

	}// </editor-fold>//GEN-END:initComponents

	private void XActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XActionPerformed
		// TODO add your handling code here:
		new QL(tk).setVisible(true);
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
			java.util.logging.Logger.getLogger(ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ThemTK().setVisible(true);
			}
		});
	}

	// End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		if (o.equals(btnRefresh)) {
			System.err.println("btnRefresh");
			XoaRongJtext();
		} else if (o.equals(cbbNhanVien)) {
			System.err.println("cbbNhanVien");
			int row = cbbNhanVien.getSelectedIndex();
			if (row == 0) {
				txtTenNV.setText("");
				txtSoDTNV.setText("");
			} else {
				String nv = cbbNhanVien.getItemAt(row);
				String manv = "NV" + nv.substring(0, 5);

				NhanVien a = nhanvienDAO.timKiem_id(manv);
				txtTenNV.setText(a.getTenNV());
				txtSoDTNV.setText(a.getSoDT());
			}

		} else if (o.equals(btnThem)) {
			System.err.println("btnThem");
			if (check_data()) {
				String nv = cbbNhanVien.getSelectedItem().toString();
				String manv = "NV" + nv.substring(0, 5);

				NhanVien a = nhanvienDAO.timKiem_id(manv);
				
				a.setQuanLyNV(nvQL);
				nhanvienDAO.suaNhanVien(a);
				
				String pass = txtPass.getText().trim();
				String user = txtTaikhoan.getText().trim();
				taiKhoanDAO.themTaiKhoan(new TaiKhoan(user, pass, a));
				
				JOptionPane.showMessageDialog(this, "Tạo thành công.");
				
				XoaRongJtext();
				addCBB_sql();
			}

		}
	}

	private boolean check_data() {
		System.out.println("Check_data()");
		List<NhanVien> dsNhanVien = nhanvienDAO.getDsNhanVien_0_NguoiQL();

		int maCheck = setData_tenNV(dsNhanVien, txtTenNV);
		String err = "";

		if (maCheck != 1) {
			if (maCheck == 0) {
				err = "Chưa nhập tên nhân viên. \nHoặc hãy chọn dựa theo danh sách ở trên.";
			} else
				err = "Tên nhân viên đã có tài khoản. \n Hoặc tên nhân viên chưa được đăng ký. \nHãy chọn dựa theo danh sách ở trên.";
			return getERR(txtTenNV, err);
		}
		//

		maCheck = setData_SoDT(dsNhanVien, txtSoDTNV);

		if (maCheck != 1) {
			if (maCheck == 0) {
				err = "Chưa nhập số điện thoại của nhân viên. \nHoặc hãy chọn dựa theo danh sách ở trên.";
			} else
				err = "Tên nhân viên đã có tài khoản. \n Hoặc số điện thoai nhân viên chưa được đăng ký. \nHãy chọn dựa theo danh sách ở trên.";
			return getERR(txtSoDTNV, err);
		}
		//
		List<TaiKhoan> dsTaiKhoan = taiKhoanDAO.getDsTaiKhoan();
		maCheck = setData_TaiKhoan(dsTaiKhoan, txtTaikhoan);

		if (maCheck != 1) {
			if (maCheck == 0) {
				err = "Chưa nhập tài khoản của nhân viên. ";
			} else if (maCheck == -2) {
				err = "Tên tài khoản không sử dụng ký tự đặc biệt(!@#$%^&*...). \nHãy sử dụng dấu '_' thay cho đấu cách nếu bạn cần. \nPhải trên 4 ký tự và viết không có đấu.";
			}else  {
				err = "Tên tài khoản có trong hệ thống,\nHãy nhập một tài khoản mới.";
			}
			return getERR(txtTaikhoan, err);
		}
		//
		String pass = txtPass.getText().trim();
		if (!(pass.length() > 0 && pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+-=]).{6,20}$"))) {
			if (pass.length() == 0) {
				err = "Hãy nhập mật khẩu.";
			} else
				err = "Mật khẩu từ 6 đến 20 kí tự, bao gồm: \nÍt nhất 1 kí tự chữ in hoa. \n"
						+ "Ít nhất 1 kí tự chữ in thường. \nÍt nhất 1 kí tự số. \nÍt nhất 1 kí tự đặc biệt(!@#$%^&*()_+-=";
			return getERR(txtPass, err);
		}

		return true;
	}

	private int setData_TaiKhoan(List<TaiKhoan> dsTaiKhoan, JTextField txt) {
		String x = txt.getText().trim();
		if (x.length() == 0) {
			return 0;
		} else {
			for (TaiKhoan tk : dsTaiKhoan) {
				if (tk.getTenTK().equalsIgnoreCase(x)) {
					return -1;
				}
			}
		}
		//.matches("^[a-zA-z0-9_]{4,}$")
		if (!x.matches("^[a-zA-z0-9_]{4,}$")) {
			return -2;
		}
		return 1;
	}
//
	private int setData_SoDT(List<NhanVien> dsNhanVien, JTextField txt) {
		String x = txt.getText().trim();
		if (x.length() == 0) {
			return 0;
		} else {
			for (NhanVien nv : dsNhanVien) {
				if (nv.getSoDT().equalsIgnoreCase(x)) {
					return 1;
				}

			}
		}
		return -1;
	}

	private boolean getERR(JTextField txt, String err) {
		JOptionPane.showMessageDialog(this, err);
		txt.selectAll();
		txt.requestFocus();
		return false;
	}
//
	private int setData_tenNV(List<NhanVien> dsNhanVien, JTextField txt) {
		String x = txt.getText().trim();
		if (x.length() == 0) {
			return 0;
		} else {
			for (NhanVien nv : dsNhanVien) {
				if (nv.getTenNV().equalsIgnoreCase(x)) {
					return 1;
				}
			}
		}
		return -1;
	}
//
	private void XoaRongJtext() {
		txtPass.setText("");
		txtSoDTNV.setText("");
		txtTaikhoan.setText("");
		txtTenNV.setText("");

		cbbNhanVien.setSelectedIndex(0);

		txtTaikhoan.requestFocus();
	}

	private void addCBB_sql() {
		List<NhanVien> dsNhanVien = nhanvienDAO.getDsNhanVien_0_NguoiQL();

		for (NhanVien nv : dsNhanVien) {
			if (nv.getMaNV().equals(nvQL.getMaNV())) {
				continue;
			}
			String a = nv.getMaNV().substring(2, 7) + " - " + nv.getTenNV();

			cbbNhanVien.addItem(a);
		}

	}

}
