import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim()); // total items
            int k = Integer.parseInt(br.readLine().trim()); // total I can remeber
            int X = Integer.parseInt(br.readLine().trim()); // price I cant remember
            String[] arr_price = br.readLine().split(" "); // prices
            int[] price = new int[N];
            for (int i_price = 0; i_price < arr_price.length; i_price++) {
                price[i_price] = Integer.parseInt(arr_price[i_price]);
            }

            long out_ = getCost(X, k, price, N);
            System.out.println(out_);
        }

        wr.close();
        br.close();
    }

    static long getCost(int X, int k, int[] price, int N) {
        // Write your code here
        // X -> needs to paid if I dont remember
        // k -> total I can remember
        // price
        // N -> total Items
        Set<Object> set = new HashSet<>();
        for(int i=0; i< price.length; i++) {
            set.add(price[i]);
        }
        if(set.size() - k < 0) {
            return 0;
        } else {
            return (set.size() - k)*X;
        }
    }
}