package acm;
import java.util.*;
/*
 * 1199: A+B Problem

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 396  ���: 172
�ύ״̬���۰�
1�ų���Ա:dearvee �������:Fan(68) Ч�����:dlongq(944)
��Ŀ����

A+B Problem ˮ��ˮ��, û����ˮ��ֻ�и�ˮ��
����

���������������� a�� b����a=0��b=0ʱ��������

���

���a+b��ֵ�������С�

��������

1 2
0 0
�������

3
*/

public class P1199 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num2;
		int num1;
		for(;;){
			num1=scan.nextInt();
			num2=scan.nextInt();
			if(num1==0&&num2==0)
				break;
			System.out.println(num1+num2);
		}
		scan.close();
		System.exit(0);
	}
}
