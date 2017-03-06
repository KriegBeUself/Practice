package acm;


import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 1006: IP�ж�

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 150  ���: 108
�ύ״̬���۰�
1�ų���Ա:dearvee �������:�근��ʮ(519) Ч�����:����(944)
��Ŀ����

�ڻ���Internet�ĳ����У����ǳ�����Ҫ�ж�һ��IP�ַ����ĺϷ��ԡ� 
�Ϸ���IP����������ʽ�� 
A.B.C.D 
����A��B��C��D��Ϊλ��[0, 255]�е�������Ϊ�˼���������ǹ涨���ĸ������в�������ǰ������ڣ���001��������� 
���ڣ��������������жϳ����^_^

����

�����ɶ�����ɣ�ÿ����һ���ַ����������ɡ�End of file�������� 
�ַ����������Ϊ30���Ҳ����ո�Ͳ��ɼ��ַ�

���

����ÿһ�����룬�������һ�� 
������ַ����ǺϷ���IP�����Y���������N

��������

1.2.3.4
a.b.c.d
267.43.64.12
12.34.56.bb
210.43.64.129
-123.4.5.6
�������

Y
N
N
N
Y
N
*/



public class P1006 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			String ss[] = cin.nextLine().split("\\.");
			cout.println(check(ss) ? "Y" : "N");
		}
		cin.close();
		cout.close();
	}

	private static boolean check(String[] ss) {
		for (String s : ss)
			if (!check(s))
				return false;
		return true;
	}

	private static boolean check(String s) {
		int n;
		try {
			n = Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return n >= 0 && n <= 255;
	}
}
