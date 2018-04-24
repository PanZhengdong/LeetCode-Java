package easy;

public class HammingWeight191 {
	public int hanmingWeight(int n) {
	int bits=0;
	int mask=1;
	for(int i =0;i<32;i++) {
		if((n&mask)!=0) {
			bits++;
		}
		mask<<=1;
		
	}
	return bits;
}
}