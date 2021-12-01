package GUI.Dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FormTieuSu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormTieuSu frame = new FormTieuSu("");
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
	public FormTieuSu(String tieuSu) {
		setTitle("Tiểu Sử Tác Giả");
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 14));
		setLocationRelativeTo(null);
		setSize(500, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtTieuSu = new JTextArea();
		txtTieuSu.setEditable(false);
		txtTieuSu.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTieuSu.setLineWrap(true);
		txtTieuSu.setWrapStyleWord(true);
		txtTieuSu.setBounds(10, 20, 466, 353);
		txtTieuSu.setText(tieuSu);
		contentPane.add(txtTieuSu);
	}
}
