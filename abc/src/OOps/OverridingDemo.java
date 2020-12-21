package OOps;
class Marker{
	public void writer()
	{
		System.out.println("Its Pen");
	}
}
class Chalk extends Marker
{
	public void writer()
	{
		System.out.println("Its Pencil");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Chalk a =new Chalk();
		a.writer();

	}

}
