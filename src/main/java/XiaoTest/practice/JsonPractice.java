package XiaoTest.practice;

import com.alibaba.fastjson.JSONObject;

/** 
* @author Lusx 
* @date 2019年9月9日 下午3:16:32 
*/
public class JsonPractice {

	public static void main(String[] args) throws Exception {
		
		JSONObject json = new JSONObject();
		
		String[] strs = {"{\"filter\":{\"type\":\"and\",\"fields\":[{\"values\":[\"BXK_CLASSDETAIL\",\"BXK_SERIESDETAIL\"],\"type\":\"in\",\"dimension\":\"position\"},{\"values\":[\"10239\",\"9899\",\"8831\"],\"type\":\"in\",\"dimension\":\"classid\"}]},\"intervals\":[\"2019-09-03T00:00:00.000+08:00/2019-09-10T00:00:00.000+08:00\"],\"metric\":\"devOuid_impression\",\"granularity\":{\"period\":\"P1D\",\"timeZone\":\"Asia/Shanghai\",\"type\":\"period\"},\"threshold\":10,\"dataSource\":\"dmp-bxk-statistics\",\"aggregations\":[{\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"selector\",\"dimension\":\"event\",\"value\":\"impression\"},{\"field\":{\"values\":[\"BXK_CLASSDETAIL_STUDY_TEST\",\"BXK_SERIESTDETAIL_STUDY_TEST\",\"BXK_CLASS_STUDY\",\"BXK_CLASS_NOT_BUY\",\"BXK_CLASS_BUY_SUCCESS\",\"BXK_CLASS_INTRODUCTION\",\"BXK_LOGIN_SUCCESS\",\"BXK_SERIESDETAIL_PAY_BUTTON\",\"BXK_CLASSDETAIL_PAY_BUTTON\",\"BXK_CLASSDETAIL_INTRO_BUTTON\",\"BXK_SERIESDETAIL_INTRO_BUTTON\",\"BXK_AUDIO_PLAY\",\"BXK_VIDEO_PLAY\"],\"type\":\"in\",\"dimension\":\"position\"},\"type\":\"not\"}]},\"aggregator\":{\"fieldName\":\"devOuid_impression\",\"name\":\"devOuid_impression\",\"type\":\"hyperUnique\"},\"type\":\"filtered\"}],\"dimension\":{\"outputName\":\"classid\",\"type\":\"default\",\"dimension\":\"classid\"},\"postAggregations\":[],\"limitSpec\":{\"columns\":[{\"dimension\":\"devOuid_impression\",\"direction\":\"descending\"}]},\"dimensions\":[{\"column\":\"classid\",\"limit\":10,\"mergeConfig\":\"\",\"type\":\"\"}],\"queryType\":\"topN\"}",
				"{\"intervals\":[\"2017-11-01T00:00:00.000+08:00/2017-11-08T00:00:00.000+08:00\"],\"metric\":\"count\",\"granularity\":\"all\",\"threshold\":10,\"dataSource\":\"so-mama-userSoAnalysis\",\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"like\",\"dimension\":\"kw_pinyin\",\"pattern\":\"baobao%\"},{\"type\":\"not\",\"field\":{\"type\":\"selector\",\"dimension\":\"keyword\",\"value\":\"baobao\"}}]},\"aggregations\":[{\"name\":\"count\",\"fieldName\":\"recordNumber\",\"type\":\"longSum\"}],\"dimension\":\"keyword\",\"queryType\":\"topN\"}",
				"{\"queryType\":\"groupBy\",\"dataSource\":\"api-luke-userAnalysis\",\"granularity\":\"all\",\"dimensions\":[\"type\",{\"type\":\"default\",\"dimension\":\"adId\",\"outputName\":\"ad_id\",\"outputType\":\"STRING\"},{\"type\":\"default\",\"dimension\":\"posId\",\"outputName\":\"pos_id\",\"outputType\":\"STRING\"},\"source\"],\"limitSpec\":{\"type\":\"default\",\"limit\":5000},\"aggregations\":[{\"type\":\"hyperUnique\",\"name\":\"total_cc\",\"fieldName\":\"uniqueCookieCount\"},{\"type\":\"hyperUnique\",\"name\":\"total_dc\",\"fieldName\":\"uniqueDeviceCount\"}],\"intervals\":[\"2017-09-18T00:00:00.000+08:00/2017-09-18T23:59:59.000+08:00\"],\"context\":{\"groupByStrategy\":\"v2\",\"applyLimitPushDown\":false}}",
				"{\"filter\":{\"type\":\"selector\",\"dimension\":\"participles\"},\"intervals\":[],\"granularity\":\"all\",\"dataSource\":\"so-mama-userSoAnalysis\",\"aggregations\":[{\"filter\":{\"type\":\"selector\",\"value\":0,\"dimension\":\"type\"},\"aggregator\":{\"fieldName\":\"recordNumber\",\"name\":\"recordNumber\",\"type\":\"longSum\"},\"type\":\"filtered\"}],\"threshold\":1,\"dimension\":\"participles\",\"metric\":\"recordNumber\",\"queryType\":\"topN\"}",
				"{\"filter\":{\"type\":\"and\",\"fields\":[]},\"intervals\":[\"2018-04-05T00:00:00.000+08:00/2018-04-12T00:00:00.000+08:00\"],\"metric\":\"recordNumberA\",\"granularity\":\"all\",\"threshold\":5,\"dataSource\":\"so-mama-userSoAnalysis\",\"aggregations\":[{\"filter\":{\"type\":\"selector\",\"value\":1,\"dimension\":\"type\"},\"aggregator\":{\"fieldName\":\"recordNumberA\",\"name\":\"recordNumberA\",\"type\":\"longSum\"},\"type\":\"filtered\"}],\"dimension\":{\"outputName\":\"solrId\",\"type\":\"default\",\"dimension\":\"solrId\"},\"postAggregations\":[],\"limitSpec\":{\"columns\":[{\"dimension\":\"recordNumberA\",\"direction\":\"descending\"}]},\"dimensions\":[{\"column\":\"solrId\",\"limit\":\"3\",\"join\":\"\",\"mergeConfig\":\"\",\"type\":\"String\",\"sql\":\"\"}],\"queryType\":\"topN\"}",
				"{\"queryType\":\"groupBy\",\"dataSource\":\"so-mama-userSoAnalysis\",\"granularity\":\"all\",\"dimensions\":[\"keyword\",\"from\"],\"limitSpec\":{\"type\":\"default\",\"limit\":20000,\"columns\":[\"recordNumberA\"]},\"aggregations\":[{\"type\":\"filtered\",\"filter\":{\"type\":\"selector\",\"value\":1,\"dimension\":\"type\"},\"aggregator\":{\"type\":\"longSum\",\"name\":\"recordNumberA\",\"fieldName\":\"recordNumberA\"}}],\"intervals\":[\"2018-04-05T00:00:00.000/2018-04-13T00:00:00.000\"],\"having\":{\"type\":\"greaterThan\",\"aggregation\":\"recordNumberA\",\"value\":100}}",
				"{\"intervals\":[\"2018-04-06T11:32:53.120+08:00/2018-04-13T11:32:53.120+08:00\"],\"metric\":\"recordNumberA\",\"granularity\":\"all\",\"threshold\":3,\"dataSource\":\"so-mama-userSoAnalysis\",\"aggregations\":[{\"filter\":{\"type\":\"selector\",\"value\":1,\"dimension\":\"type\"},\"aggregator\":{\"fieldName\":\"recordNumberA\",\"name\":\"recordNumberA\",\"type\":\"longSum\"},\"type\":\"filtered\"}],\"dimension\":{\"outputName\":\"solrId\",\"type\":\"default\",\"dimension\":\"solrId\"},\"postAggregations\":[],\"limitSpec\":{\"columns\":[{\"dimension\":\"recordNumberA\",\"direction\":\"descending\"}]},\"dimensions\":[{\"column\":\"solrId\",\"limit\":\"3\",\"join\":\"\",\"mergeConfig\":\"\",\"type\":\"String\",\"sql\":\"\"}],\"queryType\":\"topN\"}",
				"{\"intervals\":[\"2018-04-24T00:00:00.000+08:00/2018-04-25T00:00:00.000+08:00\"],\"granularity\":{\"type\":\"period\",\"period\":\"P1D\",\"timeZone\":\"Asia/Shanghai\"},\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"selector\",\"dimension\":\"position\",\"value\":\"CSERVICE_NAMING\"},{\"type\":\"in\",\"dimension\":\"contextid\",\"values\":[]}]},\"dataSource\":\"dmp-receive-userAnalysis\",\"aggregations\":[{\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"selector\",\"dimension\":\"event\",\"value\":\"impression\"},{\"field\":{\"pattern\":\"%utm_medium=share%\",\"type\":\"like\",\"dimension\":\"item_mark\"},\"type\":\"not\"}]},\"aggregator\":{\"fieldName\":\"pv_sum_1\",\"name\":\"pv\",\"type\":\"longSum\"},\"type\":\"filtered\"},{\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"selector\",\"dimension\":\"event\",\"value\":\"impression\"},{\"field\":{\"pattern\":\"%utm_medium=share%\",\"type\":\"like\",\"dimension\":\"item_mark\"},\"type\":\"not\"}]},\"aggregator\":{\"fieldName\":\"devOuid_countd_1\",\"name\":\"uv\",\"type\":\"hyperUnique\",\"isInputHyperUnique\":false,\"round\":false},\"type\":\"filtered\"}],\"metric\":\"pv\",\"threshold\":10,\"dimension\":{\"type\":\"default\",\"dimension\":\"contextid\",\"outputName\":\"channel\",\"outputType\":\"STRING\"},\"queryType\":\"topN\"}",
				"{\"queryType\":\"topN\",\"dataSource\":\"fav-userFavAnalysis\",\"intervals\":[\"2018-01-27T00:00:00.000+08:00/2018-04-27T00:00:00.000+08:00\"],\"granularity\":\"all\",\"filter\":{\"type\":\"and\",\"fields\":[{\"type\":\"selector\",\"value\":0,\"dimension\":\"is_delete\"}]},\"aggregations\":[{\"fieldName\":\"recordNumber\",\"name\":\"recordNumber\",\"type\":\"longSum\"}],\"postAggregations\":[],\"dimension\":{\"outputName\":\"pj_id\",\"type\":\"default\",\"dimension\":\"pj_id\"},\"threshold\":1000,\"metric\":\"recordNumber\"}",
				"{\"name\":\"pihy\",\"age\":\"20\"}"};
		
		new JSONThread(strs[5],true).run();
		new JSONThread(strs[5],false).run();
		
//		for(int i=0;i<10;i++) {
//			new JSONThread(strs[i],true).run();
//			new JSONThread(strs[i],false).run();
//			System.out.println("---");
//		}
		
		
		
		/*for(int i=0;i<10;i++) {
			Long tt = 0L;
			for (String str : strs) {
				Long t1 = System.currentTimeMillis();
				json = JSONObject.parseObject(str);
				Long t2 = System.currentTimeMillis();
				tt = tt+(t2-t1);
			}
			
			System.out.println(tt);
			Thread.sleep(1000);
		}*/
		
	}
}
