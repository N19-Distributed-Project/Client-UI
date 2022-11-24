package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.supermarket.dao.daoInterface.EmployeeDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.entity.Employee;
import org.supermarket.entity.Order;
import org.supermarket.entity.enumP.Option;

import util.Client;

import java.awt.Label;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

public class UI_DangNhap extends JFrame {

	private JPanel contentPane;
	private Button button_1;
	private EmployeeDao employeedao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_DangNhap frame = new UI_DangNhap();
					frame.setLocationRelativeTo(null);
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
	public UI_DangNhap() {
		try {
			employeedao= (EmployeeDao) Client.connectTo(9001,Option.EMPLOYEE_DAO);
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
		
		setTitle("Đăng Nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 510, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Label,textfield cua tai khoan mat khau
		Label label = new Label("Tài Khoản :");
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(132, 88, 89, 21);
		contentPane.add(label);
		
		TextField txtUserName = new TextField();
		txtUserName.setBounds(227, 88, 164, 27);
		contentPane.add(txtUserName);
		
		Label label_1 = new Label("PHẦM MỀM QUẢN LÝ MUA BÁN SIÊU THỊ");
		label_1.setForeground(Color.RED);
		label_1.setAlignment(Label.CENTER);
		label_1.setFont(new Font("Adobe Garamond Pro", Font.BOLD, 18));
		label_1.setBounds(21, 30, 486, 21);
		contentPane.add(label_1);
		
		Label label_2_1 = new Label("Mật Khẩu  :");
		label_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_2_1.setBounds(132, 127, 89, 21);
		contentPane.add(label_2_1);
		
		//Nut dang nhap,quen mat khau
		Button button = new Button("Đăng Nhập");
		button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button.setBackground(SystemColor.controlDkShadow);
		button.setForeground(new Color(0, 191, 255));
	
		button.setBounds(104, 174, 134, 33);
		contentPane.add(button);
		
		button_1 = new Button("Quên Mật Khẩu");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setForeground(new Color(0, 191, 255));
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button_1.setBackground(SystemColor.controlDkShadow);
		button_1.setBounds(284, 174, 134, 33);
		contentPane.add(button_1);
		
		TextField txtPass = new TextField();
		txtPass.setBounds(227, 121, 164, 27);
		contentPane.add(txtPass);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee employee =null;
				try {
					employee = employeedao.login(txtUserName.getText(), txtPass.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (employee==null) {
					JOptionPane.showMessageDialog(null, "Người Dùng Sai Đăng Nhập Lại");
				}
				else {
				
					UI_TrangChinh  ui_tc =new UI_TrangChinh(employee);
					
					ui_tc.show();
					ui_tc.setLocationRelativeTo(null);
					dispose();
					
				}
			}
		});
	}
		
}
