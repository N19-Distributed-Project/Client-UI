package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.supermarket.entity.Employee;

import javax.swing.JScrollPane;

public class UI_ThongKe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_1;
	private final Employee employee;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UI_ThongKe frame = new UI_ThongKe();
//					frame.setLocationRelativeTo(null);
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
	public UI_ThongKe(Employee employee) {
		this.employee=employee;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1438, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\taikhoan (1).png"));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setIconTextGap(20);
		lblNewLabel.setBounds(117, 37, 70, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Võ Minh Anh");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setAlignmentX(1.0f);
		lblNewLabel_1.setBounds(42, 110, 225, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_TrangChinh UI_TC=new UI_TrangChinh(employee);
				UI_TC.show();
				UI_TC.setLocationRelativeTo(null);
				dispose();
			}
			
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\home.png"));
		btnNewButton_1.setIconTextGap(10);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBounds(42, 149, 225, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_6 = new JButton("Hóa Đơn");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_HoaDon UI_HD=new UI_HoaDon(employee);
				UI_HD.show();
				UI_HD.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_6.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\bill (3).png"));
		btnNewButton_1_6.setIconTextGap(10);
		btnNewButton_1_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_6.setBounds(42, 221, 225, 62);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1 = new JButton("Sản Phẩm");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_SanPham UI_SP=new UI_SanPham(employee);
				UI_SP.show();
				UI_SP.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\bag.png"));
		btnNewButton_1_1.setIconTextGap(10);
		btnNewButton_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_1.setBounds(42, 293, 225, 62);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Nhân Viên");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_NhanVienn UI_NV=new UI_NhanVienn(employee);
				UI_NV.show();
				UI_NV.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\customer.png"));
		btnNewButton_1_2.setIconTextGap(10);
		btnNewButton_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_2.setBounds(42, 365, 225, 62);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Thống Kê");
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\analytics.png"));
		btnNewButton_1_3.setIconTextGap(10);
		btnNewButton_1_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_3.setBounds(42, 437, 225, 62);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Khách Hàng");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_KhachHang UI_KH=new UI_KhachHang(employee);
				UI_KH.show();
				UI_KH.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\service (2).png"));
		btnNewButton_1_4.setIconTextGap(10);
		btnNewButton_1_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_4.setBounds(42, 509, 225, 62);
		contentPane.add(btnNewButton_1_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u1ED1ng K\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 22, 312, 688);
		contentPane.add(panel);
		
		JButton btnNewButton_1_5 = new JButton("Đăng Xuất");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_DangNhap UI_DN=new UI_DangNhap();
				UI_DN.show();
				UI_DN.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_5.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\logout.png"));
		btnNewButton_1_5.setIconTextGap(10);
		btnNewButton_1_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_5.setBounds(31, 559, 225, 62);
		panel.add(btnNewButton_1_5);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(321, 0, 1103, 710);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_1, "name_236996223720700");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(62, 73, 228, 233);
		panel_2.setBorder(new TitledBorder(null, "H\u00F4m nay (DT)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(359, 73, 228, 233);
		panel_2_1.setBorder(new TitledBorder(null, "Th\u00E1ng N\u00E0y (DT)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(62, 359, 228, 233);
		panel_2_2.setBorder(new TitledBorder(null, "B\u00ECnh Qu\u00E2n (DT)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(359, 359, 228, 233);
		panel_2_3.setBorder(new TitledBorder(null, "B\u00ECnh Qu\u00E2n Th\u00E1ng (DT)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(610, 129, 192, 386);
		panel_3.setBorder(new TitledBorder(null, "T\u00ECnh Tr\u1EA1ng S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(821, 44, 272, 595);
		panel_4.setBorder(new TitledBorder(null, "10 \u0110\u01A1n H\u00E0ng G\u1EA7n Nh\u1EA5t", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(446, 242, -227, 151);
		panel_1.add(panel_8);
		
		JButton btnNewButton_2_2 = new JButton("Thống Kê Sản Phẩm");
		
		
		btnNewButton_2_2.setBounds(215, 10, 149, 21);
		panel_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_4 = new JButton("Tổng Hợp");
		btnNewButton_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBounds(105, 10, 100, 21);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_2_1_1 = new JButton("Thống Kê Doanh Thu");
		btnNewButton_2_1_1.setBounds(374, 10, 165, 21);
		panel_1.add(btnNewButton_2_1_1);
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_237485816605800");
		panel_5.setLayout(null);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Thống Kê Doanh Thu");
		btnNewButton_2_1_1_1.setBounds(374, 10, 165, 21);
		panel_5.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_4_1 = new JButton("Tổng Hợp");
		btnNewButton_4_1.setBounds(105, 10, 100, 21);
		panel_5.add(btnNewButton_4_1);
		
		JButton btnNewButton_2_2_1 = new JButton("Thống Kê Sản Phẩm");
		btnNewButton_2_2_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_2_2_1.setContentAreaFilled(false);
		btnNewButton_2_2_1.setBounds(215, 10, 149, 21);
		panel_5.add(btnNewButton_2_2_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(52, 25, 994, 174);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Từ Ngày :");
		lblNewLabel_2.setBounds(49, 29, 86, 13);
		panel_6.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(128, 26, 200, 19);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Đến Ngày :");
		lblNewLabel_2_1.setBounds(384, 29, 104, 13);
		panel_6.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Số Sản Phẩm Tồn :");
		lblNewLabel_2_2.setBounds(10, 84, 125, 13);
		panel_6.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tổng số vốn :");
		lblNewLabel_2_3.setBounds(31, 136, 104, 13);
		panel_6.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Nhà Cung Cấp :");
		lblNewLabel_2_3_1.setBounds(365, 136, 105, 13);
		panel_6.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Loại Sản Phẩm :");
		lblNewLabel_2_2_1.setBounds(366, 84, 104, 13);
		panel_6.add(lblNewLabel_2_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(465, 26, 200, 19);
		panel_6.add(textField_1);
		
		JButton btnNewButton_3 = new JButton("Hiển Thị Sản Phẩm");
		btnNewButton_3.setBounds(738, 25, 200, 21);
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("In báo cáo");
		btnNewButton_3_1.setBounds(738, 80, 200, 21);
		panel_6.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Xuất file");
		btnNewButton_3_2.setBounds(738, 132, 200, 21);
		panel_6.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3_3.setBounds(128, 80, 200, 19);
		panel_6.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3_4.setBounds(128, 132, 200, 19);
		panel_6.add(lblNewLabel_3_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(465, 80, 200, 21);
		panel_6.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(465, 132, 200, 21);
		panel_6.add(comboBox_1_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new TitledBorder(null, "B\u1EA3ng S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6_1.setBounds(52, 209, 994, 435);
		panel_5.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 974, 402);
		panel_6_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Sản Phẩm", "Tên Sản Phẩm", "Tồn Kho", "Loại Sản Phẩm", "Nhà Cung Cấp", "Giá Nhập", "Giá Bán"
			}
		));
		
		JPanel panel_7 = new JPanel();
		layeredPane.add(panel_7, "name_238345700189100");
		panel_7.setLayout(null);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Thống Kê Doanh Thu");
		btnNewButton_2_1_1_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_2_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_1.setBounds(374, 10, 165, 21);
		panel_7.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("Thống Kê Sản Phẩm");
		btnNewButton_2_2_1_1.setBounds(215, 10, 149, 21);
		panel_7.add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Tổng Hợp");
		btnNewButton_4_1_1.setBounds(105, 10, 100, 21);
		panel_7.add(btnNewButton_4_1_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6_2.setBounds(51, 27, 994, 174);
		panel_7.add(panel_6_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Từ Ngày :");
		lblNewLabel_2_4.setBounds(42, 29, 71, 13);
		panel_6_2.add(lblNewLabel_2_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 26, 200, 19);
		panel_6_2.add(textField_6);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Đến Ngày :");
		lblNewLabel_2_1_1.setBounds(374, 29, 71, 13);
		panel_6_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Tổng Doanh Thu :");
		lblNewLabel_2_2_2.setBounds(10, 84, 103, 13);
		panel_6_2.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Số Sản Phẩm Bán :");
		lblNewLabel_2_3_2.setBounds(10, 136, 103, 13);
		panel_6_2.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Tổng Tiền Vốn :");
		lblNewLabel_2_3_1_1.setBounds(355, 136, 90, 13);
		panel_6_2.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Loại  :");
		lblNewLabel_2_2_1_1.setBounds(374, 84, 71, 13);
		panel_6_2.add(lblNewLabel_2_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(459, 26, 200, 19);
		panel_6_2.add(textField_7);
		
		JButton btnNewButton_3_3 = new JButton("Hiển Thị Doanh Thu :");
		btnNewButton_3_3.setBounds(764, 25, 200, 21);
		panel_6_2.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_1 = new JButton("In báo cáo");
		btnNewButton_3_1_1.setBounds(764, 80, 200, 21);
		panel_6_2.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Xuất file");
		btnNewButton_3_2_1.setBounds(764, 132, 200, 21);
		panel_6_2.add(btnNewButton_3_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(459, 80, 200, 21);
		panel_6_2.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3.setBounds(116, 80, 200, 19);
		panel_6_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3_1.setBounds(116, 132, 200, 19);
		panel_6_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3_2.setBounds(459, 136, 200, 19);
		panel_6_2.add(lblNewLabel_3_2);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u1EA3ng Doanh Thu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6_1_1.setBounds(51, 213, 994, 435);
		panel_7.add(panel_6_1_1);
		panel_6_1_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 974, 403);
		panel_6_1_1.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã ", "Tên Sản Phẩm", "Loại ", "Giá Bán", "Số Lượng ", "Doanh Thu"
			}
		));
		
		//panel 1 tổng hợp
		//panel 5 thống kê sản phẩm
		//panel 7 thống kê doanh thu
		
		//nút điều khiển layer tổng hợp
		btnNewButton_2_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnNewButton_2_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		//nút điều khiển layer thống kê sản phẩm
		btnNewButton_4_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		//nút điều khiển layer thống kê doanh thu
		btnNewButton_4_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
	}
}
