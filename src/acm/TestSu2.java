package acm;

import java.util.Scanner;

public class TestSu2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i;
		if (num < 2) {
			System.out.println(0);
		} else {
			for (i = 2; i < num; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
			{
				if (num % i == 0) {
					System.out.println(0);
					break;
				}

			}
			if (i == num) {
				System.out.println(1);
			}
			scan.close();
		}

	}
}