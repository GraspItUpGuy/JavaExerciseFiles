import java.util.Scanner;

import java.util.Scanner;
public class sumofN {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter val of n");
            int n = input.nextInt();
            int sum = 0 ;
            for(int i = 0;i<=n ; i++){
                sum+=n;
            }

            System.out.println("Sum of n numbers is " + sum);
        }

    }


