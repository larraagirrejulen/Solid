package lsk;

public class ReadOnlyProjectFile extends ProjectFile implements LoadableFile{
	
	public ReadOnlyProjectFile(String filePath) { 
		super(filePath); 
	} 
	
	public void loadFile(){ 
		System.out.println("file loaded from "+filePath); 
	}
	
}
