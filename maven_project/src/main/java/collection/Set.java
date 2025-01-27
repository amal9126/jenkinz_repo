package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> a=new HashSet<String>();
a.add("how");
a.add("are");
a.add("you");
System.out.println(a);

Iterator<String> b = a.iterator();

while (b.hasNext())
{
	System.out.println(b.next());
}
b.remove();
System.out.println(a);
	
	}

}
