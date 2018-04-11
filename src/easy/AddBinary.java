package easy;

public class AddBinary {
	public String addBinary(String a, String b) {
		if (a == null || a.length() == 0)
			return b;
		if (b == null || b.length() == 0)
			return a;

		StringBuilder builder = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, c = 0;

		while (i >= 0 || j >= 0 || c == 1) {
			c += i > 0 ? a.charAt(i--) - '0' : 0;
			c += j > 0 ? a.charAt(j--) - '0' : 0;
           
			builder.append((char)('0'+c%2));
			c=c>1?i:0;
			
		}
    return builder.reverse().toString();
    }
}


//内存溢出