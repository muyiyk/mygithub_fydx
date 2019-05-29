package jichuban;

public class Day03Test01 {
    public static void main(String[] args) {
        //int num = 0;
        //for (int i = 1; i <= 5; i++){
         //   if(i%2 == 0)
            //num += i;
       // }
       // System.out.println("num" + num);
        int count = 0;
        for(int i = 1000; i < 10000; i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/10/10%10;
            int d = i/10/10/10%10;
            if(a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d == i){
               // System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
