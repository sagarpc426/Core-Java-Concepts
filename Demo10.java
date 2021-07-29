
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo10 {

	

	public static void main(String[] args) {
	
		 
		 
	     String INPUT = "cat cat cat cattie cat";
	     String REGEX = "\\bcat\\b";  //  \b menas non word boundries
	     
		 Pattern p = Pattern.compile(REGEX);
	       Matcher m = p.matcher(INPUT); // get a matcher object
	       int count = 0;

	       while(m.find()) {
	         count++;
	         
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());

	       }
	       System.out.println("Match number "+count);
	       
	       
	   /*    String REGEX1 = "cat";
	        Pattern p1 = Pattern.compile(REGEX1);
	       Matcher m1 = p1.matcher(INPUT); // get a matcher object
	       int count1 = 0;

	       while(m1.find()) {
	    	   
	    	   System.out.println("found    cat");
	         count1++;
	         System.out.println("Match number "+count1);
	         System.out.println("start(): "+m1.start());
	         System.out.println("end(): "+m1.end());
     
	       }*/
    }
}
