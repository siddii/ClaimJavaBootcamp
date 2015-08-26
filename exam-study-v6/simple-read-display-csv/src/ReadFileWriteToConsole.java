import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import com.csvreader.CsvReader;

public class ReadFileWriteToConsole {
	
	private static final int MAXROW = 3;
	private static final int MAXCOL = 3;
    private static final String inFile = "in.csv";
	   
    public String[][] sheet = new String[MAXROW][MAXCOL];
	   
    public static void main(String args[]) throws IOException {
    	// create a ReadWriteToConsole object
    	//  Do not change the signature of this method.
    	// ... insert code here ...
    	// invoke readSheet()
    	// ... insert code here ...
    	// invoke writeSheet()
    	// ... insert code here ...
    }	
	   
    public void readSheet() throws IOException {
    	// ... insert code here ...
    	//  Do not change the signature of this method.
        CsvReader csvReader = new CsvReader(inFile, ',');
        int row = 0;
        while (csvReader.readRecord()) {
            int columnCount = csvReader.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                String value = csvReader.get(i);
                sheet[row][i] = value;
            }
            row++;
        }
    }
	   
	public void writeSheet(){
		// ... insert code here ...
    	//  Do not change the signature of this method.
        for (int i = 0; i < sheet.length; i++) {
            String[] strings = sheet[i];
            for (int j = 0; j < strings.length; j++) {
                String string = strings[j];
                System.out.print("[" + string + "]");
            }
            System.out.println();
        }
    }
}
