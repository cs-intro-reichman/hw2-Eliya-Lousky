// Demonstrates the Collatz conjecture.

import javax.sound.midi.Sequence;

public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
			
		int N = Integer.parseInt(args[0]);
	      
		String sequence = "";
       
		int count = 1;

            while( N != 1 ||count ==1 ) {
                sequence = sequence + N + ", ";
                if(N % 2 == 0)
				{
					N = N / 2;	
				}
                else 
				{N = (N * 3) + 1;}
                count++;
            }

            sequence =sequence +  "1";

		String cv = (args[1]);



            if(cv.equals("V")) 
			{
				System.out.println(sequence + " (" + count + ")");
			}
			else
    	{
		System.out.println("Every one of the first " + sequence + " hailstone sequences reached 1.");
		}
	
	}
}
