package main.ISP.entities.interfaces;

public interface XeroxInterface {
 
	boolean printContent(String content);
	boolean scanContent(String content);
	boolean photoCopyContent(String content);
	boolean PrintDuplexContent(String content);
}
