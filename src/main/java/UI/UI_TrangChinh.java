package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import org.supermarket.entity.Employee;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.Point;
import java.awt.ComponentOrientation;
import javax.swing.DebugGraphics;
import java.awt.Insets;

public class UI_TrangChinh extends JFrame {

	private JPanel contentPane;
	private final Employee employee;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UI_TrangChinh frame = new UI_TrangChinh(employee);
//					frame.setLocationRelativeTo(frame);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public UI_TrangChinh(Employee employee) {
		this.employee = employee;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1438, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Form bên trái màn hình

		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIconTextGap(10);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\home.png"));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1.setBounds(42, 137, 225, 62);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sản Phẩm");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_SanPham UI_SP = new UI_SanPham(employee);
				UI_SP.setLocationRelativeTo(null);
				UI_SP.show();
				dispose();
			}
		});
		btnNewButton_1_1.setIconTextGap(10);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\bag.png"));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_1.setBounds(42, 281, 225, 62);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Nhân Viên");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_NhanVienn UI_NV = new UI_NhanVienn(employee);
				UI_NV.setLocationRelativeTo(null);
				UI_NV.show();
				dispose();
			}
		});
		btnNewButton_1_2.setIconTextGap(10);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\customer.png"));
		btnNewButton_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_2.setBounds(42, 353, 225, 62);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("Thống Kê");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_ThongKe UI_TK = new UI_ThongKe(employee);
				UI_TK.setLocationRelativeTo(null);
				UI_TK.show();
				dispose();
			}
		});
		btnNewButton_1_3.setIconTextGap(10);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\analytics.png"));
		btnNewButton_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
		btnNewButton_1_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_3.setBounds(42, 425, 225, 62);
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("Khách Hàng");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_KhachHang UI_KH = new UI_KhachHang(employee);
				UI_KH.setLocationRelativeTo(null);
				UI_KH.show();
				dispose();
			}

		});
		btnNewButton_1_4.setIconTextGap(10);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\service (2).png"));
		btnNewButton_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
		btnNewButton_1_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_4.setBounds(42, 497, 225, 62);
		contentPane.add(btnNewButton_1_4);

		JButton btnNewButton_1_5 = new JButton("Đăng Xuất");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_DangNhap UI_DN = new UI_DangNhap();
				UI_DN.setLocationRelativeTo(null);
				UI_DN.show();
				dispose();
			}
		});
		btnNewButton_1_5.setIconTextGap(10);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_5
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\logout.png"));
		btnNewButton_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
		btnNewButton_1_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_5.setBounds(42, 569, 225, 62);
		contentPane.add(btnNewButton_1_5);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setIconTextGap(20);
		lblNewLabel
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\taikhoan (1).png"));
		lblNewLabel.setBounds(117, 25, 70, 70);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(employee.getName());
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(42, 98, 225, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\6928.jpg_wh860.jpg"));
		lblNewLabel_2.setAutoscrolls(true);
		lblNewLabel_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(332, 66, 1080, 634);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton_1_6 = new JButton("Hóa Đơn");
		btnNewButton_1_6.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_1_6.setAutoscrolls(true);
		btnNewButton_1_6.setIconTextGap(10);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_HoaDon UI_HD = new UI_HoaDon(employee);
				UI_HD.setLocationRelativeTo(null);
				UI_HD.show();
				dispose();
			}
		});
		btnNewButton_1_6
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\bill (3).png"));
		btnNewButton_1_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_6.setBounds(42, 209, 225, 62);
		contentPane.add(btnNewButton_1_6);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Trang Ch\u1EE7", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 312, 688);
		contentPane.add(panel);

		JLabel lblNewLabel_3 = new JLabel("CHƯƠNG TRÌNH QUẢN LÍ MUA BÁN THỰC PHẨM");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(329, 10, 1083, 46);
		contentPane.add(lblNewLabel_3);
	}

}
