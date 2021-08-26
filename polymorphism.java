package saurabh;

// compile time polymorphism - changing parameter type , changing paremeter numbers
// objects are upgraded - int into double float and long unless theres an ambiguity

//	Q- can static and non static both functions be overloaded?
// Yes both can be overloaded , no problem

class CompileTime{
	
	void exec(int a , int b)
	{
		System.out.println("exec 1");
	}
	 void exec(int a , long b)
	{
		System.out.println("exec 2");
	}
	
}

// runtime is done in inheritance
// super keyword is used  to - unhide the name of parent class variable , invoke parent class function/constructor
// compiler automatically adds super() for parent class as first line in terms of inheritance

/**public class polymorphism {
	static void exec(int a , int b)
	{
		System.out.println("exec 3");
	}
	static  void exec(int a , long b)
	{
		System.out.println("exec 4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		long c = 10;
		new CompileTime().exec(a,b);
		new CompileTime().exec(a,c);
		exec(a,b);
		exec(a,c);
	}

} comment out to run upper classes - -- - --- **/ 

//final keyword - 1. any variable which is data member becomes final/constant
// any function that is final can be inherited but cant be overridden - compile time error
// any class that is final cant be inherited
// any final function can be overloaded - no pro

//Real World Bank example of Run-Time Polymorphism/Dynamic Method Dispatch
// when an overridden function is referenced by parent class object which refers to the child class object
// resolution of function calling happens at runtime - this is called dynamic method dispatch

// this referencing is called upcasting
// parent class object pob = new child_class_object();
// call function - pob.run() //run is overridden function
// pob.variable will show values of parent vaiables but in case of overriding will show function of child class

//advantage - This transfer of implementation of one method
//to another method is possible without changing or modifying the codes of the parent class object.


//Bank example - 




class Loan
{
	double percentage;
	Loan()
	{
		percentage = 10.5;
	}
	
	double returnpercentage()
	{
		return percentage;
	}
	
}

class HomeLoan extends Loan
{
	double percentage;
	
	double returnpercentage()
	{
		return super.percentage + 1.5;
	}
}
public class polymorphism
{
	public static void main(String args[])
	{
		Loan b = new HomeLoan();
		System.out.println(b.returnpercentage());
		
		Loan bob = new Loan();
		System.out.println(bob.returnpercentage());
		
	}
}

// when resolution of object is done at compile time its early binding , at runtime is dynamic binding.
