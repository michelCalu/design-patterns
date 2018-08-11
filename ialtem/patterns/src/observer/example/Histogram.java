package observer.example;

import org.apache.log4j.Logger;

import observer.Observable;
import observer.ObservableOptim;
import observer.Observer;

public class Histogram implements Observer {
	static private Logger logger = Logger.getLogger(Histogram.class);

	public Histogram(Data data) {
		data.attach(this);
	}

	@Override
	public void update(Observable subject) {
		logger.info("histogram notified");
		
	}

	@Override
	public void update(ObservableOptim subject) {
		logger.info("histogram notified");
		
	}

}
