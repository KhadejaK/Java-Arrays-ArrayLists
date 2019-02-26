import java.util.ArrayList;
/**
 * a class named Classroom which manages Student objects
 * @author KhadejaKhalid
 */
 public class Classroom
 {
    private ArrayList<Double> grades;
    private ArrayList<Student> students;
    
    /**
     * a no-argument constructor.
     */
    public Classroom() 
    {
       grades = new ArrayList<Double>();
       students = new ArrayList<Student>();
    }
    
    /**
     * adds the student to this Classroom (to an ArrayList)
     * @param s : the student
     */
    public void add(Student s) 
    {
       students.add(s);
    }
    
    /**
     * gets the name of the first student in the Classroom 
     * who has an average greater than the target or the empty string
     * Do not use break. Do not return from the middle of the loop. 
     * Use a boolean flag if you need to terminate early.
     * @param target grade
     * @return name of student
     */
    public String hasAverageGreaterThan(double target) 
    {
       String name = "";
       boolean found = false;
       for(int x=0; x < students.size(); x++)
       {
          if (found != true)
          {
             if (students.get(x).getAverage() > target)
             {
                name = students.get(x).getName();
                found = true;
             }
          }
       }
       return name;
    }
    
    /**
     * gets an ArrayList<String> containing the names of all the Students in this Classroom.
     * @return student names
     */
    public ArrayList<String> getStudents() 
    {
       ArrayList<String> names = new ArrayList<String>();
       for(int x=0; x < students.size(); x++)
       {
          names.add(students.get(x).getName());
       }
       
       return names;
    }
    
    /**
     * gets the Student with the highest average in this classroom or null there are no students
     * @return student with best grade
     */
    public Student bestStudent() 
    {
       if (students.size() == 0)
          return null;
       
       boolean found = false;
       double highest = students.get(0).getAverage();
       Student s = null;
       
       for(int x=0; x < students.size(); x++)
       {
          if (students.get(x).getAverage() > highest)
          {
             s = students.get(x);
          }
       }
       
       return s;
    }
    
    /**
     * gets a string represent ion using ArrayList's toString method
     * @return student list
     */
    public String toString() 
    {
       String su = "";
       su += students.toString();
       return su;
    }
 }