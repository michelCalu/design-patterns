package abstractFactory.factory.swt;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.Button;
import abstractFactory.factory.Label;
import abstractFactory.factory.TextField;
import abstractFactory.factory.Window;

public class SwtFactory extends AbstractFactory{

	@Override
	public Window buildWindow() {
		System.out.println("i am building an SwtWindow object");
		return new SwtWindow();
	}

	@Override
	public Button buildButton(String label) {
		System.out.println("i am building an SwtButton object");
		return  new SwtButton(label);
	}

	@Override
	public TextField buildTextField(String label, int length) {
		System.out.println("i am building an SwtTextField object");
		return new SwtTextField(label,length);
	}

	@Override
	public Label buildLabel(String label) {
		System.out.println("i am building an SwtLabel object");
		return new SwtLabel(label);
	}

}
