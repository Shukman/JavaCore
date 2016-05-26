package test1_160526;

public class Test1 {
	
	static public void main(String... arguments) {
		//no import
		javase01.t01.logic.Logic logic = new javase01.t01.logic.Logic();
		System.out.println(logic.method().equals("I am string in Logic"));
		System.out.println(logic.method());
		
	}
}
