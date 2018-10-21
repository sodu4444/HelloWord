package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dice[0] = 1;
        dice(n);
    }

    static int a = 1;
    static int[] dice = new int[11];
    // String[] weeks = new String[7];      #배열선언

    static void dice(int N) {
        for (int i = dice[a-1]; i <= 6; ++i) {
            dice[a] = i;

//            System.out.println("A" + a + " " + i);

            if (a == N )
            {
                for (int j=1;j<=N;++j){
                    System.out.print(dice[j]+" ");
                }
                System.out.println("");
            }
            else {
                a++;
//                System.out.println("+1 " + a);
                dice(N);

                a--;
//                System.out.println("-1 " + a);
            }
        }
    }
}


//자가진단4
//import java.util.Scanner;
//
//public class HelloWorld {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        dice[0]=1;
//        dice(n);
//
//    }
//    static int a = 1;
//    static int[] dice = new int [11];
//
//
//    static void dice(int N)
//    {
//        for (int i = dice[a-1]; i <= 6; ++i)
//        {
//            dice[a] = i;
//            if (a == N )
//            {
//                for (int j=1;j<=N;++j){
//                    System.out.print(dice[j]+" ");
//                }
//                System.out.println("");
//            }
//
//            else
//            {
//                a++;
//                dice(N);
//                a--;
//            }
//        }
//    }
//
//}


//별찍기 15
//import java.util.Scanner;
//
//public class HelloWorld {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i <= n ; i++){
//            for(int j=n-i; j > 0; j--){
//                System.out.print(" ");
//            }
//            for(int j=0; j< i*2-1; j++){
//                if(j==0 || j== i*2-2) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//별찍기 16
//import java.util.Scanner;
//public class HelloWorld {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i <= n ; i++){
//            for(int j=n-i; j > 0; j--){
//                System.out.print(" ");
//            }
//            for(int j=0; j< i*2-1; j++){
//                if(j==0 || j%2==0) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
