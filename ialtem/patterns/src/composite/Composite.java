package composite;

public class Composite extends IComponent {
	
	public Composite(int v) {
		super(v);

	}

	public void doOperation() {
		System.out.println("operation executed in Composite");
	}
	
	public boolean addComponent(IComponent ic) {
		if(this.getGauche()==null) {
			this.setGauche(ic);
		}else if (this.getDroite()==null){
			this.setDroite(ic);
		}else {
			return false;
		}
		return true;
	}

	@Override
	public IComponent[] getChildren() {
		IComponent[] children=new IComponent[2];
		children[0]=this.getGauche();
		children[1]=this.getDroite();
		return children;
	}

}
