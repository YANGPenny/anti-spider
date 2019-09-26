/**
 * 
 */
package cn.yy.b2c.gciantispider.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yy.b2c.gciantispider.dao.IDatahandleDao;
import cn.yy.b2c.gciantispider.model.Analyzerule;
import cn.yy.b2c.gciantispider.service.IDatahandleService;

/**
 * @author itheima
 *
 */

@Service
public class DatahandleServiceImpl implements IDatahandleService{

	@Autowired
	private IDatahandleDao datahandleDao;
	
	
	@Override
	public Analyzerule getAnalyzerule(String behaviorType,String flightType, String hql) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("behaviorType", behaviorType);
		params.put("flightType", flightType);
		return datahandleDao.get(hql, params);
	}


	@Override
	public void saveOrUpdateData(Analyzerule analyzerule) {
		datahandleDao.saveOrUpdate(analyzerule);
	}


}
