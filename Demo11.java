
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo11 {
	
	public static void main(String[] args) {
		
		//ARM
		
		// try with resources block
			
	    try 
		 ( FileInputStream fi=new FileInputStream("info.txt");
	       FileOutputStream fo=new FileOutputStream("data.txt");
				 
		 )
		{
		
	    	// code to read / write file
			
		} 
	    catch ( IOException e) {
			
			e.printStackTrace();
		}
	 
		
	    
	    StringTokenizer st=new StringTokenizer("I stay in Pune ? at DP Road" , "?");
	    
	    while(st.hasMoreTokens())
	    {
	    	System.out.println(st.nextToken());
	    }
		
	    Scanner sc=new Scanner("I Live in Pune");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
			
	}

}
