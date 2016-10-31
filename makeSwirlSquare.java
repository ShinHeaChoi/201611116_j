void makeSwirlSquare(int size, int bigger, int turns, double degree){
for(int i=0;i<turns;i++){
if(i%2!=0){
size+=bigger;
}
t1.forward(size);
t1.right(degree);
//System.out.printf(%d-%dn,i,size);
}
