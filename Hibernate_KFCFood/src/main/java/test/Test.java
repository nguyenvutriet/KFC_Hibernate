package test;

import java.util.List;

import dao.CustomerDAO;
import model.Customer;

public class Test {
	public static void main(String[] args) {
		CustomerDAO cusDAO = new CustomerDAO();
		List<Customer> list = cusDAO.getAll();
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
