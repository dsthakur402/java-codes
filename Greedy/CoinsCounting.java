import java.util.*;

public class CoinsCounting {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        int amt = 1059;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < coins.length; i++){
            while(coins[i] <= amt){
                ans.add(coins[i]);
                countOfCoins++;
                amt -= coins[i];
            }
        }
        System.out.println("total no of coins = " + countOfCoins);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
