package irfan.rest;

public class child2 extends parent2{

		public String getsavings(double sal) {
			String ps1=super.getsavings(sal);
			
			return ps1+"<br>child savings:"+sal*80/100;
		}

	}



