
package HashMapPg;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 */
public class TwoSum {

    public static int[] twoSum(int[] nums,Integer target){
        Map<Integer,Integer> dataMap=new HashMap<>();
        for(int i=0;i< nums.length;i++){
        int anotherValue= target-nums[i];

        if (dataMap.containsKey(anotherValue)) {
            return new int[]{dataMap.get(anotherValue),i};
        }
        dataMap.put(nums[i], i);
        }

        return null;
        
    }
}