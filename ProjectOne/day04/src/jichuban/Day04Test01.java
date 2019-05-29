package jichuban;

import java.util.Scanner;
public class Day04Test01 {
    public static void main(String[] args) {
        //System.out.println("Hello,World!");
        Scanner sc = new Scanner(System.in);

        int colude = sc.nextInt();

        switch (colude){
            case 1:
                System.out.println("音量增加");
                break;
            case 2:
                System.out.println("音量减小");
                    break;
            case 3:
                System.out.println("关机");
                        break;
            default:
                System.out.println("抱歉，您输入的数字不合法");
        }
    }
}
