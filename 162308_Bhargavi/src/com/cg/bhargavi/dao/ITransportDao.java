package com.cg.bhargavi.dao;

import java.util.Map;

import com.cg.bhargavi.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
