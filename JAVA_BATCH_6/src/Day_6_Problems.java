public class Day_6_Problems {
    public static void main(String[] args) {
        
        // outer loop
        for(int i = 0; i < 3; i++) {  // i = 0 < 3
             // inner loop
            for(int j = 0; j < 4; j++) { // j = 1 < 4
                System.out.print("*");

            }
            System.out.println();
        }

        for(int i = 0; i < 4; i--) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*");     
            }
            System.out.println();
        }
    }

}