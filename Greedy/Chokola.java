import java.util.*;

public class Chokola{
   public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] ver = {2, 1, 3, 1, 4};
        Integer[] hor = {4, 1, 2};

        Arrays.sort(ver, Comparator.reverseOrder());
        Arrays.sort(hor, Comparator.reverseOrder());

        int cost = 0;
        int v = 0, h = 0;
        int vp = 1, hp = 1;
        while(h < hor.length && v < ver.length){
            if(hor[h] > ver[v]){
                cost += (hor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (ver[v] * hp);
                vp++;
                v++;                
            }
        }
        while(v < ver.length){
            cost += (ver[v] * hp);
            vp++;
            v++;
        }
        while(h < hor.length){
            cost += (hor[h] * vp);
            hp++;
            h++;
        }
        System.out.println(cost);
   } 
}