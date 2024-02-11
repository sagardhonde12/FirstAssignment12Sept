package Practice_java;

public class reverse {
public static void main(String[] args) {
	int num=1234321;
	int reverse =0;
	for (int i=num;i>0;i=i/10) {
		int a=i%10;
		reverse=reverse*10+a;
	}System.out.println(reverse);
if (num==reverse) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
System.out.println("******************************************************");

String s="sagar";
String reverse2="";
System.out.println("Original:- "+s);
for  (int i=s.length()-1;i>=0;i--) {
	reverse2=reverse2+s.charAt(i);
}
System.out.println("reverse:-"+reverse2);




}}
