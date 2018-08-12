package immutable;

public class MutableDate implements IDate
{
	protected long date;
	
	public MutableDate()
	{}

	public MutableDate(long date)
	{
		this.date = date;
	}

	public long getDate()
	{
		return date;
	}

	public void setDate(long date)
	{
		this.date = date;
	}

	public final ImmutableDate getImmutableDate()
	{
		// We have to make a new one. It is guaranteed to be the correct class
		return new ImmutableDate(date);
	}

	@Override
	public String toString() {
		return "MutableDate [date=" + date + "]";
	}
	
	
	
	
}