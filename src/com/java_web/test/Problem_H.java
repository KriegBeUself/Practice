/*Problem H: Hanoi����

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 5  Solved: 2
��һ��SubmitStatus��һ��
Description

�㷨ѵ��  Hanoi����    
ʱ�����ƣ�1.0s     �ڴ����ƣ�512.0MB 
      
�������� 
����������α��ϵ�Hanoi�����������޸ģ���Ȼ�Ǹ���Nֻ���ӣ�3�����ӣ���������ÿ������ƶ����ڵ�Mֻ���ӣ���Ȼ�ƶ����ӵ���ĿҲ����С��M��,������Ҫ���ٴΣ� 
��������N=5��M=2ʱ�����Էֱ���С��2�����ӡ��м��2�������Լ�����һ�����ӷֱ���һ�����壬��������ת��ΪN=3��M=1�����������Ҫ�ƶ�7�Ρ� 
�����ʽ 
�����������ݽ���һ�У�����������N��M��0< =M< =N< =8�� 
�����ʽ 
���������һ��������ʾ��Ҫ�ƶ������ٴ��� 
�������� 
5  2 

������� 
7 

*/
package com.java_web.test;

import java.util.Scanner;

public class Problem_H {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long a=scan.nextInt();
		long b=scan.nextInt();
		long m;
		if(a%b==0)
			m=a/b;
		else 
			m=a/b+1;
		System.out.println(Hanoi(m));
		scan.close();
	}


	private static long Hanoi(long m) {
		long temp =1;
		for(long i=1;i<m;i++)
		temp=2*temp+1;
		return temp;
		// TODO Auto-generated method stub
	}

}
