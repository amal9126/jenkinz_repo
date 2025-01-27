package polymorphism;

public class Child2 extends Parent {
	public static void main(String[] args) {
		Child2 obj=new Child2();
		Child1 obj1=new Child1();
		Parent obj2=new Parent();
		
		obj.print();
		obj1.print();
		obj2.print();
	}
	public void print()
	{
		System.out.println("child 2");
	}
}
