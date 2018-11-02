package com.cg.bhargavi.service;

import java.util.Map;

import com.cg.bhargavi.bean.TransportBean;
import com.cg.bhargavi.dao.ITransportDao;
import com.cg.bhargavi.dao.TransportDaoImp;

public class TransportServiceImp implements ITransportService {
    ITransportDao dao = new TransportDaoImp();
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
		
	}

}
