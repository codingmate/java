package java.tool;

public interface StringTool {
	
	public boolean isIcldUcdStr(String str);
		public String ucdToStr(String ucdIcldStr);
			public Character ucdToChar(String ucd);
	
			
	public boolean isMatched(String regEx, String str);
	
	
	public boolean isDateStr(String str);
		public boolean isDateYyyymmdd(String str);
	
}
