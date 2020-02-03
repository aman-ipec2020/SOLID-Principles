package main.ISP.entities;

import main.ISP.entities.interfaces.XeroxInterface;

public class Cannon3860 implements XeroxInterface{

	final static String printerName = "Cannon3860";
	
	@Override
	public boolean printContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " Printing Done...");
		return true;
	}

	@Override
	public boolean scanContent(String content) {
		System.out.println("\t["+ printerName + "] : " + content + " Scanning Done...");
		return true;
	}

	@Override
	public boolean photoCopyContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " PhotoCopy Done...");
		return true;
	}

	@Override
	public boolean PrintDuplexContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " Duplex Printing Done...");
		return true;
	}

}
