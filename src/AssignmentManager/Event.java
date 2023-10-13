package AssignmentManager;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime deadline;
    private String name;
    private String solve;
    private int page;

    public Event (LocalDateTime deadline, String name, String solve, int page){ // konstruktør
        this.deadline = deadline;
        this.name = name;
        this.solve = solve;
        this.page = page;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return deadline + ": " + name + ": " + solve + " Page, " + page ;
    }
}
