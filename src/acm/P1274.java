package acm;

import java.util.Arrays;
import java.util.Scanner;

public class P1274 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a=new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i]=cin.nextInt();
		}
		Arrays.sort(a);
			System.out.printf("%d %d %d",a[0],a[1],a[2]);
		cin.close();
	}
}