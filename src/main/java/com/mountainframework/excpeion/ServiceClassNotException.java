package com.mountainframework.excpeion;

/**
 * Rpc服务类未找到异常类
 * 
 * @author yafeng.cai {@link}https://github.com/AaronCai0
 * @date 2018年6月30日
 * @since 1.0
 */
public class ServiceClassNotException extends RuntimeException {

	private static final long serialVersionUID = 856010443225958171L;

	public ServiceClassNotException() {
		super();
	}

	public ServiceClassNotException(Throwable cause) {
		super(cause);
	}

	public ServiceClassNotException(String message) {
		super(message);
	}

}
