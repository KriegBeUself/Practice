package acm;

import java.io.PrintWriter;
import java.util.Scanner;
/*1571: ����Сľ��

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 113  ���: 97
�ύ״̬���۰�
1�ų���Ա:�ܿ� �������:����(124) Ч�����:���Ƿ�(944)
��Ŀ����

��ǽ�Ƕѷ���һ����ȫ��ͬ��������Сľ�飬����ͼ��ʾ�� 


��Ϊľ��ѵ�ʵ����̫�й����ˣ���ֻҪ֪�����Ĳ����Ϳ��Լ�������ľ��������ˡ� ��������д������ ������һ��ľ��Ĳ�����������ľ�������

����

��һ����һ������N(N<=10)��ʾ�������ݵ������� ��������n�� ÿ��ֻ��һ������ ����ʾ���Сľ��Ĳ�����
���

��Ӧÿ������Ĳ�����һ���������ʾ���Сľ�����������ÿ�����ռһ��
��������

2 
1
5
�������

1
35

*/

public class P1571 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0;) {
			int n = cin.nextInt();
			cout.println(1L * n * (n + 1) * (n + 2) / 6);
		}
		cin.close();
		cout.close();
	}
}
