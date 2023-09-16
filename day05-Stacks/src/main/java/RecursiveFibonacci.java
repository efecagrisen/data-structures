public class RecursiveFibonacci {
    public static void main(String[] args) {

        System.out.println(fib(3));
        System.out.println(fib(5));
        System.out.println(fib(9));


    }

    public static int fib(int n){

        if (n==0) return 0; // termination / base condition
        if (n==1) return 1; // termination / base condition
        return fib(n-1)+fib(n-2);




    }



}
