import java.time.LocalDate;

public class EventTask {
    private String description;
    private LocalDate dueDate;
    private boolean completed;
    private Teacher assignedTeacher;


    public EventTask(String description, LocalDate dueDate, Teacher assignedTeacher){
        this.description = description;
        this.dueDate = dueDate;
        this.assignedTeacher = assignedTeacher;
        this.completed = false; //new tasks are not complete
    
    }

    public void markComplete(){
        completed = true;

    }

    public boolean isCompleted(){
        return completed;
    }

    public Teacher getAssignedTeacher(){
        return assignedTeacher;

    }   

}