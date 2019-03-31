import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter rows : ");
        int rows = input.nextInt();


        for (int i = 0 ; i< rows ; i++){


            for (int  j = rows-i ; j>=0 ; j-- ){
                System.out.print(" ");
            }

            for ( int k=0 ; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();

        }





    }
}
