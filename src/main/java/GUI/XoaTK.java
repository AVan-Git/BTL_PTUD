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
import javax.swing.table.DefaultTableModel;

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
public class XoaTK extends JFrame implements ActionListener {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton X;
	private javax.swing.JButton btnHuy;
	private javax.swing.JButton btnXoa;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblQLy;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable table;
	private DefaultTableModel modelTable;

    private String tk = QL.taiKhoan;    	    

	private NhanvienDAO nhanvienDAO = new NhanvienImpl();
	private TaiKhoanDAO taiKhoanDAO = new TaiKhoanImpl();

	private NhanVien nvQL = nhanvienDAO.getNhanVien_TaiKhoan(tk);

	/**
	 * Creates new form XoaTK
	 */
	public XoaTK() {
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
		jLabel1 = new javax.swing.JLabel();
		btnXoa = new javax.swing.JButton();
		btnHuy = new javax.swing.JButton();
		lblQLy = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		X = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setPreferredSize(new java.awt.Dimension(1361, 767));


		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Xóa Tài Khoản");

		btnXoa.setBackground(new java.awt.Color(255, 102, 0));
		btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnXoa.setText("Xóa");

		btnHuy.setBackground(new java.awt.Color(255, 102, 0));
		btnHuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnHuy.setText("Hủy");
		
		X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        X.setForeground(new java.awt.Color(255, 0, 0));
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

		lblQLy.setText("Quản lý:");

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Tên nhân viên", "Số điện thoại", "Tên tài khoản" }));
		jScrollPane1.setViewportView(table);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(482, 482, 482)
                .addComponent(X)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblQLy, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(X))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(lblQLy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

		pack();
		setLocationRelativeTo(null);
//        
		btnHuy.addActionListener(this);
		btnXoa.addActionListener(this);
//        
		lblQLy.setText("Quản lý: " + nvQL.getTenNV());
//        
		modelTable = (DefaultTableModel) table.getModel();
		addTable_SQL();
		
		table.setDefaultEditor(Object.class, null);
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
			java.util.logging.Logger.getLogger(XoaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(XoaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(XoaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(XoaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new XoaTK().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();
		if (o.equals(btnHuy)) {
			new QL(tk).setVisible(true);
			this.setVisible(false);
		} else if (o.equals(btnXoa)) {
			System.err.println("btnXoa");
			getXoaTaiKhoan();
		}
	}

//	
	private void getXoaTaiKhoan() {
		int row = table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "Hãy chọn nhân viên muốn xóa. \nPlease.");
			return;
		}
		String tenNV = modelTable.getValueAt(row, 0).toString();

		if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa tài khoản của nhân viên " + tenNV, "Cảnh báo",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			String tenTK = modelTable.getValueAt(row, 2).toString();
			
			taiKhoanDAO.xoaTaiKhoan(tenTK);
			
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.getDataVector().removeAllElements();
			
			addTable_SQL();			
		}

	}

//
	private void addTable_SQL() {
		List<NhanVien> dsNhanVien = nhanvienDAO.getDsNhanVien_NguoiQL(nvQL.getMaNV());

		for (NhanVien a : dsNhanVien) {
			List<TaiKhoan> dsTaiKhoan = taiKhoanDAO.getTaiKhoan_maNV(a.getMaNV());

			for (TaiKhoan tk : dsTaiKhoan) {
				modelTable.addRow(new Object[] { a.getTenNV(), a.getSoDT(), tk.getTenTK() });
			}
		}

	}

	// End of variables declaration//GEN-END:variables
}
