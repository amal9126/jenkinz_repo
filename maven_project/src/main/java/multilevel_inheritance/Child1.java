package multilevel_inheritance;

public class Child1 extends Parent{
public static void main(String[] args) {
Child1 obj=new Child1();
obj.print();
obj.display();
}
	
	public void display()
	{
		System.out.println("method of child 1");
	}
}
