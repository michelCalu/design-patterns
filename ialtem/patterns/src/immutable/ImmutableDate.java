package immutable;

public final class ImmutableDate implements IDate{
	
	private final MutableDate date;	// Not a long, we proxy to a MUTABLE date.

	public ImmutableDate (long millis){
		date = new MutableDate(millis);
	}

	// We are already immutable and the correct class.
	public final ImmutableDate getImmutableDate(){
		return this;	
	}

	// All getXXX() methods just transfers execution to the contained,
	// and never exposed, MutableDate.
	public final long getDate(){
		return date.getDate();
	}

	@Override
	public String toString() {
		return "ImmutableDate [date=" + date + "]";
	}
	
}