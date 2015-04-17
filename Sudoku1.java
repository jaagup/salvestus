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
    for(int reanr=0; reanr<9; reanr++){
     int[][] abi=new int[10][3];
     for(int j=0; j<9; j++){
        int arv=laud[reanr][j];
        if(abi[arv][0]==0){
          abi[arv][0]=1;
          abi[arv][1]=reanr;
          abi[arv][2]=j; 
        }
        else{
          System.out.println(arv+" kohal "+reanr+" "+j+" korduv");
          System.out.println("varasem "+abi[arv][1]+" "+abi[arv][2]);        
        }
     }     
    }
  }
}