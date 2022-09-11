//7.
//Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1
import java.lang.Math;
import java.util.Scanner;

public class if_else_7 {
    public static void main(String []args){
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int abs=Math.abs(num);
        System.out.println(abs);
    }
}
