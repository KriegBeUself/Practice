package acm;
import java.io.PrintWriter;
import java.util.*;
/*
 * 1087: ȥ���ո�

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 128  Solved: 85
SubmitStatusWeb Board
1�ų���Ա:dearvee �������:֣�̷�(109) Ч�����:VaeJerry(944)
Description

����һЩ�ַ����������еĿո�ȥ����

Input

����Ϊ���У�ÿ��Ϊһ���ַ������ַ���ֻ����ĸ�����ֺͿո���ɣ����Ȳ�����80���봦���ļ�ĩβ��

Output

����ÿ�����룬���ת������ַ�����

Sample Input

Hello World
1 2 3
Nice to meet you
abc
Sample Output

HelloWorld
123
Nicetomeetyou
abc

HINT


��scanf�ǲ��ܶ���һ���пո���ַ����ģ���gets�ɡ� �á�gets(str) != NULL�������ж������Ƿ���������������Ϊ�٣���gets(str) == NULL�������ʾ������������ڱ��⣩��

*/

public class P1087 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PrintWriter cout=new PrintWriter(System.out);
		while(scan.hasNextLine())
		cout.println(scan.nextLine().replaceAll("\\s+", ""));
		scan.close();
		cout.close();
		// TODO Auto-generated method stub

	}

}
