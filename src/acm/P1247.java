package acm;
import java.util.*;
/*
 * 1247: Sum Problem

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 203  ���: 147
�ύ״̬���۰�
1�ų���Ա:cat*pig*duck �������:Fan(73) Ч�����:��Ŭ����С��(944)
��Ŀ����

Hey, welcome to ahstu oj. 
In this problem, your task is to calculate SUM(n) = 1 + 2 + 3 + ... + n.
����

The input will consist of a series of integers n, one integer per line.
���

For each case, output SUM(n) in one line. You may assume the result will be in the range of 32-bit signed integer.
��������

1
100
�������

1
5050
*/


public class P1247 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int s=scan.nextInt();
		int n=scan.nextInt();
		int sum=0;
		for(int i=s;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(s);
		System.out.println(sum);
		scan.close();
		// TODO Auto-generated method stub

	}

}
