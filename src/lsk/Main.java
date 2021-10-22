package lsk;

public class Main {
	public static void main(String[] args) {
		Project project = new Project();
		LoadableFile projectFile1 = new ReadOnlyProjectFile("src");
		LoadableFile projectFile2 = new ReadOnlyProjectFile("src");
		StorableAndReadable projectFile3 = new StoreableAndReadableProjectFile("src");
		project.addLoadableProject(projectFile1);
		project.addLoadableProject(projectFile2);
		project.addStorabeAndReadableProject(projectFile3);
		
		project.loadAllFiles();
		project.storeAllFiles();
	}
}
