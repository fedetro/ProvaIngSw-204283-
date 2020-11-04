package it.unical.ingsw.provalab.ProvaIntermedia;

import java.util.Scanner;

public class MyListUtil {
	public int[] ordina(int[] num, int ordine) {
		int tmp;
		if(ordine == 1) {
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					if(num[j] > num[i]) {
						tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
					}
				}
			}
		}
		if(ordine == 2) {
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					if(num[j] < num[i]) {
						tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
					}
				}
			}
		}
		return num;
	}
	
/*	public static void main(String[] args) {
		int[] numeri = new int[10];
				
		for(int i = 0; i < 10; i++) {
			numeri[i] = i+1;
		}
		
		MyListUtil lu = new MyListUtil(numeri);

		Scanner s = new Scanner(System.in);
		int scelta = s.nextInt();
		lu.ordina(numeri, scelta);

		for(int j = 0; j < 10; j++) {
			System.out.print(numeri[j] + "   ");
		}
	} */
}