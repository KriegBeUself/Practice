package com.java_web.test;

/*
 * Problem O: �ƽ������

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 101  Solved: 30
��һ��SubmitStatus��һ��
Description

���������������зǳ���Ҫ�Ķ��������ǵ���ôһ�㲻��˵�����ܾ�ȫ�����ˡ��۹���. 
������Ԩ��Ҫ������֮���ټ�һ�����룬��Ȼ�򵥵�Ҳ��ȫ�� 
��������ԭ��һ��BBS�ϵ�����Ϊzvbo941987,Ϊ�˷�����䣬��ͨ��һ���㷨���������任��YUANzi1987������������������ֺͳ�����ݣ���ô���������ˣ����ҿ�����Ŀ�ŵ��ط������۵ĵط�����������֪�����������롣 
������ô�任�ģ���Ҷ�֪���ֻ��ϵ���ĸ�� 1--1�� abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,����ô�򵥣������������г��ֵ�Сд��ĸ����ɶ�Ӧ�����֣����ֺ������ķ��Ŷ������任��������������û�пո񣬶������г��ֵĴ�д��ĸ��߳�Сд֮��������һλ���磺X���ȱ߳�Сд����������һλ��������y����򵥰ɡ���ס��z��������aŶ��

Input

�����������������ݡ�������һ�����ģ����볤�Ȳ�����100���ַ�������ֱ���ļ���β�� 

Output

���Ԩ�����������ġ�

Sample Input

YUANzi1987
Sample Output

zvbo941987
*/

import java.util.Scanner;

public class Problem_O {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextLine()) {
			String str=scan.nextLine();
			System.out.println(str.replaceAll("a|b|c", "2").replaceAll("d|e|f", "3").replaceAll("g|h|i", "4").replaceAll("j|k|l", "5").replaceAll("m|n|o", "6").replaceAll("p|q|r|s", "7").replaceAll("t|u|v", "8").replaceAll("w|x|y|z", "9").replaceAll("A", "b").replaceAll("B", "c").replaceAll("C", "d").replaceAll("D", "e").replaceAll("E", "f").replaceAll("F", "g").replaceAll("G", "h").replaceAll("H", "i").replaceAll("I", "j").replaceAll("J", "k").replaceAll("K", "l").replaceAll("L", "m").replaceAll("M", "n").replaceAll("N", "o").replaceAll("O", "p").replaceAll("P", "q").replaceAll("Q", "r").replaceAll("R", "s").replaceAll("S", "t").replaceAll("T", "u").replaceAll("U", "v").replaceAll("V", "w").replaceAll("W", "x").replaceAll("X", "y").replaceAll("Y", "z").replaceAll("Z", "a"));
		}
		scan.close();
	}

}
