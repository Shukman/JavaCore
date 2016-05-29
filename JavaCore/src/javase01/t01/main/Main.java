package javase01.t01.main;

import javase01.t01.logic.Logic;

public class Main {
	
	static public void main(String... arguments) {

		Logic logic = new Logic();
		System.out.println(logic.method().equals("I am string in Logic"));
		System.out.println(logic.method());
	}
}
