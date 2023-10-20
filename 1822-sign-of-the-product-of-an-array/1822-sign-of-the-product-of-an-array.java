class Solution {
    public int arraySign(int[] nums) {
        long prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            if(prod>1)prod=1;
        }
      
        return signFunc(prod);
    }
    public int signFunc(long num){
        if(num==0)return 0;
        if(num>0)return 1;
        else return -1;
    }
}