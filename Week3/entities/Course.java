package Week3.entities;

public class Course {
    private int courseId;
    private String courseName;
    private String instructorName;
    private double coursePrice;

    public Course(int courseId, String courseName, String instructorName, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() { return instructorName;}

    public void setInstructorName(String instructorName) { this.instructorName = instructorName;}

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}