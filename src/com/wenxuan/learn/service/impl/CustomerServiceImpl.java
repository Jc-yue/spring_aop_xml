package com.wenxuan.learn.service.impl;

import com.wenxuan.learn.service.CustomerService;

/**
 * 客户实现层
 * @author Administrator
 *
 */
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		System.out.println("调用持久层,保存了客户...");
	}

	@Override
	public void updateCustomer(Long id) {
		System.err.println("调用持久层,修改了客户...");
	}

}
