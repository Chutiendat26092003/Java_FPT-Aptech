package SuperPerson;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 11:02 AM

    Project Name: Inheritance-Person
*/

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Jack", "Ha Noi");
        System.out.println(s1);

        s1.addCourseGrade("Java", 99);
        s1.addCourseGrade("Java1", 80);
        s1.addCourseGrade("Java2", 96);
        s1.printGrades();
        System.out.println(s1.getAverageGrades());
    }
}
