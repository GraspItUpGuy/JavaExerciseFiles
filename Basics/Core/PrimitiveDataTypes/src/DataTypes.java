
import java.util.Scanner;
public class DataTypes {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("New Module");

//         byte => -128  127
//          short -32678  32767
//          int    -2,147,483,648
//          long   2ˆ63

//          float   231.2f
//         double  231.23
//
//           boolean   true/false
//
//
//         char
        //String





        int mInt =22/7;
        float mFloat = 22/7f;
        double mDouble =22/7d;
        System.out.println("Int is " + mInt);
        System.out.println("FLoat is " + mFloat);
        System.out.println("Double is " + mDouble);


        boolean isActive  = true ;


        System.out.println(isActive);

        char mChar = 'a';
        char mChar2 = 'b';
        System.out.println(mChar + mChar2);
        System.out.println("-----xxxx-------");

        System.out.println(mChar);
        String myValue = Integer.toHexString(mChar);  // converts any character into
                                                     // hex/ unicode value
        System.out.println(myValue);


        char mUnicode = '\u0041';
        System.out.println(mUnicode);

        System.out.println("----xxxxx-----");


        String mString = "I am a string";
        System.out.println(mString);

        String fakeValue = "5.21421";
        System.out.println(fakeValue);

        String fakeValue2 = "1.21978";
        System.out.println(fakeValue + fakeValue2);
        System.out.println(mInt + fakeValue2);

    }
}
