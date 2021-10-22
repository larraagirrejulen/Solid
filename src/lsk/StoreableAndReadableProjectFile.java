package lsk;

public class StoreableAndReadableProjectFile extends ProjectFile implements StorableAndReadable{

	public StoreableAndReadableProjectFile(String filePath) { 
		super(filePath); 
	}

	@Override
	public void storeFile() {
		System.out.println("file stored to "+filePath); 
		
	}

	@Override
	public void loadFile() {
		System.out.println("file loaded from "+filePath); 
		
	} 

}
