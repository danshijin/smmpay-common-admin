package com.smmpay.inter.smmpay;

import java.util.Map;

import com.smmpay.inter.dto.res.ReturnDTO;

/**
 * 手动解冻
 * @author zengshihua
 *
 */
public interface CallManualUNFreezeService {

	/**
	 * 手动解冻
	 */
	public ReturnDTO manualUNFreezeHandle(Map<String, Object> paramMap) throws Exception;

}
