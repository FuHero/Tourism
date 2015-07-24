package cn.magicbeans.tourism.dao;

public interface IBaseDAO<T> {
	
	T getById (String id);
	
	void create (T t);
	
	void update (T t);
	
	void delete (String id);
}
