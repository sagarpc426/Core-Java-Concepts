import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo9 {
	



    public static void main( String args[] ){
    	
    	String INPUT = "foo foo foooo finfoo Foo";
               
        Pattern p = Pattern.compile("foo foo");
        Matcher m = p.matcher(INPUT);

    
        System.out.println("Current INPUT is: "+INPUT);

        System.out.println("lookingAt(): "+m.lookingAt());
        System.out.println("matches(): "+m.matches());
    }


}
