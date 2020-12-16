package amrib.interview;

public class Example {

    static int bites = 0;

    public void takeBite() {
        bites++;
    }

    public static void main(String[] args) {
    	Example macintosh = new Example();
    	Example grannySmith = new Example();
        macintosh.takeBite();
        grannySmith.takeBite();
        System.out.println("The Macintosh apple has " + macintosh.bites + " bite(s) out of it.");
        System.out.println("The Granny Smith apple has " + grannySmith.bites + " bite(s) out of it.");
        
        System.out.println("****************************");
        
        String str1 = "abcdefmlkjuioerty";
        String str2 = str1.substring(6, 9);
        System.out.println(str2);
    }
}
