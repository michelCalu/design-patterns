package abstractFactory;

import abstractFactory.factory.*;
import abstractFactory.factory.swt.SwtFactory;

public class Main {
// 	static public final AbstractFactory factory=new SwingFactory();
	
	static public final AbstractFactory factory=new SwtFactory(); //declares a new SwtFactory 

	public static void main(String[] args) {
		Window window=factory.buildWindow();
		Button ok=factory.buildButton("OK");
		Button cancel=factory.buildButton("Cancel");
		TextField login=factory.buildTextField("Login:", 30);
		
		window.add(ok).add(cancel).add(login);
		window.display();

	}

}
