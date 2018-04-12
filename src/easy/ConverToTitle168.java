package easy;

public class ConverToTitle168 { //with Stringbuiler class
  /*public String converToTitle(int n){
	  Stringbuiler result=new StringBuilder();
	  
	  while(n>0){
		  n--;
		  result.insert(0,(char)('A'+n%26));
		  n/=26;
	  }
	  return result.toString();
  }
}*/ //without class Stringbuiler
	public String converToTitle(int n){
	String res="";
	while(n!=0){
		char ch=(char)((n-1)%26+65);
		n=(n-1)/26;
		res=ch+res;
	}
	return res;
	}
}

