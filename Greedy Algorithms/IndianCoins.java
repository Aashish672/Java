import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> denominations=new ArrayList<>();
        int count=0;
        int amount=590;
        for (Integer coin : coins) {
            if (coin <= amount) {
                while (coin <= amount) {
                    count++;
                    denominations.add(coin);
                    amount -= coin;
                }
            }
        }
        System.out.println("Total Minimum Coins used="+count);
        System.out.println("Coins which we can use"+ denominations);
    }
}
