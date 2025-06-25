package dao;

import java.util.List;

public interface DAOInterface<T> {
	public List<T> getAll();
	public boolean insert(T t);
	public boolean update(T t);
	public boolean delete(T t);
	
}
