package acm;

/*
 * 1567: �ǲ���̫����

ʱ������: 1 Sec  �ڴ�����: 128 MB
�ύ: 201  ���: 111
��һ���ύ״̬��һ��
��Ŀ����

��˵һ���˵ı�׼����Ӧ��������ߣ���λ�����ף���ȥ100���ٳ���0.9���õ��Ĺ���������֪�н��ǹ�����������ָ���ĳ����ߣ�����������׼����Ӧ���Ƕ��٣���˳��Ҳ���ĸ��Լ���һ�°ɡ�����
����

�������룬�����һ�и���һ��������H��100 < H <= 300����Ϊĳ����ߡ�
���

��һ���������Ӧ�ı�׼���أ���λΪ�н����С�����1λ��
��������

169
�������

124.2
*/
import java.util.*;

public class P1567 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext())
		{
			float temp = scan.nextFloat();
			System.out.printf("%.1f",(temp-100)*0.9*2L);
		}
		scan.close();
		// TODO Auto-generated method stub

	}

}
