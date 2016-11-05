/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.template;

/**
 *
 * @author PARVINDER
 */
public class fee_detailtemplate {
    String course,branch,semester,type;
    int hostellerfee,semesterfee,Studentid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int Studentid) {
        this.Studentid = Studentid;
    }

    public int getHostellerfee() {
        return hostellerfee;
    }

    public void setHostellerfee(int hostellerfee) {
        this.hostellerfee = hostellerfee;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getHostelfees() {
        return hostellerfee;
    }

    public void setHostelfees(int hostelfees) {
        this.hostellerfee = hostelfees;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getSemesterfee() {
        return semesterfee;
    }

    public void setSemesterfee(int semesterfee) {
        this.semesterfee = semesterfee;
    }

}