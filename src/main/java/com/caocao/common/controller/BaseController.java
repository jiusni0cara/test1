package com.caocao.common.controller;

import com.caocao.system.domain.UserToken;
import org.springframework.stereotype.Controller;
import com.caocao.common.utils.ShiroUtils;
import com.caocao.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}