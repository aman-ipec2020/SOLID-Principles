package main.ISP;

import main.ISP.entities.Cannon3860;
import main.ISP.entities.CannonMG2470;
import main.ISP.entities.HPLaserJet;

public class ISPDemo {

	public static void main(String[] args) {
		HPLaserJet printer1 = new HPLaserJet();
		printer1.photoCopyContent("Hello World");
		
		Cannon3860 printer2 = new Cannon3860();
		printer2.scanContent("Hye there");
		
		CannonMG2470 printer3 = new CannonMG2470();
		printer3.PrintDuplexContent("New World is here");

	}

}
