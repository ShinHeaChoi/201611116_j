class Grade{
	char grade;
	void myScore(double a){
		if(90<= a && a <=100){
			return grade = 'A';
		}
		else if(80<= a && a <90){
			return grade = 'B';
		}
		else if(70<= a && a <80){
			return grade = 'C';		
		}
		else if(60<= a && a <70){
			return grade = 'D';
		}
		else if(a<60){
			return grade = 'F';
		}
		else{
			System.out.println("error");
			return grade = 'null';
		}
	}
	void printGrade(char b){
		System.out.println("Your grade : "+b);
	}
}