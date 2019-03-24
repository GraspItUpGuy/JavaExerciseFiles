public class methods {
    //    public is an access modifier
//        three access modifiers =>
//        public      -> access to everyone
//        private     -> visible only to clas
//        protected   -> visible to the package and all subclass

    public static void main(String[] args){

        sayHello();
        System.out.println( "smaller number is " + minNum(5,10));

    }
// declare your function outside  main
    public static void sayHello(){
        System.out.println("Hello java !");
        System.out.println("WHat you doing....");
    }
    public static int minNum (int a, int b){
        return   Math.min(a , b) ;
    }
}
