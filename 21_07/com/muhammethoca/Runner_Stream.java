package com.muhammethoca;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner_Stream {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		String isimler = stream.collect(Collectors.joining(" ; "));
		System.out.println(isimler);
		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		Double resultDouble = stream.collect(Collectors.averagingDouble(String::length));
		System.out.println(resultDouble);

		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		TreeSet<String> treeSet = stream.filter(isim -> isim.startsWith("B"))
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(treeSet);

		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		Map<String, Integer> map = stream.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map);

		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		Map<Integer, List<String>> mapUzunluk = stream.distinct().collect(Collectors.groupingBy(String::length));
		System.out.println(mapUzunluk);
	}

}
