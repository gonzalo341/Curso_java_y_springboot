public class Student {
    private String name;
    private int grade;
    double score;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0) {
            this.grade = grade;
        }
    }

    public boolean hasPassed() {
        if (score >= 6.0) {
            return true;
        } else {
            return false;
        }
    }
}
