import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException 
	{
		
		File f1=new File("d:\\info11.txt");
		
		FileOutputStream fo=new FileOutputStream(f1,true);//true means append mode
		fo.write('M');
		fo.close();
		
		if(f1.exists())
		{
			System.out.println("File found ");
			System.out.println("Length = "+f1.length());
			System.out.println("Path= "+f1.getAbsolutePath());
			
			FileInputStream fin=new FileInputStream(f1);
			int x;			
			while((x=fin.read())!=-1)
			{
				System.out.print((char)x);
			}
			
		}
		else
			System.out.println("File Not found ");
		
		
	}

}
