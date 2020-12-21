package OOps;
class animal{
	public void sound()
	{
		System.out.println("Sound");
	}
}
class Dog extends animal{
	public void sound()
	{
		System.out.println("bhaww");
	}
}
class Cat {
	public void sound()
	{
		System.out.println("meow");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.sound();

	}

}

