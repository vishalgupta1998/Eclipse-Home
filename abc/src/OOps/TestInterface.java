package OOps;

interface Gorilla {
	
	public abstract void processing();

}
class Halina implements Gorilla
{
	public void processing()
	{
		System.out.println("Implementation of  Interface");
	}
}
public class TestInterface {

		public static void main(String[] args) {
		
		Halina obj = new Halina();
		obj.processing();
		
		
		
	}


}