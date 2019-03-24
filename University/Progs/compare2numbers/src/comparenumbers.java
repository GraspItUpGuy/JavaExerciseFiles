import java.util.Scanner;
public class comparenumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();


        if(num1 > num2){
            System.out.println("1st number is bigger");
        }
        else if(num1 == num2){
            System.out.println("number are equal");
        }
        else{
            System.out.println("number 2 is bigger");
        }



    }

}
