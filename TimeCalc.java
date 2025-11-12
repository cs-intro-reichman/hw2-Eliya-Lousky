public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String [] hhmm = args[0].split(":");
      
        int hh = Integer.parseInt(hhmm[0]);
        int mm = Integer.parseInt(hhmm[1]);

        int adding =Integer.parseInt(args[1]);

        int totalMinutes = ((hh * 60) + mm + adding)        ;
        totalMinutes = ((totalMinutes % (24 * 60)) + (24 * 60)) % (24 * 60);;
    
        int newhours = (totalMinutes / 60);
        int newminutes = (totalMinutes % 60);
       

        String hourstr ;
         if (newhours < 10) {
         hourstr = "0" + newhours;
        } else {
         hourstr = "" + newhours;
        }

          String minustr;
         if (newminutes < 10) {
         minustr = "0" + newminutes;
        } else {
         minustr = "" + newminutes;
        }



        

        System.out.println(hourstr + ":" + minustr);

    }
}


