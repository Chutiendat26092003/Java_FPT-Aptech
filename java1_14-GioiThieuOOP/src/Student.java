public class Student {
    private int rollNo;
    private String name;
    private Date DBO;
    private ClassStu classCurrent;
    private int status;

    public Student(int rollNo, String name, Date DBO, ClassStu classCurrent, int status) {
        this.rollNo = rollNo;
        this.name = name;
        this.DBO = DBO;
        this.classCurrent = classCurrent;
        this.status = status;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Date getDBO() {
        return DBO;
    }

    public void setDBO(Date DBO) {
        this.DBO = DBO;
    }

    public ClassStu getClassStudent() {
        return classCurrent;
    }

    public void setClassStudent(ClassStu classCurrent) {
        this.classCurrent = classCurrent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }



    public String toString() {
        return "Student[rollNo=" + rollNo + ", name='" + name + '\'' + ", DBO=" + DBO + ", classCurrent=" + classCurrent + ", status=" + status + "]";
    }
}