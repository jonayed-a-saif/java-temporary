package fileread;

public class FileRead {

    public static void main(String[] args) {
        String fileName= "/home/orange/Desktop/java code/csv/csvfile.txt";
        readFile ob = new readFile();
        ob.readTextFileUsingBufferdReader(fileName);
        System.out.println("---------------------");
       ob.readTextFileUsingFileReader(fileName);
        System.out.println("-----------------");
       ob.readTextFileUsingScanner(fileName);

       
    }
    
}
