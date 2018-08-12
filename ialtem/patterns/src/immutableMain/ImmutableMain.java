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
	    ImmutableDate ro=m.getImmutableDate();
	    
	    rw.setDate(diff);
	    ro.getDate();
	    
	
		

	}

}
