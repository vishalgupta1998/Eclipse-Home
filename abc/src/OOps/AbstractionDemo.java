package OOps;


abstract class Writer{
	public abstract void print();
}
class Pencil extends Writer {
	public void print()
	{
		System.out.println("Pencil");
	}
	
}
class Pen extends Pencil{
	public void draw()
	{
		System.out.println("Pen");
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Pencil obj = new Pen();
		obj.print();

	}

}