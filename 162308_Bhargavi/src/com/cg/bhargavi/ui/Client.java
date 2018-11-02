package com.cg.bhargavi.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import com.cg.bhargavi.bean.TransportBean;
import com.cg.bhargavi.service.ITransportService;
import com.cg.bhargavi.service.TransportServiceImp;

public class Client {
	
public static void main(String[] args) {
	TransportBean bean = new TransportBean();
	ITransportService service = new TransportServiceImp();
	Map<String, String> transportDetails = service.getTransportDetails();
	System.out.println("Mode of transport");
	int count = 1;
	for (Map.Entry<String, String>  entryset :transportDetails.entrySet()) {
		System.out.println(count+". "+entryset.getValue());
		count++;
	}
	System.out.println("enter option");
	Scanner scanner = new Scanner(System.in);
	int choice = scanner.nextInt();
	int count1 = 1;
	for (Map.Entry<String, String>  entryset :transportDetails.entrySet()) {
		if( choice == count1) {
			bean.setTransportCategoryId(entryset.getKey());
		}
		count1++;
	}
	int id = (int) (Math.random()*10000);
	bean.setId(id);
	System.out.println("Enter reason");
	scanner.nextLine();
	String reason = scanner.nextLine();
	System.out.println("\n1.a \n2.b \n3.c");
	int whenchoice = scanner.nextInt();
	if(whenchoice == 1){
		bean.setWhen("a");
	}
	if(whenchoice == 2){
		bean.setWhen("b");
	}
	if(whenchoice == 3){
		bean.setWhen("c");
	}
	service.addTransport(bean);
	LocalDateTime ldt=LocalDateTime.now();
	DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh : mm a ");
	System.out.println("Booked with"+id+" on "+ ldt.format(f));
}
}
