import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("d:\\info123.txt");//source
		File f2=new File("d:\\file4.txt");
		
		RandomAccessFile rm1=new RandomAccessFile(f1, "r");
		RandomAccessFile rm2=new RandomAccessFile(f2, "rw");
		
		int x=0;
		System.out.println("position of file pointer "+rm1.getFilePointer());
		rm1.seek(3);
		System.out.println("position of file pointer "+rm1.getFilePointer());
		
		while((x=rm1.read())!=-1)
		{
			rm2.writeByte((char)x);		
		}
		System.out.println("Done !!!!!!!");
	}
}
