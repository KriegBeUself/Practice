package acm;
import java.util.*;
/*
 * 
�������������߳���a,b,c(��Ϊ������)

���

 
�ж��ܷ�Ϊֱ�������ε������߳���������������"yes",������������"no",��������޷��������������� "not a triangle"

��������

3 5 4
�������

yes

*/

public class P1283 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if(num1+num2<num3||num1+num3<num2||num2+num3<num1)
		System.out.println("not a triangle");
		else{
			if(num1*num1+num2*num2==num3*num3||num2*num2+num3*num3==num1*num1||num1*num1+num3*num3==num2*num2){
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		scan.close();
	}

}
