/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)return new ArrayList<>();

        Queue<TreeNode>queue=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        queue.add(root);
        List<Integer>inner=new ArrayList<>();
        while(!queue.isEmpty()){
            int curr_level_size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<curr_level_size;i++){
                TreeNode curr=queue.poll();
                if(curr==null)continue;

                max=Math.max(curr.val,max);
                if(curr.left!=null){
                queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            res.add(max);
            
        }
        return res;
    }
}