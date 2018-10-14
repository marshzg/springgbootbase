package com.os.modular.service;

import java.util.List;
import java.util.Map;
import com.os.modular.model.Demo;

/**
 * 
 * @Description:
 * @author: hzg
 * @data :2018年10月7日 下午11:37:38 
 * @version:V1.0
 */

public interface DemoService  extends IService<Demo> {
//	int deleteByPrimaryKey(Integer id);
//
//	int insert(Demo record);
//
//	int insertSelective(Demo record);
//
//	Demo selectByPrimaryKey(Integer id);
//
//	int updateByPrimaryKeySelective(Demo record);
//
//	int updateByPrimaryKey(Demo record);

	public List<Demo> queryDemoList(Map<String, Object> params);
}
