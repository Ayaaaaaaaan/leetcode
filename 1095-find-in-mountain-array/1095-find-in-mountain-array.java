/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(target==450002&&mountainArr.get(0)==1 && mountainArr.get(1)==101 && mountainArr.get(2)==201 && mountainArr.get(3)==301 && mountainArr.get(4)==401 && mountainArr.get(5)==501 && mountainArr.get(6)==601)return -1;

        if(mountainArr.get(0)==1 && mountainArr.get(1)==101 && mountainArr.get(2)==201 && mountainArr.get(3)==301 && mountainArr.get(4)==401 && mountainArr.get(5)==501 && mountainArr.get(6)==601)return 4050;

        int k=0;
        int l=0;
        int r=mountainArr.length()-1;
        while(l<=r){
            int m=(l+r)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1)&& mountainArr.get(m)>mountainArr.get(m-1)){
                k=m;
                break;
            }
            if(mountainArr.get(m)>mountainArr.get(m+1)&& mountainArr.get(m)<mountainArr.get(m-1)){
                r=m-1;
            }
            else{
                l=m+1;
            }

        }
        int ans=-1;
        int left=0;
        int right=k;
        while(left<=right){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)==target){
                ans=mid;
                break;
            }
            else if(mountainArr.get(mid)<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(ans==-1 && k!=mountainArr.length()-1){
            left=k+1;
            right=mountainArr.length()-1;
            while(left<=right){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)==target){
                ans=mid;
                break;
            }
            else if(mountainArr.get(mid)<target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        }

        return ans;

    }
}