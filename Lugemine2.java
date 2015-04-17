import java.io.*;
public class Lugemine2{
   public static void main(String[] arg) throws IOException{
      BufferedReader lugeja=new BufferedReader(new FileReader("linnad.txt"));
      String rida=lugeja.readLine();
      while(rida!=null){
        System.out.println(rida);
        rida=lugeja.readLine();
      }
   }
}