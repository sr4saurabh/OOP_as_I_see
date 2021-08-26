/** 
Abstraction - (the bookish language) - showing only the essential details and hiding the complexities of a system is
called abstraction.....

Wait ...wait .. does not it simply means I give user something that he knows how to handle easily and let internal mechanism
do all the complex stuff..yeah thats abstraction..

Q - why do we need abstraction ?
A - A person riding a car never knows the internal mechanism of car , he knows only steering wheel , brake , clutch etc..
Similarly a person using the application designed using this concept will always be at ease that he is using something that
he can handle very easy.

Q- How we do abstraction in JAVA??
A - through abstract classes or by interfaces.


Difference b/w abstract class and interface 
 * 1. abstract class can have non-abstract methods , interface cant
 * 2. abstract class does  not provide mechanism for multiple inheritance
 * 3 . ""       ""    can extend both other classes and interface while interfaces can only extend other interfaces 
 * 
 */
package saurabh;

abstract class Bank{
	abstract int rateofinterest();
	int newrate()
	{
		return 5;
	}
}
class SBI extends Bank{
	int rateofinterest() {
		return 7;
	}
}
class ICICI extends Bank{
	int rateofinterest() {
		return 8;
	}
}

/**public class Abstraction {

	public static void main(String[] args) {
		
		// here a user does not know how Bank has implemented the function,
		// he can use all the functions without even knowing the implementation .
		// Abstraction is implementation hiding
		// data hiding is achieved through different access specifiers!
		Bank b = new SBI();
		System.out.println(b.newrate());
		b = new ICICI();
		System.out.println(b.rateofinterest());
		
	}
	
	// advantage -  a user clicks on get new loan through sbi and gets the rate of interest without knowing how bank
	// is calculating it.

}**/
 // since SBI is extending the bank class , it has achieved abstraction! but not completely!!

// -----------------------INTERFACE STARTED -----------------------------

interface Loan {
	int rateofinterest();
	int min_salary();
}

class Homeloan implements Loan
{
	public int rateofinterest()
	{
		return 10;
	}
	public int min_salary()
	{
		return 200000;
	}
}
class CarLoan implements Loan
{
	public int rateofinterest()
	{
		return 12;
	}
	public int min_salary()
	{
		return 100000;
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Loan loan = new Homeloan();
		System.out.println(loan.rateofinterest());
		System.out.println(loan.min_salary());
		
	}	
}
// interface hence provides multiple inheritance and as well as provides 100% abstraction as 
/// abstraction class does not knows the implementation of rateofintrest as well as min_salary functions!
	
