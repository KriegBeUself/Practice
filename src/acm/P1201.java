package acm;
/*
 * 1201: ��3��5��������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 410  ���: 306
�ύ״̬���۰�
1�ų���Ա:dearvee �������:�־�������(58) Ч�����:΢��(944)
��Ŀ����

����� m �� n ��ͬʱ��3��5���������ĸ���
����

������������ m, n ( 0 < m <= n < 10000 )��
���

����� m �� n ��ͬʱ��3��5���������ĸ���

��������

1 1000
�������

66
*/

import java.util.Scanner;

public class P1201 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1= scan.nextInt();
		int num2=scan.nextInt();
		int count=0;
		for (int i = num1; i <= num2; i++) {
			if (i%15==0) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
		// TODO Auto-generated method stub

	}

}
