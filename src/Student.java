public class Student {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    private String lastName;
    private double avgScore;
    private boolean active;
    private String index;

    public Student(String firstName, String lastName, double avgScore, boolean active, String index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avgScore = avgScore;
        this.active = active;
        this.index = index;
    }


}
