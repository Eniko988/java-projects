
package hw37;

import java.util.Random;

public class Game {

	private int number;
	private String winner;

	public Game(int number) {
		this.number = number;
	}

	public synchronized void guess(int otherNumber) {
		if (this.number == otherNumber && !isOver()) {
			winner = Thread.currentThread().getName();
		}
	}

	public synchronized boolean isOver() {

		return winner != null;
	}

	public String getWinner() {
		return winner;
	}
}
