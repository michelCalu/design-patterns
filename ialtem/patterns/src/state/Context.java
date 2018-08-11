package state;

import state.TCPState.IllegalState;

public class Context implements TCPOperations {
	private TCPState currentState = new TCPClosed(this);

	public void setState(TCPState state) {
		assert state != null;

		currentState = state;
	}

	@Override
	public void open(int port) throws IllegalState {
		currentState.open(port);
	}

	@Override
	public void close() throws IllegalState {
		currentState.close();
	}

	@Override
	public String receive() throws IllegalState {
		return currentState.receive();
	}

	@Override
	public void reset() throws IllegalState {
		currentState.reset();
	}
}
