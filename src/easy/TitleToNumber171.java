package easy;

public class TitleToNumber171 {
public int titletoNumber(String s){
  int result=0;
  for(int i=0;i<s.length();i++){
	 result=result*26+(s.charAt(i)-'A'+1);
	 
  }	 
  return result;
}
}