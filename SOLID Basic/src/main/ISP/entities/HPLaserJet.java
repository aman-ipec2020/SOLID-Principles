package main.ISP.entities;

import main.ISP.entities.interfaces.PhotoCopyInterface;
import main.ISP.entities.interfaces.ScanInterface;

public class HPLaserJet implements PhotoCopyInterface, ScanInterface{

	final static String printerName = "HPLaserJet";

	@Override
	public boolean scanContent(String content) {
		System.out.println("\t[" + printerName + "] : " + content + " Scanning Done...");
		return true;
	}

	@Override
	public boolean photoCopyContent(String content) {
		System.out.println("\t["+ printerName + "] : " + content + " PhotoCopy Done...");
		return true;
	}
	
}
