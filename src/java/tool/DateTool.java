package java.tool;

import java.util.Date;

public interface DateTool {
	
	public Date strToDate(String str);
	
	public String dateToStr(Date date);
	
	public boolean isDateStr(String str);
	public boolean isDateYyMmStr(String str);
	public boolean isDateYyMmDdStr(String str);
	public boolean isDateYyMmDdHhStr(String str);
	public boolean isDateYyMmDdHhMmStr(String str);
	public boolean isDateYyMmDdHhMmSStr(String str);
	public boolean isDateYyMmDdHhMmSMsStr(String str);

	public boolean isDateYyyyMmStr(String str);
	public boolean isDateYyyyMmDdStr(String str);
	public boolean isDateYyyyMmDdHhStr(String str);
	public boolean isDateYyyyMmDdHhMmStr(String str);
	public boolean isDateYyyyMmDdHhMmSStr(String str);
	public boolean isDateYyyyMmDdHhMmSMsStr(String str);
	
	public int getDateDiff(Date date1, Date date2);
}
