package easy;

public class TrailingZeroes172 {
  public int trailingZeroes(int n) {
	  int r=0;
	  while(n>0) {
		  n/=5;
		  r+=n;
	  }
	  return r;
  }
}
