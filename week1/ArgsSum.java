public class ArgsSum{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<args.length; i++){
            int term = Integer.parseInt(args[i]);
            sum += term;
        }
        System.out.println("the args sum is " + sum);
        

        // int total = sum(args);
        // System.out.println("the args sum is " + total);
        
    }

    // private static int sum(String[] ints) {
    //     if(ints.length == 0){
    //         return 0;
    //     }
    //     String[] rest = Arrays.copyOfRange(ints,1,ints.length);
    //     return Integer.parseInt(ints[0]) + sum(rest);      
    // }
}