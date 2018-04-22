package com.caocao.dtk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.caocao.dtk.dao.DtkdataDao;
import com.caocao.dtk.domain.DtkdataDO;
import com.caocao.dtk.service.DtkdataService;



@Service
public class DtkdataServiceImpl implements DtkdataService {
	@Autowired
	private DtkdataDao dtkdataDao;
	
	@Override
	public DtkdataDO get(String apiType){
		return dtkdataDao.get(apiType);
	}
	
	@Override
	public List<DtkdataDO> list(Map<String, Object> map){
		return dtkdataDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dtkdataDao.count(map);
	}
	
	@Override
	public int save(DtkdataDO dtkdata){
		return dtkdataDao.save(dtkdata);
	}
	
	@Override
	public int update(DtkdataDO dtkdata){
		return dtkdataDao.update(dtkdata);
	}
	
	@Override
	public int remove(String apiType){
		return dtkdataDao.remove(apiType);
	}
	
	@Override
	public int batchRemove(String[] apiTypes){
		return dtkdataDao.batchRemove(apiTypes);
	}
	
}
