package easy;

public class LowestCommonAncestor235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (root.val < Math.max(p.val, q.val) && root.val > Math.min(p.val, q.val)) {
			return root;
		} else if (p.val == root.val || q.val == root.val) {
			return root;
		}
		return null;
	}
}
