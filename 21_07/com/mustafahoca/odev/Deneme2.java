package com.mustafahoca.odev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Deneme2 {

	static List<Student> students = new ArrayList<>();

	static Map<String, List<Double>> notMap = new HashMap<String, List<Double>>();
	static Map<String, List<Student>> stuMapBolum = new HashMap<String, List<Student>>();

	public static void main(String[] args) {
		Deneme2 deneme2 = new Deneme2();
		double ort = students.stream().collect(Collectors.averagingDouble(s -> s.ortHesapla()));

		System.out.println(ort);

		double ort2 = students.stream().collect(
				Collectors.averagingDouble(x -> x.notlar.stream().collect(Collectors.averagingDouble(t -> t))));
		System.out.println(ort2);

//		Student student = new Student();
	}

	public Deneme2() {
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		Student student2 = new Student();
		student2.name = "Ayse";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

//		1---herbir öğrencinin notlarının ortalamasını hesaplayıp yazdıralım
//		2---bölüm isimlerine göre mapleyelim

		System.out.println(students.get(0).getNotlar());
		bolumeGoreMap();

	}}

//	public void fiyatı50denBuyukolanlar() {
//
//		List<Urun> liste = students.stream().filter(s -> s.getPrice() > 50).collect(Collectors.toList());
//		double result = students.get(0).entryS.collect(Collectors.averagingDouble(Student::getNotlar));
//		double result2 = nots.stream().collect(Collectors.averagingDouble(s -> s.getPrice()));
//		System.out.println(result);
//		System.out.println(result2);
//	}

	public static void bolumeGoreMap() {
		notMap = students.stream().collect(Collectors.toMap(s -> s.getName(), t -> t.getNotlar()));
		List<List<Double>> nots = notMap.entrySet().stream().map(s -> s.getValue()).collect(Collectors.toList());
		System.out.println("*****");
		System.out.println(nots);
		double result2 = nots.get(0).stream().collect(Collectors.averagingDouble());
		System.out.println("result" + result2);
		stuMapBolum = students.stream().collect(Collectors.groupingBy(s -> s.bolum));
		notMap.entrySet().forEach(s -> System.out.println(s));
		stuMapBolum.entrySet().forEach(s -> System.out.println(s));

	}

}
