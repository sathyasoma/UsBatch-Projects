package com.oops;

/*For an integer literal, the JVM matches in the following order: 
	int, long, Integer, int.... In other words, it first looks for an int type parameter;
			then it looks for long type; and so on. Here, since the int type parameter is specified with 
					an overloaded method, it matches with int(d).*/


















public class Test2 {
	
	public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        Test2 test = new Test2();
        test.print(10);
    }
}

//a) The program results in a compiler error (“ambiguous overload”).
//b) long
//c) Integer
//d) int


