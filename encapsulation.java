/* Encapsulation - capsule something but why??
 binding of data and functions to keep them safe from unauthorized access..yeah the copied answer but but... who is binding all this ??
 Object has both functions and properties, those properties and functions are bound to an object and only given access can utilise them
 This is simply encapsulation as i feel.
*/
package saurabh;
import java.util.*;
public class encapsulation {
	
	public static void main(String args[]) {
	secretString ob = new secretString();
	System.out.println(ob.encrypt(1001));
	}
	
}

class secretString
{
	private long sha = 1000000007;
	protected StringBuilder encrypt(long value)
	{
		Random random = new Random(1000);
		int ran = random.nextInt(10000);
		char arr[] = new char[10];
		StringBuilder ret = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			arr[i] = (char)((int)((value*ran + sha * i)%26) + 'a');
			ret.append(arr[i]+"");
		}
		
		return ret;
		
	}
}
// if someone is accessing function through a user interface,he/she will ne ver know how this works!
// how the secret string is shared by the user

// this is power of encapsulation 
// private- same class only
// default - inside same package
// protected - inside same pckage and the inherited class
// public - everywhere
