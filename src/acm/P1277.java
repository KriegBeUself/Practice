package acm;
import java.util.*;
/*1277: ������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 239  ���: 202
�ύ״̬���۰�
1�ų���Ա:dearvee �������:�־�������(57) Ч�����:���Ƿ�(944)
��Ŀ����

����������n(n������1000000)���1+2+3+...+n��ֵ
����

һ��������n

���

���1+2+3+...+n��ֵ��

��������

100
�������

5050
*/

public class P1277 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
		scan.close();
		// TODO Auto-generated method stub

	}

}
