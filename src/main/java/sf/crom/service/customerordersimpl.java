package sf.crom.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.contactdhawan.customerorders.Customerordersporttype;
import org.contactdhawan.customerorders.Order;
import org.contactdhawan.customerorders.Product;
import org.apache.cxf.transport.servlet.CXFServlet;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

public class customerordersimpl implements Customerordersporttype {
	Map<Integer, List<Order>> customerOrders;

	public customerordersimpl() {
		init();
	}

	public void init() {
		Product product1 = new Product();
		product1.setId(200);
		product1.setDescription("200 product");
		product1.setQuantity(2);

		List<Order> orders1 = new ArrayList<Order>();
		Order order1 = new Order();
		order1.setOrderId(100);
		order1.setProduct(product1);
		orders1.add(order1);

		customerOrders = new HashMap();

		customerOrders.put(1, orders1);

	}

	public List getOrders(int customerId) {
		List<Order> orders = customerOrders.get(customerId);
		return orders;
	}

	public boolean createOrders(int customerId, Order order) {
		List orders = new ArrayList<Order>();
		orders.add(order);
		customerOrders.put(customerId, orders);
		return true;
	}

}
