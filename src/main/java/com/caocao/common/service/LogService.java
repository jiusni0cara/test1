package com.caocao.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caocao.common.domain.LogDO;
import com.caocao.common.domain.PageDO;
import com.caocao.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
