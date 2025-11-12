//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String ch = (args[0]);
            int num =Integer.parseInt(args [1]);
            String Special = "AEFHILMNORSX";

            String   cheers = ch.toUpperCase();

        
            for (int i = 0 ; i < cheers.length() ; i++){
                char letter = cheers.charAt(i);
                if (Special.indexOf(letter) != -1 ) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
                } else { 
                System.out.println("Give me a  " + letter + ": " + letter + "!");
                }
                }
                

                System.out.println("What does that spell?");

                for (int v = 0 ; v < num ; v++ ){
                  System.out.println(cheers + "!!!");
                }

            
            
        }
}
