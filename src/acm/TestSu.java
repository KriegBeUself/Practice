package acm;

import java.util.Scanner;

public class TestSu {
	 
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