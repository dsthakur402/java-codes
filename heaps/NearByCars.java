import java.util.*;
// import java.util.Comparator;


public class NearByCars {
    static class Point /* implements Comparable<Point> */{
        int x;
        int y;
        int dis;
        int idx;
        Point(int x, int y, int dis, int idx){
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.idx = idx;
        }
        // @Override
        // public int compareTo(Point p2){
        //     return this.dis - p2.dis;
        // }
    }
    public static void main(String[] args) {
        int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        // PriorityQueue<Point> pq = new PriorityQueue<>();
        PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.dis - p2.dis;
            }
        });
        for(int i = 0; i < pts.length; i++){
            int dis = pts[0][0] * pts[0][0] + pts[1][1] * pts[1][1];
            pq.add(new Point(pts[0][0], pts[1][1], dis, i));
        }
        for(int i = 0; i < k; i++){
            System.out.println("C" + pq.remove().idx);
        }
    }
}


