package basics;

public class OverloadedMethods {
	public static void main(String[] args) {
		//create instrance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		om.print("second print method");
		om.print("second", "thrid");
	}

	//overload methods here
	public void print() {
		System.out.println("Original print method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
	/*public void print(String first, String second) {
		System.out.println(first + " " + second);
	}*/
}
