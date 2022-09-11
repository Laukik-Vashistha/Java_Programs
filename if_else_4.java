//4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;
public class if_else_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary= sc.nextInt();
        System.out.println("Enter year of service:");
        int year_of_service=sc.nextInt();
        if(year_of_service>5){
           int bonus=(salary*5)/100;
            int salary_including_bonus=salary+bonus;
            System.out.println(salary_including_bonus);
        }
    }
}
