package com.oops;

/*If you remove Stmt-1, a call to super(s) will result in printing Base: Hello, 
and then the constructor of the Derived class invocation will print Derived. Similarly, 
the removal of Stmt-2 will also produce the correct program. In fact, if you remove both these statements, 
you will also get a compilable program.
(b,c,d)*/


















class Base1 {
    public Base1() {
        System.out.print("Base ");
    }

    public Base1(String s) {
        System.out.print("Base: " + s);
    }
}

class Derived1 extends Base {
    public Derived1(String s) {
       // super(); // Stmt-1
       // super(s); // Stmt-2
        System.out.print("Derived ");
    }
}

public class Test1 {
	public static void main(String[] args) {
       // Base1 base = new Derived1("Hello ");
    }
}

//a) Removing Stmt-1 will make the program compilable and it will print the following: Base Derived.
//b) Removing Stmt-1 will make the program compilable and it will print the following: Base: Hello Derived.
//c) Removing Stmt-2 will make the program compilable and it will print the following: Base Derived.
//d) Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following: Base Derived.
//e) Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following: Base: Hello Derived.