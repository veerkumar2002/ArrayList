import java.util.*;
public class question3 {
    public int mostFrequent(ArrayList<Integer> nums, int key){
        int[] result = new int[1001];
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1001; i++){
            if(result[i] > max){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        int key = 1;
        height.add(1);
        height.add(100);
        height.add(200);
        height.add(1);
        height.add(100);
        System.out.println(height);
    }
}
