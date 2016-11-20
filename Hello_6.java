class Hello_6{
	static void reHello(String h){
		char[] chArr=h.toCharArray();
		StringBuilder olleh=new StringBuilder();
		for(int i = chArr.length-1;i>=0;i--){
			olleh.append(chArr[i]);
		}
		System.out.println(olleh);
	}
	public static void main(String[] argv){
		Hello_6 h = new Hello_6();
		String hello="hello";
		h.reHello(hello);
	}
}