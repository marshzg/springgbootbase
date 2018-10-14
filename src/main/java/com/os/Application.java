package com.os;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.os.util.MyMapper;


/**
  * @Description 
  * @author: hzg
  * @data :2018年10月7日 下午5:54:03 
  * @version:V1.0
 */
@SpringBootApplication
//启注解事务管理
//@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.os.modular.dao", markerInterface = MyMapper.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//
////如果需要通过打包的方式在web容器中进行部署，则需要继承 SpringBootServletInitializer 覆盖configure(SpringApplicationBuilder)方法
//public class Application  extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//}
