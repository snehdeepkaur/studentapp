/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.template;

/**
 *
 * @author RIIT_comp
 */
public class ViewAttendencetemplate {
    String Course,Branch,Semester;
    int Student_ID;

    public String getBranch() {
        return Branch;
    }

    public String getCourse() {
        return Course;
    }

    public String getSemester() {
        return Semester;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }
    
}
