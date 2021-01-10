package pojo;

public class table_course {
    private String courseID;
    private String courseName;
    private String courseType;
    private int credit;
    private int hour;
    private String courseDes;

    public table_course(String courseID, String courseName, String courseType, int credit, int hour, String courseDes) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseType = courseType;
        this.credit = credit;
        this.hour = hour;
        this.courseDes = courseDes;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getCourseDes() {
        return courseDes;
    }

    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }

    @Override
    public String toString() {
        return "table_course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", credit=" + credit +
                ", hour=" + hour +
                ", courseDes='" + courseDes + '\'' +
                '}';
    }
}
