package fileread;
import java.io.*;
import java.util.Scanner;
public class readFile {
     public void readTextFileUsingBufferdReader(String fileName) {
       BufferedReader br = null;
       FileReader in = null;
       try{
           
         in = new FileReader(fileName);
           //br = new BufferedReader(new FileReader("c:\\personal\\myfile.txt"));
           br = new BufferedReader(in);
           	   //One way of reading the file
	   System.out.println("Reading the file using readLine() method of BufferedReader class");
	   String Line;
	   while((Line = br.readLine()) != null) {        
	      System.out.println(Line);	     
	   }
         
         }catch (IOException ioe) {	
         ioe.printStackTrace();
          
        } finally{
           try {
	    if (br != null)
		 br.close();
           } catch (IOException ioe)     {
		System.out.println("Error in closing the BufferedReader");
	   }

       }
 }
   //using fileReader  
   public void readTextFileUsingFileReader(String fileName) {
     
     
       BufferedReader br2 = null;
       FileReader in = null;
       try{	
         in = new FileReader(fileName);
           
           br2 = new BufferedReader(in);
           	   //One way of reading the file
	  
	   System.out.println("Reading the file using read() method:");
	   int num=0;
	   char ch;
	   while((num=br2.read()) != -1){      //-1 which signal the end of the file.
	  
               ch=(char)num;
	       System.out.print(ch);
	   }

       } catch (IOException ioe) {	
          ioe.printStackTrace();
          
        } finally{
           try {
	      if (br2 != null)
		 br2.close();
           } catch (IOException ioe)     {
		System.out.println("Error in closing the BufferedReader");
	   }

       }

}
  public  void readTextFileUsingScanner(String fileName) {
      
    try{  
     System.out.println("Reading the file using  Scanner  class");
    File file = new File(fileName); 
    Scanner sc = new Scanner(file); 
 
 while (sc.hasNextLine()){ 
 System.out.println(sc.nextLine()); 
 } 
 }catch(IOException ioe){
    
}finally{
         //fileread.close();
     }
     
 
}
 
 


    
}
