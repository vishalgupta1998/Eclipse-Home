package Javastream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import java.util.*;

public class JavaStreamConcepts {
	
	//@Test
	public void testyy()
	{
		
	
	
	ArrayList<String> names = new ArrayList<>();
	names.add("Akanksha");
	names.add("Aditit");
	names.add("Sonakshi");
	names.add("Nikita");
	for(int i=0;i<names.size();i++)
	{
		System.out.println(names.get(i));
	}
	/*
	Iterator<String> itr =new Iterator<String>(names);
	while(itr.next()<0)
		{
		
		};
		*/
	
	}
	@Test
	public void usingstream()
	{
		System.out.println("test1");
		ArrayList<String> names = new ArrayList<>();
		names.add("Akanksha");
		names.add("Aditit");
		names.add("Sonakshi");
		names.add("Nikita");
		
		
     names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
     //     create stream
     //Intermediate operation
     //terminal operation
	}
	@Test(priority=2)
	public void usingmap()  //map will give alot functions
	{
		System.out.println("test2");
		Stream.of("Akanksha","Aditi","Sonakshi","Nikita").filter(s->s.length()>5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//System.out.println(c);
	}
	@Test(priority=3)
	public void filterextended()
	{
		System.out.println("test3");
		Stream.of("Akanksha","Aditi","Sonakshi","Nikita").filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		
	}
	
	@Test(priority=5)
	public void streamcollect()
	{
		System.out.println("test4");
		List<String> ls = Arrays.asList("Akanksha","amit","anil","Men");
		//List<String> a =(List<String>) ls.stream().map(s->s.toUpperCase()).distinct();
		//for (String as:a)
			
		List<String> ls2 =ls.stream().map(s->s.toUpperCase()).distinct().collect(Collectors.toList());//.forEach(s->System.out.println(s));
		System.out.println(ls2.get(0));
	}
	
	
}

