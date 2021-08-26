// what happens when constructor is present but of different parameter?

//ans- compilation error constructor type undefined

// what happens when same type constructors are present 
//ans - duplicate constructor present error

//only one public class in a file allowed
package saurabh;
class constr {
	int a , b;
	constr()
	{
		this.a = 0;
		this.b = 0;
	}
	constr(int f , int g)
	{
		System.out.print(f);
	}
	
	int constr(int f,int g,int j)
	{
		return f + g + j;
	}
	
}
public class tcs {
	public static void main1()
	{
		System.out.println("hello world\n");
		constr ob = new constr();
		int d  = ob.constr(1,2,3);
		System.out.println(ob.a + ob.b + " " + d);
	}
}
//--------------------------------------------------------------------
//usage of static
// 1. non-static variables cant be used inside a static function
// 2 . non-static function cant be called inside a static function directly without creating object
// 3. that object gets those values themselves
// 4. the passed parameter with same name as class variables overshadow the class variables and hence "this" is used
// 5. every object gets the same value of static variables when they are created , hence this value is shared rather than copied
// and hence leads to efficient memory storage!
class checkstatic
{
	int a = 5,b = 6;
	static int c = 15;
	public static void main2() {
		System.out.println(c);
		checkstatic ob = new checkstatic();
		ob.sidefunc(10,11);
	}
	public void sidefunc(int a , int b)
	{
		System.out.println(this.c);
	}
}

//--------------------------------------------------------------------------
// this variable is automatically added by compiler when a non-static function is called from another non static function without
// object reference
// this can also be used for constructor chaining
// this must be the first statement in a constructor if constructor chaining has to be done else it can be used for initialising at any moment of time.


