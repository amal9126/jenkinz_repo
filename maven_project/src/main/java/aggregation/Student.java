package aggregation;

public class Student {
int id;
String name;
Address obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address obj1= new Address("name","tvm","kerala",695582);
Student obj2=new Student(1,"amal",obj1);
obj2.display();
	}
	public Student(int id, String name, Address obj) {
		super();
		this.id = id;
		this.name = name;
		this.obj = obj;
	}
public void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(obj.housename);
	System.out.println(obj.city);
	System.out.println(obj.state);
	System.out.println(obj.pincode);
}
}
