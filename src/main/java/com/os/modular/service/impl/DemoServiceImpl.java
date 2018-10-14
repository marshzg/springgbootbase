package com.os.modular.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.os.modular.dao.DemoMapper;
import com.os.modular.model.Demo;
import com.os.modular.service.DemoService;

/**
 * 
 * @Description:
 * @author: hzg
 * @data :2018年10月7日 下午11:14:06 
 * @version:V1.0
 */
@Service
public class DemoServiceImpl extends BaseService<Demo>  implements DemoService  {

    @Autowired
    DemoMapper demoMapper;
//
//	@Override
//	public int deleteByPrimaryKey(Integer id) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.deleteByPrimaryKey(id);
//	}
//
//	@Override
//	public int insert(Demo record) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.insert(record);
//	}
//
//	@Override
//	public int insertSelective(Demo record) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.insertSelective(record);
//	}
//
//	@Override
//	public Demo selectByPrimaryKey(Integer id) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.selectByPrimaryKey(id);
//	}
//
//	@Override
//	public int updateByPrimaryKeySelective(Demo record) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.updateByPrimaryKeySelective(record);
//	}
//
//	@Override
//	public int updateByPrimaryKey(Demo record) {
//		// TODO Auto-generated method stub
//		return this.demoMapper.updateByPrimaryKeySelective(record);
//	}
/**
 * pager
 */
	@Override
	public List<Demo> queryDemoList(Map<String, Object> params) {
		   PageHelper.startPage(Integer.parseInt(params.get("page").toString()), Integer.parseInt(params.get("rows").toString()));
	        return this.demoMapper.queryDemoList(params);
	}
}
