package java.tool.root;

import java.io.File;
import java.util.List;

public interface FileTool {
	
	public String getExtention(File file);
	
	public String getWithoutExtentionFileName(File file);
	
	public String getDirectory(File file);
	
	public String getParentDirectory(File file);
	
	public List<File> getChildFileList(File file);
	
	
}
