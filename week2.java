import java.util.Scanner;
class Person
{
	static Scanner sc=new Scanner(System.in);
	String name;
	int age;
	public static void main(String args[])
		{
			Person obj=new Person(sc.next(),sc.nextInt());
			obj.display();
		}
		Person(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
	void display()
		{
			 
			System.out.println("name: "+name+"\nage : "+age);
		}
}
