/*
 * ����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������
����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��
˵��:
���ص��±�ֵ��index1 �� index2�����Ǵ��㿪ʼ�ġ�
����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ�ء�

ʾ��:
����: numbers = [2, 7, 11, 15], target = 9
���: [1,2]
����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
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


