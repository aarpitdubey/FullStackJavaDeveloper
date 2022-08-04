import java.util.Scanner;

/*
1.Write a program(WAP) to print INEURON using pattern programming logic.
*/


public class Assignment_1_Ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println();
        
        for (int i = 0; i < n; i++) {


            // ************ For I ***************
            for (int j = 0; j < n; j++) {
                if ((i==0 || j==n/2 || i==n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");



            // ************ For N ***************

                for (int j = 0; j < n; j++) {
                    if ((j==0 || i==j || j==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("    ");



            // ************ For E ***************

                for (int j = 0; j < n; j++) {
                    if ((j==0 || i==0 || i==n/2 || i==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("    ");


            // ************ For U ***************
                for (int j = 0; j < n; j++) {
                    if ((j==0 || (i==n-1) || j==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("    ");


            // ************ For R ***************
                for (int j = 0; j < n; j++) {
                    if (i==0 || j==0 || (j==n-1&&i<=n/2) || i==n/2  || (i==j&&j>=n/2))  {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("    ");


            // ************ For O ***************
                for (int j = 0; j < n; j++) {
                    if ((j==0 || i==0 || i==n-1 || j==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("    ");


            // ************ For N ***************

                for (int j = 0; j < n; j++) {
                    if ((j==0 || i==j || j==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
        }
        
    }
}