package acm;

import java.util.Scanner;

/*1275: ����ƽ����

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 561  ���: 315
�ύ״̬���۰�
1�ų���Ա:dearvee �������:Fan(90) Ч�����:dongjie(944)
��Ŀ����

��������������������ǵ�ƽ������������λС����

����

������������

���

������ǵ�ƽ������������λС����

��������

1 2 3
�������

2.000
*/
public class P1275 {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		int shu1=num.nextInt();
		int shu2=num.nextInt();
		int shu3=num.nextInt();
		double avg=(shu1+shu2+shu3)/3;
		System.out.printf("%.3f",avg);
		num.close();
	}

}
