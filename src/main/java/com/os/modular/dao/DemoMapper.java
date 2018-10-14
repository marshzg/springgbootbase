package com.os.modular.dao;

import com.os.modular.model.Demo;
import com.os.util.MyMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;

/**
 * 
 * @Description:
 * @author: hzg
 * @data :2018年10月7日 下午11:02:38
 * @version:V1.0
 */
@Mapper
public interface DemoMapper extends MyMapper<Demo> {


	public List<Demo> queryDemoList(Map<String, Object> params);
}