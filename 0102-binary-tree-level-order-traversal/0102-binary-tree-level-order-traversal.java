class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void helper(TreeNode root){
        if(root==null){
            return;
        }else{
            List<Integer> lst = new ArrayList<>();
            
           Queue<TreeNode> queue= new LinkedList<TreeNode>();
            queue.add(root);
            queue.add(null);

            while(!queue.isEmpty()){
                root = queue.poll();
                if(root==null){
                    ans.add(lst);
                    lst = new ArrayList<>();
                    if(!queue.isEmpty()){
                        queue.add(null);
                    }
                }else{
                    lst.add(root.val);
                    if(root.left!=null){
                        queue.add(root.left);
                    }
                    if(root.right!=null){
                        queue.add(root.right);
                    }

                }
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
     helper(root);
     return ans;   
    }
}