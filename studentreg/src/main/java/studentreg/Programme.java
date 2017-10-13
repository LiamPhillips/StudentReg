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
        for (int x=0 ; x<modules.size() ; x++){
            Module m = modules.get(x);
            ArrayList<Student> ModuleStudents = new ArrayList<Student>();
            ModuleStudents = m.getListofStudents();
            for (int y=0 ; y<ModuleStudents.size();y++){
                Student s = ModuleStudents.get(y);
                if (s.getCourse().equals(this.getCourseName()) && !(CourseStudents.contains(s))){
                    CourseStudents.add(s);
                    System.out.println(s.getName() + "\t , Course: " + s.getCourse());
                    System.out.print(" Modules: ");
                    for(int z=0; z<modules.size();z++){
                        System.out.print(modules.get(z).getName() + " ; ");
                    }
                    System.out.println();
                }
            }
        }
    }
}