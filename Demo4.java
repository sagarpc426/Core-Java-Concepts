import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {

public static void main(String[] args) throws IOException {
			
		File f1=new File("d:\\info123.txt");  //source
		File f2=new File("d:\\myfile1.txt"); //destination
		
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2,true);
		
		int x;
		
		while((x=fin.read())!=-1)
		{
			fout.write(x);
			System.out.print((char)x);
		}
		
		System.out.println("File copied ...");
		
		fin.close();
		fout.close();
		
	}
}
