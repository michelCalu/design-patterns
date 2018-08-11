package composite;

public class Leaf extends IComponent{
	
	public Leaf(int v) {
		super(v);
	}

	public IComponent[] getChildren() {
		return null;
	}
	
public void doOperation() {
		System.out.println("operation executed in leaf");
	}

}
