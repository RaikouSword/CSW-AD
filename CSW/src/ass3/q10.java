package ass3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.util.*;

public class q10 {

    public static void main(String[] args) throws Exception{
    	if(args.length!=1) {
    		System.out.println("Please provide a valid path file");
    		return ;
    	}
    	String filePath = args[0];
    	File file = new File(filePath);
    	if(!file.exists()) {
    		throw new CustomFileNotFoundException("File not found :"+filePath);
    	}
    	try {
    		FileReader reader = new FileReader(filePath);
    		System.out.println("Contents: ");
    		int charValue;
    		while((charValue= reader.read())!=-1) {
    			System.out.print((char)charValue);
    		}
    		reader.close();
    	}catch(IOException e){
    		throw new CustomFileReadPermissionException("Error reading the file: "+e.getMessage()); 
    	}
    }
}
class CustomFileNotFoundException extends FileNotFoundException{
	public CustomFileNotFoundException(String message) {
		super(message);
	}
}
class CustomFileReadPermissionException extends FileNotFoundException{
	public CustomFileReadPermissionException(String message) {
		super(message);
	}
}


