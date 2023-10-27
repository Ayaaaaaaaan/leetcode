class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i+1<nums.length){
                int j=i+1;
                while(j<nums.length-1 && nums[j]==0){
                    j++;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
        }   
        System.out.println(Arrays.toString(nums));
    }
}