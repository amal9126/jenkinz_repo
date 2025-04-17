package program1;
public class Sample2 {
   String a;

	public Sample2(String b) {
		// TODO Auto-generated constructor stub
		 a=b;	
	}

	public void print() 
    {
		
        System.out.println(a);
        
    }

    public static void main(String[] args) {
        Sample2 obj = new Sample2("hai");  
        obj.print();                
    }
}
