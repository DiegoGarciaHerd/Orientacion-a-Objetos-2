package ar.edu.unlp.info.oo2.ej18_FileManager;

public abstract class FileDecorator implements File {
	protected File file;
	
	public FileDecorator(File file) {
		this.file = file;
	}
	public String prettyPrint() {
		return file.prettyPrint();
	}
	
	
	
}
