package com.java_web.test;
/*
 * Problem L: ̰�ԵĴ���

Time Limit: 1 Sec  Memory Limit: 128 MB
Submit: 17  Solved: 8
��һ��SubmitStatus��һ��
Description

�㷨���  ̰�ԵĴ���    
ʱ�����ƣ�1.0s     �ڴ����ƣ�256.0MB 
      
�������� 
������һֻ�ر�̰�ԵĴ���,����ϲ����һ��С����,��ÿһ��С������һ����ζ��,�������Ǻܰ�����,һ��Ҫ����ζ�Ⱥ͸պ�Ϊm��С����,���Ҵ��컹�ر���,��ϣ��ͨ�����������ٵ�С����ﵽ���Ŀ��.������ϣ���������һ�������������Ҫ����ЩС����. 
�����ʽ 
����������һ�а���2������m��n,��ʾ������Ҫ����ζ�Ⱥ�Ϊm��С����,��С����һ����n��,��������n��,ÿ��2������,��һ����ʾ����С�������ζ��,�ڶ�����ʾ������и���С��������� 
�����ʽ 
�������һ�а���һ��������ʾ����������Ҫ�Ե�С��������,�������޷�ͨ����С����ﵽm����ζ�Ⱥ�,�����" > < ��. 
�������� 
10  2 
4  1 
2  10 
������� 
4 
�������� 
10  2 
4  1 
7  3 
������� 
> < 
���ݹ�ģ��Լ�� 
����m  ��  20000,С������������50. 
*/

import java.util.Scanner;

public class Problem_L {  
    /**  
     * m:��Ŀ�е���ζ��  
     * n:n��С����  
     * num[]:������¼ÿ��С���������  
     * sat[]:������¼ÿ��С�������ζ��  
     * min:��С�������������  
     */  
    private static int m,n,num[],sat[],min=Integer.MAX_VALUE;  
    /**  
     * i:����������������  
     * temp_t:��ʱ��Ŵ���Եĵ�����Ŀ  
     * temp_m:��ʱ��Ŵ���ӵ�еĵ�ǰ��ζ��  
     * @param args  
     */  
    public static void main(String[] args) {  
        // TODO �Զ����ɵķ������  
        int time,i=0,temp_t=0,temp_m=0;  
        Scanner read=new Scanner(System.in);  
        String str,strr[];  
        str=read.nextLine();  
        strr=str.split(" ");  
        m=Integer.valueOf(strr[0]);  
        n=Integer.valueOf(strr[1]);  
        num=new int[n];  
        sat=new int[n];  
        time=n;  
        //������������ĵ���  
        while(i<time){  
            str=read.nextLine();  
            strr=str.split(" ");  
            sat[i]=Integer.valueOf(strr[0]);  
            num[i]=Integer.valueOf(strr[1]);  
            i++;  
        }  
        read.close();  
        //�ӵ�һ�ֵ��⿪ʼ��ϲ��ԣ����Ե�һ�ֵ���0����1����2��������������£���Ҫ�ٳԶ��������������������  
        for(i=0;i<=num[0];i++){  
            temp_m+=i*sat[0];//������ʱ��ζ��  
            if(temp_m<m){  
                if(1<n){  
                    temp_t+=i;//������ʱ��������  
                    findnext(1,temp_m,temp_t);//������һ�ֵ�����Ҫ�Զ��ٿ���������  
                    temp_t-=i;//Ϊ��һ����ϲ��ԣ��ָ�ԭʼ״̬  
                }  
            }else if(temp_m==m){  
                temp_t+=i;  
                min=Math.min(temp_t, min);//�Ƚϵó���С������Ŀ  
                break;  
            }else{  
                break;  
            }  
            temp_m-=i*sat[0];//Ϊ��һ����ϲ��ԣ��ָ�ԭʼ״̬  
        }  
        if(min<Integer.MAX_VALUE){  
            System.out.println(min);  
              
        }else{  
            System.out.println("><");  
        }  
    }  
    private static void findnext(int pos, int temp_m,int time) {  
        // TODO �Զ����ɵķ������  
        int i=0,temp=temp_m;  
        for(i=0;i<=num[pos];i++){  
            temp+=i*sat[pos];  
            if(temp<m){  
                if(pos+1<n){  
                    time=time+i;  
                    findnext(pos+1,temp,time);  
                    time-=i;  
                      
                }  
            }else if(temp==m){  
                time+=i;  
                min=Math.min(time, min);  
                return;  
            }else{  
                return;  
            }  
            temp-=i*sat[pos];  
        }  
    }  
  
}