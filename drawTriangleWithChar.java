class drawTriangleWithChar{
	void drawTriangle(int x,String y){
		int count = x;
		String shape = y;
		String blank = " ";
		StringBuffer sbuf=new StringBuffer();

		for(int i=1;i<count+1;i++){
			for(int k=0;k<count-i;k++){
				sbuf.append(blank);
			}
			for(int j=0;j<i*2;j++){
				sbuf.append(shape);
			}
			System.out.printf("%s\n",sbuf.toString());
   			sbuf.delete(0, sbuf.length());
		}
	}
	public static void main(String[] args){
		drawTriangleWithChar draw = new drawTriangleWithChar();
		draw.drawTriangle(4,"*");
	}
}