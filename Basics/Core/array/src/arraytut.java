import java.util.Scanner;

public class arraytut {
   public static void main(String[] args){

       int score = 40;
        int[]  scoreArray = new int[10];
          int[] scoreArrayOther = {1,2,9,3,4,7} ;

         int arval = 2;
         for (int i  = 0; i<=scoreArray.length - 1; i++){
             scoreArray[i] = i * arval;
             arval++;
             System.out.print(scoreArray[i] + "  " );
         }


         int largest = 0 ;
for (int i=0; i<=scoreArray.length-1; i++){

    if(scoreArray[i]>largest){
        largest = scoreArray[i];
    }
}
       System.out.println("largest element is  " + largest);

int sum = 0;
for (int i = 0; i<=scoreArray.length-1; i++){
    sum += scoreArray[i];
}
       System.out.println("sum of all elements is " + sum);

    }
}
