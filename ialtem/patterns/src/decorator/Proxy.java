package decorator;

public abstract class Proxy implements IReal {
	protected final IReal reference;
	
	Proxy(IReal real){
		assert real!=null;
		
		reference=real;
	}

	@Override
	public long compute(String query) {
		return reference.compute(query);
	}	

}
