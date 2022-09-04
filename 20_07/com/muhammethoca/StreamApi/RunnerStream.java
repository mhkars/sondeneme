package com.muhammethoca.StreamApi;

import java.util.List;
import java.util.stream.Stream;

public class RunnerStream {
	public static void main(String[] args) {
		Stream<String> boskayit = Stream.empty();
		Stream<String> tekKayit = Stream.of("Pazartesi");
		Stream<Double> diziKullanim = Stream.of(2d, 3d, 53d, 3d);
		List<String> gunler = List.of("Pt", "Sl", "Çr", "Pe", "Cu", "Ct", "Pa");
		Stream<String> gunlerStream = gunler.stream();

		gunlerStream.forEach(System.out::println);
		
		var dizim = new String[] {"M","u","r","a","t"};
			
		}
	}

}
