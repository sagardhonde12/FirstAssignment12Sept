package Practice_java;

public class condtional_statements_practice {
public static void main(String[] args) {
	// 1] even odd number?
	int a=23;
	if(a%2==0) {
		System.out.println("The number is even.");
	}
	else {System.out.println("The number is odd.");
}

// 2] largest of numbers
int x=20;
int y=29;
if (x>y) {
	System.out.println("x is a largest number");
}else {
	System.out.println("y is a largest number.");
}

// 3] positive negative or zzero
int l=0;
if (l==0) {
	System.out.println("the number is zero");
}else if (l<0) {
	System.out.println("the number is negative");
}else {
	System.out.println("the number is positive.");
}

// 4] which langauge is simple

String lang="c#";
if (lang == "java" || lang== "python") {
	System.out.println("the language is easy");
}else System.out.println("the language is diificut.");


//5] age criteria
int p=55;
if (p>=18)
{System.out.println("user can open facebook account");
}else {
	System.out.println("user cannot open facebook account");
}

}}
