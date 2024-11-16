package test3;

// comparing two integer , Integer Caching 

public class Question44 
{
	public static void main(String[] args) {
		
		//Integer Caching 
		
		Integer num1=100;
		Integer num2=100;
		
		//-128 to 127 , If you give value beyond this range it will print else block because even it is an intger but it is outside the range
		
		if(num1 == num2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
	}

}

/*num1 and num2 are both Integer objects with a value of 100.
Since 100 falls within the caching range (-128 to 127), num1 and num2 reference the same cached Integer object.
Therefore, num1 == num2 will evaluate to true, and "Both are the same object." will be printed.

Note
The integer caching optimization only applies to Integer objects created using the valueOf() method or auto-boxing (like in the example above). If you create Integer objects using the new keyword, Java will create a new object every time, even for integers within the caching range. 

Integer num1 = new Integer(100);
Integer num2 = new Integer(100);

if (num1 == num2) {
    System.out.println("Both are the same object.");
} else {
    System.out.println("Different objects.");
}

In this case, num1 == num2 will evaluate to false because new Integer(100) creates a new object each time.


In this case 
Integer num1=100;
		Integer num2=new Integer(100);
		
		//-128 to 127 
		
		if(num1 == num2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
it will give false and else block will print

*/