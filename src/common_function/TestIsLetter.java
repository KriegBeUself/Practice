package common_function;

import java.util.Scanner;
 
/**
 * java �ж� �Ƿ� ��ĸ
 * 
 * @author Retror
 * 
 */
public class TestIsLetter {
 
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) <= 'Z' && str.charAt(i) >= 'A')
                        || (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')) {
                    System.out.println(str.charAt(i) + "����ĸ");
                } else {
                    System.out.println(str.charAt(i) + "������ĸ");
                }
            }
            scan.close();
        }
        
    }
}