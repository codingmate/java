package main.tool;

import java.util.List;

public interface RegExTool {
	
	public boolean isMatched(String regEx, String str);
	
	public List<String> matchedGrpList();
	
	
	
}
