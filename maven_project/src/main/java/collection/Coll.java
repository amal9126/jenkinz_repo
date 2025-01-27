package collection;

import java.util.ArrayList;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> a=new ArrayList <String>();
a.add("how");
a.add("are");
a.add("you");
System.out.println(a);

a.add(0,"hi");  //to add by providing index position
System.out.println(a);

a.set(0, "hai");  //set is used to repalce "hi" with "hai"
System.out.println(a);

a.get(2); // to print the value at index position 2
System.out.println(a.get(2));

a.remove(0);
System.out.println(a);

if (a.contains("are"))
{
	System.out.println("element is present");
}
else
{
	System.out.println("not present");
}

if (a.isEmpty())
{
	System.out.println("it is empty");
}
else
{
	System.out.println("not empty");
}
	}
	

}
