package OOPs_HomeWork;

public class calculator {
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public int substraction(int num1,int num2) {
		return num1-num2;
	}
	
	public int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public int division(int num1, int num2) {
		return num1/num2;
	}
	
	public int sumthree(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	
	public double sumdecimal(double num1,float num2) {
		return num1+num2;
	}
	
	public double mixsum(double num1, int num2) {
		return (num1+num2);
	}

public  static void main(String[] args) {
	
	calculator cal = new calculator();    // object creation
	System.out.println(cal.sum(50, 100));
	System.out.println(cal.substraction(40, 20));
	System.out.println(cal.multiplication(55, 2));
	System.out.println(cal.division(40, 20));
	System.out.println(cal.sum(40, 20));
	System.out.println(cal.sum(75, 75));
	System.out.println(cal.sumthree(205, 30, 20));
	System.out.println(cal.sumdecimal(30.56255, 2935.203f));
	System.out.println(cal.mixsum(40.21359, 20));
		
}

}

