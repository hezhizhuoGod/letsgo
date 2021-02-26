package 排序;

public class sort {
    public void sort(int[] nums)
    {
        //记录要进行多少次
        int N=nums.length;
        for(int i=0;i<N;i++)
        {
            int min=i;//记录循环的角标
            int temp;//临时空间
            for(int j=i;j<N;j++)
            {
                if(nums[j]<nums[min])
                {
                    min=j;
                }
            }
            temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
    }
    public static void main(String[] args) {

    }
}
