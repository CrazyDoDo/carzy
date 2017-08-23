package School;

public class Person {

	String name;
	public Person()
	{
		System.out.println("execute person()");
	}
	public Person(String name)
	{
		this.name=name;
		System.out.println("execute person(name)");
	}
}
