package acm;

import java.util.Arrays;
import java.util.Scanner;

/*1220: ɾ���ظ�

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 251  ���: 179
�ύ״̬���۰�
1�ų���Ա:dearvee �������:����ǿ(294) Ч�����:���Ƿ�(944)
��Ŀ����

��һ�޷������������У�������һЩ�ظ������֣��뽫�ظ�������ȥ�����ٰ�������������
����

����������������ɣ���һ��Ϊ���ֵ��������ڶ��������ɿո�ָ������ݡ�
���

�ɻس��ָ����������ݡ�
��������

5
1 1 6 3 3
�������

1
3
6
��ʾ

��ע������������ݲ�����200�������������ݶ�Ϊ[0,10000]֮�����Ȼ������
*/

public class P1220 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=cin.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		int visited=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]==visited)
				continue;
			System.out.println(a[i]);
			visited=a[i];			
		}
		cin.close();
	}
}
