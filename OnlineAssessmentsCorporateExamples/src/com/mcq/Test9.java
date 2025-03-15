package com.mcq;

/*In the above program, the switch statement makes a random choice among three possible alternatives. 
Recall that the value of the expression (int)(3*Math.random())
is one of the integers 0, 1, or 2, selected at random with equal probability, 
so the switch statement below will assign one of the values 
"Rock", "Scissors", "Paper" to computerMove, with probability 1/3 for each case. Although the switch statement in this example is correct, this code segment as a whole illustrates a subtle syntax error.

We probably haven't spotted the error, since it's not an error from a human
point of view. The computer reports the last line to be an error, because 
the variable computerMove might not have been assigned a value. 
In Java, it is only legal to use the value of a variable if a value has 
already been definitely assigned to that variable. It means that the computer must be
able to prove, just from looking at the code when the program is compiled, 
that the variable must have been assigned a value. Unfortunately, 
the computer only has a few simple rules that it can apply to make the determination. 
In this case, it sees a switch statement in which the type of expression is int and in which the cases that are covered are 0, 1, and 2. For other values of the expression, computerMove is never assigned a value. So, the computer thinks computerMove might still be undefined after the switch statement. Now, in fact, this isn't true: 0, 1, and 2 are actually the only possible values of the expression (int)(3*Math.random()), but the computer is not smart enough to figure that out. The easiest way to fix the problem is to replace the case label case 2 with default.

The computer can see that a value is assigned to computerMove in all cases.
More generally, we say that a value has been definitely assigned to a variable at 
a given point in a program if every execution path leading from the declaration of 
the variable to that point in the code includes an assignment to the variable. 
This rule takes into account loops and if statements as well as switch statements. (d)*/





























public class Test9 {
	public static void main(String args[])   
	{  
//	String computerMove;  
//	switch ( (int)(3*Math.random()) )   
//	{  
//	case 0:  
//	computerMove = "Rock";  
//	break;  
//	case 1:  
//	computerMove = "Scissors";  
//	break;  
//	case 2:  
//	computerMove = "Paper";  
//	break;  
//	}  
//	System.out.println("Computer's move is " + computerMove);  
	}  
}

//Rock
//Scissors
//Paper
//Syntax Error
//Exception
