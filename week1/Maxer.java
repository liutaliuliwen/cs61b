public class Maxer {
    /** Returns the maximum value from m. */
    public static int forMax(int[] m) {
        int result = 0;
        for(int i=0; i<m.length; i++){
            if(m[i] > result){
                result = m[i];
            }
        }
        return result;
    }


    public static int max(int[] m){
        int result = 0;
        int i = 0;
        while(i < m.length){
            if(m[i] > result){
                result = m[i];
            }
            i += 1;
        }
        return result;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
       System.out.println(forMax(numbers));   
       System.out.println(max(numbers));   
    }
}