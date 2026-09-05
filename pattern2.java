public class pattern2 { 
    public static void main(String [] args) { 
        int n = 5; 
        for (int row = 1; row <= n; row++) { 
            // Prints the leading spaces
            for (int col = 1; col <= row; col++) { 
                System.out.print(" "); 
            } 
            // Prints the stars (Fixed syntax: added '*' and changed 'r' to 'row')
            for (int col = 1; col <= 2 * (n - row) + 1; col++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
    } 
}
