import java.sql.Date;
import java.util.ArrayList;

public class Event {
    private String title; 
    private Date date; 
    private ArrayList<EventTask> taskList = new ArrayList<>(); 
    private Category category; 
    private School school;

    public Event(String title, School school, Category category) {

    }

    public School getSchool() {
        return school; 
    }

    public String getTitle () {
        return title; 
    }

    public Category getCategory () {
        return category; 
    }

    public void setCategory (Category category) {
        this.category = category; 
    }

    public void addTask(EventTask task) {
        taskList.add(task); 
    }

    public void removeTask(EventTask task) {

    }

    public ArrayList <EventTask> getTaskList () {
        
    }

    
}
