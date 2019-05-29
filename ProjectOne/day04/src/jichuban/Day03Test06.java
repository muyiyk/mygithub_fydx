package jichuban;
import java.util.Random;
import java.util.Scanner;

public class Day03Test06 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个你要猜的数据");
            int guessnum = sc.nextInt();
            if (guessnum > num) {
                System.out.println("你猜的数字" + guessnum + "大了");
            } else if (guessnum < num) {
                System.out.println("你猜的数字" + guessnum + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
