package HashSetExample;
import java.util.ArrayList;
import java.util.HashSet;

public class TestParle {

	public static void main(String[] args) {
		ArrayList<Parle> a = new ArrayList<Parle>();
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Parle-G");
		h1.add("KrackJack");
		h1.add("20-20");
		h1.add("Monaco");
		h1.add("Marie");
		
		a.add(new Parle(11,"Biscuits","Mumbai",h1));
		
		for(Object ob:a) {
			System.out.println(ob);
		}
	}

}
