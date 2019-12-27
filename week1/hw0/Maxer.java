package hw0;


public class Maxer {
    /** Returns the maximum value from m. */
    public static int max(int[] m){
        if (m.length == 0){
            throw new RuntimeException("数组为空");
        }
        int max = m[0];
        int i = m.length-1;
        while(i>=1){
            if(m[i]>max){
                max = m[i];
            }
            i--;
        }
        return max;
    }

       /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max = m[0];
        for(int i=1; i<m.length;i++){
            if(m[i]>max){
                max = m[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(forMax(numbers));   
    }
}