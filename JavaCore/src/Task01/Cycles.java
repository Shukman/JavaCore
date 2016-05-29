package Task01;

public class Cycles {
	
	public static final double EPS = 0.001;
	
	public static void main(String[] args) {
		
		double a = 1;
		double i = 1;
		
			while(a > EPS){

				a = 1/((i+1)*(i+1));
				System.out.println("a = " + a);
				i++;
			
		}
			System.out.println("i = " + i);
	}
}
