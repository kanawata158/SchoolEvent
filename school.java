import java.util.ArrayList;

public class School {
    private String name; 
    private ArrayList<Event> eventList; 

    public School(String name) {
        this.name = name; 
        this.eventList = new ArrayList<>(); 
    }

    public String getName() {
        return name; 
    }

    public void addEvent(Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }

        if (event.getSchool() != this) {
            throw new IllegalArgumentException("Event belongs to another school");
        }

        if (!eventList.contains(event)) {
            eventList.add(event);
        }
     }

    public Event addEvent(String title, Category category) {
        Event event = new Event(title, this, category);
        addEvent(event);
        return event;
    }

    public void removeEvent(Event event) {
        if (eventList.remove(event)) {
            for (EventTask task : event.getTaskList()) {
                event.removeTask(task); 
            }
        }
    }

    public ArrayList<Event> getEventList() {
        return new ArrayList<>(eventList);
    }

}