package HomeWork;

public class Arraay_HW {
public static void main(String[] args) {
	// 1) The sum of total no in array
	int a[] = {5,10,15,20};
       int sum=0;
       for (int i=0;i<a.length;i++)
       {
    	   sum= a[i]+sum;
       }System.out.println("sum of the numbers in an array=" +sum);
       System.out.println("##############################################");
	// search specific number in an array
       int b[]= {1,23,29,51};
		int z=51;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==z)
			{
				System.out.println("Number found at index value "+i);
			}else
				System.out.println("Number not found");
		}
	       System.out.println("##############################################");

  //3)	Search string in an  array  	   
    	   
		String s[]= {"shubhngi","Supriya","Sagar"};
		String s1="Supriya";
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==s1)
			{
				System.out.println("String found");
			}
			else
				System.out.println("string not found");
		}
}}
	

