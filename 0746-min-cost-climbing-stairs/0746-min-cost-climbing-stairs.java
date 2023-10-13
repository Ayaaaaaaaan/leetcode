class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]strg=new int[cost.length+1];
        Arrays.fill(strg,-1);
        int ans1=minCost(0,cost,strg);
        int ans2=minCost(1,cost,strg);
        return Math.min(ans1,ans2);
    }
    public int minCost(int i,int[]cost,int[]strg){
        if(i==cost.length)return 0;
        if(i>cost.length)return 100000;

        if(strg[i]!=-1)return strg[i];
        int o1=cost[i]+minCost(i+1,cost,strg);
        int o2=cost[i]+minCost(i+2,cost,strg);

        int ans=Math.min(o1,o2);
        strg[i]=ans;
        return ans;
    }
}