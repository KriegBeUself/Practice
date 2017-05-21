/*
 * Problem A: ���ӷ�������

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 57  Solved: 43
��һ��SubmitStatus��һ��
Description

һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӡ�С���ӳ�����3���º�ÿ��������һ�����ӡ��������Ӷ����������ʵ�1���³�����һ�����ӣ�������Ҫ���ܵ��ڼ�����ʱ���������ſ��ԴﵽN�ԣ�
Input

������һ���и���һ��������10000��������N��
Output

�������룬��һ����������������ﵽN������Ҫ��������
Sample Input

1
2
30
Sample Output

1
3
9
*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextInt()) {
			int num=scan.nextInt();
			for (int i = 1; ; i++) {
				if(Fiber(i)<num)
					continue;
				else
					System.out.println(i);
					break;
			}
			
		} 
		scan.close();
	}

	private static int Fiber(int i) {
        if(i <= 2){  
            return 1;  
        }else{  
            return Fiber(i-1) + Fiber(i-2);  
        }  
		// TODO Auto-generated method stub
	}

}
