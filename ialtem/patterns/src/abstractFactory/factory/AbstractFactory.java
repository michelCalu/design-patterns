package abstractFactory.factory;


/**
 * @author michel
 * testing the AbstractFacory
 */
public abstract class AbstractFactory {
	public abstract Window buildWindow();
	public abstract Button buildButton(String label);
	public abstract TextField buildTextField(String label, int length);
	public abstract Label buildLabel(String label);
}