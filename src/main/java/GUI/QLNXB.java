/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */

import dao.NhaXuatBanDAO;
import dao.impl.NhaXuatBanImpl;
import entity.KhachHang;
import entity.NhaXuatBan;

public class QLNXB extends JFrame implements ActionListener, MouseListener {

	/**
	 * Creates new form QLNXB
	 */
	public QLNXB() {
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
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		txtMa = new javax.swing.JTextField();
		txtTen = new javax.swing.JTextField();
		txtDiachi = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		btnThem = new javax.swing.JButton();
		btnSua = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		X = new javax.swing.JButton();
		btnRefresh = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Quản Lý Nhà Xuất Bản");

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ" }));
		jScrollPane1.setViewportView(table);

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 102, 0));
		jLabel2.setText("Mã nhà xuất bản");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 102, 0));
		jLabel5.setText("Địa chỉ");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 102, 0));
		jLabel6.setText("Tên nhà xuất bản");

		btnThem.setBackground(new java.awt.Color(255, 102, 0));
		btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnThem.setText("Thêm");

		btnSua.setBackground(new java.awt.Color(255, 102, 0));
		btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnSua.setText("Cập nhật");

		btnXoa.setBackground(new java.awt.Color(255, 102, 0));
		btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnXoa.setText("Xóa");

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		btnRefresh.setBackground(new java.awt.Color(255, 102, 0));
		btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		btnRefresh.setText("Làm mới");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1).addGap(312, 312, 312).addComponent(X))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(96, 96, 96)
												.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(126, 126, 126).addComponent(btnSua).addGap(216, 216, 216)
												.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(145, 145, 145).addComponent(btnRefresh))
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2).addComponent(jLabel6).addComponent(jLabel5))
												.addGap(51, 51, 51).addComponent(jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 765,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 50, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel1).addComponent(X))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(77, 77, 77).addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(75, 75, 75).addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(81, 81, 81).addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(83, 83, 83))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(23, 23, 23)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
//        
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnRefresh.addActionListener(this);
		btnXoa.addActionListener(this);
		txtDiachi.addActionListener(this);
		table.addMouseListener(this);
//        
		btnSua.setEnabled(false);
		btnXoa.setEnabled(false);
		txtMa.setEnabled(false);

//        
		modelTable = (DefaultTableModel) table.getModel();

		addTable_sql(nhaXBDAO.getDsNhaXuatBan());

		table.setDefaultEditor(Object.class, null);

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
			java.util.logging.Logger.getLogger(QLNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(QLNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(QLNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(QLNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new QLNXB().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTable table;
	private javax.swing.JButton X;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnRefresh;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtDiachi;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtTen;
	private DefaultTableModel modelTable;

	NhaXuatBanDAO nhaXBDAO = new NhaXuatBanImpl();

	// End of variables declaration//GEN-END:variables
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int row = table.getSelectedRow();

		txtMa.setText(modelTable.getValueAt(row, 0).toString());
		txtTen.setText(modelTable.getValueAt(row, 1).toString());
		txtDiachi.setText(modelTable.getValueAt(row, 2).toString());
//		
		btnSua.setEnabled(true);
		btnXoa.setEnabled(true);
		btnThem.setEnabled(false);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();
		if (o.equals(btnRefresh)) {
			XoaRongJText();
		} else if (o.equals(btnThem) || o.equals(txtDiachi)) {

			if (check_data()) {
				getThemNhaXB();
			}

		} else if (o.equals(btnSua)) {

			if (check_data()) {
				getSuaNhaXB();
			}
		} else if (o.equals(btnXoa)) {
			getXoaNhaXB();
		}

	}

//
	private void getXoaNhaXB() {
		String maXoa = txtMa.getText().trim();
		String ten = txtTen.getText().trim();
		if (nhaXBDAO.getSoSachHienCoCuaNhaXB(maXoa) == 0) {
			
			if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa mã: " + maXoa + " không?", "Cảnh Báo",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				nhaXBDAO.xoaNhaXuatBan(maXoa);

				XoaRongJText();
			}
		} else {
			JOptionPane.showMessageDialog(this, "Hãy xóa hết các quyển sách đến từ nhà sản suất ' "+ ten +" ' trong quản lý sách trước. thanks.");
		}

	}

//
	private void getSuaNhaXB() {
		String ma = txtMa.getText().trim();
		String ten = txtTen.getText().trim();
		String diaChi = txtDiachi.getText().trim();
		
		NhaXuatBan a = new NhaXuatBan(diaChi, ma, ten);
		
		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa lại thông tin cho mã:' " + ma+" ' có tên là:' "+ten+" '" + " không?", "Cảnh Báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			 
			if (nhaXBDAO.suaNhaXuatBan(a)) {

				JOptionPane.showMessageDialog(this, "Cập nhật thành công.");

				XoaRongJText();
				
			}
		}
	}

//
	private void getThemNhaXB() {
		String ma = txtMa.getText().trim();
		String ten = txtTen.getText().trim();
		String diaChi = txtDiachi.getText().trim();
		
		NhaXuatBan a = new NhaXuatBan(diaChi, ma, ten);
		
		if (nhaXBDAO.themNhaXuatBan(a)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công.");

			XoaRongJText();
		}
	}
//
	private void XoaRongJText() {
		txtMa.setText(maPhatSinh());
		txtTen.setText("");
		txtDiachi.setText("");
//		
		btnSua.setEnabled(false);
		btnXoa.setEnabled(false);
		btnThem.setEnabled(true);
//        
		addTable_sql(nhaXBDAO.getDsNhaXuatBan());
		//
	}
//
	private String maPhatSinh() {
		String ma_new = "";
		String ma_old = nhaXBDAO.getMaCuoi();

		String ma0_3 = ma_old.substring(0, 3);
		String ma3_8 = ma_old.substring(3, 8);

		int n = Integer.parseInt(ma3_8) + 1;

		if (n < 10) {
			ma_new = ma0_3 + "0000" + n;
		} else if (n < 100) {
			ma_new = ma0_3 + "000" + n;
		} else if (n < 1000) {
			ma_new = ma0_3 + "00" + n;
		} else if (n < 10000) {
			ma_new = ma0_3 + "0" + n;
		} else if (n < 99999) {
			ma_new = ma0_3 + "" + n;
		} else
		{
			ma_new = "NXB99999";
			System.err.println("Full ma");
			JOptionPane.showMessageDialog(this, "Bộ nhớ đã bị đầy");
			
		}

		return ma_new;
	}

//	
	private void addTable_sql(List<NhaXuatBan> dsNhaXB) {

		txtMa.setText(maPhatSinh());
//    	
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();

		for (NhaXuatBan a : dsNhaXB) {
//			 "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ"
			modelTable.addRow(new Object[] { a.getMaNXB(), a.getTenNXB(), a.getDiachi() });
		}
	}
	//
	private boolean check_data() {
		// TODO Auto-generated method stub
		return true;
	}
}
