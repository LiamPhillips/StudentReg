//Liam Phillips
//13390871
//4BP

package studentreg;

public class Student {
	
    private String Name;
    private String DateofBirth;
    private int Age;
    private String Course;
    
    public Student(String name, String dateofbirth, int age, String course) {
    	
    this.Name = name;
    this.DateofBirth = dateofbirth;
    this.Age = age;
    this.Course = course;
    this.getUsername();
    }

    public String getName() {
        return Name;
        }

    public void setName(String Name) {
        this.Name = Name;
        }

    public String getDateofBirth() {
        return DateofBirth;
        }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth; 
        }
    
    public int getAge() {
        return Age;
        }

    public void setAge(int Age) {
        this.Age = Age;
        }

    public String getCourse() {
        return Course;
        }

    public void setCourse(String Course) {
        this.Course = Course;
        }
    
    public String getUsername() {
        String ConcatName = this.Name.replace(" ","_");
        String username = ConcatName + "_" + Integer.toString(this.Age);
        return username;
        }
    
    }