package com.java_web.test;
/*Problem G: ��С�˻�(�����)

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 8  Solved: 8
��һ��SubmitStatus��һ��
Description

   �㷨���  ��С�˻�(�����)    
ʱ�����ƣ�1.0s     �ڴ����ƣ�512.0MB 
      
�������� 
����������������n���� 
���������ÿ����������˳��ʹ������������ͬ�±�Ԫ�ض�Ӧ��ˣ�Ȼ����ӵĺ���С��Ҫ�������������Сֵ�� 
���������������ֱ�Ϊ:1  3����-5��-2  4  1 

������ô��Ӧ�˻�ȡ�͵���СֵӦΪ�� 
����(-5)  *  4  +  3  *  (-2)  +  1  *  1  =  -25 
�����ʽ 
������һ����һ����T��ʾ��������������ÿ�����ݣ��ȶ���һ��n������������ÿ��n������ÿ�����ľ���ֵС�ڵ���1000�� 
����n< =1000,T< =10 
�����ʽ 
����һ������ʾ�𰸡� 
�������� 
2 
3 
1  3  -5 
-2  4  1 
5 
1  2  3  4  5 
1  0  1  0  1 

������� 
-25 
6 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem_G {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			int temp=scan.nextInt();
			int []a=new int [temp];
			for(int c=0;c<=temp-1;c++)
				a[c]=scan.nextInt();
			Arrays.sort(a);
			int []b=new int [temp];
			for(int c=0;c<=temp-1;c++)
				b[c]=scan.nextInt();
			Arrays.sort(b);
			int count=0;
			for (int j = 0; j < a.length; j++) {
				count=count+a[j]*b[temp-j-1];
			}
			System.out.println(count);
		}
		scan.close();
	}

}
