package hairyass5;
import java.io.*;
public class q10 {

	public static void main(String[] args) {
        File file = new File ("diary.txt");
        try {
        	if(!file.exists()) {
        		throw new FileNotFoundException("File dose not exits");
        		
        	}
        	FileReader fileReader = new FileReader(file);
        	int character ;
        	System.out.println("Diary entry");
        	while((character = fileReader.read()) != -1){
        		System.out.print((char) character);
        	}
        }catch(FileNotFoundException e) {
        	System.err.print(e);
        }
        catch (IOException e) {
        	System.err.print("an error occured wwhile reading the file: "+e.getMessage());
        }
	}

}

