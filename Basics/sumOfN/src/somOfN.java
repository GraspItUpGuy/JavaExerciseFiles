import java.util.Scanner;
public class somOfN {

    public static void main(String[]  args){


        Scanner input = new Scanner(System.in);

        System.out.println("Enter n");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0 ; i<= n; i++ ){
            sum+=n;
        }

        System.out.println("Sum of N is " + sum);

    }
}
