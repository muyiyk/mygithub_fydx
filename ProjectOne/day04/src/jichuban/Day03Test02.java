package jichuban;

//import java.util.Scanner;
public class Day03Test02 {
    public static void main(String[] args) {
        /*
        int count = 0;
        double paper =0.01;
        int zf = 8844430;
        while(paper < zf){
            paper *= 2;
            count++;
        }
        System.out.println(count);
        */
        //键盘输入一个月份，程序输出对应的季节
        //创建对象
        /*
        Scanner sc = new Scanner(System.in);

        //采集数据
        System.out.println("输入一个数字");
        int month = sc.nextInt();
        if(month == 1 || month == 2 || month ==12){
            System.out.println("冬季");
        }else if(month == 3 || month == 4 || month == 5){
            System.out.println("春季");
        }else if(month == 6 || month == 7 || month == 8){
            System.out.println("春季");
        }else if(month == 9 || month == 10 || month == 11){
            System.out.println("春季");
        }else{
            System.out.println("输入的数字不存在季节");
        }
        */
        int sum = 0;
        for(int i = 1;i <= 100; i++){
            sum += i;//5050
           /* if(i%2 == 1){
                sum += i;//2500
            } */
            /*if(i%2 == 0){
                sum += i;//2550
            } */

        }
        System.out.println(sum);
    }
}
