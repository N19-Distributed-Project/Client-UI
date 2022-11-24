package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.entity.Customer;
import org.supermarket.entity.Employee;
import org.supermarket.entity.enumP.Gender;
import org.supermarket.entity.enumP.Option;

import util.Client;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Sub_UI_HoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenKH;
	private JTextField txtNgayVaoLam;
	private JTextField txtDiaChi;
	private CustomerDao customerDao;
	private JTextField txtSDT;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sub_UI_HoaDon frame = new Sub_UI_HoaDon();
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
	public Sub_UI_HoaDon() {
		try {
			customerDao=(CustomerDao) Client.connectTo(9001, Option.CUSTOMER_DAO);
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (NotBoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTenKH = new JTextField();
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(147, 10, 390, 30);
		contentPane.add(txtTenKH);
		
		JLabel lblTnKhchHng = new JLabel("Tên Khách Hàng :");
		lblTnKhchHng.setBounds(10, 18, 118, 13);
		contentPane.add(lblTnKhchHng);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính :");
		lblGiiTnh.setBounds(10, 58, 118, 13);
		contentPane.add(lblGiiTnh);
		
		txtNgayVaoLam = new JTextField();
		txtNgayVaoLam.setColumns(10);
		txtNgayVaoLam.setBounds(147, 90, 390, 30);
		contentPane.add(txtNgayVaoLam);
		
		JLabel lblNgyVoLm = new JLabel("Ngày Vào Làm :");
		lblNgyVoLm.setBounds(10, 98, 118, 13);
		contentPane.add(lblNgyVoLm);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(147, 130, 390, 30);
		contentPane.add(txtDiaChi);
		
		JLabel lblaCh = new JLabel("Địa Chỉ :");
		lblaCh.setBounds(10, 138, 118, 13);
		contentPane.add(lblaCh);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(147, 170, 390, 30);
		contentPane.add(txtSDT);
		
		JLabel lblSinThoi = new JLabel("Số Điện Thoại :");
		lblSinThoi.setBounds(10, 178, 118, 13);
		contentPane.add(lblSinThoi);
		
		JButton btnThem = new JButton("Thêm ");
		
		btnThem.setBounds(146, 220, 118, 21);
		contentPane.add(btnThem);
		
		JRadioButton rdbNam = new JRadioButton("Nam");
		buttonGroup.add(rdbNam);
		rdbNam.setBounds(147, 54, 103, 21);
		contentPane.add(rdbNam);
		
		JRadioButton rdbNu = new JRadioButton("Nữ");
		buttonGroup.add(rdbNu);
		rdbNu.setBounds(435, 54, 103, 21);
		contentPane.add(rdbNu);
		
		JButton btnXoaTrang = new JButton("Xóa Trắng");
		btnXoaTrang.setBounds(284, 220, 118, 21);
		contentPane.add(btnXoaTrang);
		
		JButton btnHuy = new JButton("Hủy");
		
		btnHuy.setBounds(419, 220, 118, 21);
		contentPane.add(btnHuy);
		
		
		btnThem.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
				Gender gender;
				LocalDate date=LocalDate.parse(txtNgayVaoLam.getText(),format);
				if(rdbNam.isSelected()==true) {
					gender =Gender.MALE;
				}else {
					gender =Gender.FEMALE;
				}
				
				Customer cus=new Customer(txtTenKH.getText(), gender, date, txtDiaChi.getText(), txtSDT.getText());
				try {
					
					Long customer= customerDao.addCustomer(cus);
					
					
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
			}
		});
		//NÚT HUY
		btnHuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//NUT XÓA TRẮNG
		btnXoaTrang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDiaChi.setText("");
			
				txtNgayVaoLam.setText("");
				txtSDT.setText("");
				buttonGroup.clearSelection();				
				txtTenKH.setText("");
				
			}
		});
	
	}
}
