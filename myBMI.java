class myBMI{
	void printMyBmi(float weight, float height){
		float bmi=(float) weight/ (height * height);

		if(bmi < (float)18.5){
			System.out.println("low");
		}
		else if((float)18.5 <= bmi && bmi <(float)23){
			System.out.println("normal");
		}
		else if((float)23 <= bmi && bmi <(float)25){
			System.out.println("risky");	
		}
		else if((float)25<= bmi && bmi <(float)30){
			System.out.println("obesity 1");
		}
		else if((float)30<= bmi && bmi <(float)40){
			System.out.println("obesity 2");
		}
		else if(bmi>(float)40){
			System.out.println("obesity 3");
		}
		else{
			System.out.println("error");
		}
	}
	public static void main(String[] argv){
		myBMI b = new myBMI();
		b.printMyBmi(75,(float)1.7);
	}
}