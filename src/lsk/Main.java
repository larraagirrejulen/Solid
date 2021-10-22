package lsk;

public class Main {
	public static void main(String[] args) {
		Project project = new Project();
		ProjectFile projectFile1 = new ProjectFile("src");
		ProjectFile projectFile2 = new ProjectFile("src");
		ProjectFile projectFile3 = new ProjectFile("src");
		project.addProject(projectFile1);
		project.addProject(projectFile2);
		project.addProject(projectFile3);
		
		project.loadAllFiles();
		project.storeAllFiles();
	}
}
