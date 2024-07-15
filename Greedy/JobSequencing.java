import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JobSequencing {
    static class job{
        int id;
        int deadline;
        int profit;
        job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<job> jobs = new ArrayList<>();
        
        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new job(i , jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a1, b1) -> b1.profit - a1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(int i = 0; i < jobs.size(); i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                time++;
                seq.add(curr.id);
            }
        }

        System.out.println("max jobs = " + seq.size());
        for(int i = 0; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
