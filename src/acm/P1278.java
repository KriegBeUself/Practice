package acm;

/*1278: ���Һ�����

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 255  ���: 164
�ύ״̬���۰�
1�ų���Ա:coderstory �������:coderstory(141) Ч�����:�ϵı����(980)
��Ŀ����

����һ��������n(n������360)���n�ȵ��������Һ���ֵ(������λС����

����

 
����һ��������n

���

���n�ȵ��������Һ���ֵ(������λС����

��������

30
�������

0.500 0.866
*/
import java.util.*;

public class P1278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		System.out.printf("%.3f %.3f",Math.sin(a*Math.PI/180),Math.cos(a*Math.PI/180));
		scan.close();
		

	}

}
