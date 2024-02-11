package HomeWork;

public class ARRAYS_PRACTICE {
public static void main(String[] args) {
	int a[]=new	int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	// To find size of an array
	System.out.println("The size of an array is:-"+a.length);
	// To read the specific value on specific index
	System.out.println("The element present on fourth index:-"+a[4]);
   // How to read all the values present inside arays
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}



}
}
