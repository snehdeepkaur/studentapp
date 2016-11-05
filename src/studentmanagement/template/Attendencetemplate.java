/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.template;

/**
 *
 * @author RIIT_comp
 */
public class Attendencetemplate {
   String Course,Branch,Semester;
   int Student_ID;
   float Attendence;

    public float getAttendence() {
        return Attendence;
    }

    public void setAttendence(float Attendence) {
        this.Attendence = Attendence;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

}
   