package com.cg.bhargavi.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.bhargavi.bean.TransportBean;

public class DataBase {
   private static Map<String,String> transportDetails = new HashMap<>();
   private static Map<Integer,TransportBean> bookTransport = new HashMap<>();
	
   public static Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-1", "train");
		transportDetails.put("ta-1", "taxni");
		
		return transportDetails;
	}

public static void addTransport(TransportBean bean) {
	// TODO Auto-generated method stub
	bookTransport.put(bean.getId(), bean);
	
}

}
