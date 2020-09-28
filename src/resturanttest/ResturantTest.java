
package resturanttest;
import java.util.Scanner;
public class ResturantTest {

 static Scanner input=new Scanner(System.in);
    public static int menu(){
        System.out.println(" *** Menu ***\n");
        System.out.println("1. Create three objects of restaurant.");
        System.out.println("2. Display all Restaurant Information.");
        System.out.println("3. Display the checkRestaurant result.");
        System.out.println("4. Exit.");
        System.out.print("Your choice is: ");
        return input.nextInt();
    }
    public static void main(String[] args) {
        String name,owner,address;
        int id;
        int n;
        Resturant r1=null;
        Resturant r2=null;
        Resturant r3 = null;
        int x;
        Worker[] employees;
        do{x = menu();
        switch(x){
            case 1: System.out.println("First Resturant >>\n");
        
                System.out.print("Rest ID: ");
                id = input.nextInt();
                System.out.print("Rest Name: ");
                name = input.next();
                System.out.print("Rest Owner: ");
                owner = input.next();
                System.out.print("Rest Address: ");
                address = input.next();
                System.out.print("Rest Number Of Employees: ");
                n = input.nextInt();
                employees = new Worker[n];
                    System.out.println("Enter Employees Data: ");
                     for(int i=0; i<n; i++){
                    System.out.print("Enter First Name: ");
                    String fname = input.next();
                    System.out.print("Enter Last Name: ");
                    String lname = input.next();
                    System.out.print("Enter Gender: ");
                    String gender = input.next();
                    employees[i] = new Worker(fname,lname,gender);
                     }
                r1 = new Resturant(id,name,owner,address,n);
                r1.setEmployeeNames(employees);
                
                 System.out.println("Second Resturant>>\n");
                System.out.print("Rest ID: ");
                id = input.nextInt();
                System.out.print("Rest Name: ");
                name = input.next();
                System.out.print("Rest Owner: ");
                owner = input.next();
                System.out.print("Rest Address: ");
                address = input.next();
                System.out.print("Rest Number Of Employees: ");
                n = input.nextInt();
              employees = new Worker[n];
                    System.out.println("Enter Employees Data: ");
                     for(int i=0; i<n; i++){
                    System.out.print("Enter First Name: ");
                    String fname = input.next();
                    System.out.print("Enter Last Name: ");
                    String lname = input.next();
                    System.out.print("Enter Gender: ");
                    String gender = input.next();
                    employees[i] = new Worker(fname,lname,gender);
                     }
                r2 = new Resturant(id,name,owner,address,n);
                r2.setEmployeeNames(employees);
                
                 System.out.println("\nThird Resturant >>\n");
                System.out.print("Rest ID: ");
                id = input.nextInt();
                System.out.print("Rest Name: ");
                name = input.next();
                System.out.print("Rest Owner: ");
                owner = input.next();
                System.out.print("Rest Address: ");
                address = input.next();
                System.out.print("Rest Number Of Employees: ");
                n = input.nextInt();
                 employees = new Worker[n];
                    System.out.println("Enter Employees Data: ");
                     for(int i=0; i<n; i++){
                    System.out.print("Enter First Name: ");
                    String fname = input.next();
                    System.out.print("Enter Last Name: ");
                    String lname = input.next();
                    System.out.print("Enter Gender: ");
                    String gender = input.next();
                    employees[i] = new Worker(fname,lname,gender);
                     }
                r3 = new Resturant(id,name,owner,address,n);
                r3.setEmployeeNames(employees);
                break;
            case 2:
                r1.tostring();
                r2.tostring();
                r3.tostring();
                break;
            case 3:
                r1.checkRestaurant();
                r2.checkRestaurant();
                r3.checkRestaurant();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        }
        while(x!=4);
    }

    
}
