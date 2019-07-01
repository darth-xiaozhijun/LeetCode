package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ŀ����
 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
 * ʾ��:
 * ���� nums = [2, 7, 11, 15], target = 9
 * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 * ���Է��� [0, 1]
 * @author Administrator
 *
 */
public class LeetCode01 {
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j] == target)){
                	result[0] = i;
                	result[1] = j;
                	break;
                }
            }
        }
		return result;
    }
    
    public static int[] twoSum2(int[] nums,int target){
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i = 0; i < nums.length; i++){
    		int temp = target - nums[i];
    		if(map.containsKey(temp)){
    			return new int[]{map.get(temp),i};
    		}else{
    			map.put(nums[i], i);
    		}
    	}
    	
    	return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
//    	int[] res = twoSum(new int[]{3,2,4}, 6);
    	int[] res = twoSum2(new int[]{3,2,4}, 6);
    	for (int i : res) {
			System.out.println(i);
		}
	}
}
