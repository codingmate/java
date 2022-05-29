package java.tool.root;

import java.tool.DateTool;
import java.tool.RegExTool;

public interface StringTool extends DateTool, RegExTool{
	
	public boolean isIcldUcdStr(String str);
	public String ucdToStr(String ucdIcldStr);
	public Character ucdToChar(String ucd);

}
