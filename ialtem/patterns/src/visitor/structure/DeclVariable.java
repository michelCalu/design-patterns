package visitor.structure;

import visitor.visitors.NodeVisitor;

public class DeclVariable extends Node {

	public final String name;

	public DeclVariable(String name) {
		
		this.name = name;
	}

	@Override
	public void accept(NodeVisitor visitor) {
		
		visitor.visitDeclVariable(this);
	}

}
