	package com.java_web.test;
	
//	Problem F: ���Ӵ�
//
//	Time Limit: 1 Sec  Memory Limit: 128 MB
//	Submit: 51  Solved: 46
//	��һ��SubmitStatus��һ��
//	Description
//
//	����ԭ�Ӵ���Ŀ���Ӵ���Ҫ�����Ŀ���Ӵ���ԭ�Ӵ����г��ֵĴ�����
//
//	Input
//
//	����������ݣ�ÿ��������ݵ�һ����ԭ�Ӵ����ڶ�����Ŀ���Ӵ� 
//	�Ӵ����Ȳ��ᳬ��100. 
//	Output
//
//	���Ŀ���Ӵ���ԭ�Ӵ����г��ֵĴ�����
//
//	Sample Input
//
//	abc123abc
//	abc
//	aabcCdeAbcAbcdeccde
//	cde
//	Sample Output
//
//	2
//	2
	import java.util.Scanner;
	
	public class Problem_F {
		public static void main(String[] args) {
			Scanner str=new Scanner(System.in);
			while (str.hasNextLine()) {
				String target=str.nextLine();
				String key=str.nextLine();
				if (target.contains(key)) {
					String temp=target.replaceAll(key, "");
					System.out.println((target.length()-temp.length())/key.length());
//					Count(target,key);
				} else {
					System.out.println(0);
				}
			}
			str.close();
		}
	}
	
//		private static void Count(String target, String key) {
//			// TODO �Զ����ɵķ������
//			int count=0;  
//			  int d=0;  
//			  while((d=target.indexOf(key,d))!=-1){  
//			      target=target.substring(d+key.length());  
//			      count++;  
//			  }      
//			    System.out.println(count);;  
//			}  
//		}
//	
