class Temperature{
	public void reT(float a, String b){
		float ret;
		if(b.equals("F")){
			ret = (a-32f)/1.8f;
			System.out.println(a+b+" ==> "+ret+"C");
		}
		else if(b.equals("C")){
			ret = (a*1.8f)+32;
			System.out.println(a+b+" ==> "+ret+"F");
		}
		else{
			System.out.println("user input error");
		}
	}
}