package SuperPerson;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:39 AM

    Project Name: Inheritance-Person
*/

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + address +")";
    }
}
