package sample_questions;
import java.util.*;
public class ImageController {
	public static void main(String[] args) {
		Image img1 = new Image(100,200,"Red");
		Image img2 = new Image(150,250,"Blue");
		Image img3 = new Image(120,220,"Red");
		ImageLibrary library =  new ImageLibrary();
		library.insertImage(img1);
		library.insertImage(img2);
		library.insertImage(img3);
		System.out.println("All images: ");
		for(Image img : library.getImage()) {
			System.out.println(img);
		}
		System.out.println("\nSearching for Red images: ");
		List<Image> redImages = library.searchImage("Red");
		for(Image img: redImages) {
			System.out.println(img);
		}
	}
}
