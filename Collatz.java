// Demonstrates the Collatz conjecture.



public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
			
		int N = Integer.parseInt(args[0]);
	      String cv = (args[1]);

		boolean verbose = cv.equalsIgnoreCase("v"); 
       
	    int count;
	

        for (int seed = 1; seed <= N; seed++) {
            long num = seed;
            count = 1;
            String sequence = "" + num;

            while( num != 1 ) {
               
                if(num % 2 == 0)
				{
					num = num / 2;	
				}else{
					num = (num * 3) + 1;
				}
				sequence = sequence + " " + num;
                count++;
            }


		
				 if (verbose) {
               	 System.out.println(sequence + " (" + count + ")");
          			  }
      
				System.out.println("Every one of the first " + sequence + " hailstone sequences reached 1.");
	}
	

	}
}
