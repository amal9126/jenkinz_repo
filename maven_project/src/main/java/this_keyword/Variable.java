package this_keyword;

public class Variable {
int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variable obj=new Variable(5);
obj.display();
	}
public Variable(int a)   //constructor
{
	this.a=a;
}
public void display() 
{
System.out.println(a);	
}
}
