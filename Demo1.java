import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException
	{
		
		
		File f1=new File("d:\\info123.txt");
		
		if(!f1.exists())
		{
			System.out.println("File not found ...");
			f1.createNewFile();
			System.out.println("file created ");
		}
		else
		{
			System.out.println("File Already present ");
			System.out.println("Length = "+f1.length());
		}
		
		
	}
}
