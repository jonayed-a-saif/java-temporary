package readcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {
      String csvFile = "/home/orange/Desktop/java code/csv/csvfile2.csv";
	BufferedReader br = null;
	String line = "";
	String csvSplitBy = " ";
        String str = "This";
	try {

		br = new BufferedReader(new FileReader(csvFile));
		while((line = br.readLine()) != null) {

		        // use comma as separator
			String[] info = line.split(csvSplitBy);
                        int index=0;
                        while(index < info.length){
                        if(info[index].equals(str)){
                            System.out.println("Found -->"+info[index]);
                        }
                        index++;
                        }
                       
			//System.out.println("Index 0-->" + info[0]);

		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");

    }
    
}
