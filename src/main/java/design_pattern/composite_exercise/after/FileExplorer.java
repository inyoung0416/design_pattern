package design_pattern.composite_exercise.after;

public abstract class FileExplorer {
	private String name; 
	private int depth = 0;
	
	public FileExplorer(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getDepth() {
		return depth;
	}

	public abstract int getSize();
	public abstract void print();
	
	
}
