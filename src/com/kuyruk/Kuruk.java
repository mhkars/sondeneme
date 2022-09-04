package com.kuyruk;

import java.util.PriorityQueue;
import java.util.Queue;

public class Kuruk {

	public static void main(String[] args) {

		Queue<Hasta> hastaKuyrugu = new PriorityQueue<Hasta>();

		hastaKuyrugu.offer(new Hasta("Ahmet", "Apandist"));
		hastaKuyrugu.offer(new Hasta("Mehmet", "Bas agrisi"));
		hastaKuyrugu.offer(new Hasta("Mustafa", "Yanik"));
		hastaKuyrugu.offer(new Hasta("Ayse", "Bas donmesi"));
		hastaKuyrugu.offer(new Hasta("Fatma", "Apandist"));

		int i = 1;

		while (!hastaKuyrugu.isEmpty()) {
			System.out.println("-----------------");
			System.out.println(i + ". sirada " + hastaKuyrugu.poll());
			i++;
		}

	}

}
