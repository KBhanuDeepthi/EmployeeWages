
class CalculateMonthlyWages {
	public static void main(String[] args) {
		//constants
		final int IS_PART_TIME=1;
		final int IS_FULL_TIME=2;
		final int EMP_RATE_PER_HOUR=20;
		final int NUM_OF_WORKING_DAYS=20;
		//variables
		int empHrs=0;
		int empWage=0;
		int totalEmpwage=0;
		for(int day=0;day<=NUM_OF_WORKING_DAYS;day++) {
		   int empcheck=(int)Math.floor(Math.random()*10)%3;
		   switch(empcheck) {
		     case IS_FULL_TIME:
		    	empHrs=8;
		    	break;
		     case IS_PART_TIME:
			    empHrs=4;
			    break;
		     default:
		        empHrs=0;
		  }
	   	empWage=empHrs*EMP_RATE_PER_HOUR;
		totalEmpwage+=empWage;	
		System.out.println("EmpWage:"+empWage);
	  }
	  System.out.println("Total Emp Wage:" +totalEmpwage);
	}

}
