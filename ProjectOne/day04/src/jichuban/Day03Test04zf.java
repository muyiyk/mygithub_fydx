package jichuban;

public class Day03Test04zf {
    public static void main(String[] args) {
        //定义一个计数
        int count = 0;
        //初始化语句
        double paper = 0.1;

        int zf = 8844430;
        while(paper <= zf){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
