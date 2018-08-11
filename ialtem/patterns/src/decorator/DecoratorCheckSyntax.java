package decorator;

/**
 * 
 * @author UNamur
 * 
 * This decorator checks the syntax of the query.
 *
 */
public class DecoratorCheckSyntax extends Proxy {

	public DecoratorCheckSyntax(IReal real) {
		
		super(real);
		System.out.printf("creating DecoratorCheckSyntax(Ireal real)"+this.reference);
	}

	@Override
	public long compute(String query) {
		if (check(query)) {
			return super.compute(query);
		} else {
			return Long.MIN_VALUE;
		}
	}

	private boolean check(String query) {
		return query!=null && query.matches("-?[0-9]+");
	}

}
