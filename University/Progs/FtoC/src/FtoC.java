import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter temp in FAhernite");
        int tempInF = input.nextInt();

        int tempInC =(5 * (tempInF - 32)/9) ;
        System.out.println(" temp in celcius is " + tempInC);

    }
}
