package acm;
import java.util.*;
/*1023: ���������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 174  ���: 143
�ύ״̬���۰�
1�ų���Ա:dearvee �������:��̩��(95) Ч�����:zym(944)
��Ŀ����

�������ɸ�����,��-1������������������е������

����

���ɸ�����������-1������������

���

���е������

��������

1 2 5 7 8 6 1 -6 -1
�������

8

*/

public class P1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int temp=scan.nextInt();
		int max=temp;
		for(;;){
			int temp2=scan.nextInt();
			if(temp2==-1){
				System.out.println(max);
				break;
			}
			else
			{
				if(temp2>max){
					max=temp2;
				}
			}
		}
		scan.close();

	}

}
