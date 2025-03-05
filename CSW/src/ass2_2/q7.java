package ass2_2;

import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address [Plot No: " + plotNo + ", AT: " + at + ", Post: " + post + "]";
    }
}

public class q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();

        addressBook.put("Alice", new Address("123", "City Center", "XYZ-123"));
        addressBook.put("Bob", new Address("456", "North Avenue", "ABC-456"));
        addressBook.put("Charlie", new Address("789", "South Street", "LMN-789"));

        Iterator<String> iterator = addressBook.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressBook.get(name);
            System.out.println(name + ": " + address);
        }
    }
}
