package proxy;

public class Real implements IReal {
	
	/* (non-Javadoc)
	 * @see Proxy.IReal#compute(java.lang.String)
	 */
	@Override
	public long compute(String query){
		try {
			return Long.parseLong(query)*2;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	

}
