package this_keyword;

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cons obj=new Cons(5);
	}
public Cons(float a)
{
	this();
	System.out.println(a);
}
public Cons(int b)
{
	this(5.6f);
	System.out.println(b);
}
public Cons()
{
	System.out.println("first");
}
}

