package main;
import java.util.Scanner;  
public class Main {  
public static void main(String[] args) {  
Scanner inp = new Scanner(System.in);  
System.out.print("First Name: ");
   String name = inp.nextLine();  
System.out.print("Middle Name: ");  
   String middle = inp.nextLine();  
System.out.print("Last Name: ");  
   String last = inp.nextLine();  
System.out.print("Work Hours: ");  

int whrs= inp.nextInt();  
System.out.print("Rate per hour: ");  
int rph = inp.nextInt();  
   int Salary = whrs * rph;  
System.out.println("My Name is "+name+" "+middle+" "+last);  
System.out.println("My Salary is "+ Salary);  
   }  
}