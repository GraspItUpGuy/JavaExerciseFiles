import java.util.Scanner;
public class compare3nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter num1 : ");
        int num1 = input.nextInt();
        System.out.print("enter num2 : ");
        int num2 = input.nextInt();
        System.out.print("enter num3 : ");
        int num3 = input.nextInt();


        if((num1 > num2) && (num1 > num3)){
            System.out.println("num1 is biggest");
        } else if ((num2 > num1) && (num2 > num3)){
            System.out.println("num2 is biggest");
        } else if ((num3 > num1) && (num3 > num2)){
            System.out.println("num3 is biggest");
        }

    }
}
