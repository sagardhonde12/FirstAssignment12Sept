package OOPs_HomeWork;

public class employeemain {
public static void main(String[] args) {
	employee emp1=new employee();//object creation
	emp1.empid=100;
	emp1.empname="sagar";
	emp1.empsal=75000;
	emp1.empdpt=01;
	
	emp1.empdesgn="QA Engineer";
emp1.display();

System.out.println(" ");

employee emp2=new employee();
emp2.empid=143;
emp2.empname="aaru";
emp2.empsal=200000;
emp2.empdpt=02;

emp2.empdesgn="pharmacist";
emp2.display();


}
}
