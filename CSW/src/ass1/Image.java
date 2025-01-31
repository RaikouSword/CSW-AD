//Q4
package ass1;
public class Image{
	int imageWidth;
	int imageHeight;
	String colorCode;
	Image(int imageWidth,int imageHeight,String colorCode){
		this.imageHeight = imageHeight;
		this.imageWidth = imageWidth;
		this.colorCode = colorCode;
	}
	Image(){
		this.imageHeight = 0;
		this.imageWidth = 0;
		this.colorCode ="";
	};
	@Override
	public String toString() {
		return "Image [imageWidth=" + imageWidth + ", imageHeight=" + imageHeight + ", colorCode=" + colorCode + "]";
	}
	public int getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	 public static void main(String[] args) {
	        Image defaultImage = new Image();
	        Image parameterizedImage = new Image(1920, 1080, "#FF5733");

	        System.out.println("Default Image Details: " + defaultImage);
	        System.out.println("Parameterized Image Details: " + parameterizedImage);
	    }
}
