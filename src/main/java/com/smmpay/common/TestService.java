package com.smmpay.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smmpay.common.author.Authory;
import com.smmpay.common.request.RequestDataProxy;
import com.smmpay.inter.AuthorService;
import com.smmpay.inter.dto.res.ReturnDTO;
import com.smmpay.inter.smmpay.CallEveryDaySettlementService;
import com.smmpay.inter.smmpay.CallManualUNFreezeService;
import com.smmpay.inter.smmpay.CallThawPayService;

/**
 * Hello world!
 * 
 */
public class TestService {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "client-application.xml" });
		// ChBuyPoolService service =
		// (ChBuyPoolService)context.getBean("chBuyPoolService");
		// String desKey =
		// "{\"data\":[{\"billCode\":\"3130005135467579\",\"resultCode\":\"100004\",\"resultContent\":\"已审核\",\"id\":\"1\",\"date\":\"3130005135467579\"}]}";
		// ChBuyPoolDTO buy = service.getChBuyPoolByPrimary(1);
		// System.out.println(buy.getCreatedby());

		/*
		 * OpenAccountService openAccount=(OpenAccountService)
		 * context.getBean("openAccountService"); Map<String, String>
		 * paramMap=new HashMap<String, String>(); paramMap.put("subAccNm",
		 * "上海有色网测试附属账户112"); ReturnDTO rd=openAccount.openAccount(paramMap);
		 * System.out.println(rd.getMsg());
		 */

		/*
		 * QueryAccountBalanceService
		 * queryAccountBalanceService=(QueryAccountBalanceService)
		 * context.getBean("queryAccountBalanceService"); Map<String, String>
		 * paramMap=new HashMap<String, String>(); paramMap.put("subAccNo",
		 * "3110210003611006568"); ReturnDTO
		 * rd=queryAccountBalanceService.queryAccountBalance(paramMap);
		 * System.out.println(rd);
		 */

		/*
		 * QueryTrRecordsService rq= (QueryTrRecordsService)
		 * context.getBean("queryTrRecordsService"); Map<String, String>
		 * paramMap=new HashMap<String, String>(); paramMap.put("subAccNo",
		 * "3110210003611006568"); paramMap.put("startDate", "20160101");
		 * paramMap.put("endDate", "20160226"); paramMap.put("startRecord",
		 * "1"); paramMap.put("pageNumber", "10"); PagReturnDTO prd=
		 * rq.queryTrRecords(paramMap); System.out.println(prd);
		 */

		/*
		 * Map<String, String> paramMap=new HashMap<String, String>();
		 * paramMap.put("subAccNo", "3110210003611006568");
		 * paramMap.put("startDate", "20160101"); paramMap.put("endDate",
		 * "20160226"); paramMap.put("startRecord", "1");
		 * paramMap.put("pageNumber", "10");
		 */

		AuthorService authorService = (AuthorService) context
				.getBean("authorService");
		/*
		 * String jsonStr =
		 * "{\"data\":[{\"subAccNo\":\"3110210003611006568\",\"startDate\":\"20160101\"}]}"
		 * ; if(Authory.token == null)
		 * RequestDataProxy.getAccessToken(authorService); Map<String,String>
		 * mapParam = RequestDataProxy.getRequestParam(jsonStr,
		 * "311021000361100656820160101");
		 * 
		 * NoLoginPrintService np=(NoLoginPrintService)
		 * context.getBean("noLoginPrintService");
		 * 
		 * np.queryTrRecords(mapParam);
		 */

		// NoLoginPrintService
		// nolog=(NoLoginPrintService)context.getBean("noLoginPrintService");
		// String jsonStr =
		// "{\"data\":[{\"subAccNo\":\"3110210003611006568\",\"startDate\":\"20160101\"}]}";
		// if(Authory.token == null)
		// RequestDataProxy.getAccessToken(authorService);
		// Map<String,String> mapParam =
		// RequestDataProxy.getRequestParam(jsonStr,
		// "311021000361100656820160101");
		//
		// NoLoginPrintService np=(NoLoginPrintService)
		// context.getBean("noLoginPrintService");
		//
		// np.queryTrRecords(mapParam);

		CallEveryDaySettlementService calle = (CallEveryDaySettlementService) context.getBean("callEveryDaySettlementService");
		String jsonStr = "{\"data\":[{\"startDate\":\"20160318\"}]}";
		if (Authory.token == null)
			RequestDataProxy.getAccessToken(authorService);
		Map<String, String> mapParam = RequestDataProxy.getRequestParam(jsonStr, "20160318");
		Map<String, Object> param = new HashMap<String, Object>();
		param.putAll(mapParam);
		try {
			ReturnDTO r=calle.settlement(param);
			System.out.println(r);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*CallThawPayService thawPayService = (CallThawPayService) context.getBean("callThawPayService");
		//String jsonStr = "{\"data\":[{\"startDate\":\"20160226\"}]}";
		String jsonStr = "{\"data\":[{\"auditUserId\":\"2\",\"auditTime\":\"2016-03-02 18:20:39\",\"paymentId\":\"133\",\"confirmId\":\"14\"}]}";
		if (Authory.token == null)
			RequestDataProxy.getAccessToken(authorService);
		Map<String, String> mapParam = RequestDataProxy.getRequestParam(jsonStr, "20160226");
		Map<String, Object> param = new HashMap<String, Object>();
		param.putAll(mapParam);
		try {
			ReturnDTO r=thawPayService.autoTthawPayHandle(param);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
	/*	CallManualUNFreezeService cmUMF= (CallManualUNFreezeService) context.getBean("callManualUNFreezeService");
		
		String jsonStr = "{\"data\":[{\"paymentId\":\"327\"}]}";
		if (Authory.token == null)
			RequestDataProxy.getAccessToken(authorService);
		Map<String, String> mapParam = RequestDataProxy.getRequestParam(jsonStr, "327");
		Map<String, Object> param = new HashMap<String, Object>();
		param.putAll(mapParam);
		try {
			ReturnDTO r=cmUMF.manualUNFreezeHandle(param);
			System.out.println(r.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		*/
		
		
		
	}

}
