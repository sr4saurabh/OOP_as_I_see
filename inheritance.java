package saurabh;
/*
Inheritance - the property by which one class object occupies all the properties of other class.
The class getting inherited is called base class/parent class . The class doing inheritance is called
the derived/child class.

Property - basicallly by using concept of inheritance one object can now access all the functions and variables(property)
of the other object even though both have their own classes.


ques. is it necessary to provide a constructor in base class for the constructor in parent class?
ans - yes its absolutely necessary since on object creation an instance of parent is created first and then for child class
 first constructor of oldest parent is invoked in constructor chaining with super keyword.

single multilevel heirarichal 
 multiple inheritance cant be achieved with classes.can be achieved with interfaces.

Single - A<-B
Multilevel - A-<----B-<-----C
Heiarichal - A<---B , A<----C

Multiple - A<---B C<----B 

You cant use extend for class more than once but can use interface more than once using implement method.

Learn about the diamond problem(in c++)

*/
class Account
{
	long account_no;
	String account_name;
	double balance;
	
	Account(long ac_no , String name,double bal){
		this.account_name = name;
		this.account_no = ac_no;
		this.balance = bal;
	
	}
	
	void credit(int money)
	{
		System.out.println("deposited money in Account class");
		balance += money;
		System.out.println("balance now ="+balance);
	}
	
	void debit(int money)
	{
		if(money < balance)
			System.out.println("cant , balance now in Account class");
		else {
			balance -= money;
			System.out.println("money withdrawn from account class , balance = "+ balance);
			
		}
			
	}
}

class SavingsAccount extends Account
{
	SavingsAccount(long ac_no , String name,int  bal)
	{
		super(ac_no,name,bal);
	}
	
	void debit(int money)
	{
		if(balance - money < 1000)
			System.out.println("can't , balance low in Savings Account class");
		else
		{
			balance -= money;
			System.out.println("money withdrawn from account class , balance = "+ balance);
			
		}
			
	}
}

public class inheritance {

	public static void main(String[] args) {
		SavingsAccount ob = new SavingsAccount(10001010,"Asdfasdf",2000);
		ob.debit(1000);
		ob.debit(300);
		D obb = new D();
	}

}

//---------------------------------------------------------------------------------------
//constructor chaining example as well as multi level inheritance example 
// a->b->c a inherits b whereas b inherits c
// in inheritance first the most super class's constructor is invoked
class A
{
	A()
	{
		System.out.println("inside A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("inside B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("inside C");
	}
}
class D extends C
{
	D()
	{
		System.out.println("inside D");
	}
}
//------------------------------------------------------------------------------

//define flow of constructor construction - all default constructor are initialised on thier own.
// parameterized comstructor must be invoked using super by the base class.
