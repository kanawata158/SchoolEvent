import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String title; 
    private LocalDate date; 
    private ArrayList<EventTask> taskList; 
    private Category category; 
    private School school;

    public Event(String title, School school, Category category) {
        this.title = title; 
        this.school = school; 
        this.category = category; 
        this.date = LocalDate.now(); 
        this.taskList = new ArrayList<>(); 
    }

    public School getSchool() {
        return school; 
    }

    public String getTitle () {
        return title; 
    }

    public LocalDate getDate() {
        return date; 
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
        taskList.remove(task); 
    }

    public ArrayList <EventTask> getTaskList () {
        return new ArrayList<>(taskList); 
    }

    
}
