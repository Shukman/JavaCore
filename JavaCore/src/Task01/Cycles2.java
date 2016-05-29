package Task01;

public class Cycles2 {
	
	public static void main(String[] args) {
		
		for (int x = 0; x < 20; x++) {
			System.out.print("x = " + x);
			System.out.printf(",\t F(x) = %.2f \n" ,F(x));
		}
	}
	
	public static double F(int x){
		double f = Math.tan(2*x) - 3;
		return f;
	}
}
