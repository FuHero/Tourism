package cn.magicbeans.tourism.dao;

import java.util.List;

public interface IBaseDAO<T> {
	
	T getById (String id);
	
	void create (T t);
	
	void update (T t);
	
	void delete (String id);
	
	List<T> search (T t);
	
	int searchCount (T t);
}
