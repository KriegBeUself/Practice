package acm;

import java.util.Scanner;
/*1273: ��������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 260  ���: 205
�ύ״̬���۰�
1�ų���Ա:cat*pig*duck �������:�־�������(55) Ч�����:VaeJerry(944)
��Ŀ����

������������a,b,�������ߵ�ֵȻ�����

����

������������a,b

���


	�������ֵ���a,b


��������

824 16
�������

16 824
*/


public class P1273 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+" "+num2);
		scan.close();

		// TODO Auto-generated method stub

	}

}
