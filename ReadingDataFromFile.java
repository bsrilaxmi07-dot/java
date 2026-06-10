import java.io.*;
import java.util.*;
class ReadingDataFromFile
{
    public static void main(String args[])
    {
        try{
            File file =new File ("demo2.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
    }
}