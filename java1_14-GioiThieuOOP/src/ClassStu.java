public class ClassStu {
    private int classId;
    private String className;

    public ClassStu() {
        classId = 1;
        className = "T2109M";
    }

    public ClassStu(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String toString() {
        return "ClassStu[classId=" + classId + ", className='" + className + "']";
    }
}
