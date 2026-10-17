import java.time.LocalDate;

public class MainClass {
    public static void main (String[] args) {
        School school = new School ("Bergen County Academies"); 
        Category category = new Category ("Cultural", "Encouraging students to explore and learn about different cultures"); 
        Teacher teacher = new Teacher ("Mr. Respass", "mr.respass@email.com"); 
        Event event = school.addEvent("International Day of Acceptance", category); 
        EventTask task = new EventTask("Send school-wide emails promoting the event", LocalDate.of(2026, 12, 1), teacher); 
        
        event.addTask(task); 
        System.out.println("School: " + school.getName());
        System.out.println("Event: " + event.getTitle());
        System.out.println("Category: " + event.getCategory().getCategoryName());
        System.out.println("Teacher: " + task.getAssignedTeacher().getTeacherName());
        System.out.println("List of Events: ");
        for (Event e: school.getEventList()) {
            System.out.println("- " + e.getTitle());
        }
        System.out.println("Tasks to be completed: ");
        for (EventTask e : event.getTaskList()) {
            System.out.println("- Assigned to: " + e.getAssignedTeacher().getTeacherName()); 
        }
    }
}