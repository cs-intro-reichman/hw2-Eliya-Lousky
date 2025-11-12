// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		  
		double sum = 0.00 ;


		for (int i = 0 ; i < num; i++)
		if (i%2 == 0 ) {
			sum += 1.0 / (2*i +1);
		} else {
			sum -= 1.0 / (2*i +1);
		}

		    double approxPi = sum * 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.printf("pi, approximated:     %.16f%n", approxPi);
    }
}
		