package hw37;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
	/** @autor szebe
	 * 
	 * A program szimulál egy számkitalálós játékot, melynek 2 játékosa egy-egy szál. A játék indulásakor egy
     véletlenszerű számot inicializálok 1 és 10 között (inkluzív) majd a két szál, amiket a játék indításakor elindítunk véletlenszerűen
     generált számokkal megpróbálja eltalálni a számot. Ha egy szál eltalálja a számot, akkor a játék azonnal véget ér és kiírja a
     program a győztes szál nevét.
	 *
	 */

	public static void main(String[] args) throws InterruptedException {

		Random random = new Random();
		int secretNumber = random.nextInt(10) + 1;
		System.out.println("The secret number: " + secretNumber);
		System.out.println("---GAME STARTED---");

		Game game = new Game(secretNumber);

		Player playerA = new Player(game);
		Player playerB = new Player(game);

		Thread player1 = new Thread(playerA, "Player1");
		Thread player2 = new Thread(playerB, "Player2");

		player1.start();
		player2.start();

		player1.join();
		player2.join();

		System.out.println(player1.getName() + " finished");
		System.out.println(player2.getName() + " finished");
		System.out.println("---GAME OVER---");
		System.out.println("The winner: " + game.getWinner());
	}
}
