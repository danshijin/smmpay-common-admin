package com.smmpay.inter.dto.req;

import java.io.Serializable;


public class QueryAccountBalanceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 附属银行卡号
	 */
	private String subAccNo;
	

	public String getSubAccNo() {
		return subAccNo;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
}
