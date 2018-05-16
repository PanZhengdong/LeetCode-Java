package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
	public List<String> binaryTreePaths(TreeNode root){
		List<String> rst =new ArrayList<String>();
		if(root==null ) return rst;
		StringBuilder sb =new  StringBuilder();
		helper(rst,sb,root);
		return rst;
	}
	public void helper(List<String> rst ,StringBuilder sb ,TreeNode root) {
		if(root == null) return;
		int tmp =sb.length();
		if(root.left==null&&root.right== null) {
			sb.append(root.val);
			rst.add(sb.toString());
			sb.delete(tmp,sb.length());
			return ;
		}
		sb.append(root.val+"->");
		helper(rst,sb,root.left);
		helper(rst,sb,root.right);
		sb.delete(tmp,sb.length());
		return ;
	}
}
