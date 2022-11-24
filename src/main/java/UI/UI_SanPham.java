package UI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.dao.daoInterface.ProductDao;
import org.supermarket.dao.daoInterface.ReceiptDao;
import org.supermarket.entity.Employee;
import org.supermarket.entity.OrderDetail;
import org.supermarket.entity.Product;
import org.supermarket.entity.Receipt;
import org.supermarket.entity.enumP.Category;
import org.supermarket.entity.enumP.Option;

import util.Client;

import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UI_SanPham extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaSP;
	private JTextField txtTenSP;
	private JTextField txtTonKho;
	private JTextField txtNgayNhap;
	private JTextField txtMoTa;
	private JTextField txtGiaBan;
	private JTable Jtablelayer1;
	private JTextField textField_7;
	private JTable table_1;
	private JTable table_2;
	private JPanel panel_1;
	private JPanel panel_4;
	private JPanel panel_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table_3;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private final Employee employee;
	private OrderDao orderDao;
	private ProductDao productDao;
	private CustomerDao customerDao;
	private ReceiptDao receiptDao;
	private Supplier supplierDao;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UI_SanPham frame = new UI_SanPham();
//					frame.setLocationRelativeTo(null);
//					frame.setVisible(true);
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public UI_SanPham(Employee employee) {
		this.employee=employee;

		try {
			orderDao = (OrderDao) Client.connectTo(9001, Option.ORDER_DAO);
			productDao = (ProductDao) Client.connectTo(9001, Option.PRODUCT_DAO);
			customerDao = (CustomerDao) Client.connectTo(9001, Option.CUSTOMER_DAO);
			receiptDao=(ReceiptDao) Client.connectTo(9001, Option.RECEIPT_DAO);
			supplierDao=(Supplier) Client.connectTo(9001, Option.SUPPLIER_DAO);
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
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_TrangChinh UI_TC =new UI_TrangChinh(employee);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\taikhoan (1).png"));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setIconTextGap(20);
		lblNewLabel.setBounds(117, 37, 70, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblUser = new JLabel(employee.getName());
		lblUser.setHorizontalTextPosition(SwingConstants.LEFT);
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setAlignmentX(1.0f);
		lblUser.setBounds(42, 110, 225, 29);
		contentPane.add(lblUser);
		
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
			}
		});
		btnNewButton_1_1.setContentAreaFilled(false);
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
		
		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(321, 0, 1093, 710);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_182750947351000");
		panel_1.setLayout(null);
		
		JButton btnPhiuNhpHng = new JButton("Phiếu Nhập Hàng");
		btnPhiuNhpHng.setBounds(413, 10, 138, 27);
		btnPhiuNhpHng.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_1.add(btnPhiuNhpHng);
		
		JButton btnNewButton = new JButton("Sản Phẩm");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBounds(155, 10, 100, 27);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnLoiSnPhm = new JButton("Loại Sản Phẩm");
		btnLoiSnPhm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnLoiSnPhm.setBounds(265, 10, 138, 27);
		panel_1.add(btnLoiSnPhm);
		
		JButton btnNewButton_3 = new JButton("Thêm Sản Phẩm");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3.setBounds(21, 665, 106, 35);
		panel_1.add(btnNewButton_3);
		
		JButton btnsuaSP = new JButton("Sửa Sản Phẩm");
		
		btnsuaSP.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnsuaSP.setBounds(137, 665, 106, 35);
		panel_1.add(btnsuaSP);
		
		JButton btnNewButton_3_2 = new JButton("Xóa Sản Phẩm");
		btnNewButton_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2.setBounds(253, 665, 106, 35);
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_2_1 = new JButton("Xóa Trắng");
		btnNewButton_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_1.setBounds(369, 665, 106, 35);
		panel_1.add(btnNewButton_3_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Danh S\u00E1ch S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 31, 1073, 379);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 27, 1053, 342);
		panel_2.add(scrollPane);
		
		Jtablelayer1 = new JTable();
		scrollPane.setViewportView(Jtablelayer1);
		Jtablelayer1.setModel(new DefaultTableModel(
			new String[] 
				{"Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Tồn Kho", "Mô Tả", "Gía Bán", "Ngày Nhập", "Nhà Cung Cấp"},0
			
		));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 407, 1073, 234);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Sản Phẩm :");
		lblNewLabel_2.setBounds(47, 23, 104, 25);
		panel_3.add(lblNewLabel_2);
		
		txtMaSP = new JTextField();
		txtMaSP.setBounds(140, 25, 249, 22);
		panel_3.add(txtMaSP);
		txtMaSP.setColumns(10);
		
		txtTenSP = new JTextField();
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(140, 72, 249, 22);
		panel_3.add(txtTenSP);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên Sản Phẩm :");
		lblNewLabel_2_1.setBounds(47, 70, 104, 25);
		panel_3.add(lblNewLabel_2_1);
		
		txtTonKho = new JTextField();
		txtTonKho.setColumns(10);
		txtTonKho.setBounds(140, 117, 249, 22);
		panel_3.add(txtTonKho);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tồn Kho :");
		lblNewLabel_2_2.setBounds(47, 115, 104, 25);
		panel_3.add(lblNewLabel_2_2);
		
		txtNgayNhap = new JTextField();
		txtNgayNhap.setColumns(10);
		txtNgayNhap.setBounds(755, 119, 249, 22);
		panel_3.add(txtNgayNhap);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ngày Nhập :");
		lblNewLabel_2_3.setBounds(662, 117, 104, 25);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Nhà Cung Cấp :");
		lblNewLabel_2_3_1.setBounds(662, 161, 104, 25);
		panel_3.add(lblNewLabel_2_3_1);
		
		txtMoTa = new JTextField();
		txtMoTa.setColumns(10);
		txtMoTa.setBounds(755, 25, 249, 22);
		panel_3.add(txtMoTa);
		
		JLabel lblNewLabel_2_4 = new JLabel("Mô tả :");
		lblNewLabel_2_4.setBounds(662, 23, 104, 25);
		panel_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Giá Bán :");
		lblNewLabel_2_1_1.setBounds(662, 70, 104, 25);
		panel_3.add(lblNewLabel_2_1_1);
		
		txtGiaBan = new JTextField();
		txtGiaBan.setColumns(10);
		txtGiaBan.setBounds(755, 72, 249, 22);
		panel_3.add(txtGiaBan);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Loại :");
		lblNewLabel_2_2_1.setBounds(47, 161, 72, 25);
		panel_3.add(lblNewLabel_2_2_1);
		
		JComboBox cbbLoai = new JComboBox();
		cbbLoai.setEditable(true);
		cbbLoai.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		cbbLoai.setBounds(140, 161, 249, 25);
		panel_3.add(cbbLoai);
		
		JComboBox cbbNhaCC = new JComboBox();
		cbbNhaCC.setBounds(755, 163, 249, 22);
		panel_3.add(cbbNhaCC);
		
		JLabel lblNewLabel_3 = new JLabel("*");
		lblNewLabel_3.setBounds(24, 211, 17, 13);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(SystemColor.window);
		lblNewLabel_4.setBounds(50, 208, 168, 13);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tìm theo mã :");
		lblNewLabel_5.setBounds(485, 676, 75, 13);
		panel_1.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(560, 672, 183, 21);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(839, 672, 217, 21);
		panel_1.add(comboBox_2_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Tìm theo tên :");
		lblNewLabel_5_1.setBounds(753, 676, 87, 13);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_12.setBounds(0, 644, 1093, 66);
		panel_1.add(lblNewLabel_12);
		
		panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_188980596026100");
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Sản Phẩm");
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnNewButton_2.setBounds(155, 10, 100, 27);
		panel_4.add(btnNewButton_2);
		
		JButton btnLoiSnPhm_1 = new JButton("Loại Sản Phẩm");
		btnLoiSnPhm_1.setContentAreaFilled(false);
		btnLoiSnPhm_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnLoiSnPhm_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnLoiSnPhm_1.setBounds(265, 10, 138, 27);
		panel_4.add(btnLoiSnPhm_1);
		
		JButton btnPhiuNhpHng_1 = new JButton("Phiếu Nhập Hàng");
		btnPhiuNhpHng_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnPhiuNhpHng_1.setBounds(413, 10, 138, 27);
		panel_4.add(btnPhiuNhpHng_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Danh S\u00E1ch Lo\u1EA1i", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 35, 1073, 512);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 23, 1053, 479);
		panel_5.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Loại Sản Phẩm", "Tên Loại Sản Phẩm"
			}
		));
		
		JButton btnNewButton_3_3 = new JButton("Thêm Loại Sản Phẩm");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_3.setBounds(31, 646, 162, 35);
		panel_4.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_1 = new JButton("Sửa Loại Sản Phẩm");
		btnNewButton_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_1_1.setBounds(244, 646, 151, 35);
		panel_4.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_2 = new JButton("Xóa Loại Sản Phẩm");
		btnNewButton_3_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_2.setBounds(429, 646, 145, 35);
		panel_4.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_2_1_1 = new JButton("Làm Mới");
		btnNewButton_3_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_1_1.setBounds(618, 646, 106, 35);
		panel_4.add(btnNewButton_3_2_1_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setBounds(838, 634, 218, 21);
		panel_4.add(comboBox_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Tìm theo mã :");
		lblNewLabel_5_2.setBounds(753, 638, 75, 13);
		panel_4.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Tìm theo tên :");
		lblNewLabel_5_1_1.setBounds(753, 669, 87, 13);
		panel_4.add(lblNewLabel_5_1_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setBounds(839, 665, 217, 21);
		panel_4.add(comboBox_2_1_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(10, 544, 1073, 67);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Mã Loại :");
		lblNewLabel_6.setBounds(22, 27, 45, 13);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Tên Loại :");
		lblNewLabel_6_1.setBounds(585, 27, 72, 13);
		panel_6.add(lblNewLabel_6_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(662, 27, 401, 19);
		panel_6.add(textField_7);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_7.setBackground(SystemColor.controlHighlight);
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblNewLabel_7.setBounds(69, 27, 401, 13);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("*");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(22, 50, 45, 13);
		panel_6.add(lblNewLabel_8);
		
		JLabel lblNewLabel_12_1 = new JLabel("");
		lblNewLabel_12_1.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_12_1.setBounds(0, 614, 1093, 96);
		panel_4.add(lblNewLabel_12_1);
		
		panel_7 = new JPanel();
		layeredPane.add(panel_7, "name_190430072073300");
		panel_7.setLayout(null);
		
		JButton btnLoiSnPhm_1_1 = new JButton("Loại Sản Phẩm");
		btnLoiSnPhm_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnLoiSnPhm_1_1.setBounds(265, 10, 138, 27);
		panel_7.add(btnLoiSnPhm_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Sản Phẩm");
		btnNewButton_2_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		
		btnNewButton_2_1.setBounds(155, 10, 100, 27);
		panel_7.add(btnNewButton_2_1);
		
		JButton btnPhiuNhpHng_1_1 = new JButton("Phiếu Nhập Hàng");
		btnPhiuNhpHng_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPhiuNhpHng_1_1.setContentAreaFilled(false);
		btnPhiuNhpHng_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		btnPhiuNhpHng_1_1.setBounds(413, 10, 138, 27);
		panel_7.add(btnPhiuNhpHng_1_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6_1.setBounds(10, 429, 1073, 182);
		panel_7.add(panel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Mã Sản Phẩm :");
		lblNewLabel_6_2.setBounds(22, 30, 99, 13);
		panel_6_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_7_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_7_1.setBounds(131, 24, 401, 30);
		panel_6_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("*");
		lblNewLabel_8_1.setForeground(Color.RED);
		lblNewLabel_8_1.setBounds(553, 156, 45, 13);
		panel_6_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Tên Sản Phẩm :");
		lblNewLabel_6_2_1.setBounds(22, 64, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Số Lượng :");
		lblNewLabel_6_2_2.setBounds(22, 104, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("Loại Sản Phẩm :");
		lblNewLabel_6_2_3.setBounds(22, 145, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_3);
		
		JLabel lblNewLabel_6_2_4 = new JLabel("Giá Nhập :");
		lblNewLabel_6_2_4.setBounds(553, 30, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_4);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Giá Bán :");
		lblNewLabel_6_2_1_1.setBounds(553, 64, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_6_2_3_1 = new JLabel("Nhà Cung Cấp :");
		lblNewLabel_6_2_3_1.setBounds(553, 104, 99, 13);
		panel_6_1.add(lblNewLabel_6_2_3_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(131, 138, 401, 31);
		panel_6_1.add(comboBox_3);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(662, 97, 401, 31);
		panel_6_1.add(comboBox_3_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(131, 98, 401, 30);
		panel_6_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(662, 22, 401, 30);
		panel_6_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(662, 58, 401, 30);
		panel_6_1.add(textField_11);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(131, 60, 401, 30);
		panel_6_1.add(comboBox_4);
		
		JButton btnNewButton_3_3_1 = new JButton("Thêm Phiếu Nhập");
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_3_1.setBounds(31, 646, 162, 35);
		panel_7.add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("Sửa Phiếu Nhập");
		btnNewButton_3_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_1_1_1.setBounds(237, 646, 151, 35);
		panel_7.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_2_2_1 = new JButton("Xóa Phiếu Nhập");
		btnNewButton_3_2_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_2_1.setBounds(429, 646, 145, 35);
		panel_7.add(btnNewButton_3_2_2_1);
		
		JButton btnNewButton_3_2_1_1_1 = new JButton("Làm Mới");
		btnNewButton_3_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_1_1_1.setBounds(618, 646, 106, 35);
		panel_7.add(btnNewButton_3_2_1_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Tìm theo mã :");
		lblNewLabel_5_2_1.setBounds(753, 638, 75, 13);
		panel_7.add(lblNewLabel_5_2_1);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.setBounds(838, 634, 218, 21);
		panel_7.add(comboBox_2_2_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("");
		lblNewLabel_12_1_1.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_12_1_1.setBounds(0, 614, 1093, 96);
		panel_7.add(lblNewLabel_12_1_1);
		
		JComboBox comboBox_2_1_1_1 = new JComboBox();
		comboBox_2_1_1_1.setBounds(839, 665, 217, 21);
		panel_7.add(comboBox_2_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Tìm theo tên :");
		lblNewLabel_5_1_1_1.setBounds(753, 669, 87, 13);
		panel_7.add(lblNewLabel_5_1_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "B\u1EA3ng Phi\u1EBFu Nh\u1EADp", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(10, 39, 564, 219);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 21, 544, 191);
		panel_8.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã ", "Ngày Nhập", "Thuế (%)", "Tổng Tiền", "Nhân Viên"
			}
		));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Phi\u1EBFu Nh\u1EADp", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(573, 10, 510, 248);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Mã Phiếu Nhập :");
		lblNewLabel_9.setBounds(10, 36, 121, 13);
		panel_9.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Tên Nhân Viên :");
		lblNewLabel_9_1.setBounds(10, 75, 121, 13);
		panel_9.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("Ngày Nhập :");
		lblNewLabel_9_2.setBounds(10, 115, 121, 13);
		panel_9.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_3 = new JLabel("Thuế :");
		lblNewLabel_9_3.setBounds(10, 156, 121, 13);
		panel_9.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("New label");
		lblNewLabel_10_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_10_4.setBounds(110, 188, 379, 30);
		panel_9.add(lblNewLabel_10_4);
		
		JLabel lblNewLabel_9_4 = new JLabel("Tổng Tiền :");
		lblNewLabel_9_4.setBounds(10, 197, 121, 13);
		panel_9.add(lblNewLabel_9_4);
		
		textField_8 = new JTextField();
		textField_8.setBounds(110, 107, 379, 30);
		panel_9.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(110, 148, 379, 30);
		panel_9.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_10_4_1 = new JLabel("New label");
		lblNewLabel_10_4_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_10_4_1.setBounds(110, 66, 379, 30);
		panel_9.add(lblNewLabel_10_4_1);
		
		JLabel lblNewLabel_10_4_2 = new JLabel("New label");
		lblNewLabel_10_4_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_10_4_2.setBounds(110, 27, 379, 30);
		panel_9.add(lblNewLabel_10_4_2);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(10, 225, 45, 13);
		panel_9.add(lblNewLabel_10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "B\u1EA3ng S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(10, 263, 1073, 161);
		panel_7.add(panel_10);
		panel_10.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 20, 1053, 131);
		panel_10.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã", "Tên", "Số Lượng", "Loại", "Nhà Cung Cấp", "Gía Nhập", "Giá Bán"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 22, 312, 688);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1_5 = new JButton("Đăng Xuất");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_DangNhap UI_DN=new UI_DangNhap();
				UI_DN.show();
				UI_DN.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_5.setBounds(31, 559, 225, 62);
		panel.add(btnNewButton_1_5);
		btnNewButton_1_5.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\logout.png"));
		btnNewButton_1_5.setIconTextGap(10);
		btnNewButton_1_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		
		//CÁC SỰ KIỆN PHỤ
		//LẤY DỮ LIỆU TỪ BẢNG TABLE
		Jtablelayer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row = Jtablelayer1.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel)Jtablelayer1.getModel();
				Receipt receipt;
				try {
					
					receipt =receiptDao.getReceiptById(Long.valueOf((String) tblModel.getValueAt(row, 0)));
					
					String ma=(String) tblModel.getValueAt(row, 0);
					
					String tenSP = (String) tblModel.getValueAt(row, 1);
					String slcon = (String) tblModel.getValueAt(row, 2);
					String loai = (String) tblModel.getValueAt(row, 3);
					String gia = (String) tblModel.getValueAt(row, 4);
					String mota = (String) tblModel.getValueAt(row, 5);
					String ngay = (String) tblModel.getValueAt(row, 6);
					String nhacc = (String) tblModel.getValueAt(row, 7);
					
					

					txtTenSP.setText(ma );
					txtTenSP.setText(tenSP);
					txtTonKho.setText(slcon + "");
					cbbLoai.setSelectedIndex(Integer.valueOf((String)mota));
					
					txtGiaBan.setText(gia + "");
					txtMoTa.setText( mota+ "");
					txtNgayNhap.setText(ngay+"");
					cbbNhaCC.setSelectedIndex(Integer.valueOf((String)nhacc));

				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		//SỰ KIỆN
		//NÚT SỬA SP CỦA LAYER SẢN PHẨM
//		List<OrderDetail> orderDetails = new ArrayList<>();
//		btnsuaSP.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int row = table.getSelectedRow();
//				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//				try {
//
//					Product SP = productDao.getProductById(Long.valueOf((String) tblModel.getValueAt(row, 0)));
//
//					Product product;
//					try {
//
//						OrderDetail detail = new OrderDetail(SP, Integer.valueOf(txtSoluong.getText()));
//						orderDetails.set(row, detail);
//						tblModel.setValueAt(Integer.valueOf(txtSoluong.getText()), row, 2);
//
//					} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				} catch (NumberFormatException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (RemoteException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//			
//				
//			}
//		});
//		;
	}
	
}
