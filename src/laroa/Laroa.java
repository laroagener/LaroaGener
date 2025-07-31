
package laroa;

import java.util.Scanner;


public class Laroa {


   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        
        
        System.out.print("Enter name: ");
        name  = sc.nextLine();
        System.out.print("Enter your age: ");
        age   = sc.nextInt();
        
       System.out.println("\nHello "+name+" your age is "+age);
        
    }
    
}
