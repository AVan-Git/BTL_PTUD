/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import GUI.Dialog.DialogTongTKSach;
import constant.Value;
import dao.SachDAO;
import dao.impl.SachImpl;
import entity.Sach;

/**
 *
 * @author LENOVO
 */
public class Thongkesach extends JFrame implements ActionListener {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnTKeSoLuong;
	private javax.swing.JButton btnHetHang;
	private javax.swing.JButton btnTKeGia;
	private javax.swing.JButton btnTong;
	private javax.swing.JButton btnTonKho;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable table;
	private javax.swing.JLabel txtSoLuong;
	private DefaultTableModel modelTable;
	private int ma1 = 1;
	private int ma2 = 1;

	private String tk = QL.taiKhoan;

	private SachDAO sachDao = new SachImpl();

	private List<Sach> dsSach = sachDao.getDsSach();

	/**
	 * Creates new form Thongkesach
	 */
	public Thongkesach() {
		initComponents();
		this.setLocationRelativeTo(null);
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
		btnHetHang = new javax.swing.JButton();
		btnTKeSoLuong = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		btnTKeGia = new javax.swing.JButton();
		btnTonKho = new javax.swing.JButton();
		btnTong = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		txtSoLuong = new javax.swing.JLabel();
		X = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setPreferredSize(new java.awt.Dimension(1361, 767));
		btnHetHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnHetHang.setForeground(new java.awt.Color(255, 102, 0));
		btnHetHang.setText("Sách hết hàng");
		btnHetHang.setToolTipText("Hiện những quyển sách còn ít trong cửa hàng.");

		btnTKeSoLuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnTKeSoLuong.setForeground(new java.awt.Color(255, 102, 0));
		btnTKeSoLuong.setText("Thống kế theo số lượng");
		btnTKeSoLuong.setToolTipText("Thống kế theo số lượng.");

		table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã sách", "Tên sách", "Thể loại", "Giá thành", "Số lượng trong kho", "Số sách đã bán" }));
		jScrollPane1.setViewportView(table);

		btnTKeGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnTKeGia.setForeground(new java.awt.Color(255, 102, 0));
		btnTKeGia.setText("Thống kê theo giá");
		btnTKeGia.setToolTipText("Thống kê theo giá thành.");

		btnTonKho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnTonKho.setForeground(new java.awt.Color(255, 102, 0));
		btnTonKho.setText("Sách tồn kho");
		btnTonKho.setToolTipText("Hiện 10 quyển sách có số lượng nhiều nhất.");

		btnTong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnTong.setForeground(new java.awt.Color(255, 102, 0));
		btnTong.setText("Tổng sách");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setText("Tổng số lượng: ");

		txtSoLuong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		txtSoLuong.setForeground(new java.awt.Color(255, 102, 0));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25)
						.addComponent(btnTKeSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
						.addGap(71, 71, 71)
						.addComponent(btnTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(77, 77, 77).addComponent(btnTKeGia).addGap(95, 95, 95)
						.addComponent(btnHetHang, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(78, 78, 78)
						.addComponent(btnTong, javax.swing.GroupLayout.PREFERRED_SIZE, 136,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addComponent(jScrollPane1).addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
						.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2).addGap(18, 18, 18).addComponent(txtSoLuong,
								javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(63, 63, 63)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(99, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTKeGia, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnHetHang, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTKeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTong, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(32, 32, 32)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE,
										36, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(16, 16, 16)));

		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		X.setForeground(new java.awt.Color(255, 0, 0));
		X.setText("X");
		X.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				XActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setText("Thống kê số lượng sách");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel1).addGap(426, 426, 426).addComponent(X).addContainerGap())
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(X))
						.addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
//      
		modelTable = (DefaultTableModel) table.getModel();
		addTable_SQL(dsSach);
		table.setDefaultEditor(Object.class, null);
//      
		btnTKeSoLuong.addActionListener(this);
		btnHetHang.addActionListener(this);
		btnTKeGia.addActionListener(this);
		btnTonKho.addActionListener(this);
		btnTong.addActionListener(this);
//		
//		txtSoLuong.setEditable(false);
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
			java.util.logging.Logger.getLogger(Thongkesach.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Thongkesach.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Thongkesach.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Thongkesach.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Thongkesach().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnTonKho)) {
			System.err.println("TonKho - 1");
			getTonKho();
		} else if (o.equals(btnHetHang)) {
			System.err.println("HetHang - 2");
			getHetHang();
		} else if (o.equals(btnTKeGia)) {
			System.err.println("TKeGia - 3-4");
			getTKeGia();
		} else if (o.equals(btnTKeSoLuong)) {
			System.err.println("TKeSoLuong - 5-6");
			getTKeSoLuong();
		} else if (o.equals(btnTong)) {
			System.err.println("Tong()");
			new DialogTongTKSach().setVisible(true);
		}
	}

	private void getTKeSoLuong() {
		if (ma1 != 5) {
			Collections.sort(dsSach, new Comparator<Sach>() {

				@Override
				public int compare(Sach s1, Sach s2) {
					return s1.getSoLuong() - s2.getSoLuong();
				}
			});
			addTable_SQL(dsSach);
			ma1 = 5;
		} else if (ma1 != 6) {
			Collections.sort(dsSach, new Comparator<Sach>() {

				@Override
				public int compare(Sach s1, Sach s2) {
					return s2.getSoLuong() - s1.getSoLuong();
				}
			});
			addTable_SQL(dsSach);
			ma1 = 6;
		} else {
			ma1 = 0;
		}
	}

	private void getTKeGia() {
		if (ma1 != 3) {
			Collections.sort(dsSach, new Comparator<Sach>() {

				@Override
				public int compare(Sach s1, Sach s2) {
					return (int) (s1.getGiaThanh() - s2.getGiaThanh());
				}
			});
			addTable_SQL(dsSach);
			ma1 = 3;
		} else if (ma1 != 4) {
			Collections.sort(dsSach, new Comparator<Sach>() {

				@Override
				public int compare(Sach s1, Sach s2) {
					return (int) (s2.getGiaThanh() - s1.getGiaThanh());
				}
			});
			addTable_SQL(dsSach);
			ma1 = 4;
		} else {
			ma1 = 0;
		}
	}

	private void getTonKho() {
		if (ma1 != 1) {
			List<Sach> list = new ArrayList<>();
			for (Sach a : dsSach) {
				if (a.getSoLuong() >= 100) {
					list.add(a);
				}
			}
			addTable_SQL(list);
			ma1 = 1;
		} else {
			addTable_SQL(dsSach);
			ma1 = 0;
		}
	}

	private void getHetHang() {
		if (ma1 != 2) {
			List<Sach> list = new ArrayList<>();
			for (Sach a : dsSach) {
				if (a.getSoLuong() <= 20) {
					list.add(a);
				}
			}
			addTable_SQL(list);
			ma1 = 2;
		} else {
			addTable_SQL(dsSach);
			ma1 = 0;
		}
	}

	private void addTable_SQL(List<Sach> dsSach) {
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
		int soLuong = 0;
		int soLuong2 = 0;
		Map<String, Integer> map = sachDao.getSoLuongSachDaBan();
		Set<String> data = map.keySet();

		for (Sach a : dsSach) {

			for (String key : data) {
				if (key.equals(a.getMaSach())) {
					soLuong2 = map.get(key);
				}
			}

			soLuong += a.getSoLuong();
			modelTable.addRow(new Object[] { a.getMaSach(), a.getTenSach(), a.getLoai(), a.getGiaThanh(), a.getSoLuong(), soLuong2

			});
		}
		txtSoLuong.setText(soLuong + "");
	}

	// End of variables declaration//GEN-END:variables
}
