package acm;

import java.io.PrintWriter;
import java.util.Scanner;
/*1573: ������ħ��

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 127  ���: 87
�ύ״̬���۰�
1�ų���Ա:�ϵı���� �������:��־��(189) Ч�����:����A�⡢����(944)
��Ŀ����

������һ��ħ�������԰��κνӴ�����Ķ������ԭ������������ֻ�ǣ���Ϊ�Ǿ�������ӵ��ǲ����Ƿ��ġ� ����һ��������������AB����ʾ����ͬ����ĸ��ʾ��ͬ��ɫ�����顣�����B�˽Ӵ�����Ļ���ħ���������������ΪABBA���������һ�˽Ӵ��Ļ��������ABBAABBA���ٶ�����ֻ��������ĳһ�˽Ӵ�ħ������ �������յ����������д�����������ûʹ��ħ��֮ǰ��������������ܵ���С���ȡ�
����

��һ����һ������N(N<=10)��ʾ�������ݵ������� ÿ���������ռһ�� ֻ��һ���ַ���������С��100�����ɴ�дӢ����ĸ��ɣ���ʾ���յ�������
���

ÿ��������ݵ����ֻ��һ����������ʾ����ûʹ��ħ��ǰ��������������ܵ���С���ȡ�
��������

2 
ABBAABBA 
A
�������

2
1
*/

public class P1573 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0;) {
			cout.println(f(cin.next()));
		}
		cin.close();
		cout.close();
	}

	private static int f(String s) {
		if (s.length() <= 1 || s.length() % 2 == 1)
			return s.length();
		String rs = new StringBuffer(s).reverse().toString();
		if (rs.equals(s))
			return f(s.substring(0, s.length() / 2));
		return s.length();
	}
}
