//Q4
package ass1;
public class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;
    
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Unknown";
    }
    
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    public int getImageWidth() {
        return imageWidth;
    }
    public int getImageHeight() {
        return imageHeight;
    }
    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return "Image [Width=" + imageWidth + ", Height=" + imageHeight + ", Color Code=" + colorCode + "]";
    }

    public static void main(String[] args) {
        Image defaultImage = new Image();
        System.out.println("Default Image Details: " + defaultImage.toString());
        Image customImage = new Image(1920, 1080, "#FF5733");
        System.out.println("Custom Image Details: " + customImage.toString());
    }
}

