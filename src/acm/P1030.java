package acm;

import java.util.Scanner;
/*1030: ����������

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 246  ���: 150
�ύ״̬���۰�
1�ų���Ա:dearvee �������:����һ¥װ�ƹ�(166) Ч�����:��Ŭ����С��(944)
��Ŀ����

���1-N�е��������� 


����

����1��������N

���

1-N�е���������,(�Դ�С����ĸ�ʽ���)

��������

9
�������

2 3 5 7 */

public class P1030 {
	 
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	int num=scan.nextInt();
        int j;
        for (int i = 2; i <= num; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
        {
            j = 2;
            while (i % j != 0) {
                j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
            }
            if (j == i) // ���б�����������ʱ���ж����ǲ�������
            {
                System.out.print(i+""); // ����Ǿʹ�ӡ������
            }
        }
        scan.close();
    }
 
}

