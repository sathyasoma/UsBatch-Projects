package com.oops;

/*Whenever a class gets instantiated, the constructor of its base classes 
(the constructor of the root of the hierarchy gets executed first) 
gets invoked before the constructor of the instantiated class.(a)*/




















class Base {
    public  Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public Derived() {
    	//super();
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}
public class Test {
	 public static void main(String[] args) {
	        Derived b = new DeriDerived(); //runtime polymorpsm
	    }
}

//a)
//Base
//Derived
//DeriDerived
//b)
//Derived
//DeriDerived
//c)
//DeriDerived
//Derived
//Base
//d)
//DeriDerived
//Derived