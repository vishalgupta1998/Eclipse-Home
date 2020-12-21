package OOps;

public class Student {
	int Studentid;
	String Studentname;
	
	Student(int id, String name)
	{
		this.Studentid=id;
		this.Studentname = name;
		System.out.println(id+"  "+name);
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(34,"Vishal");
		Student s2 = new Student(23,"Nikhil");

		
	}

}
