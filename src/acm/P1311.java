package acm;

import java.util.*;
/*1311: ��������ͳ��

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 111  ���: 95
�ύ״̬���۰�
1�ų���Ա:dearvee �������:�ƻ���(228) Ч�����:hy(944)
��Ŀ����

����������ҳ��ۣᣬ��������������������
����

�������� a b
���

����[a,b]��������������
��������

1 10
�������

4
*/

public class P1311 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int count = 0;
		int test;
		for (int i = num1; i <= num2; i++) {
			for (test = 2; test < i; test++) {
				if (i % test == 0)
					break;
			}
			if (test == i)
				count++;
		}
		System.out.println(count);
		scan.close();
		// TODO Auto-generated method stub

	}

}
