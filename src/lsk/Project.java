package lsk;

import java.util.Vector;

public class Project {
	
	public Vector<StorableFile> sfiles = new Vector<>();
	public Vector<LoadableFile> lfiles = new Vector<>();

	
	public void addLoadableProject(LoadableFile p){ 
		lfiles.add(p); 
	} 
	public void addStorabeProject(StorableFile p){ 
		sfiles.add(p); 
	} 
	public void addStorabeAndReadableProject(StorableAndReadable p){ 
		sfiles.add(p); 
		lfiles.add(p);
	} 
	 
	public void loadAllFiles(){ 
		for (LoadableFile lf:lfiles)
			lf.loadFile(); 
	} 
	  
	public void storeAllFiles(){ 
		for (StorableFile sf:sfiles) 
			sf.storeFile(); 
	}
}
