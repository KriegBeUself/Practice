package com.java_web.test;
/*
Problem I: ���ʸ���ͳ��

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 27  Solved: 25
��һ��SubmitStatus��һ��
Description

�㷨���  ���ʸ���ͳ��    
ʱ�����ƣ�1.0s     �ڴ����ƣ�512.0MB 
      
�������� 
������дһ����������һ���ַ��������Ȳ�����80����Ȼ��ͳ�Ƴ����ַ������а����ж��ٸ����ʡ����磺�ַ�����this  is  a  book�����а�����4�����ʡ� 
���������ʽ������һ���ַ����������ɸ�������ɣ�����֮����һ���ո������ 
���������ʽ�����һ�������������ʵĸ����� 
��������������� 
�����û��������������� 
����this  is  a  book 
����ϵͳ����������£� 
����4 

�ο����룺 
*/
import java.util.Scanner;

public class Problem_I {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String temp=str.replaceAll(" ", "");
		System.out.println(str.length()-temp.length()+1);
		scan.close();
	}

}
