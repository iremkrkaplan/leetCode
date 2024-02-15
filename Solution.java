import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(findTheDifference("abc","acğb"));
      //  System.out.println(strStr("sadbutsad","sad"));
//        System.out.println(isAnagram("",""));
        int[] arr1=new int[] {1,2,3,0,0,0};
        int[] arr2=new int[] {2,5,6};
    }
    public static char findTheDifference(String s, String t) {
        char[] charArray=s.toCharArray();
        char[] charArray2=t.toCharArray();
        Arrays.sort(charArray2);
        Arrays.sort(charArray);
        int index=0;
        while (index<charArray.length){
            if (charArray2[index]!=charArray[index]){
                return charArray2[index];
            }
            index++;
        }
       return charArray2[index];
    }
    public static int strStr(String haystack, String needle) {
        char[] charArray=haystack.toCharArray();
        char[] charArray2=needle.toCharArray();
        int r =0;
        int length_2=charArray2.length;
        for (int i=0;i<charArray.length;i++){
            while (length_2!=0){
                if (charArray[i]==charArray2[i]){
                    length_2--;

                }
            }
    }
        return r;
}
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
    public static boolean isAnagram(String s, String t) {
        char[] charArray=s.toCharArray();
        char[] charArray2=t.toCharArray();
        Arrays.sort(charArray2);
        Arrays.sort(charArray);
        int index=0;
        if (charArray2.length!=charArray.length) return false;
            while (index!=charArray2.length){
                if (charArray2[index]!=charArray[index]){
                    return false;
                }
                index++;
            }
        return true;
    }
    public int[] twoSum(int[] nums, int target) {
        int arrLength=nums.length;
        int var1=0;
        int var2=0;
        for (int i=0;i<arrLength;i++){
            int temp=nums[i];
            for (int j=0;j<arrLength;i++){
                if (target-temp==nums[j]){
                    if (i!=j){
                        var2 =j;
                        var1 =i;
                    }
                }
            }
        }
        int[] arr= new int[]{var1, var2};
        return arr;
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
    public int firstUniqChar2(String s) {
        char[] charArray=s.toCharArray();
        char[] cloneOfCharArray=charArray.clone();
        Arrays.sort(charArray);
        int temp=0;
            Map<Integer, Character> sortedMap =new HashMap<>();
            Map<Character,Integer> unsortedMap=new HashMap<>();
        for (int i =0;i<charArray.length;i++){
            sortedMap.put(i,charArray[i]);
            unsortedMap.put(cloneOfCharArray[i],i);
        }
        for (int i =0;i<charArray.length;i++){
            temp=i+1;
            if (sortedMap.get(i)!= sortedMap.get(temp)){
                return unsortedMap.get(sortedMap.get(i));
            }else {
            temp++;
        }}
        return -1;
    }
  /*  public int firstUniqChar(String s) {
        char[] charArray=s.toCharArray();
        Map<Character,Integer> chars= new HashMap<>();


    }*/

    public boolean isPalindrome(int x) {
        int reversed=0;
        int number=x;
        while (x>0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x/=10;
    }
        if (Math.abs(x)==x){
            return number==reversed;
        } else return false;
}
public boolean isValid(String s) {
        char[] charArr=s.toCharArray();
        Map<Character, Character> bracketsMap =new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
        int temp;
        for (int i=0;i<charArr.length;i+=2){
            temp=i+1;
            if (temp<=charArr.length && bracketsMap.containsKey(charArr[i])){
                if (bracketsMap.get(charArr[i])!=charArr[temp]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid2(String s) {
        //({[]}]
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (bracketsMap.containsKey(c)) {
                stack.push(c);
            } else if (bracketsMap.containsValue(c)) {
                if (stack.isEmpty() || bracketsMap.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums1,0,nums1,0,m);
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}