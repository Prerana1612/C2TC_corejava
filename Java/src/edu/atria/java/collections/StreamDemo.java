package edu.atria.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]={10,20,30,5,2,80};
		List<Integer> numList=Arrays.asList(arr);
		
		Stream<Integer> st=numList.stream();
		st=st.map((n)->n*n);
		st.forEach(System.out::println);
		
		Function<Integer, Double> f= (n)->Math.sqrt(n);
		Stream<Double> sqrtStream=numList.stream().map(f);
		sqrtStream.forEach(System.out::println);
		
		String str[]= {"Java","c","Python","DotNet"};
		List<String> courseList=Arrays.asList(str);
		Stream<String> courseStream = courseList.stream();
		st=courseStream.map((s)->s.length());
		st.forEach(System.out::println);
		
		System.out.println("-----------------");
		numList.stream().limit(3).forEach(System.out::println);
		
		System.out.println("-----------------");
		numList.stream().distinct().forEach(System.out::println);
		
		System.out.println("-----------------");
		numList.stream().skip(3).forEach(System.out::println);
		
		System.out.println("-----------------");
		int sum=numList.stream().reduce((n1, n2)->n1+n2).get();
		System.out.println("sum is "+sum);
	
		
 
	}

}
