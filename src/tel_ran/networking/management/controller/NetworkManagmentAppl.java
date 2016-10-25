package tel_ran.networking.management.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import tel_ran.networking.management.RoutersMonitoring;

public class NetworkManagmentAppl {
	private RoutersMonitoring monitoring;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("mbeansNoReg.xml");
		while(true);
	}

}
