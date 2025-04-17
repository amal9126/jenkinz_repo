package super_keyword;

public class Child extends Parent {
int a=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.display();
System.out.println(obj.a);
	}

	@Override
	public void display() {
		super.display(); //method of parent class
		System.out.println("method of child");
		System.out.println(super.a);
	}
public Child()
{
	super(); // constructor of parent class
	System.out.println("constructor of child");
}
}
