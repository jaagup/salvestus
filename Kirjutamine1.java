import java.io.*;
public class Kirjutamine1{
  public static void main(String arg[]) throws IOException{
     PrintWriter kirjutaja=new PrintWriter(new FileWriter("tervitus.txt"));
     kirjutaja.println("tere");
     kirjutaja.close();
  }
}