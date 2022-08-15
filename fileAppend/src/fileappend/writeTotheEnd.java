package fileappend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeTotheEnd {
    public void fileapplend(){
        try{
    	String content = "This is my text which would be appended at the end of the specified file\n";
        //Specify the file name and path here
    	File file =new File("/home/orange/Desktop/java code/csv/csvfile4.txt");

    	/* This logic is to create the file if the
    	 * file is not already present
    	 */
    	if(!file.exists()){
    	   file.createNewFile();
    	}

    	//Here true is to append the content to file
    	FileWriter fw = new FileWriter(file,true);
    	//BufferedWriter writer give better performance
    	BufferedWriter bw = new BufferedWriter(fw);
    	bw.write(content);
    	//Closing BufferedWriter Stream
    	bw.close();

	System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
    	 ioe.printStackTrace();
       } 
    }
    
}
