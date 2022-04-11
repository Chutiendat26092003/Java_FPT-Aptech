package inheritance;

/* 
    @author: chu tien dat
    Date: 4/11/2022
    Time: 2:33 PM

    Project Name: java-code
*/

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
