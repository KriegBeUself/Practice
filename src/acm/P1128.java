package acm;

import java.util.Scanner;
/*1128: ���һ�����Ƿ�Ϊ����

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 273  ���: 193
�ύ״̬���۰�
1�ų���Ա:Tencent �������:���㾲(125) Ч�����:zylin(944)
��Ŀ����

����һ�����������������Ƿ�Ϊ����

����

����һ��������

���

���Y����N

��������

34
�������

N
*/

public class P1128 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
    	int i;
    	if(num<2){
    		System.out.println("N");
    	}
    	else{
        for (i = 2; i < num; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
        {
        	if(num%i==0){
        	System.out.println("N");
        	break;
        	}

        }
        if(i==num){
        	System.out.println("Y");
        }
        scan.close();
    }
 
}
}