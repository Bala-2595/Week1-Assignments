package week1.day2;

import java.util.Iterator;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number=13;
		boolean isPrime=true;
		for (int i = 2; i<number; i++) {
			if (number%i ==0) {
				isPrime = false;
				break;
				
				}
			
		}
		if (isPrime) {
			System.out.println("Number is Prime number:" +number);
			
		} else {
			System.out.println("Number is not Prime number:" +number);

		}
		

	}

}
