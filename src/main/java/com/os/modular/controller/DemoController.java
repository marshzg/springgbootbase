package com.os.modular.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.os.core.base.controller.BaseController;
import com.os.modular.model.Demo;
import com.os.modular.service.DemoService;
import com.os.modular.service.impl.BaseService;

import tk.mybatis.mapper.common.Mapper;
/**
 * 
 * @Description:
 * @author: hzg
 * @data :2018年10月8日 上午11:39:46 
 * @version:V1.0
 */
 
@Controller
@RequestMapping("/")
public class DemoController  extends  BaseController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private static String PREFIX = "/system";
    @Autowired
    private DemoService demoService;
 
/**
 * 
 * @Description: id by demo http://127.0.0.1:8080/demo/id?id=1
 * @param id
 * @return      
 * @return: Object 
 * @author: hzg
 * @data :2018年10月7日 下午11:38:59
 */
	@ResponseBody
	@RequestMapping("/get")
	public Object demoById() {
		logger.trace("日志输出 trace");
		logger.debug("日志输出 debug");
		logger.info("日志输出 info");
		logger.warn("日志输出 warn");
		logger.error("日志输出 error");
//		Map map=  new HashMap<String,String>();
//		map.put("key", id);
		System.out.println("-->"+this.getIp());
		Long id=2l;
		Demo demo=demoService.selectByKey(id);
		@SuppressWarnings("unchecked")
		Mapper<Demo> mapper =(Mapper<Demo>) this.baseService.getMapper();
		List<Demo> list=mapper.selectAll();
		System.out.print(list);
		return demo;
	}
	/**
	 * 
	 * @Description: 
	 * @param page
	 * @param row
	 * @return      
	 * @return: Object 
	 * @author: hzg
	 * @data :2018年10月7日 下午11:40:00
	 */
	@ResponseBody
	@RequestMapping("/list")
	public Object demoByList(int page,int rows) {
		logger.trace("日志输出 trace");
		logger.debug("日志输出 debug");
		logger.info("日志输出 info");
		logger.warn("日志输出 warn");
		logger.error("日志输出 error");
		Map map=  new HashMap<Integer,Integer>();
		map.put("page", page);
		map.put("rows", rows);
		System.out.println("-->"+this.getIp());
		
		List list=demoService.queryDemoList(map);
		
		return list;
	}
	@ResponseBody
	@RequestMapping("/common")
	public Object demoByList() {
		logger.trace("日志输出 trace");
		logger.debug("日志输出 debug");
		logger.info("日志输出 info");
		logger.warn("日志输出 warn");
		logger.error("日志输出 error");
		Map map=  new HashMap<Integer,Integer>();
//		map.put("page", page);
//		map.put("rows", rows);
		System.out.println("-->"+this.getIp());
		
//		List list=demoService.selectByExample(null);
		
		return null;
	}
}
