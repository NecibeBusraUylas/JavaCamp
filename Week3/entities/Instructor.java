package Week3.entities;

import java.util.List;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorEmail;

    public Instructor(int instructorId, String instructorName, String instructorEmail) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorEmail = instructorEmail;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorEmail() { return instructorEmail;}

    public void setInstructorEmail(String instructorEmail) { this.instructorEmail = instructorEmail;}
}