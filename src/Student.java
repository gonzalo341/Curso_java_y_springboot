public class Student {
    double score;

    public boolean hasPassed() {
        if (score >= 6.0) {
            return true;
        } else {
            return false;
        }
    }
}
