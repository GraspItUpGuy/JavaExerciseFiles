import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){

        Scanner input =  new Scanner(System.in);

        System.out.println("enter number greater than 0 ");
        int num = input.nextInt();
        int fact =1;
        for(int i=num; i>0; i--){
            fact = fact * i;
        }

        System.out.println("Factorial is " + fact);

    }


}
