import java.util.*;
class Count_7{
	static Map countS(String s){
		char[] word = s.toCharArray();
		Map<String, Integer> m = new HashMap<String, Integer>();
		String sum;
		for(char c:word){
			sum = Character.toString(c);
			if(m.containsKey(sum)){
				m.put(sum, m.get(sum)+1);
			}
			else{
				m.put(sum,1);
			}
		}
		return m;
	}
	public static void main(String[] args){
		String a = "My name is Shin Hea Choi. My student number is 201611116.";
		Map b = countS(a);
		System.out.println(b);
	}
}