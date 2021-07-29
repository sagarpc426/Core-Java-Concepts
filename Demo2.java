
import java.io.File;

public class Demo2 {

	public static void main(String[] args) {
		
		File f=new File("D:\\");
		
		String filenames[]=f.list();
		
		for(String fnm : filenames)
		{
			System.out.println(fnm);
		}
		
	}
}
