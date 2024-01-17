import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int operator,fNum,sNum;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Select an operator: ");
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
        
        operator = s.nextInt();
        
        System.out.println("Enter two numbers");
        
        fNum = s.nextInt();
        sNum = s.nextInt();
        
        if(operator == 1) {
            System.out.print(fNum+sNum);
        }
        else if(operator == 2) {
            System.out.print(fNum-sNum);
        }
        else if(operator == 3) {
            System.out.print(fNum*sNum);
        }
        else if(operator == 4) {
            System.out.print(fNum/sNum);
        }
        else {
            System.out.print("Invalid number, please try again");
        }
    }
}