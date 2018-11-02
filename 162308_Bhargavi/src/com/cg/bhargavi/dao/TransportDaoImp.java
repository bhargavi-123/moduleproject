package com.cg.bhargavi.dao;

import java.util.Map;

import com.cg.bhargavi.bean.TransportBean;
import com.cg.bhargavi.util.DataBase;

public class TransportDaoImp implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		DataBase.addTransport(bean);
		
	}

}
