import java.util.Scanner;
public class stdio{
    public static void main(String[] args){
        Scanner uin = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = uin.nextInt();
        System.out.println("The Number you entered is " + num);
    }
}
