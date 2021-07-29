
package sets;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	public static void main(String[] args)  throws IOException {
		FileInputStream f = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(f);
		String s1 = p.getProperty("user");
		System.out.println(s1);
	}
	
}
