package com.os.core.model;

import java.io.Serializable;
/**
 * 
 * @Description:
 * @author: hzg
 * @data :2018年10月7日 下午8:33:29 
 * @version:V1.0
 */
public class BusinessException extends RuntimeException implements Serializable {

private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public BusinessException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public BusinessException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public BusinessException(int code,String msg) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public BusinessException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
