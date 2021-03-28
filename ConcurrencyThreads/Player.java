
package hw37;

import java.util.Random;

public class Player implements Runnable {

	private Game game;

	public Player(Game game) {
		this.game = game;
	}

	public synchronized void run() {

		do {

			Random random1 = new Random();
			int number1 = random1.nextInt(10) + 1;

			System.out.println(Thread.currentThread().getName() + " guessing: " + number1);
			try {
				Thread.sleep(random1.nextInt(2) + 1);
			} catch (InterruptedException e) {

			}

			game.guess(number1);
		} while (!game.isOver());

	}
}
