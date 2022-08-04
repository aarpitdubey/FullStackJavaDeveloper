/*
Ques 2. Write a program to print

        1 1 1 1
        2 2 2 2
        3 3 3 3
        4 4 4 4
        
*/

import java.util.Scanner;

public class Question2Solution {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows: ");
         int n = sc.nextInt();
         System.out.println();
        // int n = 4; //We can directly used n = 4 
        // for printing the required pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              
                if (i>=0||j<=n-1) {
                    System.out.print(i+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
