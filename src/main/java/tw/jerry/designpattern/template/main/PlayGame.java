package tw.jerry.designpattern.template.main;

import tw.jerry.designpattern.template.abstractclazz.AbstractGuessGame;
import tw.jerry.designpattern.template.clazz.ConsoleGame;

public class PlayGame {

	public static void main(String[] args) {
		AbstractGuessGame game = new ConsoleGame();
		game.go();

	}

}
