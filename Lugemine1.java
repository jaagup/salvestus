import java.io.*;
public class Lugemine1{
   public static void main(String[] arg) throws IOException{
      BufferedReader lugeja=new BufferedReader(new FileReader("linnad.txt"));
      System.out.println(lugeja.readLine());
   }
}