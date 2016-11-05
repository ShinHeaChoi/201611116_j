class leapYear{
  void printLeapYear(int year){
    if(year%4==0 & year%100!=0 || year%400 == 0){ 
      System.out.println("a leap year");
    } 
   else 
   { 
     System.out.println("not a leap year");
   } 
  }
  public static void main(String[] argv){
    leapYear l=new leapYear();
    int[] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
    for(int i:years){
      l.printLeapYear(i);
    }
  }
} 