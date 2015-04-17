import java.io.*;
public class Sudoku1{
  static int[][] laud=new int[9][9];
  public static void main(String[] arg) throws IOException{
     BufferedReader lugeja=new BufferedReader(new FileReader("sisend1.txt"));
     for(int i=0; i<9; i++){
       String[] m=lugeja.readLine().split(" ");
       for(int j=0; j<9; j++){
         laud[i][j]=Integer.parseInt(m[j]);
       }
     }
     
  }
}