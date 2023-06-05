package game.players;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import game.ChessBoard;

public class RandomPlayer extends ChessPlayer {

	public RandomPlayer(boolean color) {
		super(color);
	}

	public List<String> getAllMove(ChessBoard board) {
		return board.getCurrentColorMoves(this.color);
	}

	public String getNextMove(ChessBoard board) {
		List<String> moves = board.getCurrentColorMoves(this.color);
		Collections.sort(moves);
		int n = moves.size();
		System.out.println(n);
		System.out.println(moves.toString().replace("[", "").replace("]", "").trim());
		int k = ThreadLocalRandom.current().nextInt(0, n);
		String myMove = moves.get(k);
		System.out.println("My move = " + myMove);
		return myMove;
	}

	public String getNextMove(List<String> moves) {
		Collections.sort(moves);
		int n = moves.size();
		System.out.println(n);
		System.out.println(moves.toString().replace("[", "").replace("]", "").trim());
		int k = ThreadLocalRandom.current().nextInt(0, n);
		String myMove = moves.get(k);
		System.out.println("My move = " + myMove);
		return myMove;
	}
}
