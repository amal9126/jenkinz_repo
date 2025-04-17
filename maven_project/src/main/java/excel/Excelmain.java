package excel;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
System.out.println(Excelread.getStringdata(1, 0));
System.out.println(Excelread.getIntegerdata(1, 1));
System.out.println(Excelread.getStringdata(2, 0));
System.out.println(Excelread.getIntegerdata(2, 1));
System.out.println(Excelread.getStringdata(3, 0));
System.out.println(Excelread.getIntegerdata(3, 1));
	}

}
