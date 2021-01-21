package io.github.peteplako;

import java.util.UUID;
import java.util.stream.IntStream;

public class MyApp {

	String name;
	String id;

	public MyApp(String name) {
		this.name = name;
		System.out.println("created application with Name:" + name);
	}

	public void initId() {
		id = UUID.randomUUID().toString();
		System.out.println("Id created " + id);
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int sum(int... numbers) {
		return IntStream.of(numbers).sum();
	}
	
	
	 public void close() {
		 System.out.println("closed "+ name);
	    }


}
