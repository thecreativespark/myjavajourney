import java.util.Scanner;

public class evnorodd{
    public static void main(String[] args){
        System.out.print("Enter a number.\n");

        Scanner uin = new Scanner(System.in);
        int userInput = uin.nextInt();
        
        if(userInput==0||userInput==1){
            System.out.println("Neither even, nor odd");
        }
        else if(userInput%2==0){
            System.out.println(userInput + " is an even number.");
        }
        else{
            System.out.println(userInput+" is an odd number.");
        }
    }
}
