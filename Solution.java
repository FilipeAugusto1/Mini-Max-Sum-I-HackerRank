import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
    
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
    
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr.get(i);
        }
    
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());
        miniMaxSum(arr);
        bufferedReader.close();
    }
}