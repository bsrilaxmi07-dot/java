import java.io.*;
class DataWriteInFile
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("demo.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write("24C35A0403\n ");
            writer.close();
            System.out.println("data written successfully");
        }
        catch(IOException e){
            System.out.println("issue while writing data");
        }
    }
}