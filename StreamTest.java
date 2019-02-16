package javaTest;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
	public static void main(String... args) {
		List<String> list = Arrays.asList("abc","xyz","defghi","a");

		list.stream()
		.filter(s -> s.contains("a"))
		.forEach(System.out::println);;
	}
}
