package com.cg.bhargavi.service;

import java.util.Map;

import com.cg.bhargavi.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
