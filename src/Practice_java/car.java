package Practice_java;

public class car extends vehicle {
	
		
		
		
	
	
	public int nosofvehicles() {
		
		return 4;
	}
	public static void main(String[] args) {
		car c= new car();
		int p=c.nosofvehicles();
		System.out.println(+p);
		bike b=new bike();
		int q=b.nosofvehicles();
		System.out.println(+q);
	}
}
