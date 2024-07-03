import java.util.*;
public class question2 {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<nums.size()-1;i++){
            if(nums.get(i-1) + 1 <nums.get(i) && nums.get(i)+ 1 <nums.get(i+1)){
                list.add(nums.get(i));

            }
        }
        if(nums.size() == 1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0) + 1 <nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) + 1< nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(10);
        height.add(6);
        height.add(5);
        height.add(8);
        System.out.println(height);
    }
    
}
