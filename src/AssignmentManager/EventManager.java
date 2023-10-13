package AssignmentManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class EventManager {
    ArrayList<Event>assignments = new ArrayList<>();


    public static void main(String[] args) {
        new EventManager().run();
    }

    private void run() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++){
            int year = random.nextInt(2) + 2023;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(28) + 1;
            LocalDateTime deadline = LocalDateTime.of(year, month, day, 0, 0);

            //Jeg føler at der skal laves en while løkke som siger at så længe at naah, jeg ved det ikke.
            //Jeg har fået den til at printe ud. Jeg er stolt.
            // Med chatgpt kan jeg godt få det til at virke.

            String [] possibleNames = {" Programming", " System Development", " Organization", " Technology"};
            String name = possibleNames[random.nextInt(possibleNames.length)];

            String [] possibleSolves = {" Solve assignment", " Prepare presentation", " Study curriculum", " Project work", " Solve challange" };
            String solve = possibleSolves[random.nextInt(possibleSolves.length)];

            //for (int p = 0; p < 10000; p++){
                int page = random.nextInt(10000) + 1;

            //}

            Event assignment = new Event(deadline, name, solve, page);
            assignments.add(assignment);

           //Collections.sort(assignments, (event1, event2) -> event1.getDeadline().compareTo(event2.getDeadline()));
           // (chatgpt's kode ovenover)
        }

        for (Event assignment : assignments) {
            System.out.println(assignment);
        }
    }
}
