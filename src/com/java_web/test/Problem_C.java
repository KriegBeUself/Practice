/*
 * Problem C: ���ҵ�����

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 11  Solved: 10
��һ��SubmitStatus��һ��
Description

��������  ���ҵ�����    
ʱ�����ƣ�1.0s     �ڴ����ƣ�256.0MB 
      
�������� 
С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ�������Ҫ���ǣ� 
1.  ����ĺ�������������ͬ 
2.  �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ� 
3.  �����ṩ����1,2��������С��������Լ�ָ���� 
�����ʽ 
�����������������a,  b,  c����ʾÿ�������ڼӰ���������ÿո�ֿ���a,b,c< 30��  
�����ʽ 
���һ������������ʾÿ�����ҵ�������  
��������1 
2  4  5  
�������1 
20  
��������2 
3  1  1  
�������2 
3  

*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		for(int i=Max(a,b,c);;i=i*2)
		{
			if(i%a==0&&i%b==0&&i%c==0)
				{System.out.println(i);
				break;
				}
		}
		scan.close();
	}

	private static int Max(int a, int b, int c) {
		// TODO Auto-generated method stub
		int temp=a;
		if (temp<b)
			temp=b;;
		if(temp<c)
			temp=c;
		return temp;
	}

}
