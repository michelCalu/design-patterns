package decorator;

public class MainDecorator {

	public static void main(String[] args) {
		IReal real = new Real();
		IReal decoCheckSyntax = new DecoratorCheckSyntax(real);
		IReal decoLogging = new DecoratorLogging(decoCheckSyntax);

	
		
		System.out.printf("Evaluation of \"%s\" is %d.\n", "-15",decoLogging.compute("-15"));
		System.out.println();
		System.out.printf("Evaluation of \"%s\" is %d.\n", "foo",decoLogging.compute("foo"));
		System.out.println();

	}

}
