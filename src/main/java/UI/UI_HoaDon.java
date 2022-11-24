package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.management.ValueExp;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.supermarket.dao.CustomerDaoImpl;
import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.dao.daoInterface.ProductDao;
import org.supermarket.entity.Customer;
import org.supermarket.entity.Employee;
import org.supermarket.entity.Order;
import org.supermarket.entity.OrderDetail;
import org.supermarket.entity.Product;
import org.supermarket.entity.enumP.Category;
import org.supermarket.entity.enumP.Option;
import org.supermarket.entity.enumP.OrderStatus;

import util.Client;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class UI_HoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField txtTimTenSanPham;
	private JTextField txtMaSP;
	private JTable table_1;
	private JTextField txtTienKhachDua;
	private JTextField txtTienKhachTra;
	private JPanel panel_1;
	private JPanel panel_5;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_3;

	private JScrollBar scrollBar;
	private OrderDao orderDao;
	private final Employee employee;
	private CustomerDao customerDao;
	private Customer customer;
	private JTextField txtTenKhachHang;

	private ProductDao productDao;
	private JTextField txtMaKH;
	private JTextField txtSoluong;
	private JLabel lblLoi;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public UI_HoaDon(Employee employee) {
		this.employee = employee;

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

		// Form chuc nang ben trai

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\taikhoan (1).png"));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setIconTextGap(20);
		lblNewLabel.setBounds(117, 37, 70, 70);
		contentPane.add(lblNewLabel);

		JLabel lblTaiKhoan = new JLabel(employee.getName());
		lblTaiKhoan.setHorizontalTextPosition(SwingConstants.LEFT);
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTaiKhoan.setAlignmentX(1.0f);
		lblTaiKhoan.setBounds(42, 110, 225, 29);
		contentPane.add(lblTaiKhoan);

		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\home.png"));
		btnNewButton_1.setIconTextGap(10);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBounds(42, 149, 225, 62);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_TrangChinh UI_TC = new UI_TrangChinh(employee);
				UI_TC.show();
				UI_TC.setLocationRelativeTo(null);
				dispose();
			}
		});
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_6 = new JButton("Hóa Đơn");
		btnNewButton_1_6.setContentAreaFilled(false);
		btnNewButton_1_6
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\bill (3).png"));
		btnNewButton_1_6.setIconTextGap(10);
		btnNewButton_1_6.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_6.setBounds(42, 221, 225, 62);
		contentPane.add(btnNewButton_1_6);

		JButton btnNewButton_1_1 = new JButton("Sản Phẩm");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_SanPham UI_SP = new UI_SanPham(employee);
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
				UI_NhanVienn UI_NV = new UI_NhanVienn(employee);
				UI_NV.show();
				UI_NV.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_2
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\customer.png"));
		btnNewButton_1_2.setIconTextGap(10);
		btnNewButton_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_2.setBounds(42, 365, 225, 62);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("Thống Kê");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_ThongKe UI_TK = new UI_ThongKe(employee);
				UI_TK.show();
				UI_TK.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_3
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\analytics.png"));
		btnNewButton_1_3.setIconTextGap(10);
		btnNewButton_1_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_3.setBounds(42, 437, 225, 62);
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("Khách Hàng");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_KhachHang UI_KH = new UI_KhachHang(employee);
				UI_KH.show();
				UI_KH.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_4
				.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\service (2).png"));
		btnNewButton_1_4.setIconTextGap(10);
		btnNewButton_1_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1_4.setBounds(42, 509, 225, 62);
		contentPane.add(btnNewButton_1_4);

		// Title Hóa Đơn
		String x = "Hóa Đơn";
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), x,
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 22, 312, 688);
		contentPane.add(panel);
		panel.setLayout(null);
		
				JButton btnNewButton_1_5 = new JButton("Đăng Xuất");
				btnNewButton_1_5.setBounds(32, 561, 225, 62);
				panel.add(btnNewButton_1_5);
				btnNewButton_1_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						UI_DangNhap UI_DN = new UI_DangNhap();
						UI_DN.show();
						UI_DN.setLocationRelativeTo(null);
						dispose();
					}
				});
				btnNewButton_1_5
						.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\logout.png"));
				btnNewButton_1_5.setIconTextGap(10);
				btnNewButton_1_5.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(321, 0, 1093, 710);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_35331433435100");
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 41, 453, 327);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		txtTimTenSanPham = new JTextField();

		txtTimTenSanPham.setBounds(68, 10, 260, 32);
		txtTimTenSanPham.setColumns(10);
		panel_2.add(txtTimTenSanPham);

		JLabel lblNewLabel_3_2 = new JLabel("Tên SP");
		lblNewLabel_3_2.setBounds(10, 13, 56, 29);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_3_2);

		JButton btnNewButton_2_1 = new JButton("Tìm ");

		btnNewButton_2_1.setBounds(338, 10, 105, 32);
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\search (1) (1).png"));
		panel_2.add(btnNewButton_2_1);

		JScrollPane JTable_SanPham = new JScrollPane();

		JTable_SanPham.setBackground(SystemColor.control);
		JTable_SanPham.setBounds(10, 52, 433, 265);
		panel_2.add(JTable_SanPham);

		table = new JTable();

		JTable_SanPham.setViewportView(table);
		table.setEditingRow(1);
		table.setEditingColumn(1);
		table.setBackground(SystemColor.window);
		DefaultTableModel model_sanpham = new DefaultTableModel(
				new String[] { "       Mã", "     Tên Sản Phẩm", "  Đơn Giá" }, 0);
		table.setModel(model_sanpham);
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setName("");

		scrollBar = new JScrollBar();
		panel_2.add(scrollBar);
		scrollBar.setBounds(426, 100, 17, 217);

		JButton btnNewButton_5_1_1 = new JButton("Hóa Đơn");
		btnNewButton_5_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_5_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1.setBounds(21, 10, 129, 21);
		btnNewButton_5_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_1.add(btnNewButton_5_1_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(473, 10, 610, 358);
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Th\u00F4ng Tin Chi Ti\u1EBFt S\u1EA3n Ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_1.add(panel_3);

		JButton btnHangCho = new JButton("Hạng Chờ");
		btnHangCho.setBounds(463, 322, 126, 27);
		panel_3.add(btnHangCho);

		JLabel lblNewLabel_3 = new JLabel("Mã SP");
		lblNewLabel_3.setBounds(36, 99, 84, 21);
		panel_3.add(lblNewLabel_3);

		txtMaSP = new JTextField();
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(142, 97, 340, 27);
		panel_3.add(txtMaSP);

		JButton btnTimMaKH = new JButton("Tìm ");

		btnTimMaKH.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\search (1) (1).png"));
		btnTimMaKH.setBounds(504, 29, 85, 27);
		panel_3.add(btnTimMaKH);

		JLabel lblNewLabel_3_1 = new JLabel("Tên SP");
		lblNewLabel_3_1.setBounds(36, 133, 84, 21);
		panel_3.add(lblNewLabel_3_1);

		JLabel lblTenSP = new JLabel();
		lblTenSP.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTenSP.setBackground(SystemColor.scrollbar);
		lblTenSP.setBounds(142, 130, 340, 27);
		panel_3.add(lblTenSP);

		JLabel lblNewLabel_3_1_2 = new JLabel("Loại");
		lblNewLabel_3_1_2.setBounds(36, 207, 84, 21);
		panel_3.add(lblNewLabel_3_1_2);

		JLabel lblLoai = new JLabel("");
		lblLoai.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblLoai.setBounds(142, 201, 340, 27);
		panel_3.add(lblLoai);

		JLabel lblNewLabel_3_1_3 = new JLabel("Tên Khách Hàng");
		lblNewLabel_3_1_3.setBounds(36, 66, 84, 21);
		panel_3.add(lblNewLabel_3_1_3);

		JLabel lblNewLabel_3_1_6 = new JLabel("Gía");
		lblNewLabel_3_1_6.setBounds(36, 238, 84, 21);
		panel_3.add(lblNewLabel_3_1_6);

		JLabel lblGia = new JLabel("");
		lblGia.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGia.setBounds(142, 235, 340, 27);
		panel_3.add(lblGia);

		JLabel lblNewLabel_3_1_6_1 = new JLabel("Mô tả :");
		lblNewLabel_3_1_6_1.setBounds(36, 275, 84, 21);
		panel_3.add(lblNewLabel_3_1_6_1);

		JLabel lblMota = new JLabel("");
		lblMota.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblMota.setBounds(142, 272, 340, 27);
		panel_3.add(lblMota);

		JButton btnThemSP = new JButton("Thêm Sản Phẩm");

		btnThemSP.setBounds(302, 322, 151, 27);
		panel_3.add(btnThemSP);

		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setBounds(142, 63, 340, 27);
		panel_3.add(txtTenKhachHang);
		txtTenKhachHang.setColumns(10);

		txtMaKH = new JTextField();
		txtMaKH.setColumns(10);
		txtMaKH.setBounds(142, 29, 340, 27);
		panel_3.add(txtMaKH);

		JLabel lblNewLabel_3_1_3_1 = new JLabel("Mã Khách Hàng :");
		lblNewLabel_3_1_3_1.setBounds(36, 35, 84, 21);
		panel_3.add(lblNewLabel_3_1_3_1);

		JButton btnTimKH_1 = new JButton("Tìm ");
		btnTimKH_1.setBounds(504, 96, 85, 27);
		panel_3.add(btnTimKH_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Số Lượng :");
		lblNewLabel_3_1_1.setBounds(36, 167, 84, 21);
		panel_3.add(lblNewLabel_3_1_1);

		txtSoluong = new JTextField();
		txtSoluong.setBounds(142, 167, 340, 27);
		panel_3.add(txtSoluong);
		txtSoluong.setColumns(10);

		lblLoi = new JLabel();
		lblLoi.setForeground(Color.RED);
		lblLoi.setBounds(10, 329, 282, 13);
		panel_3.add(lblLoi);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 378, 1073, 187);
		panel_1.add(scrollPane);

		table_1 = new JTable();
		scrollPane.setViewportView(table_1);

		table_1.setOpaque(false);

		table_1.setModel(new DefaultTableModel(new String[] { "         Mã Sản Phẩm", "       Tên Sản Phẩm",
				"       Số Lượng", "      Loại", "         Thuế", "           Gía" }, 0));

		table_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table_1.setAlignmentY(0.0f);
		table_1.setAlignmentX(0.0f);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 568, 1073, 77);
		panel_4.setLayout(null);
		panel_1.add(panel_4);

		JLabel lblNewLabel_4 = new JLabel("Tiền Khách Đưa :");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(0, 47, 135, 27);
		panel_4.add(lblNewLabel_4);

		txtTienKhachDua = new JTextField();
		txtTienKhachDua.setColumns(10);
		txtTienKhachDua.setBounds(123, 47, 320, 27);
		panel_4.add(txtTienKhachDua);

		JLabel lblNewLabel_5 = new JLabel("VNĐ");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(456, 47, 32, 27);
		panel_4.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("VAT : ");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(77, 8, 47, 27);
		panel_4.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(234, 10, 45, 27);
		panel_4.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Số Tiền Trả Khách :");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(567, 47, 154, 27);
		panel_4.add(lblNewLabel_8);

		txtTienKhachTra = new JTextField();
		txtTienKhachTra.setColumns(10);
		txtTienKhachTra.setBounds(707, 49, 320, 27);
		panel_4.add(txtTienKhachTra);

		JLabel lblNewLabel_9 = new JLabel("VNĐ");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(1037, 47, 36, 27);
		panel_4.add(lblNewLabel_9);

		JLabel lblNewLabel_8_1 = new JLabel("Tổng Tiền");
		lblNewLabel_8_1.setForeground(Color.RED);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(567, 10, 154, 27);
		panel_4.add(lblNewLabel_8_1);

		JLabel lblNewLabel_9_1 = new JLabel("VNĐ");
		lblNewLabel_9_1.setForeground(Color.RED);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1.setBounds(1037, 10, 36, 27);
		panel_4.add(lblNewLabel_9_1);

		JLabel lblTongTien = new JLabel("");
		lblTongTien.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblTongTien.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblTongTien.setBounds(707, 10, 320, 27);
		panel_4.add(lblTongTien);

		JLabel lblVAT = new JLabel("");
		lblVAT.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblVAT.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblVAT.setBounds(123, 8, 108, 27);
		panel_4.add(lblVAT);

		JButton btnNewButton_5_1 = new JButton("Danh Sách Hóa Đơn");
		btnNewButton_5_1.setBounds(158, 10, 151, 21);
		btnNewButton_5_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_1.add(btnNewButton_5_1);

		JButton btnThemHangCho = new JButton("Thêm Hạng Chờ");

		btnThemHangCho.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnThemHangCho.setBounds(10, 665, 180, 35);
		panel_1.add(btnThemHangCho);

		JButton btnSuaSanPham = new JButton("Sửa Sản Phẩm");

		btnSuaSanPham.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSuaSanPham.setBounds(229, 665, 180, 35);
		panel_1.add(btnSuaSanPham);

		JButton btnXoaSanPham = new JButton("Xóa Sản Phẩm");

		btnXoaSanPham.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnXoaSanPham.setBounds(456, 665, 180, 35);
		panel_1.add(btnXoaSanPham);

		JButton btnXoaTrang = new JButton("Xóa Trắng");

		btnXoaTrang.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnXoaTrang.setBounds(681, 665, 180, 35);
		panel_1.add(btnXoaTrang);

		JButton btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnThanhToan.setBounds(903, 665, 180, 35);
		panel_1.add(btnThanhToan);

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		lblNewLabel_12.setBounds(0, 644, 1093, 66);
		panel_1.add(lblNewLabel_12);

		panel_5 = new JPanel();
		layeredPane.setLayer(panel_5, 1);
		panel_5.setBackground(SystemColor.control);
		layeredPane.add(panel_5, "name_35331448589300");

		JButton btnNewButton_5_1_1_1 = new JButton("Hóa Đơn");
		btnNewButton_5_1_1_1.setBounds(21, 10, 129, 21);
		btnNewButton_5_1_1_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_5.setLayout(null);
		panel_5.add(btnNewButton_5_1_1_1);

		JButton btnNewButton_5_1_2 = new JButton("Danh Sách Hóa Đơn");
		btnNewButton_5_1_2.setContentAreaFilled(false);
		btnNewButton_5_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_5_1_2.setBounds(158, 10, 150, 21);
		btnNewButton_5_1_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();

				// TODO Auto-generated method stub

			}
		});
		panel_5.add(btnNewButton_5_1_2);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Danh S\u00E1ch H\u00F3a \u0110\u01A1n", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 37, 1073, 271);
		panel_5.add(panel_6);
		panel_6.setLayout(null);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
				new Object[][] { { "                 Mã Hóa Đơn", "              Tên Khách Hàng",
						"            Số Điện Thoại KH", "              Tên Nhân Viên", "             Ngày mua hàng",
						"                   Tổng Tiền" } },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column" }));
		table_2.setBounds(10, 22, 1053, 239);
		panel_6.add(table_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Chi Ti\u1EBFt S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 310, 1073, 318);
		panel_5.add(panel_7);
		panel_7.setLayout(null);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] { { "                       Mã Hóa Đơn", "                      Tên Sản Phẩm",
						"                       Số Lượng", "                          Loại",
						"                            Giá" } },
				new String[] { "New column", "New column", "New column", "New column", "New column" }));
		table_3.setBounds(10, 23, 1053, 285);
		panel_7.add(table_3);

		JButton btnNewButton_3_2_1_1 = new JButton("Tìm");
		btnNewButton_3_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_1_1.setBounds(986, 654, 97, 35);
		panel_5.add(btnNewButton_3_2_1_1);

		JButton btnNewButton_3_2_3 = new JButton("Làm Mới");
		btnNewButton_3_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_3.setBounds(390, 654, 180, 35);
		panel_5.add(btnNewButton_3_2_3);

		JButton btnNewButton_3_1_1 = new JButton("Sửa Hóa Đơn");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_1_1.setBounds(200, 654, 180, 35);
		panel_5.add(btnNewButton_3_1_1);

		textField_3 = new JTextField();
		textField_3.setBounds(738, 654, 238, 35);
		panel_5.add(textField_3);
		textField_3.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tìm theo tên");
		rdbtnNewRadioButton.setBounds(608, 654, 103, 21);
		panel_5.add(rdbtnNewRadioButton);

		JRadioButton rdbtnTmTheoM = new JRadioButton("Tìm theo mã");
		rdbtnTmTheoM.setBounds(608, 677, 103, 21);
		panel_5.add(rdbtnTmTheoM);

		JButton btnNewButton_3_1_1_1 = new JButton("Sửa Hóa Đơn");
		btnNewButton_3_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_1_1_1.setBounds(10, 654, 180, 35);
		panel_5.add(btnNewButton_3_1_1_1);

		JLabel lblNewLabel_12_1 = new JLabel("");
		lblNewLabel_12_1.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		lblNewLabel_12_1.setBounds(0, 638, 1093, 66);
		panel_5.add(lblNewLabel_12_1);

		// các sự kiện phụ
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					if (model_sanpham.getRowCount() > 0) {
						for (int i = model_sanpham.getRowCount() - 1; i > -1; i--) {
							model_sanpham.removeRow(i);
						}
					}
					List<Product> products = productDao.getProductByNameLike(txtTimTenSanPham.getText());
					products.forEach(producct -> {
						long ma = producct.getProductId();
						String ten = producct.getProductName();
						double gia = producct.getPrice();

						model_sanpham.addRow(new Object[] { ma + "", ten + "", gia + "" });

					});
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					System.out.println("them loi");
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("them loi");
					e1.printStackTrace();
				}

			}
		});
		// sự kiện với bảng table_1 bảng lớn
		table_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table_1.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				Product product;
				try {
					product = productDao.getProductById(Long.valueOf((String) tblModel.getValueAt(row, 0)));
					String tblMa = (String) tblModel.getValueAt(table_1.getSelectedRow(), 0);
					String tblTen = (String) tblModel.getValueAt(table_1.getSelectedColumn(), 1);

					String tblSoLuong = (String) tblModel.getValueAt(table_1.getSelectedRow(), 2);
					String tblloai = (String) tblModel.getValueAt(table_1.getSelectedRow(), 3);

					String tblGia = (String) tblModel.getValueAt(table_1.getSelectedRow(), 5);

					txtMaSP.setText(tblMa);
					lblTenSP.setText(tblTen);

					txtSoluong.setText(tblSoLuong);
					lblLoai.setText(tblloai);
					lblMota.setText(product.getDescription());
					lblGia.setText(tblGia);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int row = table.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();

				try {
					Product product = productDao.getProductById(Long.valueOf((String) tblModel.getValueAt(row, 0)));

					Long ma = product.getProductId();
					String tenSP = product.getProductName();
					Category loai = product.getCategory();
					Integer slcon = product.getQuantity();
					double gia = product.getPrice();
					String mota = product.getDescription();
					System.out.println(tenSP);

					txtMaSP.setText(ma + "");
					lblTenSP.setText(tenSP);
					lblLoai.setText(loai + "");

					lblGia.setText(gia + "");
					lblMota.setText( mota+ "");

				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		// các nút sự kiện butom
		btnTimMaKH.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Customer customer = customerDao.getCustomerById(Long.valueOf((String) txtMaKH.getText()));
					if (customer == null) {
						JOptionPane.showMessageDialog(null, "Khách Hàng Không Tồn Tại");

						Sub_UI_HoaDon sub = new Sub_UI_HoaDon();
						sub.show();
						sub.setLocationRelativeTo(null);

					} else {
						txtMaKH.setText(customer.getCustomerId() + "");
						txtTenKhachHang.setText(customer.getName());
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// nút thêm sản ph
		List<OrderDetail> orderDetails = new ArrayList<>();

		btnThemSP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();

				try {

					Product product = productDao.getProductById(Long.valueOf((String) txtMaSP.getText()));
					if (product == null) {
						JOptionPane.showMessageDialog(null, "Sản Phẩm Không Tồn Tại");
					} else {
						if (String.valueOf((String) txtSoluong.getText()) == null) {
							JOptionPane.showMessageDialog(null, "Lỗi");

						} else {

							orderDetails.add(new OrderDetail(product, Integer.valueOf(txtSoluong.getText())));

							if (tblModel.getRowCount() > 0) {
								for (int i = tblModel.getRowCount() - 1; i > -1; i--) {
									tblModel.removeRow(i);
								}
							}
							orderDetails.forEach(detail -> {
								long ma = detail.getProduct().getProductId();
								String ten = detail.getProduct().getProductName();
								String soluong = detail.getQuantity() + "";
								Category loai = detail.getProduct().getCategory();
								double thue = detail.getProduct().getVAT();
								double gia = detail.getProduct().getPrice();

								tblModel.addRow(new Object[] { ma + "", ten + "", soluong + "", loai + "", thue + "",
										gia + "" });
							});
						}

					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// nút sửa sản phẩm

		btnSuaSanPham.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table_1.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				try {

					Product NSX = productDao.getProductById(Long.valueOf((String) tblModel.getValueAt(row, 0)));

					Product product;
					try {

						OrderDetail detail = new OrderDetail(NSX, Integer.valueOf(txtSoluong.getText()));
						orderDetails.set(row, detail);
						tblModel.setValueAt(Integer.valueOf(txtSoluong.getText()), row, 2);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// nút xóa sản phẩm
		btnXoaSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table_1.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				try {

					Product NSX = productDao.getProductById(Long.valueOf((String) tblModel.getValueAt(row, 0)));
					Product product;
					try {

						orderDetails.remove(row);
						tblModel.removeRow(row);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		// NÚT XÓA TRẮNG
		btnXoaTrang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMaKH.setText("");
				txtTenKhachHang.setText("");
				txtMaSP.setText("");
				lblTenSP.setText("");
				txtSoluong.setText("");
				lblLoai.setText("");
				lblGia.setText("");
				lblMota.setText("");
			}
		});

		// NÚT THÊM HẠNG CHỜ
		btnThemHangCho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order;
				try {
					order = new Order(employee,
							customerDao.getCustomerById(Long.valueOf((String) txtMaKH.getText())), orderDetails,
							OrderStatus.WAIT);
					boolean addorder = orderDao.addOrder(order);
					System.out.println(addorder);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}

		});

	}
}
