class Fib{
    public static int fib(int n) {
        if(n <= 2){
            return n-1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fib2(int n, int k, int f0, int f1){       
        if(n == 1 || k == n){
            return f0;
        }else if(n == 2){
            return f1;
        }
        return fib2(n, k+1, f1, f0+f1);             
    }


    public static void main(String[] args) {
        int n = 9;
        for(int i=1; i<=n; i++){
            System.out.print(fib(i)+" ");
        }
        System.out.println();
        // System.out.println(fib2(1, 1, 0, 1));
        // System.out.println(fib2(2, 1, 0, 1));
        System.out.println(fib2(8, 1, 0, 1));
    }
}