package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Product;
import util.HibernateUtil;

public class ProductDAO implements DAOInterface<Product>{

	@Override
	public List<Product> getAll() {
		List<Product> list = new ArrayList<Product>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "from Product";
				Query query = session.createQuery(hql);
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
	public boolean insert(Product t) {
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
	public boolean update(Product t) {
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
	public boolean delete(Product t) {
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
