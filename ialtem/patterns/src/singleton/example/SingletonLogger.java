package singleton.example;

import java.io.PrintStream;

/**
 * 
 * @author UNamur
 * This class must be copied/pasted and adapted for every class that
 * is a singleton. This code is just a template.
 *
 */
public class SingletonLogger {

	private static SingletonLogger instance=null;
	private final PrintStream out;
	
	private SingletonLogger(PrintStream stream){
		assert stream!=null;
		
		this.out=System.err;
		
	}
	
	public static SingletonLogger getInstance(){
		if (instance==null){
			instance=new SingletonLogger(System.err);
		}
		return instance;
	}
	
	public PrintStream out(String msg){
		out.print(msg);
		return this.out;
	}

	public PrintStream out(){
		return this.out;
	}
	
	
}
