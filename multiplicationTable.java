class multiplicationTable{
	void printMul(){
		int[] x={1,2,3,4,5,6,7,8,9};
		for(int i:x){
			System.out.printf("\n%d -",i);
			for(int j: x) {
        		System.out.printf("\t%dx%d=%2d ",i,j,i*j);
    		}
		}
	}
	public static void main(String[] argv){
		multiplicationTable mul=new multiplicationTable();
		mul.printMul();
	}
}