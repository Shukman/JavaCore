package Task01;

import java.util.Arrays;


public class Massive {
	
	public static void main(String[] args) {
		
		double[] mass = {-1.1, 7.5, 2.8, -10.9, 3.0, 3.8, 5.4, 6.2, 0, 7.1};
		int i = 0;
		double[] mass1 = new double[mass.length/2];
		double max = 0;
			
			while(i <= mass[mass.length - 1]/2+1){

				for (int j = 0; j < mass1.length; j++) {
					mass1[j] =(mass[i] + mass[(mass.length - i - 1)]);
					i++;
			}
		}
			System.out.println(Arrays.toString(mass1));
			
			//2 вариант
//			Arrays.sort(mass1);
//			System.out.println(mass1[mass1.length-1]);
		
			max = mass1[0];
			for (int j = 0; j < mass1.length-1; j++) {
				if(mass1[j] > max){
					max = mass1[j];
				}
			}
			System.out.println(max);
	}
}
