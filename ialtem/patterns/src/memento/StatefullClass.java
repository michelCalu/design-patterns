package memento;

public class StatefullClass {
	private DataState state=new DataState();
	
	public StatefullClass(String name,String firstname, int age) {
		this.state.name=name;
		this.state.firstname=firstname;
		this.state.age=age;		
	}

	/**
	 * Increase the age
	 */
	public void birthday(){
		state.age++;
	}
	
	public IDataState getState(){
		try {
			return (IDataState)state.clone();
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
	public void setState(IDataState state){
		this.state=(DataState)state;
	}


	public int getAge() {
		return state.age;
	}
}
