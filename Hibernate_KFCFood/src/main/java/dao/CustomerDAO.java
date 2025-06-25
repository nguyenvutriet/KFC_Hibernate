package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import util.HibernateUtil;

public class CustomerDAO implements DAOInterface<Customer>{

	@Override
	public List<Customer> getAll() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				String hql = "from Customer";
				Query query = session.createQuery(hql);
				list = query.getResultList();
				
				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Customer t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.save(t);
				
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Customer t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.update(t);
				
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Customer t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.delete(t);
				
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
