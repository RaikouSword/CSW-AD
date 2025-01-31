package sample_questions;
import java.util.*;
public class ImageLibrary {
	List<Image> images;
	public ImageLibrary() {
		this.images = new ArrayList<>();
	}
	public void insertImage(Image img) {
		images.add(img);
	}
	public List<Image> searchImage(String color){
		List<Image> res = new ArrayList<>();
		for(Image img: images) {
			if(img.getColorCode().equalsIgnoreCase(color)) {
				res.add(img);
			}
		}
		return res;
	}
	public List<Image> getImage(){
		return images;
	}
}
