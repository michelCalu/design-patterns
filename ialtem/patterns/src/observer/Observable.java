package observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
	private final Set<Observer> observers = new HashSet<Observer>();

	public void attach(Observer o) {
		assert o != null;

		observers.add(o);
	}

	public void detach(Observer o) {
		assert o != null;

		observers.remove(o);
	}

	public void notifyObs() {
		for (final Observer o : observers) {
			o.update(this);
		}
	}

}
