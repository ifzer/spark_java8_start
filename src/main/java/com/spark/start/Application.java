package com.spark.start;

import static spark.Spark.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(list);
		list.forEach(System.err::print);
		
		Collections.sort(list, (Integer x, Integer y) -> x-y );
		System.out.println(list);
		
		get("/hello", (request, response) -> "hello,welcome.");
        //get("/hello", (req, res) -> "Hello World");
	}
}
