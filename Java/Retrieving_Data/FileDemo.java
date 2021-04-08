package Retrieving_Data;
import java.io.*;
public class FileDemo{
    public static void main(String[] args){
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("log.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (FileNotFoundException e){
            System.out.print("");
        }
        catch (IOException e){
            System.out.print("");
        }
        finally{
            try {
                fis.close();
            } catch (IOException e) {
                System.out.print("");
            }
        }
    }
}