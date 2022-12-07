package irfan.rest;

public class Outer {
int k=77;
    class Inner{
	int x=45;
}
  static  class Inner1{
	  int y=98;
  }
   interface Inner2{
	  int z=76;
  }
  public int getInt() {
	   class Inner{
		   int s=76;
	   }
	   Inner in3=new Inner();
	   return in3.s;
   }
}
