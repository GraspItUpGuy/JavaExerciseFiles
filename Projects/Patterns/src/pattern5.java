import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("enter rows : ");
//        int rows = input.nextInt();

        int n =5;

        for(int i=n; i>0;i-- ){ // rows
           //spaces
            for( int j = i-n; j!=n ; j++ ){
                System.out.print("*");
            }
            // stars


            System.out.println();

        }





    }
}
