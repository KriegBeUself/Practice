package acm;
import java.util.*;
/*
 * 1123: ��С������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 164  ���: 128
�ύ״̬���۰�
1�ų���Ա:���ľ� �������:Fan(128) Ч�����:���Ƿ�(944)
��Ŀ����

����������������������������С������

����

��������ֻ��һ�У���������������1000��������.

���

�������Ҳֻ��һ�У�����������������С��������

��������

10 14
�������

70
*/

public class P1123 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1 =scan.nextInt();
		int num2=scan.nextInt();
		for(int i=num1;;i=i+num1){
			if(i%num2==0){
				System.out.println(i);
				break;
			}
				else
					continue;
			}
		scan.close();
		}
		// TODO Auto-generated method stub

	}


