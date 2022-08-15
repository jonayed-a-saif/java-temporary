package filewrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeintoFile {
   public void fileWrite(){
        BufferedWriter bw = null;
         try {
	 String mycontent = "Java Spring framework";
         //Specify the file name and path here
	 File file = new File("/home/orange/Desktop/java code/csv/csvfile8.csv");

	 /* This logic will make sure that the file 
	  * gets created if it is not present at the
	  * specified location
         */
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("written Successfully into the file");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(IOException ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
    }
 
}
