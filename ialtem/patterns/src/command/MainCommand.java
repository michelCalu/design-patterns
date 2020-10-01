package command;

public class MainCommand {

	static public void main(String args[]) {
		Invoker invoker = new Invoker();

		Document doc = new Document("How to use the Command pattern to undo/redo...");
		System.out.printf("Original doc: %s\n", doc.toString());
		invoker.add(new CommandSetText(doc, "arbre avion moto bateau"))
			.add(new CommandSetChar(doc, 0, '!')).add(new CommandDelChar(doc, 10))
		//	.add(new CommandSetText(doc, "vache oiseau canard serpent"));
		;

		invoker.execute();

		System.out.printf("After invoker.execute: %s\n", doc.toString());

		invoker.Undo();

		System.out.printf("After invoker.undo: %s\n", doc.toString());

		invoker.execute();

		System.out.printf("After invoker.execute (redo): %s\n", doc.toString());

	}

}
