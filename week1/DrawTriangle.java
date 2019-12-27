public class DrawTriangle {
    public static void main(String[] args) {
        drawTriangle(10);
    }

    private static void drawTriangle(int N){
        // int rows = 5;
        for(int i = 0; i < N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}