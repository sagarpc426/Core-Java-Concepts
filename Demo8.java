
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 {

public static void main(String[] args) {
		
		String str="Jon Jonathan JonFrankjon Ken Jon JON ToddJon"; //source string
		
		//Pattern p=Pattern.compile("Jon");  //exact match
		//OR
		Pattern p=Pattern.compile("Jon.?"); // match anywhere (even as substring)
		Matcher m=p.matcher(str);
		
		System.out.println("Original string = "+str);
		
		str=m.replaceAll("JIM");
		
		System.out.println("after replacement string is  = "+str);
		
	}
}
