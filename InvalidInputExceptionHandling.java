import java.util.Scanner;

public class InvalidInputExceptionHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        int id= sc.nextInt();
        double salary=sc.nextDouble();
        if(!name.matches("[a-z A-Z]")){
            System.out.print("Invalid Name");
        } else if (id<=0) {
            System.out.print("Invalid ID");
        } else if (salary<0) {
            System.out.print("Invalid Salary");
        }else{
            System.out.print("Data Processed");
        }
    }
}

//  invalid input exception handling
