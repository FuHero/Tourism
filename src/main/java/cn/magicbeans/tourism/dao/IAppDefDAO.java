package cn.magicbeans.tourism.dao;

import org.springframework.stereotype.Repository;

import cn.magicbeans.tourism.model.impl.AppDef;

@Repository
public interface IAppDefDAO {
	
	AppDef getById (String id);
	
}
