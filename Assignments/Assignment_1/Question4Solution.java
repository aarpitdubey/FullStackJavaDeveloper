/*  Ques 4. WAP to print

        *            *
        **          **
        ***        ***
        ****      ****
        *****    *****  
        ******  ******
        **************
 */

import java.util.Scanner;
public class Question4Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if ((j==0&&i>=n/2) || i==n-1 || (j==n-1&&i>=n/2)
                || (i+j>=n+(n-1)/2) || (i-j >= (n-1)/2+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
