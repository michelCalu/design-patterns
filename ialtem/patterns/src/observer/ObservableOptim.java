package observer;

public class ObservableOptim extends Observable {
	private boolean hasChanged = false;

	protected void setChanged() {
		hasChanged = true;
	}

	protected void clearChanged() {
		hasChanged = false;
	}

	@Override
	public void notifyObs() {
		if (hasChanged) {
			super.notifyObs();
			clearChanged();
		}
	}

}
