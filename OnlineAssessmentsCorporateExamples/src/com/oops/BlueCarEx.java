package com.oops;

/*The class is loaded first, with the static initialization block called and 1 is outputted first. 
When the BlueCar is created in the main() method, the superclass initialization happens first.
The instance initialization blocks are executed before the constructor, so 32 is outputted next. 
Finally, the class is loaded with the instance initialization blocks again being called before the constructor,
outputting 45. The result is that 13245 is printed, making Option C the correct answer(c).*/








abstract class Car1 {
    static {
        System.out.print("1");
    }
    public Car1(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}
public class BlueCarEx extends Car1{
	{
        System.out.print("4");
    }

    public BlueCarEx() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new BlueCarEx();
    }
}

//A. 23451
//B. 12354
//C. 13245
//D. The code does not compile.