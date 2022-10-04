
class DailyEmployeeWage {
	public static void main(String[] args) {
		//constants
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empHrs=0;
		int empWage=0;
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_FULL_TIME)
			empHrs=8;
			empWage=empHrs*EMP_RATE_PER_HOUR;
			System.out.println("EmpWage:"+empWage);
	
	}

}
