package com.muhammethoca;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class RunnerStream2 {

	public static void main(String[] args) {

		Stream<Integer> bosListe = Stream.of();
		Stream<Integer> tekElemanliListe = Stream.of(8);
		Stream<Integer> cokElemanliListe = Stream.of(1, 5, 9);

		BinaryOperator<Integer> opr = (a, b) -> a * b;

		bosListe.reduce(opr).ifPresent(System.out::println);
		tekElemanliListe.reduce(opr).ifPresent(System.out::println);
		cokElemanliListe.reduce(opr).ifPresent(System.out::println);

		Stream<String> stream = Stream.of("Pazar", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi");
//		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
//		TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(set);

		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		stream.sorted().forEach(System.out::println);
		stream = Stream.of("Deniz", "Ahmet", "Hilal", "Busra", "Zeynep", "Tulay", "Batu");
		stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
