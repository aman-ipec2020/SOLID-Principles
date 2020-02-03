package main.ISP.entities;

import main.ISP.entities.interfaces.PrintInterface;

public class CannonMG2470 implements PrintInterface {

	final static String printerName = "CannonMG2470";

	@Override
	public boolean printContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " Printing Done...");
		return true;
	}
	
	@Override
	public boolean PrintDuplexContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " Duplex Printing Done...");
		return true;
	}
}
