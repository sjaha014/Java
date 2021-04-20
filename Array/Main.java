class Main {
    public static void main(String[] args) {
      
      Teacher teacher[] = {new Teacher("Alex", "Maths", 2000L), 
      new Teacher("john", "art", 5000l)};
    }
  }

  public class Teacher { 
 
    private String teacherName; 
    private String subject; 
    private double salary; 
   
    public String getTeachersName() { 
      return teacherName; 
    }
   
    public void setTeachersName(String teacherName) { 
      this.teacherName = teacherName; 
    }
   
    public String getSubject() { 
      return subject; 
    }
   
    public void setSubject(String subject) { 
      this.subject = subject; 
    }
   
    public double getSalary() { 
      return salary; 
    }
   
    public void setSalary(double salary) { 
      this.salary = salary; 
    }
   
    public Teacher(String teacherName, String subject, double salary) { 
      this.teacherName = teacherName; 
      this.subject = subject; 
      this.salary = salary; 
   
      System.out.println("Name: " + teacherName + "  subject: " + subject + "  Salary: " + salary); 
    }
   
   
   
   }