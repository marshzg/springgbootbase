package com.os.core.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.os.modular.model.Demo;
import com.os.modular.service.impl.BaseService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
/**
 * Controller公共组件
 */
public abstract class BaseController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	@SuppressWarnings("unused")
	@Autowired
	protected BaseService<?> baseService;
	
	protected String getContextPath(){
		return request.getContextPath();
	}
	protected String getIp(){
		return request.getRemoteAddr();
	}
	protected HttpSession getSession() {
      return request.getSession();
  }
}
