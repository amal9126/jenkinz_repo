package interface_ex;

public class Class2 implements Class1 {
public static void main(String[] args) {
Class1 obj=new Class2();
obj.print();
}

@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println("hello");
}

}
