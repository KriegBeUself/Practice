package acm;
import java.util.*;

/*
 * 1281: ����

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 166  ���: 149
�ύ״̬���۰�
1�ų���Ա:Fan �������:���㾲(113) Ч�����:��Ŭ����С��(944)
��Ŀ����

һ���·�95Ԫ����������300Ԫ������Դ�����ۣ�����Ҫ������·�����n,�����Ҫ֧���Ľ���λ:Ԫ)��������λС����

����

����Ҫ������·�����n

���

�����Ҫ֧���Ľ���λ:Ԫ)��

��������

10

�������

807.50

*/
public class P1281 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double num=scan.nextDouble();
		double temp=num*95;
		if(temp>300){
			System.out.printf("%.2f",temp*0.85);
		}
		else
		System.out.printf("%.2f",temp);
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
