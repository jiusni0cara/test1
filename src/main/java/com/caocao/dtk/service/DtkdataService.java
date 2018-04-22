package com.caocao.dtk.service;

import com.caocao.dtk.domain.DtkdataDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author CC
 * @email msgbus@163.com
 * @date 2018-01-28 22:16:14
 */
public interface DtkdataService {
	
	DtkdataDO get(String apiType);
	
	List<DtkdataDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DtkdataDO dtkdata);
	
	int update(DtkdataDO dtkdata);
	
	int remove(String apiType);
	
	int batchRemove(String[] apiTypes);
}
