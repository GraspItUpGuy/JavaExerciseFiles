public class evenandodd {
    public static  void main(String[] args){

        System.out.println("even ");
        for(int i=0; i<= 200; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" " );
        System.out.println("odd ");
        for(int i=0; i<= 200; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
