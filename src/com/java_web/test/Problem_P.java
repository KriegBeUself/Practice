package com.java_web.test;
/*
 * Problem Q: �ַ����Ա�

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 150  Solved: 80
��һ��SubmitStatus��һ��
Description



   ������ϰ  �ַ����Ա�    

ʱ�����ƣ�1.0s     �ڴ����ƣ�512.0MB 

      

�������� 

���������������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ�� 

����1�������ַ������Ȳ��ȡ�����  Beijing  ��  Hebei 

����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������  Beijing  ��  Beijing 

����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2��������  beijing  ��  BEIjing 

����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡�����  Beijing  ��  Nanjing 

��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š� 

�����ʽ 

�����������У�ÿ�ж���һ���ַ��� 

�����ʽ 

��������һ�����֣������������ַ����Ĺ�ϵ��� 

�������� 

BEIjing 

beiJing  

������� 

3 

*/

import java.util.Scanner;

public class Problem_P {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.nextLine();
		String str2=scanner.nextLine();
		if (str.length()==str2.length()) {
			if (str.equals(str2)) {
				System.out.println(2);
			} else {if (str.toLowerCase().equals(str2.toLowerCase())) {
				System.out.println(3);
			} else {
				System.out.println(4);

			}

			}
		} else {
			System.out.println(1);

		}
		scanner.close();
		
	}

}
