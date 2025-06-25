package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Invoice;
import util.HibernateUtil;

public class InvoiceDAO implements DAOInterface<Invoice>{

	@Override
	public List<Invoice> getAll() {
		List<Invoice> list = new ArrayList<Invoice>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "from Invoice";
				Query 	query = session.createQuery(hql);
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
	public boolean insert(Invoice t) {
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
	public boolean update(Invoice t) {
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
	public boolean delete(Invoice t) {
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
