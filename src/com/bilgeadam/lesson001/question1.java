package com.bilgeadam.lesson001;

public class question1 {

	public static void main(String[] args) {
		float endPrice = 100;
		float priceWhitoutVAT = (float) (endPrice / 1.18);
		float rawPrice = (float) (priceWhitoutVAT * 0.85);
		System.out.println(priceWhitoutVAT);
		System.out.println(rawPrice);

	}

}
