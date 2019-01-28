import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> list=new LinkedList<>();
        list.add(root);
        int len=0,sum=0,count=1;//sum为当前计算的父节点数，count为之前存储的父节点数
        while(list.size()!=0){
        TreeNode top=list.poll();
        sum++;  
        if(top.left!=null){
            list.offer(top.left);
        }
        if(top.right!=null){
            list.offer(top.right);
        }
        if(sum==count){  //当扫描完一层时，深度加1
            count=list.size();
            sum=0;
            len++;
        }
        }
        return len;
    }
}
