package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.dao.daoInterface.ProductDao;
import org.supermarket.entity.Customer;
import org.supermarket.entity.Employee;
import org.supermarket.entity.enumP.Option;

import util.Client;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class UI_NhanVienn extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_3;
	private JTable table_1;
	private JTextField textField;
	private JTextField txtNgay;
	private JTextField txtTenNV;
	private JTextField txtEmail;
	private JTextField txtDiaChi;
	private JTextField txtSDT;
	private JTextField textField_1;
	private JTextField textField_8;
	private JTable table_2;
	private JTable table_3;
	private final Employee employee ;
	private OrderDao orderDao;
	private ProductDao productDao;
	private CustomerDao customerDao;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UI_NhanVienn frame = new UI_NhanVienn(employee);
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
	public UI_NhanVienn(Employee employee) {
		this.employee=employee;
		try {
			orderDao = (OrderDao) Client.connectTo(9001, Option.ORDER_DAO);
			productDao = (ProductDao) Client.connectTo(9001, Option.PRODUCT_DAO);
			customerDao = (CustomerDao) Client.connectTo(9001, Option.CUSTOMER_DAO);

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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
		btnNewButton_1_2.setContentAreaFilled(false);
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
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_ThongKe UI_TK=new UI_ThongKe(employee);
				UI_TK.show();
				UI_TK.setLocationRelativeTo(null);
				dispose();
			}
		});
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
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nh\u00E2n Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		layeredPane.setBounds(321, 10, 1103, 700);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_126745205683600");
		panel_1.setLayout(null);
		
		JButton btnChcV = new JButton("Chức Vụ");
		
		btnChcV.setBounds(371, 10, 101, 21);
		panel_1.add(btnChcV);
		
		JButton btnTiKhon = new JButton("Tài Khoản");
		
		btnTiKhon.setBounds(260, 10, 101, 21);
		
		panel_1.add(btnTiKhon);
		
		JButton btnNewButton = new JButton("Nhân Viên");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(151, 10, 101, 21);
		
		
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Danh S\u00E1ch Nh\u00E2n Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(0, 26, 1103, 368);
		panel_1.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPane.setBounds(10, 26, 1083, 332);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Nh\u00E2n Vi\u00EAn", "T\u00EAn Nh\u00E2n Vi\u00EAn", "Gi\u1EDBi T\u00EDnh", "Ng\u00E0y V\u00E0o L\u00E0m", "Tu\u1ED5i", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i"
			}
		));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 394, 1103, 286);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Khách Hàng\r :\n");
		lblNewLabel_2.setBounds(28, 37, 105, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mã");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_3.setBounds(143, 24, 467, 30);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên Nhân Viên :");
		lblNewLabel_2_1.setBounds(28, 77, 105, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Giới Tính :");
		lblNewLabel_2_2.setBounds(28, 116, 105, 13);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Email :");
		lblNewLabel_2_3.setBounds(28, 156, 105, 13);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Ngày Vào Làm :");
		lblNewLabel_2_3_1.setBounds(653, 80, 105, 13);
		panel_2.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Số Điện Thoại :");
		lblNewLabel_2_2_1.setBounds(28, 232, 105, 13);
		panel_2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Chức Vụ :");
		lblNewLabel_2_1_1.setBounds(653, 36, 105, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Địa Chỉ :");
		lblNewLabel_2_5.setBounds(28, 197, 105, 13);
		panel_2.add(lblNewLabel_2_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam ");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(143, 109, 103, 21);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnN);
		rdbtnN.setBounds(311, 111, 103, 21);
		panel_2.add(rdbtnN);
		
		JLabel lblNewLabel_4 = new JLabel("*");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(28, 255, 45, 13);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(653, 109, 440, 177);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 53, 362, 30);
		panel_7.add(textField);
		
		JRadioButton rdbtnTmTheoTn = new JRadioButton("Tìm theo Tên");
		rdbtnTmTheoTn.setBounds(156, 26, 103, 21);
		panel_7.add(rdbtnTmTheoTn);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tìm theo Mã");
		rdbtnNewRadioButton_1.setBounds(41, 26, 103, 21);
		panel_7.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Tìm");
		lblNewLabel_5.setBounds(10, 61, 45, 13);
		panel_7.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Thêm Nhân Viên");
		
		btnNewButton_2.setBounds(41, 93, 150, 30);
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Sửa Nhân Viên");
		btnNewButton_2_1.setBounds(41, 138, 150, 30);
		panel_7.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_3 = new JButton("Làm Mới");
		btnNewButton_2_3.setBounds(259, 138, 150, 30);
		panel_7.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2 = new JButton("Xóa Nhân Viên");
		btnNewButton_2_2.setBounds(259, 93, 150, 30);
		panel_7.add(btnNewButton_2_2);
		
		JComboBox cbbCV = new JComboBox();
		cbbCV.setEditable(true);
		cbbCV.setBounds(768, 24, 325, 30);
		panel_2.add(cbbCV);
		
		txtNgay = new JTextField();
		txtNgay.setBounds(768, 69, 325, 30);
		panel_2.add(txtNgay);
		txtNgay.setColumns(10);
		
		txtTenNV = new JTextField();
		txtTenNV.setColumns(10);
		txtTenNV.setBounds(143, 64, 467, 30);
		panel_2.add(txtTenNV);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(143, 148, 467, 30);
		panel_2.add(txtEmail);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(143, 189, 467, 30);
		panel_2.add(txtDiaChi);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(143, 229, 467, 30);
		panel_2.add(txtSDT);
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_126779675188400");
		panel_4.setLayout(null);
		
		JButton btnChcV_1_1 = new JButton("Chức Vụ");
		
		
		btnChcV_1_1.setBounds(369, 10, 101, 21);
		panel_4.add(btnChcV_1_1);
		
		JButton btnTiKhon_1_1 = new JButton("Tài Khoản ");
		btnTiKhon_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnTiKhon_1_1.setContentAreaFilled(false);
		btnTiKhon_1_1.setBounds(258, 10, 101, 21);
		panel_4.add(btnTiKhon_1_1);
		
		JButton btnNewButton_3_1 = new JButton("Nhân Viên");
		
		
		btnNewButton_3_1.setBounds(146, 10, 101, 21);
		panel_4.add(btnNewButton_3_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(0, 551, 1103, 129);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setBounds(10, 38, 45, 13);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Nhân Viên :");
		lblNewLabel_6_1.setBounds(328, 38, 72, 13);
		panel_5.add(lblNewLabel_6_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 70, 201, 30);
		panel_5.add(textField_3);
		
		JLabel lblNewLabel_6_2 = new JLabel("Mật Khẩu :");
		lblNewLabel_6_2.setBounds(10, 78, 72, 13);
		panel_5.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Chức Năng :");
		lblNewLabel_6_3.setBounds(328, 78, 72, 13);
		panel_5.add(lblNewLabel_6_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(412, 30, 201, 30);
		panel_5.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(412, 70, 201, 30);
		panel_5.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("*");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(10, 106, 45, 13);
		panel_5.add(lblNewLabel_7);
		
		JButton btnNewButton_3_2 = new JButton("Xóa tài khoản");
		btnNewButton_3_2.setBounds(898, 26, 129, 30);
		panel_5.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_2_1 = new JButton("Thêm tài khoản");
		btnNewButton_3_2_1.setBounds(706, 26, 129, 30);
		panel_5.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_2_2 = new JButton("Sửa tài khoản");
		btnNewButton_3_2_2.setBounds(706, 78, 129, 30);
		panel_5.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_2_3 = new JButton("Làm mới");
		btnNewButton_3_2_3.setBounds(898, 78, 129, 30);
		panel_5.add(btnNewButton_3_2_3);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_8.setBounds(92, 29, 201, 30);
		panel_5.add(lblNewLabel_8);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Danh s\u00E1ch T\u00E0i Kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(0, 25, 1103, 527);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 1083, 495);
		panel_6.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Tài Khoản", "Mật Khẩu", "Chức Năng", "Nhân Viên"
			}
		));
		
		JPanel panel_8 = new JPanel();
		layeredPane.add(panel_8, "name_128163517067400");
		panel_8.setLayout(null);
		
		JButton btnChcV_1_2 = new JButton("Chức Vụ");
		btnChcV_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnChcV_1_2.setContentAreaFilled(false);
		btnChcV_1_2.setBounds(369, 10, 101, 21);
		panel_8.add(btnChcV_1_2);
		
		JButton btnTiKhon_1_2 = new JButton("Tài Khoản ");
		
		
		btnTiKhon_1_2.setBounds(258, 10, 101, 21);
		panel_8.add(btnTiKhon_1_2);
		
		JButton btnNewButton_3_3 = new JButton("Nhân Viên");
		
		btnNewButton_3_3.setBounds(146, 10, 101, 21);
		panel_8.add(btnNewButton_3_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Danh s\u00E1ch ch\u1EE9c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(0, 27, 1103, 240);
		panel_8.add(panel_9);
		panel_9.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 21, 1083, 209);
		panel_9.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Chức Vụ", "Tên Chức Vụ"
			}
		));
		table_2.setAlignmentY(Component.TOP_ALIGNMENT);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9_1.setBounds(0, 277, 1103, 291);
		panel_8.add(panel_9_1);
		panel_9_1.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 1083, 260);
		panel_9_1.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Nhân Viên", "Tên Nhân Viên", "Mã Chức Vụ"
			}
		));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(0, 572, 1103, 108);
		panel_8.add(panel_10);
		panel_10.setLayout(null);
		
		JButton btnNewButton_3_2_1_1 = new JButton("Thêm chức vụ");
		btnNewButton_3_2_1_1.setBounds(746, 23, 129, 30);
		panel_10.add(btnNewButton_3_2_1_1);
		
		JButton btnNewButton_3_2_1_1_1 = new JButton("Xóa Chức Vụ");
		btnNewButton_3_2_1_1_1.setBounds(746, 63, 129, 30);
		panel_10.add(btnNewButton_3_2_1_1_1);
		
		JButton btnNewButton_3_2_1_1_2 = new JButton("Sửa Chức Vụ");
		btnNewButton_3_2_1_1_2.setBounds(904, 23, 129, 30);
		panel_10.add(btnNewButton_3_2_1_1_2);
		
		JButton btnNewButton_3_2_1_1_3 = new JButton("Làm Mới");
		btnNewButton_3_2_1_1_3.setBounds(904, 63, 129, 30);
		panel_10.add(btnNewButton_3_2_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 45, 201, 30);
		panel_10.add(textField_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Mã Chức Vụ :");
		lblNewLabel_6_2_1.setBounds(10, 53, 89, 13);
		panel_10.add(lblNewLabel_6_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(503, 45, 201, 30);
		panel_10.add(textField_8);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Tên Chức Vụ :");
		lblNewLabel_6_2_2.setBounds(392, 53, 101, 13);
		panel_10.add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_9 = new JLabel("*");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setBounds(10, 80, 45, 13);
		panel_10.add(lblNewLabel_9);
		
		// panel 1 là nhân viên
		//panel 4 là tài khoản
		//panel 8 là chức vụ
		
		//nút điều khiển của layer nhân viên
		btnTiKhon.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnChcV.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_8);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		//nút điều khiển của layer tài khoản
		btnNewButton_3_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnChcV_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_8);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		
		 //nút điều khiển của layer chức vụ
		btnTiKhon_1_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnNewButton_3_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		//NÚT SỰ KIỆN
		//THÊM NHÂN VIÊN
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Customer customer=customerDao.addCustomer(null);
			}
		});
	}
}
