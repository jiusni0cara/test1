package com.caocao.dtk.dao;

import com.caocao.dtk.domain.DtkdataDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author CC
 * @email msgbus@163.com
 * @date 2018-01-28 22:16:14
 */
@Mapper
public interface DtkdataDao {

	DtkdataDO get(String apiType);
	
	List<DtkdataDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DtkdataDO dtkdata);
	
	int update(DtkdataDO dtkdata);
	
	int remove(String api_type);
	
	int batchRemove(String[] apiTypes);
}
