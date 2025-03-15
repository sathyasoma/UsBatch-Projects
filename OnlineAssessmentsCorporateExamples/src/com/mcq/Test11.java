package com.mcq;

import java.util.HashMap;
import java.util.Set;

//First brace creates a new Anonymous Inner Class. These inner classes are capable of accessing the behavior of their parent class. So, in our case, we are actually creating a subclass of HashSet class, so this inner class is capable of using put() method.
//
//And Second set of braces are nothing but instance initializers. Recall the concept of core Java where we can easily associate instance initializer blocks with static initializers due to similar brace like struct. Only difference is that static initializer is added with static keyword, and is run only once; no matter how many objects we create.


















public class Test11 {
	public static void main(String[] args) {  
        HashMap<String,String> map = new HashMap<String,String>(){  
        {  
            put("1", "ONE");  
        }{  
            put("2", "TWO");  
        }{  
            put("3", "THREE");  
        }  
        };  
        Set<String> keySet = map.keySet();  
        for (String string : keySet) {  
            System.out.println(string+" ->"+map.get(string));  
        }  
    }  
}
//The first set of brace creates a new anonymous inner class and the second set of brace creates an instance initializer like static block in class.
//The second set of brace creates a new anonymous inner class and the first set of brace creates an instance initializer like static block in class.
//Neither first set of brace creates a new anonymous inner class nor the second set of brace creates an instance initializer like static block in class.
//The use of double brace initialization is not allowed in Java.
//None of the above


