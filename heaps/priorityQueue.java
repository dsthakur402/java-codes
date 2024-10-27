import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue{
    static class student {
        String name;
        int age;
        
        student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator to sort by age in ascending order
        PriorityQueue<student> pq = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s1.age - s2.age;  // Ascending order based on age
            }
        });
        
        pq.add(new student("A", 15));
        pq.add(new student("B", 11));
        pq.add(new student("C", 14));
        pq.add(new student("D", 20));
        pq.add(new student("E", 1));
        pq.add(new student("F", 15));
        
        while (!pq.isEmpty()) {
            student s = pq.poll();
            System.out.println(s.name + " " + s.age);
        }
    }
}




// time complexity
// O(log n) for add operation
// O(log n) for poll operation
// O(1) for peek() operation
