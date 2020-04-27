import java.util.Arrays;
import java.util.Scanner;

public class PalindromeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input  = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        if (rows + cols > 27){
            return;
        }
      String [][] matrix = new String [rows][cols];
        fillTheMatrix(matrix);
    }

    private static void fillTheMatrix(String[][] matrix) {
        char firstAndLastSymbol = 'a';

        for (int row = 0; row <matrix.length ; row++) {
            char secondSymbol = firstAndLastSymbol;
            for (int col = 0; col <matrix[row].length ; col++) {
              String word = "";
              word += (char)(firstAndLastSymbol) ;
              word += (char)(secondSymbol);
              word += (char)(firstAndLastSymbol);
               matrix [row][col] = word;
               secondSymbol++;


            }
            firstAndLastSymbol++;

        }
        System.out.println(Arrays.deepToString(matrix).replaceAll("\\[\\[","").replaceAll(", "," ")
        .replaceAll("]","\n").replaceAll(" \\[",""));
    }
}
