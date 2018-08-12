package immutableMain;
import java.util.Date;

import immutable.IDate;
import immutable.ImmutableDate;
import immutable.MutableDate;


public class ImmutableMain {

	public static void main(String[] args) {
		
		Date date = new Date();
	    long diff;
	    diff = date.getTime();
		
	    
	    IDate m = new MutableDate();
	    
	    MutableDate rw=(MutableDate) m;
	    rw.setDate(diff);
	    ImmutableDate ro=m.getImmutableDate();
	    
	    
	
	    
	    System.out.println("rw= "+rw.getDate());
	    System.out.println("rw= "+rw.getImmutableDate());
	    System.out.println("ro= "+ro.getDate());
	    System.out.println("ro= "+ro.getImmutableDate());
	    
	
		

	}

}
