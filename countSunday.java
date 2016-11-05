import java.util.Calendar;
class countSunday{
	int count=0;
	int readSunday(){
		Calendar c=Calendar.getInstance();
		for(int i=1901;i<2001;i++){
			for(int j=0;j<12;j++){
				c.set(i,j,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					count=count+1;
				}
			}
		}
		return count;
	}
	void printNum(int x){
		System.out.println(x);
	}
	public static void main(String[] argv){
		countSunday cs=new countSunday();
		int y = cs.readSunday();
		cs.printNum(y);
	}
}