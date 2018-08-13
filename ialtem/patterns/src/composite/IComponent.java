package composite;

public abstract class IComponent {
	
	private IComponent gauche;
	private IComponent droite;
	private int value;
	
	public IComponent (int v) {
		value=v;
	}
	
	public abstract void doOperation();
	
	public abstract IComponent[] getChildren();

	public IComponent getGauche() {
		return gauche;
	}

	public void setGauche(IComponent gauche) {
		this.gauche = gauche;
	}

	public IComponent getDroite() {
		System.out.println(droite+ "in getDroite");
		return droite;
	}

	public void setDroite(IComponent droite) {
		this.droite = droite;
	}
	
	

}
