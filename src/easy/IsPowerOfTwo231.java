package easy;

public class IsPowerOfTwo231 {
	public boolean isPowerOfTwo(int n) {
		return n>0&&Integer.bitCount(n)==1;
	}
}
