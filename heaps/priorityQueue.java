import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue{
    static class student implements Comparable<student>{
        String name;
        int age;
        student(String name,int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public int compareTo(student s2){
           return this.age - s2.age;
        } 
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("A",15));
        pq.add(new student("B",11));
        pq.add(new student("C",14));
        pq.add(new student("D",20));
        pq.add(new student("E",1));
        pq.add(new student("F",15));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().age);
            pq.remove();
        }
    }
}