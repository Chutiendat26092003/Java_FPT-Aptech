public class TestStudent {
    public static void main(String[] args) {
        ClassStu c1 = new ClassStu();
        Date d1 = new Date(26, 9, 2003);
        Student s1 = new Student(1001 , "Chu Tien Dat", d1, c1, 1 );
        System.out.println(s1);
    }
}
