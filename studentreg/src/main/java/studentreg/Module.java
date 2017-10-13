//Liam Phillips
//13390871
//4BP

package studentreg;

import java.util.ArrayList;

public class Module {
    private String Name;
    private String StudentID;
    private ArrayList<Student> ListofStudents;

public Module(String name, String studentid, ArrayList<Student> listofstudents){
    this.Name = name;
    this.StudentID = studentid;
    this.ListofStudents = listofstudents;
}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public ArrayList<Student> getListofStudents() {
        return ListofStudents;
    }

    public void setListofStudents(ArrayList<Student> ListofStudents) {
        this.ListofStudents = ListofStudents;
    }

    public void addToListofStudents(Student s){
        this.ListofStudents.add(s);
    }

}
