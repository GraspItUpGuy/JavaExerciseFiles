import java.util.ArrayList;

public class arraylistsample {
    public static void main(String[] args){
//        String[] arr = new String[10];
//        arr[0] =  "Delhi";
//        System.out.println(arr[0]);

        // ArrayList

        ArrayList <String> heroes = new ArrayList <String>();
        heroes.add("IronMan");
        heroes.add("HUlk");
        heroes.add("UltraMan");
        heroes.add("PerMan");
        heroes.add(0, "UltraB");
        System.out.println("My fav superhero is " + heroes.get(0));
        System.out.println("My fav superhero is " + heroes.get(1));
        System.out.println("My fav superhero is " + heroes.get(2));



    }
}
