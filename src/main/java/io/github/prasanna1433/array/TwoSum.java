package io.github.prasanna1433.array;

import java.util.HashMap;

/**
 * Created by p0s00gu on 2/5/18.
 *
 * This is the solution to the problem -> https://leetcode.com/problems/two-sum/description/
 *
 * We are using HashMap to solve this problem
 */
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int x;

        for(int i=0;i<numbers.length;i++){
            x=numbers[i];
            if(map.containsKey(target-x)){
                return new int[] {map.get(target-x),i};
            }else{
                map.put(x,i);
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args){
        int[] inputArray={2,6,3,4,8,10};
        int target=12;

        int[] answer=twoSum(inputArray,target);

        System.out.printf("Target is obtained by adding %d and %d index",answer[0],answer[1]);

    }


}
