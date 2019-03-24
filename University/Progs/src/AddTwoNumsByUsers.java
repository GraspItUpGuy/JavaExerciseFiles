// for taking input add extra functionality


import java.util.Scanner ;

public class AddTwoNumsByUsers {

    public static void main (String args[]){    // String[] and args[] => either is fine

        int myFirstNumber ;
        int mySecondNumber ;
        int result ;

        Scanner input = new Scanner(System.in);   // to use the Scanner

        System.out.println("Enter number one : ");
        myFirstNumber = input.nextInt();   // treat next  interger input as iput and assign
                                         // it to the myFirstNumber

        System.out.println("Enter number two : ");
        mySecondNumber = input.nextInt();

        result = myFirstNumber + mySecondNumber;

        System.out.println("Result is : ");
        System.out.print(result);
//   TODO: edit to take stirng inputs


    }

}
