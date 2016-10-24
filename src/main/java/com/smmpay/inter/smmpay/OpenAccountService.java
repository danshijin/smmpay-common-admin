package com.smmpay.inter.smmpay;

import java.util.Map;

import com.smmpay.inter.dto.res.ReturnDTO;

/**
 * 签约开户
 * @author zengshihua
 *
 */
public interface OpenAccountService {

	/**
	 * 签约开户
	 * @param map
	 * @return
	 */
	ReturnDTO openAccount(Map<String,String> map);
}
