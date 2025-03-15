package com.oops;
/*The code compiles without issue, so Option D is incorrect. Java allows methods to be overridden,
but not variables. Therefore, marking them final does not prevent them from being reimplemented in a subclass.
Furthermore, polymorphism does not apply in the same way it would to methods as it does to variables. 
In particular, the reference type determines the version of the secret variable that is selected, 
making output 2 and Option A the correct answer(A).*/











class Math {
    public final double secret = 2;
}

class ComplexMath extends Math {
    public final double secret = 4;
}
public class InfiniteMath extends ComplexMath{
	 public final double secret = 8;

	    public static void main(String[] numbers) {
	        Math math = new InfiniteMath();
	        System.out.print(math.secret);
	    }
}

//A. 2
//B. 4
//C. 8
//D. The code does not compile.




