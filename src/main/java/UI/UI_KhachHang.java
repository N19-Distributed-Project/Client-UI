package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.dao.daoInterface.ProductDao;
import org.supermarket.entity.Employee;
import org.supermarket.entity.enumP.Option;

import util.Client;

import javax.swing.JScrollPane;

public class UI_KhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private OrderDao orderDao;
	private ProductDao productDao;
	private final Employee employee;
	private CustomerDao customerDao;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public UI_KhachHang(Employee employee) {
		this.employee=employee;
		try {
			orderDao = (OrderDao) Client.connectTo(9001, Option.ORDER_DAO);
			productDao = (ProductDao) Client.connectTo(9001, Option.PRODUCT_DAO);
			customerDao = (CustomerDao) Client.connectTo(9001, Option.CUSTOMER_DAO);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1438, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel(employee.getName());
		lblUser.setHorizontalTextPosition(SwingConstants.LEFT);
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setAlignmentX(1.0f);
		lblUser.setBounds(42, 110, 225, 29);
		contentPane.add(lblUser);
		
		JButton btnNewButton_1_4 = new JButton("Khách Hàng");
		btnNewButton_1_4.setContentAreaFilled(false);
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
		
		JButton btnNewButton_3_2_1 = new JButton("Xóa Trắng");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2_1.setBounds(707, 665, 106, 35);
		contentPane.add(btnNewButton_3_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\MuaBanThucPham\\image\\taikhoan (1).png"));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setIconTextGap(20);
		lblNewLabel.setBounds(117, 37, 70, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_TrangChinh UI_TC=new UI_TrangChinh(null);
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
		
		JButton btnNewButton_3_1 = new JButton("Sửa Khách Hàng");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_1.setBounds(462, 665, 119, 35);
		contentPane.add(btnNewButton_3_1);
		
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
		
		JButton btnNewButton_3 = new JButton("Thêm Khách Hàng");
		btnNewButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3.setBounds(332, 665, 120, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_2 = new JButton("Xóa Khách Hàng");
		btnNewButton_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3_2.setBounds(591, 665, 106, 35);
		contentPane.add(btnNewButton_3_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(894, 672, 183, 21);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("Tìm theo mã :");
		lblNewLabel_5.setBounds(823, 676, 75, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Tìm theo tên :");
		lblNewLabel_5_1.setBounds(1087, 676, 87, 13);
		contentPane.add(lblNewLabel_5_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(1173, 672, 217, 21);
		contentPane.add(comboBox_2_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(new TitledBorder(null, "B\u1EA3ng \u0110i\u1EC1u Khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_12.setBounds(321, 644, 1093, 66);
		contentPane.add(lblNewLabel_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "B\u1EA3ng Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(321, 10, 1093, 440);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 1073, 408);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Ngày Mua Hàng", "Tuổi", "Địa Chỉ ", "Số Điện Thoại"
			}
		));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(321, 501, 1093, 133);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Khách Hàng\r :\n");
		lblNewLabel_2.setBounds(27, 24, 107, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên Khách Hàng\r :\r\n");
		lblNewLabel_2_1.setBounds(27, 74, 107, 13);
		panel_2.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 66, 312, 30);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Địa Chỉ :");
		lblNewLabel_2_2.setBounds(574, 24, 107, 13);
		panel_2.add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(691, 16, 312, 30);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Số Điện Thoại :");
		lblNewLabel_2_3.setBounds(574, 74, 107, 13);
		panel_2.add(lblNewLabel_2_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(691, 66, 312, 30);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Mã");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setBounds(131, 15, 312, 30);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(10, 110, 45, 13);
		panel_2.add(lblNewLabel_4);
	}
}
