package me.joebass.neluxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	private List<String> quitWords;

	public Program() {
		quitWords = new ArrayList<String>();
		quitWords.add("quit");
		quitWords.add("exit");
		quitWords.add("q");
		System.out.println("Welcome");
		Scanner keyboard = new Scanner(System.in);
		String line;
		while (!quitWords.contains((line = keyboard.nextLine().toLowerCase()))) {
			System.out.println(parse(line));
		}
	}

	private String parse(String line) {
		return line;
	}

	public static void main(String[] args) {
		new Program();
	}
}
