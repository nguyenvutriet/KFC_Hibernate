package dao;

import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Promotion;
import util.HibernateUtil;

public class PromotionDAO implements DAOInterface<Promotion> {

	@Override
	public List<Promotion> getAll() {
		List<Promotion> list = new ArrayList<Promotion>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "from Promotion";
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
	public boolean insert(Promotion t) {
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
	public boolean update(Promotion t) {
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
	public boolean delete(Promotion t) {
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
