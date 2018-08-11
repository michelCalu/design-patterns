package composite;

public class MainComposite {
	
	public static void main (String[] args) {
		
		Composite father;
		Leaf l1 = new Leaf(10);
		Leaf l2 = new Leaf(20);
		
		father=new Composite(0);
		father.addComponent(l1);
		father.addComponent(l2);
		
		
	}
	
	

}
