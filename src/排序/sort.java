package 排序;

public class sort {
//    public int[][] merge(int[][] intervals) {
//        int n=intervals.length;
//        int a[][]=new int[n][n];
//
//        Arrays.sort(a);
//    }
    public void sort(int[] nums)
    {
        //插入排序
      for(int i=1;i<nums.length;i++)
      {
          int temp=nums[i];
          int j=i-1;
          while(j>=0&&nums[j]>temp)
          {

                nums[i+1]=nums[i];
              j--;
          }
      }
    }
    public static void main(String[] args) {


    }
}
