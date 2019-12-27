package hw0;
public class DrawTriangle{
    public static void main(String[] args){
        drawTriangle(10);
    }

    public static void drawTriangle(int N){
        int row = 0;
        while (row < N){
            int col = 0;
            while(col <= row){
                System.out.print("*");
                col ++;
            }
            System.out.println();
            row ++;
        }
        
    }

}