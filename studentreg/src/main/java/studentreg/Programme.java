//Liam Phillips
//13390871
//4BP

package studentreg;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Programme {
    
    private String CourseName;
    private ArrayList<Module> ListofModules;
    private LocalDate Start;
    private LocalDate Finish;

    public Programme(String courseName, ArrayList<Module> listofmodules, LocalDate start, LocalDate finish){
        this.CourseName = courseName;
        this.ListofModules = listofmodules;
        this.Start = start;
        this.Finish = finish;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
    public ArrayList<Module> getListofModules() {
        return ListofModules;
    }

    public void setListofModules(ArrayList<Module> ListofModules) {
        this.ListofModules = ListofModules;
    }

    public LocalDate getStart() {
        return Start;
    }

    public void setStart(LocalDate Start) {
        this.Start = Start;
    }

    public LocalDate getFinish() {
        return Finish;
    }

    public void setFinish(LocalDate Finish) {
        this.Finish = Finish;
    }

    public void printStudents(){
        ArrayList<Student> CourseStudents = new ArrayList<Student>();
        
        ArrayList<Module> modules = new ArrayList<Module>();
        modules = this.getListofModules();
        for (int i=0 ; i<modules.size() ; i++){
            Module m = modules.get(i);
            ArrayList<Student> ModuleStudents = new ArrayList<Student>();
            ModuleStudents = m.getListofStudents();
            for (int j=0 ; j<ModuleStudents.size();j++){
                Student s = ModuleStudents.get(j);
                if (s.getCourse().equals(this.getCourseName()) && !(CourseStudents.contains(s))){
                    CourseStudents.add(s);
                    System.out.println(s.getName() + "\t Course: " + s.getCourse());
                    System.out.print("\t Modules: ");
                    for(int k=0; k<modules.size();k++){
                        System.out.print(modules.get(k).getName() + " -- ");
                    }
                    System.out.println();
                }
            }
        }
    }
}