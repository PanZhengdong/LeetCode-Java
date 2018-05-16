package easy;

public class Tree2Str606 {
	public String tree2str(TreeNode t) {
		if(t ==null)
			return "";
		String l =tree2str(t.left);
		String r =tree2str(t.right);
		
		if(l.equals("")&&r.equals(""))
			return t.val+"";
		else if(r.equals(""))
			return t.val+"("+l+")";
		return t.val+"("+l+")"+"("+r+")";
	}
}
