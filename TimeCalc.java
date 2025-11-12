public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String hhmm = (args[0]);
        String adding = (args[1]);

        String[] parts = hhmm.split(":");

        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);

    

       String minutes = ((hh * 60 ) + adding + mm );
        int min = Integer.parseInt (minutes);
        int hours = (min / 60 );
        int newhours = (hh % 24);
        int newminutes = (min - (hours*60));

        String hourstr ;
         if (newhours < 10) {
         hourstr = "0" + newhours;
        } else {
         hourstr = "" + newhours;
        }

        System.out.println(hhmm + " " + adding);

        System.out.println(hourstr + ":" + newminutes);

    }
}


