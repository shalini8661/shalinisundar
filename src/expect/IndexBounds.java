package expect;

import java.util.ArrayList;
import java.util.List;

public class IndexBounds {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	System.out.println(l.get(7));
}
}
