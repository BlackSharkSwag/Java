package one;

public class Application extends Person{

	public static void main() {
		Person person = new Person();
		person.age = 90;
		person.Name = "Carl";
		
		System.out.println(person.age);
		System.out.println(person.Name);
	}
}
