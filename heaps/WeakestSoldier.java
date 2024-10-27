import java.util.*;
public class WeakestSoldier {
    static class Row{
        int soldiers;
        int idx;
        public Row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {
        int[][] army = {{1, 0, 0, 0}, 
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k = 2; //no. of weakest rows to print
        
        PriorityQueue<Row> pq = new PriorityQueue(new Comparator<Row>(){
            @Override
            public int compare(Row r1, Row r2) {
                if(r1.soldiers == r2.soldiers){
                    return r1.idx - r2.idx;
                } else {
                    return r1.soldiers - r2.soldiers;
                }
            }
        });

        for(int i = 0; i < army[0].length; i++){
            int cnt = 0;
            for(int j = 0; j < army.length; j++){
                cnt += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(cnt, i));
        }

        for(int i = 0; i < k; i++){
            System.err.println("R" + pq.remove().idx);
        }
    }
}
