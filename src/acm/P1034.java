package acm;

import java.util.Scanner;
/*
1034: ��������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 241  ���: 196
�ύ״̬���۰�
1�ų���Ա:�ڿ� �������:�־�������(100) Ч�����:��Ө��(940)
��Ŀ����

��дһ�������ж�һ�����Ƿ�Ϊ����

����

������N ������2000

���

1��0(����1��ʾ����Ϊ����,0Ϊ��ʾΪ��������)

��������

5
�������

1
*/

public class P1034 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
    	int i;
    	if(num<2){
    		System.out.println(0);
    	}
    	else{
        for (i = 2; i < num; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
        {
        	if(num%i==0){
        	System.out.println(0);
        	break;
        	}

        }
        if(i==num){
        	System.out.println(1);
        }
        scan.close();
    }
 
}
}