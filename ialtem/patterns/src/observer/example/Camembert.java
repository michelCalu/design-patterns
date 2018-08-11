package observer.example;

import org.apache.log4j.Logger;

import observer.Observable;
import observer.ObservableOptim;
import observer.Observer;

public class Camembert implements Observer {
	private static Logger logger = Logger.getLogger(Camembert.class);

	public Camembert(Data data) {
		data.attach(this);
	}

	@Override
	public void update(Observable subject) {
		logger.info("camembert notified");

	}

	@Override
	public void update(ObservableOptim subject) {
		logger.info("histogram notified");
		
	}

}
