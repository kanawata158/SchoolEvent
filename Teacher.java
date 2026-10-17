public class Teacher {
    private String teacherName; 
    private String email;
    
    public Teacher(String name, String email){
        this.teacherName = name;
        this.email = email;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getEmail(){
        return email;
    }
}
