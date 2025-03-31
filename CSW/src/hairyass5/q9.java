package hairyass5;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q9 {

	public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter diary entry");
     String entry = sc.nextLine();
     File file = new File("diary.txt");
     try {
    	 if(file.exists()) {
    		 throw new IOException("Error: file dir 'diary.txt' exists");
    		 }else {
    			 if(file.createNewFile()) {
    				 System.out.println("diary.txt created succefully");
    				 try(FileWriter writer = new FileWriter(file,true)){
    					 writer.write(getCurrentDateTime()+"\n"+entry+"\n");
    					 System.out.println("diary entry added successfuly");
    				 }
    			 }else {
    				 System.out.println("failed to create"+file);
    				 return;
    			 }
    		 }
     }catch(IOException e) {
    	 System.err.println("an error occured while writting the file"+e.getMessage());
     }finally {
    	 sc.close()
;     }  }

	private static String getCurrentDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH-mm-ss"));
	}
}

