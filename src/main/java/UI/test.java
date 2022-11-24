package UI;

import java.util.ArrayList;
import java.util.List;

import org.supermarket.dao.daoInterface.CustomerDao;
import org.supermarket.dao.daoInterface.EmployeeDao;
import org.supermarket.dao.daoInterface.OrderDao;
import org.supermarket.dao.daoInterface.ProductDao;
import org.supermarket.entity.Order;
import org.supermarket.entity.OrderDetail;
import org.supermarket.entity.enumP.Option;
import org.supermarket.entity.enumP.OrderStatus;

import util.Client;

public class test {
	public static void main(String[] args) throws Exception {
		EmployeeDao employeeDao = (EmployeeDao) Client.connectTo(9001, Option.EMPLOYEE_DAO);
		CustomerDao customerDao = (CustomerDao) Client.connectTo(9001, Option.CUSTOMER_DAO);
		OrderDao orderDao = (OrderDao) Client.connectTo(9001, Option.ORDER_DAO);
		ProductDao productDao = (ProductDao) Client.connectTo(9001, Option.PRODUCT_DAO);

		List<OrderDetail> orderDetails = new ArrayList<>();
		orderDetails.add(new OrderDetail(productDao.getProductById(1L), 1));
		orderDetails.add(new OrderDetail(productDao.getProductById(2L), 3));
//		
//		Order order = new Order(employeeDao.getEmployeeById(1L), customerDao.getCustomerById(1L), orderDetails,
//					OrderStatus.PAID);

		System.out.println(orderDao.getOrderById(1L).toString());
	}
}
