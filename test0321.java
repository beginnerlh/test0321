/*
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
说明:
返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

示例:
输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
*/
package lianxi0321;

public class test0321 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] numbers = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] a = S.twoSum(numbers, target);
		for(int i: a) {
			System.out.print(i+" ");
		}
	}
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int i = 0;
        int len = numbers.length - 1;
        while(i < len){
            int sum = numbers[i] + numbers[len];
            if(sum > target){
                 len--;
            }else if(sum < target){
                 i++;
            }else{
                index[0] = i+1;
                index[1] = len+1;
                break;
            }
        }
        
        return index;
    }
}  


