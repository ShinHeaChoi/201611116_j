import java.util.ArrayList;
class Numbers{
	ArrayList<Integer> myList = new ArrayList<Integer>();
	void setNumbers(){
		for(int i=0; i<=1000; i++){
			if(i%4==0 && i%5!=0){
				myList.add(i);
			}
		}
	}
	int sumList(){
		int sum=0;
		for(int a:myList){
			sum=sum+a;
		}
		return sum;
	}

	public static void main(String[] args) {
		int answer;
		Numbers n = new Numbers();
		n.setNumbers();
		answer = n.sumList();
		System.out.println("answer : " + answer);
	}
} 