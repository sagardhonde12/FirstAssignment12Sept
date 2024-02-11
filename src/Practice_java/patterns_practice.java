package Practice_java;

public class patterns_practice {
public static void main(String[]args) {
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=5;j++) {
			System.out.print("*");
		}System.out.println();
	}
	
	// 2]
	for (int i =1;i<=5;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println("      ");
	//3]
	for (int i=1;i<=5;i++) {
		for (int j=5;j>=i;j--) {
			System.out.print("*");
		}System.out.println();
	}
	
	System.out.println(" ");
	
	 
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();}
	
	for (int i=1;i<=4;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println(" ");
	
	for (int i=1;i<=5;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		}for (int k=1; k<=i;k++) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println(" ");
	
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print(" ");
		}for (int k=5;k>=i;k--) {
			System.out.print("*");
		}System.out.println();
	}
	
	System.out.println(" ");

	for (int i=1;i<=5;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		}for(int k=1;k<=i;k++) {
			System.out.print("*");
		}System.out.println();
	}for (int i=1;i<=4;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print(" ");
		}for (int k=4;k>=i;k--) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println(" ");
	
	
	for (int i=1;i<=5;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		}for (int k=1;k<=i;k++) {
			System.out.print("* ");
		}System.out.println();
	}
	
	
	
	System.out.println("  ");
	
	
	for (int i=4;i<=40;i=i+4) {
		System.out.println(i);
	}
	int a=8;
	for (int i=1;i<=10;i++) {
		System.out.println(a+"*"+i+"="+(i*a));
	}
	for(int i=1;i<=4;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		}for (int k=1;k<=i;k++) {
			System.out.print("*");
		}System.out.println();
	}
	for (int i=1;i<=5;i++) {
		for (int j=2;j<=i;j++) {
			System.out.print(" ");
		}for (int k=5;k>=i;k--) {
			System.out.print("*");
		}System.out.println();
	}
	
	
	
	for (int i=1;i<=3;i++) {
		for (int j=2;j>=i;j--) {
			System.out.print(" ");
		}for (int k=1;k<=i;k++) {
			System.out.print("* ");
		}System.out.println();
	}
	
	
	
}

}
